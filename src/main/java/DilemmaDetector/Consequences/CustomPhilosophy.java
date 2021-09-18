package DilemmaDetector.Consequences;

import java.util.HashMap;

public class CustomPhilosophy {
    private String philosophyName;

    private HashMap<PhilosophyParameter, Float> parameters = new HashMap<>();


    public String getPhilosophyName() {
        return philosophyName;
    }

    public HashMap<PhilosophyParameter, Float> getParameters() {
        return parameters;
    }

    public void setPhilosophyName(String philosophyName) {
        this.philosophyName = philosophyName;
    }


    public void setParametersFromHashMap(HashMap<String, Float> tableValues) {
        parameters.put(PhilosophyParameter.HUMAN_LIFE_INSIDE_MAIN_VEHICLE, tableValues.get("Human life inside main vehicle"));
        parameters.put(PhilosophyParameter.HUMAN_LIFE_OUTSIDE_MAIN_VEHICLE, tableValues.get("Human life outside main vehicle"));
        parameters.put(PhilosophyParameter.HUMAN_SEVERE_INJURY_INSIDE_MAIN_VEHICLE, tableValues.get("Human severe injury inside main vehicle"));
        parameters.put(PhilosophyParameter.HUMAN_SEVERE_INJURY_OUTSIDE_MAIN_VEHICLE, tableValues.get("Human severe injury outside main vehicle"));
        parameters.put(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_INSIDE_MAIN_VEHICLE, tableValues.get("Human lightly injury inside main vehicle"));
        parameters.put(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_OUTSIDE_MAIN_VEHICLE, tableValues.get("Human lightly injury outside main vehicle"));
        parameters.put(PhilosophyParameter.ANIMAL_LIFE, tableValues.get("Animal life"));
        parameters.put(PhilosophyParameter.ANIMAL_SEVERE_INJURY, tableValues.get("Animal severe injury"));
        parameters.put(PhilosophyParameter.ANIMAL_LIGHTLY_INJURY, tableValues.get("Animal lightly injury"));
        parameters.put(PhilosophyParameter.MATERIAL_VALUE, tableValues.get("Material damages per 1000$"));
//        parameters.put(PhilosophyParameter.BREAKING_THE_LAW, tableValues.get("Breaking the law"));
        parameters.put(PhilosophyParameter.TAKING_ACTION, tableValues.get("Taking action"));
        parameters.put(PhilosophyParameter.DILEMMA_THRESHOLD, tableValues.get("Dilemma threshold"));
        parameters.put(PhilosophyParameter.HUMAN_LIFE_RATIO, tableValues.get("Human life ratio"));
        parameters.put(PhilosophyParameter.HUMAN_SEVERE_INJURY_RATIO, tableValues.get("Human severe injury ratio"));
        parameters.put(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_RATIO, tableValues.get("Human lightly injury ratio"));
        parameters.put(PhilosophyParameter.AGE_ADDITION_RATIO, tableValues.get("Age addition ratio"));
        parameters.put(PhilosophyParameter.HEALTH_ADDITION_RATIO, tableValues.get("Health addition ratio"));
        parameters.put(PhilosophyParameter.WEIGHT_ADDITION_RATIO, tableValues.get("Weight addition ratio"));
        parameters.put(PhilosophyParameter.FITNESS_ADDITION_RATIO, tableValues.get("Fitness addition ratio"));
        parameters.put(PhilosophyParameter.CHILDREN_ADDITION_RATIO, tableValues.get("Children addition ratio"));
    }

    public static CustomPhilosophy getSimplestPhilosophy() {
        CustomPhilosophy customPhilosophy = new CustomPhilosophy();
        customPhilosophy.setPhilosophyName("Simple");
        for (PhilosophyParameter philosophyParameter : PhilosophyParameter.values()) {
            if (philosophyParameter.equals(PhilosophyParameter.HUMAN_LIFE_INSIDE_MAIN_VEHICLE) || philosophyParameter.equals(PhilosophyParameter.DILEMMA_THRESHOLD)) {
                customPhilosophy.getParameters().put(philosophyParameter, 1f);
            } else {
                customPhilosophy.getParameters().put(philosophyParameter, 0f);
            }
        }
        return customPhilosophy;
    }

    public static CustomPhilosophy getSimplestPhilosophyWithOnesForTest() {
        CustomPhilosophy customPhilosophy = new CustomPhilosophy();
        customPhilosophy.setPhilosophyName("SimpleWithOnes");
        for (PhilosophyParameter philosophyParameter : PhilosophyParameter.values()) {
                customPhilosophy.getParameters().put(philosophyParameter, 1f);
        }
        return customPhilosophy;
    }

    @Override
    public String toString() {
        return "CustomPhilosophy{" +
                "philosophyName='" + philosophyName + '\'' +
                ", parameters=" + parameters +
                '}';
    }

}
