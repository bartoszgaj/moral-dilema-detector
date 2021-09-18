package DilemmaDetector.Consequences;

import project.*;

import java.util.*;

public class DecisionCostCalculator {
    private IConsequenceContainer consequenceContainer;
    private OWLFactory factory;
    private CustomPhilosophy customPhilosophy;
    private Boolean useDataExchange;


    public DecisionCostCalculator(IConsequenceContainer consequenceContainer, OWLFactory factory, CustomPhilosophy customPhilosophy, Boolean useDataExchange) {
        this.useDataExchange = useDataExchange;
        this.consequenceContainer = consequenceContainer;
        this.factory = factory;
        this.customPhilosophy = customPhilosophy;
    }

    public DecisionCostCalculator(IConsequenceContainer consequenceContainer, OWLFactory factory) {
        this.consequenceContainer = consequenceContainer;
        this.factory = factory;
        customPhilosophy = CustomPhilosophy.getSimplestPhilosophy();
    }

    public void setCustomPhilosophy(CustomPhilosophy customPhilosophy) {
        this.customPhilosophy = customPhilosophy;
    }

    public int getSummarizedCostForDecision(Decision decision) {
        int result = 0;
        result += calculateCostOfHealthConsequence(decision);
        result += calculateCostOfMaterialConsequence(decision);
        result += calculateCostOfTakingAction(decision);
        // dalej inne typy
        System.out.println("DECISION : " + decision.getOwlIndividual().getIRI().toString() + " | POINTS: " + result);
        return result;
    }

    private Float calculateCostOfTakingAction(Decision decision) {
        Float result = 0f;
        System.out.println(decision.toString());
        if (decision.toString().indexOf("follow") == -1 && decision.toString().indexOf("stop") == -1) {
            result = customPhilosophy.getParameters().get(PhilosophyParameter.TAKING_ACTION);
        }
        return result;
    }

    private int calculateCostOfMaterialConsequence(Decision decision) {
        int sum = 0;
        HashMap<PhilosophyParameter, Float> parameters = customPhilosophy.getParameters();
        Set<Map.Entry<String, Double>> consequences = consequenceContainer.getMaterialConsequences(decision);
        for (Map.Entry<String, Double> consequence : consequences) {
            sum += (int) Math.round(consequence.getValue());
        }
        return (int) (sum * parameters.get(PhilosophyParameter.MATERIAL_VALUE)) / 1000;
    }

    private int calculateCostOfHealthConsequence(Decision decision) {
        int result = 0;
        for (ConsequenceType consequenceType :
                List.of(ConsequenceType.KILLED, ConsequenceType.SEVERELY_INJURED, ConsequenceType.LIGHTLY_INJURED)) {
            result += calculateCostOfHealthConsequenceOfType(decision, consequenceType);
        }
        return result;
    }

    private boolean humanInsideMainVehicle(Vehicle vehicle, String victimName) {
        if (vehicle == null)
            return false;
        else return passengerInsideVehicle(vehicle, victimName) || driverInsideVehicle(vehicle, victimName);
    }

    private boolean passengerInsideVehicle(Vehicle mainVehicle, String victimName) {
        if (mainVehicle == null)
            return false;
        return mainVehicle.getVehicle_has_passenger().stream().map(p -> ((Passenger) p).getOwlIndividual().getIRI().toString())
                .anyMatch(p -> p.equals(victimName));
    }

    private boolean driverInsideVehicle(Vehicle mainVehicle, String victimName) {
        if (mainVehicle == null)
            return false;
        return mainVehicle.getVehicle_has_driver().stream().map(d -> ((Driver) d).getOwlIndividual().getIRI().toString())
                .anyMatch(d -> d.equals(victimName));
    }

    private int calculateCostOfHealthConsequenceOfType(Decision decision, ConsequenceType consequenceType) {
        int result = 0;
        List<String> victims = consequenceContainer.getHealthConsequencesOfType(decision, consequenceType);
        for (String victimName : victims) {
            HashMap<PhilosophyParameter, Float> parameters = customPhilosophy.getParameters();
            //extract scenario number to get main vehicle
            String scenarioNumber = victimName.split("_")[0];
            Vehicle mainVehicle = factory.getVehicle(scenarioNumber + "_vehicle_main");
            if (humanInsideMainVehicle(mainVehicle, victimName)) {
                switch (consequenceType) {
                    case KILLED:
                        result += parameters.get(PhilosophyParameter.HUMAN_LIFE_INSIDE_MAIN_VEHICLE);
                        if (useDataExchange) {
                            result += getDataExchangeAddition(victimName, ConsequenceType.KILLED, parameters);
                        }
                        break;
                    case SEVERELY_INJURED:
                        result += parameters.get(PhilosophyParameter.HUMAN_SEVERE_INJURY_INSIDE_MAIN_VEHICLE);
                        if (useDataExchange) {
                            result += getDataExchangeAddition(victimName, ConsequenceType.SEVERELY_INJURED, parameters);
                        }
                        break;
                    case LIGHTLY_INJURED:
                        result += parameters.get(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_INSIDE_MAIN_VEHICLE);
                        if (useDataExchange) {
                            result += getDataExchangeAddition(victimName, ConsequenceType.LIGHTLY_INJURED, parameters);
                        }
                }
            } else if (factory.getHuman(victimName) != null) {
                switch (consequenceType) {
                    case KILLED:
                        result += parameters.get(PhilosophyParameter.HUMAN_LIFE_OUTSIDE_MAIN_VEHICLE);
                        if (useDataExchange) {
                            result += getDataExchangeAddition(victimName, ConsequenceType.KILLED, parameters);
                        }
                        break;
                    case SEVERELY_INJURED:
                        result += parameters.get(PhilosophyParameter.HUMAN_SEVERE_INJURY_OUTSIDE_MAIN_VEHICLE);
                        if (useDataExchange) {
                            result += getDataExchangeAddition(victimName, ConsequenceType.SEVERELY_INJURED, parameters);
                        }
                        break;
                    case LIGHTLY_INJURED:
                        result += parameters.get(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_OUTSIDE_MAIN_VEHICLE);
                        if (useDataExchange) {
                            result += getDataExchangeAddition(victimName, ConsequenceType.LIGHTLY_INJURED, parameters);
                        }
                }
            } else if (factory.getAnimal(victimName) != null) {
                switch (consequenceType) {
                    case KILLED:
                        result += parameters.get(PhilosophyParameter.ANIMAL_LIFE);
                        break;
                    case SEVERELY_INJURED:
                        result += parameters.get(PhilosophyParameter.ANIMAL_SEVERE_INJURY);
                        break;
                    case LIGHTLY_INJURED:
                        result += parameters.get(PhilosophyParameter.ANIMAL_LIGHTLY_INJURY);
                }
            }
        }
        System.out.println(consequenceType.toString() + "  " + result);
        return result;
    }

    private float getDataExchangeAddition(String victimName, ConsequenceType consequence, HashMap<PhilosophyParameter, Float> parameters) {
        Human human = factory.getHuman(victimName);
        Float ratio = 0f;

        switch (consequence) {
            case KILLED:
                ratio = parameters.get(PhilosophyParameter.HUMAN_LIFE_RATIO);
                break;
            case LIGHTLY_INJURED:
                ratio = parameters.get(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_RATIO);
                break;
            case SEVERELY_INJURED:
                ratio = parameters.get(PhilosophyParameter.HUMAN_SEVERE_INJURY_RATIO);
                break;
            case NO_CONSEQUENCE:
                ratio = 0f;
                break;

        }
        float sum = 0f;

        //wiek
        Optional<? extends Integer> age = human.getAge().stream().findFirst();
        if (age.isPresent()) {
            if (age.get() < 25) {
                sum += parameters.get(PhilosophyParameter.AGE_ADDITION_RATIO);
            } else if (age.get() > 60) {
                sum -= parameters.get(PhilosophyParameter.AGE_ADDITION_RATIO);
            }
        }
        // zdrowie
        Optional<? extends String> health = human.getHealth().stream().findFirst();
        if (health.isPresent()) {
            if (health.get().equals("Healthy")) {
                sum += parameters.get(PhilosophyParameter.HEALTH_ADDITION_RATIO);
            } else if (health.get().equals("Not heealthy")) {
                sum -= parameters.get(PhilosophyParameter.HEALTH_ADDITION_RATIO);
            }
        }
        // fitness
        Optional<? extends String> fitness = human.getFitness().stream().findFirst();
        if (fitness.isPresent()) {
            if (fitness.get().equals("Fitness")) {
                sum += parameters.get(PhilosophyParameter.FITNESS_ADDITION_RATIO);
            } else if (fitness.get().equals("Not fitness")) {
                sum -= parameters.get(PhilosophyParameter.FITNESS_ADDITION_RATIO);
            }
        }
        // dzieci
        Optional<? extends Boolean> children = human.getHasChildren().stream().findFirst();
        if (children.isPresent()) {
            if (children.get()) {
                sum += parameters.get(PhilosophyParameter.HEALTH_ADDITION_RATIO);
            }
        }

        return sum * ratio;
    }
}

