package DilemmaDetector.Consequences;

import javax.management.ListenerNotFoundException;

public enum PhilosophyParameter {


    HUMAN_LIFE_INSIDE_MAIN_VEHICLE("humanLifeInsideMainVehicle"),
    HUMAN_LIFE_OUTSIDE_MAIN_VEHICLE("humanLifeOutsideMainVehicle"),
    HUMAN_SEVERE_INJURY_INSIDE_MAIN_VEHICLE("humanSevereInjuryInsideMainVehicle"),
    HUMAN_SEVERE_INJURY_OUTSIDE_MAIN_VEHICLE("humanSevereInjuryOutsideMainVehicle"),
    HUMAN_LIGHTLY_INJURY_INSIDE_MAIN_VEHICLE("humanLightlyInjuryInsideMainVehicle"),
    HUMAN_LIGHTLY_INJURY_OUTSIDE_MAIN_VEHICLE("humanLightlyInjuryOutsideMainVehicle"),
    ANIMAL_LIFE("animalLife"),
    ANIMAL_SEVERE_INJURY("animalSevereInjury"),
    ANIMAL_LIGHTLY_INJURY("animalLightlyInjury"),
    MATERIAL_VALUE("materialValue"),
    BREAKING_THE_LAW("breakingTheLaw"),
    TAKING_ACTION("takingAction"),
    DILEMMA_THRESHOLD("dilemmaThreshold"),

    HUMAN_LIFE_RATIO("humanLifeRatio"),
    HUMAN_SEVERE_INJURY_RATIO("humanSevereInjuryRatio"),
    HUMAN_LIGHTLY_INJURY_RATIO("humanLightlyInjuryRatio"),

    //if injured -> AGE_ADDITION_RATIO * HUMAN_LIFE_INSIDE_MAIN_VEHICLE
    AGE_ADDITION_RATIO("ageAdditionRatio"),
    HEALTH_ADDITION_RATIO("healthAdditionRatio"),
    WEIGHT_ADDITION_RATIO("weightAdditionRatio"),
    FITNESS_ADDITION_RATIO("fitnessAdditionRatio"),
    CHILDREN_ADDITION_RATIO("childrenAdditionRatio"),

    ;
    private String parameter;

    PhilosophyParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }
}
