package generatorGUI;

import org.apache.commons.lang3.ArrayUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

abstract class ScenarioPanel extends JPanel implements ValueHandler {
    private Set<Component> enableList = new HashSet<Component>();

    protected void disableInputFields() {
        Arrays.stream(this.getComponents())
                .filter(c -> c instanceof JPanel)
                .map(JPanel.class::cast)
                .forEach(c -> Arrays.stream(c.getComponents())
                        .forEach(d -> d.setEnabled(false)));
    }

    protected void disableComponents() {
        for(Component c : this.getComponents()) {
            if(c instanceof JPanel) {
                for(Component d : ((JPanel) c).getComponents()) {
                    disableComponent(d);
                }
            }
            else {
                disableComponent(c);
            }
        }
    }

    private void disableComponent(Component c) {
        if(c.isEnabled()) {
            enableList.add(c);
            c.setEnabled(false);
        }
    }

    protected void enableComponents() {
        enableList.forEach(c -> c.setEnabled(true));
        enableList.clear();
    }


    protected int[] getObjectsNumbers(JSpinner jSpinner) {
        int maxValue;
        maxValue = getJSpinnerValue(jSpinner);

        int[] objectNumbers = new int[maxValue];
        for(int i = 0; i < maxValue; i++)
            objectNumbers[i] = i+1;
        return objectNumbers;
    }

    protected double[] getProbabilities(TextField textField) {
        try {
            return ArrayUtils.toPrimitive(Arrays.stream(textField.getText().split(",")).map(Double::valueOf).toArray(Double[]::new));
        } catch(NumberFormatException ex) {
            showExceptionWindow("Wrong format of probability value");
            throw new IllegalArgumentException();
        }
    }

    protected double getProbability(TextField textField) {
        try {
            return Double.parseDouble(textField.getText());
        } catch(NumberFormatException ex) {
            showExceptionWindow("Wrong format of probability value");
            throw new IllegalArgumentException();
        }
    }

    protected JPanel getProbabilitiesPanel(int y, JSpinner maxValue, TextField probabilityTextField, JCheckBox checkbox) {
        JPanel probabilitiesPanel = new JPanel();
        probabilitiesPanel.setLayout(null);
        probabilitiesPanel.setBounds(450, y, 400, 30);

        JLabel maxObjectsLabel = new JLabel("max objects:");
        maxObjectsLabel.setBounds(0, 0, 80, 30);
        probabilitiesPanel.add(maxObjectsLabel);

        maxValue.setBounds(80, 3, 50, 24);
        probabilitiesPanel.add(maxValue);

        JLabel probabilitiesLabel = new JLabel("probabilities:");
        probabilitiesLabel.setBounds(150, 0, 80, 30);
        probabilitiesPanel.add(probabilitiesLabel);

        probabilityTextField.setBounds(230, 3, 170, 24);
        probabilitiesPanel.add(probabilityTextField);

        checkbox.addItemListener(e -> {
            maxObjectsLabel.setEnabled(checkbox.isSelected());
            maxValue.setEnabled(checkbox.isSelected());
            probabilitiesLabel.setEnabled(checkbox.isSelected());
            probabilityTextField.setEnabled(checkbox.isSelected());
            probabilityTextField.setText("1");
        });

        maxValue.addChangeListener(e -> updateProbability(maxValue, probabilityTextField));

        return probabilitiesPanel;
    }

    private void updateProbability(JSpinner maxValue, TextField probabilityTextField) {
        int jSpinnerValue = getJSpinnerValue(maxValue);
        probabilityTextField.setText(getDefaultProbabilities(jSpinnerValue));
    }

    private String getDefaultProbabilities(int maxValue) {
        if(maxValue == 0)
            return "0";
        double probability = Math.floor(100.0 / maxValue) / 100.0;
        String probabilityStr = Double.toString(probability);
        StringBuilder returnStr = new StringBuilder().append(probabilityStr);
        for(int i = 1; i < maxValue; i++)
            returnStr.append(", ").append(probabilityStr);
        return returnStr.toString();
    }

    protected JPanel getProbabilityPanel(int y, TextField probabilityTextField,  JCheckBox checkbox) {
        JPanel probabilitiesPanel = new JPanel();
        probabilitiesPanel.setLayout(null);
        probabilitiesPanel.setBounds(450, y, 400, 30);

        JLabel probabilitiesLabel = new JLabel("probabilitity:");
        probabilitiesLabel.setBounds(0, 0, 80, 30);
        probabilitiesPanel.add(probabilitiesLabel);

        probabilityTextField.setBounds(80, 3, 50, 24);
        probabilitiesPanel.add(probabilityTextField);

        checkbox.addItemListener(e -> {
            probabilitiesLabel.setEnabled(checkbox.isSelected());
            probabilityTextField.setEnabled(checkbox.isSelected());
            probabilityTextField.setText("0.1");
        });

        return probabilitiesPanel;
    }
}