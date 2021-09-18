package gui;


import DilemmaDetector.Consequences.CustomPhilosophy;
import DilemmaDetector.Consequences.PhilosophyParameter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.io.IOException;
import java.util.HashMap;

public abstract class CustomPhilosophyWindow extends JFrame {

    protected JTable jTable;
    protected JScrollPane jScrollPane;
    protected DashboardWindow dashboardWindow;
    private String[] columnNames = {"Parameter", "Moral value"};

    public CustomPhilosophyWindow(DashboardWindow dashboardWindow){
        setSize(430, 450);
        setResizable(false);
        setTitle("Moral dilemma detector");
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dashboardWindow = dashboardWindow;
    }

    protected Object[][] prepareData(CustomPhilosophy customPhilosophy) {
        HashMap<PhilosophyParameter, Float> parameters = customPhilosophy.getParameters();
        Object[][] data = {
                {"Human life inside main vehicle", parameters.get(PhilosophyParameter.HUMAN_LIFE_INSIDE_MAIN_VEHICLE)},
                {"Human life outside main vehicle", parameters.get(PhilosophyParameter.HUMAN_LIFE_OUTSIDE_MAIN_VEHICLE)},
                {"Human severe injury inside main vehicle", parameters.get(PhilosophyParameter.HUMAN_SEVERE_INJURY_INSIDE_MAIN_VEHICLE)},
                {"Human severe injury outside main vehicle", parameters.get(PhilosophyParameter.HUMAN_SEVERE_INJURY_OUTSIDE_MAIN_VEHICLE)},
                {"Human lightly injury inside main vehicle", parameters.get(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_INSIDE_MAIN_VEHICLE)},
                {"Human lightly injury outside main vehicle", parameters.get(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_OUTSIDE_MAIN_VEHICLE)},
                {"Animal life", parameters.get(PhilosophyParameter.ANIMAL_LIFE)},
                {"Animal severe injury", parameters.get(PhilosophyParameter.ANIMAL_SEVERE_INJURY)},
                {"Animal lightly injury", parameters.get(PhilosophyParameter.ANIMAL_LIGHTLY_INJURY)},
                {"Material damages per 1000$", parameters.get(PhilosophyParameter.MATERIAL_VALUE)},
                {"Taking action", parameters.get(PhilosophyParameter.TAKING_ACTION)},
                {"Dilemma threshold", parameters.get(PhilosophyParameter.DILEMMA_THRESHOLD)},
                {"Human life ratio", parameters.get(PhilosophyParameter.HUMAN_LIFE_RATIO)},
                {"Human severe injury ratio", parameters.get(PhilosophyParameter.HUMAN_SEVERE_INJURY_RATIO)},
                {"Human lightly injury ratio", parameters.get(PhilosophyParameter.HUMAN_LIGHTLY_INJURY_RATIO)},
                {"Age addition ratio", parameters.get(PhilosophyParameter.AGE_ADDITION_RATIO)},
                {"Health addition ratio", parameters.get(PhilosophyParameter.HEALTH_ADDITION_RATIO)},
                {"Weight addition ratio", parameters.get(PhilosophyParameter.WEIGHT_ADDITION_RATIO)},
                {"Fitness addition ratio", parameters.get(PhilosophyParameter.FITNESS_ADDITION_RATIO)},
                {"Children addition ratio", parameters.get(PhilosophyParameter.CHILDREN_ADDITION_RATIO)},
        };
        return data;
    }


    protected HashMap<String, Float> getTableValues() {
        HashMap<String, Float> result = new HashMap<>();

        for (int i = 0; i < jTable.getRowCount(); i++) {
            result.put((String) jTable.getValueAt(i, 0), this.parse(jTable.getValueAt(i, 1)));
        }
        return result;
    }

    private Float parse(Object valueAt) {
        System.out.println(valueAt);
        if (valueAt instanceof String) {
            return Float.valueOf( (String) valueAt);
        } else
            return (Float) valueAt;
    }

    protected DefaultTableModel getDefaultTableModel(Object[][] data) {
        DefaultTableModel defaultTableModel = new DefaultTableModel(data, columnNames) {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return column == 1;
            }
        };
        return defaultTableModel;
    }

    protected void prepareJTableToEditing() {
        jTable.setSurrendersFocusOnKeystroke(true);
        TableColumnModel tableColumnModel = jTable.getColumnModel();
        tableColumnModel.getColumn(1).setCellEditor(new DefaultCellEditor(new JTextField()));

        tableColumnModel.getColumn(0).setPreferredWidth(250);
        tableColumnModel.getColumn(1).setPreferredWidth(75);

        jTable.setPreferredScrollableViewportSize(jTable.getPreferredSize());
        jTable.setShowHorizontalLines(true);
        jTable.setShowVerticalLines(false);
    }

    protected String mapObjectToJSON(Object object) {
        ObjectMapper Obj = new ObjectMapper();
        Obj.enable(SerializationFeature.INDENT_OUTPUT);
        String jsonStr = null;
        try {

            jsonStr = Obj.writeValueAsString(object);
            System.out.println(jsonStr);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return jsonStr;
    }

    protected String getFullPathOfFileForGivenPhilosophyName(String philosophyName ){
          return  System.getProperty("user.dir") +
            "\\src\\main\\resources\\gui\\customPhilosophies\\" + philosophyName + ".json";
    }

    protected void closeWindowWithoutAction(){
        setVisible(false);
        dispose();
    }



}

