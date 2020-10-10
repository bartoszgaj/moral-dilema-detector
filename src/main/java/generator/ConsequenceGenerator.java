package generator;

import DilemmaDetector.ParameterizedPhilosophy;
import DilemmaDetector.Simulator.Actor;
import DilemmaDetector.Simulator.PhysicsUtils;
import project.*;
import project.MyFactory;

import java.util.*;

public class ConsequenceGenerator {
    MyFactory factory;
    Random random;
    Model model;
    List<Actor> actors;

    public ConsequenceGenerator(MyFactory factory, Model model, List<Actor> actors){
        this.factory = factory;
        this.model = model;
        this.actors = actors;
        random = new Random();
    }

    public void predict(Map<Decision, List<Actor>> collidedEntities, Actor mainVehicle) {
        Map<Decision, Integer> decisionResult = new HashMap<>();
        for (Map.Entry<Decision, List<Actor>> entry : collidedEntities.entrySet()) {
            int result= 0;
            Decision decision = entry.getKey();
            System.out.println(decision.getOwlIndividual());

            Killed killed = factory.createKilled(ObjectNamer.getName("killed"));
            Severly_injured severelyInjured = factory.createSeverly_injured(ObjectNamer.getName("severely_injured"));
            Lightly_injured lightlyInjured = factory.createLightly_injured(ObjectNamer.getName("lightly_injured"));
            Intact intact = factory.createIntact(ObjectNamer.getName("intact"));

            double severInjuryProbability;
            double minorInjuryProbability;
            double fatalInjuryProbability;
            for(Actor actor : entry.getValue()) {
                double speed;
                List<Living_entity> victims;

                //check if only collided vehicle is mainVehicle - it means that vehicle was out of road
                if (mainVehicle.getEntityName().equals(actor.getEntityName())){
                    victims = getLivingEntitiesFromActor(actor);
                    System.out.println("VICTIMS:::::::::::");
                    for (Living_entity living_entity : victims){
                        System.out.println(living_entity.getOwlIndividual().toString());
                    }
                    speed = Math.abs(mainVehicle.getRigidBody().getSpeed().getMagnitude());

                }
                else {
                    victims = getLivingEntitiesFromActor(actor);
                    victims.addAll(model.getPassengers());
                    victims.add(model.getDriver());
//                    System.out.println("VICTIMS SIZE " + victims.size());
//                    System.out.println("PASSENGER SIZE " + model.getPassengers().size());
                    speed = Math.abs( actor.getRigidBody().getSpeed().getMagnitude() - mainVehicle.getRigidBody().getSpeed().getMagnitude());
//                    System.out.println("Collided with relative speed: " + speed);
                }

                severInjuryProbability = severInjuryProbability(speed);
                minorInjuryProbability = minorInjuryProbability(speed);
                fatalInjuryProbability = fatalInjuryProbability(speed);
                double maxProbability = fatalInjuryProbability;
                if (severInjuryProbability > maxProbability) {
                    maxProbability = severInjuryProbability;
                }
                if (minorInjuryProbability > maxProbability) {
                    maxProbability = minorInjuryProbability;
                }

                if (maxProbability == fatalInjuryProbability) {
                    decision.addHas_consequence(killed);
                    for (Living_entity living_entity : victims) {
                        if (living_entity instanceof Passenger || living_entity instanceof Human){
                            result += ParameterizedPhilosophy.lifeValue * ParameterizedPhilosophy.humanLifeFactor;
                        }
                        else if (living_entity instanceof Animal){
                            result += ParameterizedPhilosophy.lifeValue * ParameterizedPhilosophy.animalLifeFactor;
                        }
                        killed.addHealth_consequence_to(living_entity);
                    }
                }
                else if (maxProbability == severInjuryProbability) {
                    decision.addHas_consequence(severelyInjured);
                    for (Living_entity living_entity : victims){
                        if (living_entity instanceof Passenger || living_entity instanceof Human){
                            result += ParameterizedPhilosophy.severeInjuryValue * ParameterizedPhilosophy.humanLifeFactor;
                        }
                        else if (living_entity instanceof Animal){
                            result += ParameterizedPhilosophy.severeInjuryValue * ParameterizedPhilosophy.animalLifeFactor;
                        }
                        severelyInjured.addHealth_consequence_to(living_entity);
                    }
                } else if (maxProbability == minorInjuryProbability) {
                    decision.addHas_consequence(lightlyInjured);
                    for (Living_entity living_entity : victims){
                        if (living_entity instanceof Passenger || living_entity instanceof Human){
                            result += ParameterizedPhilosophy.lightlyInjuryValue * ParameterizedPhilosophy.humanLifeFactor;
                        }
                        else if (living_entity instanceof Animal){
                            result += ParameterizedPhilosophy.lightlyInjuryValue * ParameterizedPhilosophy.animalLifeFactor;
                        }
                        lightlyInjured.addHealth_consequence_to(living_entity);
                    }

                }
            }
            // not collided LivingEntities which are in this scenario are intact
            for(Actor actor : actors){
                if(!entry.getValue().contains(actor)) {
                    for(Living_entity living_entity : getLivingEntitiesFromActor(actor)) {
                        intact.addHealth_consequence_to(living_entity);
                        decision.addHas_consequence(intact);
                    }
                }
            }
            decisionResult.put(decision, result);
        }

        System.out.println("\n\n DECISION RESULTS :");
        for (Map.Entry<Decision, Integer> entry : decisionResult.entrySet()) {
            System.out.println("DECISION : " + entry.getKey().getOwlIndividual().toString() + " " + entry.getValue());
        }


    }

    private List<Living_entity> getLivingEntitiesFromActor(Actor actor){
        Vehicle vehicle = factory.getVehicle(actor.getEntity());
        Living_entity living_entity = factory.getLiving_entity(actor.getEntity());
        List<Living_entity> result = new ArrayList<>();

        if (vehicle != null) {
//            System.out.println("Get victims from vehicle");
            result.addAll(vehicle.getVehicle_has_passenger());
            result.addAll(vehicle.getVehicle_has_driver());
        }
        else if(living_entity != null){
            result.add(living_entity);
        }

        return result;
    }

    private double minorInjuryProbability(double speed){
        speed = PhysicsUtils.MetersToKmph(speed);
        double probability;
        if (speed < 30) {
            probability = getProbability(0, 0, 30, 82.5, speed);
        }
        else if(speed < 50){
            probability = getProbability(30, 82.5, 50, 75, speed);
        }
        else if(speed < 70){
            probability = getProbability(50, 75, 70, 54.9, speed);
        }
        else if(speed < 90){
            probability = getProbability(70, 54.9, 90, 32.3, speed);
        }
        else if(speed < 115){
            probability = getProbability(90, 32.3, 115, 33.3, speed);
        }
        else{
            probability = getProbability(115, 33.3, speed, 33.3, speed);
        }
        return probability;
    }

    private double severInjuryProbability(double speed){
        speed = PhysicsUtils.MetersToKmph(speed);
        double probability;
        if (speed < 30) {
            probability = getProbability(0, 0, 30, 14.7, speed);
        }
        else if(speed < 50){
            probability = getProbability(30, 14.7, 50, 21.9, speed);
        }
        else if(speed < 70){
            probability = getProbability(50, 21.9, 70, 33.3, speed);
        }
        else if(speed < 90){
            probability = getProbability(70, 33.3, 90, 30.6, speed);
        }
        else if(speed < 115){
            probability = getProbability(90, 30.6, 115, 26.7, speed);
        }
        else{
            probability = getProbability(115, 26.7, speed, 26.7, speed);
        }
        return probability;
    }

    private double fatalInjuryProbability(double speed){
        speed = PhysicsUtils.MetersToKmph(speed);
        double probability;
        if (speed < 30) {
            probability = getProbability(0, 0, 30, 2.7, speed);
        }
        else if(speed < 50){
            probability = getProbability(30, 2.7, 50, 3.1, speed);
        }
        else if(speed < 70){
            probability = getProbability(50, 3.1, 70, 11.8, speed);
        }
        else if(speed < 90){
            probability = getProbability(70, 11.8, 90, 37.1, speed);
        }
        else if(speed < 115){
            probability = getProbability(90, 37.1, 115, 40.0, speed);
        }
        else{
            probability = getProbability(115, 40.0, speed, 40.0, speed);
        }
        return probability;
    }

    private double getProbability(double x1, double y1, double x2, double y2, double speed){
        return (y2 - y1)/(x2 - x1)*(speed - x1) + y1;
    }
}
