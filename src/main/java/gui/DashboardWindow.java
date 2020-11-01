package gui;

import DilemmaDetector.Consequences.ConsequenceContainer;
import DilemmaDetector.Consequences.CustomPhilosophy;
import DilemmaDetector.Consequences.DecisionCostEvaluator;
import DilemmaDetector.Consequences.IConsequenceContainer;
import DilemmaDetector.Simulator.Actor;
import com.fasterxml.jackson.databind.ObjectMapper;
import generator.Model;
import gui.logic.BusinessLogic;

import org.apache.commons.lang3.StringUtils;
import project.Decision;
import project.MyFactory;
import visualization.Visualization;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class DashboardWindow extends JFrame implements ActionListener {

    private JButton jButtonLoadFromFile;
    private JLabel jLabelSelectedFile;
    private JButton jButtonLoadScenario;
    private JComboBox jComboBoxScenarios;
    private JButton jButtonGenerateScenario;
    private JLabel jLabelImageScenario;
    private JButton jButtonAddCustomPhilosophy;
    private JComboBox jComboBoxCustomPhilosophies;
    private JButton jButtonCalculate;
    private JLabel jLabelBestDecision;
    private JButton jButtonCustomPhilosophyInfo;

    private JLabel jLabelSelectPhilosophyPrompt;
    private JScrollPane jScrollPaneWithResults;


    /// CONST
    private String NO_FILE_SELECTED = "No file selected";
    private String NO_SCENARIO_TYPE_SELECTED = "No random scenario type selected";
    private String RANDOM_SCENARIO_TYPE = "Generated scenario type: ";
    private List<String> possibleScenariosList = new ArrayList<String>(Arrays.asList("Simple scenario",
            "Scenario with animals",
            "Scenario with crosswalk"));
    private int IMAGE_WIDTH = 820;
    private int IMAGE_HEIGHT = 400;

    private int CENTER_CUSTOM_PHILOSOPHIES = 100;

    //business logic variables
    private Map<Decision, Set<Actor>> collidedEntities;
    private Model scenarioModel;
    private MyFactory factory;
    private String pictureName;
    private IConsequenceContainer consequenceContainer;
    private Map<String, Integer> decisionCosts = new HashMap<>();
    private boolean isAnyCustomPhilosophy = true;


    public DashboardWindow() {

        factory = BusinessLogic.getFactory();

        setSize(880, 800);
        setResizable(false);
        setTitle("Moral dilemma detector");
        setLayout(null);


        jButtonLoadFromFile = new JButton("Load scenario from file");
        jButtonLoadFromFile.setBounds(20, 10, 400, 30);
        jButtonLoadFromFile.addActionListener(this);
        add(jButtonLoadFromFile);

        jLabelSelectedFile = new JLabel(NO_FILE_SELECTED, SwingConstants.CENTER);
        jLabelSelectedFile.setBounds(20, 40, 300, 30);
        add(jLabelSelectedFile);

        jButtonLoadScenario = new JButton("Load");
        jButtonLoadScenario.setBounds(320, 40, 100, 30);
        jButtonLoadScenario.addActionListener(this);
        add(jButtonLoadScenario);


        jComboBoxScenarios = new JComboBox(possibleScenariosList.toArray());
        jComboBoxScenarios.setBounds(440, 10, 400, 30);
        add(jComboBoxScenarios);


        jButtonGenerateScenario = new JButton("Generate");
        jButtonGenerateScenario.setBounds(440, 40, 400, 30);
        jButtonGenerateScenario.addActionListener(this);
        add(jButtonGenerateScenario);

        jLabelImageScenario = new JLabel(getStartingImageIcon());
        jLabelImageScenario.setBounds(20, 80, IMAGE_WIDTH, IMAGE_HEIGHT);
        add(jLabelImageScenario);

        jLabelSelectPhilosophyPrompt = new JLabel("Select custom philosophy");
        jLabelSelectPhilosophyPrompt.setBounds(50, 515, 200, 30);
        add(jLabelSelectPhilosophyPrompt);

        jButtonAddCustomPhilosophy = new JButton("Add new");
        jButtonAddCustomPhilosophy.setBounds(CENTER_CUSTOM_PHILOSOPHIES + 520, 500, 100, 30);
        jButtonAddCustomPhilosophy.addActionListener(this);
        add(jButtonAddCustomPhilosophy);


        jComboBoxCustomPhilosophies = new JComboBox(getCustomPhilosophiesNames().toArray());
        jComboBoxCustomPhilosophies.setBounds(CENTER_CUSTOM_PHILOSOPHIES + 220, 500, 300, 30);
        add(jComboBoxCustomPhilosophies);

        jButtonCustomPhilosophyInfo = new JButton("Info");
        jButtonCustomPhilosophyInfo.setBounds(CENTER_CUSTOM_PHILOSOPHIES + 220, 530, 200, 30);
        jButtonCustomPhilosophyInfo.addActionListener(this);
        add(jButtonCustomPhilosophyInfo);

        jButtonCalculate = new JButton("Calculate");
        jButtonCalculate.setBounds(CENTER_CUSTOM_PHILOSOPHIES + 420, 530, 200, 30);
        jButtonCalculate.addActionListener(this);
        add(jButtonCalculate);

        jLabelBestDecision = new JLabel("");
        jLabelBestDecision.setBounds(50, 600, 400, 30);
        jLabelBestDecision.setVisible(false);
        add(jLabelBestDecision);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object eventSource = e.getSource();

        if (eventSource == jButtonLoadFromFile) {
            JFileChooser jFileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                jLabelSelectedFile.setText(jFileChooser.getSelectedFile().getAbsolutePath());
            } else
                jLabelSelectedFile.setText(NO_FILE_SELECTED);
        }

        if (eventSource == jButtonLoadScenario) {
            WarningWindow warningWindow = new WarningWindow(this, "Not implemented yet");
            warningWindow.setVisible(true);
        }

        if (eventSource == jButtonCustomPhilosophyInfo) {
            WarningWindow warningWindow = new WarningWindow(this, "Not implemented yet");
            warningWindow.setVisible(true);
        }

        if (eventSource == jButtonGenerateScenario) {
            // różne rodzaje w zależności od comboboxa z rodzajami, na razie na sztywno
            scenarioModel = BusinessLogic.getModelFromGenerator(factory);
            pictureName = Visualization.generateImageAndGetName(scenarioModel);
            jLabelImageScenario.setIcon(
                    getImageIcon(System.getProperty("user.dir")
                            + "\\src\\main\\resources\\vis_out\\"
                            + pictureName));

            consequenceContainer = new ConsequenceContainer(factory);
            collidedEntities = BusinessLogic.getCollidedEntities(consequenceContainer, factory, scenarioModel);


        }


        if (eventSource == jButtonAddCustomPhilosophy) {
            CustomPhilosophyWindow customPhilosophyWindow = new CustomPhilosophyWindow(this);
            customPhilosophyWindow.setVisible(true);
        }


        if (eventSource == jButtonCalculate) {
            if (collidedEntities == null) {
                WarningWindow warningWindow = new WarningWindow(this, "Load or generate scenario");
                warningWindow.setVisible(true);
            } else {
                if (!isAnyCustomPhilosophy) {
                    WarningWindow warningWindow = new WarningWindow(this, "Add custom philosophy");
                    warningWindow.setVisible(true);
                } else {
                    // wczytujemy wybraną filozofię
                    String philosophyName = jComboBoxCustomPhilosophies.getSelectedItem().toString() + ".json";
                    CustomPhilosophy customPhilosophy = getCustomPhilosophyByName(philosophyName);
                    System.out.println(philosophyName);
                    System.out.println(customPhilosophy);

                    DecisionCostEvaluator decisionCostEvaluator =
                            new DecisionCostEvaluator(consequenceContainer, factory, customPhilosophy);

                    for (Decision decision : collidedEntities.keySet()) {
                        decisionCosts.put(getActionNameFromDecision(decision.toString()), decisionCostEvaluator.getSummarizedCostForDecision(decision));
                    }

                    String bestDecision = BusinessLogic.getOptimumDecision(decisionCosts);

                    jLabelBestDecision.setText("Best decision: " + bestDecision);
                    jLabelBestDecision.setVisible(true);

                    int numberOfDecisions = decisionCosts.size();


                    String[] columnNames = {"Action", "Moral cost"};
                    Object[][] data = new Object[numberOfDecisions][2];
                    int i = 0;
                    for(String decisionName : decisionCosts.keySet()){
                        data[i][0] = decisionName;
                        data[i][1] = decisionCosts.get(decisionName);
                        i++;
                    }
                    DefaultTableModel defaultTableModel = new DefaultTableModel(data, columnNames) {
                        private static final long serialVersionUID = 1L;
                    };
                    JTable jTable = new JTable(defaultTableModel);

                    jScrollPaneWithResults = new JScrollPane(jTable);
                    int jScrollPanelHeight = (jTable.getRowCount()+1)*jTable.getRowHeight() + 7;
                    if(jScrollPanelHeight > 150) jScrollPanelHeight = 150;
                    jScrollPaneWithResults.setBounds(CENTER_CUSTOM_PHILOSOPHIES + 220, 600, 400, jScrollPanelHeight);
                    add(jScrollPaneWithResults);
                    System.out.println("eleoe");
                }
            }

        }

    }

    public void updateCustomPhilosophiesList() {
        List<String> customPhilosophiesNames = getCustomPhilosophiesNames();
        int size = customPhilosophiesNames.size();
        String[] strings = new String[size];
        for (int i = 0; i < size; i++) {
            strings[i] = customPhilosophiesNames.get(i);
        }
        ComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(strings);
        jComboBoxCustomPhilosophies.setModel(comboBoxModel);
    }

    // poleci do innej klasy
    private ImageIcon getStartingImageIcon() {
        return getImageIcon(System.getProperty("user.dir") + "\\src\\main\\resources\\gui\\Blank_scenario.png");
    }

    // poleci do innej klasy
    private ImageIcon getImageIcon(String path) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT,
                Image.SCALE_SMOOTH);
        return new ImageIcon(dimg);
    }

    //do innej klasy
    public List<String> getCustomPhilosophiesNames() {
        File f = new File(System.getProperty("user.dir") +
                "\\src\\main\\resources\\gui\\customPhilosophies\\");
        List<String> customPhilosophiesNames = new ArrayList<>();
        for (String name : f.list()) {
            customPhilosophiesNames.add(StringUtils.substringBefore(name, ".json"));
        }
        if (customPhilosophiesNames.size() == 0) {
            customPhilosophiesNames.add("No custom philosophies yet");
            isAnyCustomPhilosophy = false;
        }
        isAnyCustomPhilosophy = true;
        return customPhilosophiesNames;
    }

    //do innej klasy
    public CustomPhilosophy getCustomPhilosophyByName(String name) {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(System.getProperty("user.dir") +
                "\\src\\main\\resources\\gui\\customPhilosophies\\" +
                name);
        CustomPhilosophy customPhilosophy = null;
        try {
            customPhilosophy = objectMapper.readValue(file, CustomPhilosophy.class);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return customPhilosophy;
    }

    //potencjalnie do innej klasy, ale potrzeba też konsultacji jak będziemy to rozwiazywać
    private String getActionNameFromDecision(String decisionString) {
        String tmp = StringUtils.substringAfter(decisionString, "has_action: _");
        return StringUtils.substringBefore(tmp, ";");
    }
}
