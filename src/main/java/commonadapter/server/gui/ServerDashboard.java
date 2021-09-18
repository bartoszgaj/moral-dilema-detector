package commonadapter.server.gui;

import com.zeroc.IceInternal.Ex;
import commonadapter.logging.LogMessageType;
import commonadapter.logging.Logger;
import commonadapter.server.logic.Server;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import project.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;


public class ServerDashboard extends JFrame implements ActionListener {

    private Server server;
    private boolean first = true;
    private Thread serverThread;
    private String owlFilePath;
    private String scenarioFilePath;

    private JButton selectOntologyButton;
    private JButton startServerButton;
    private JButton stopServerButton;
    private JButton readScenarioButton;
    private OWLFactory myFactory;


    public ServerDashboard() {

        setSize(460, 300);
        setResizable(false);
        setTitle("Common Scenario Adapter - Server");
        setLayout(null);

        prepareDashboard();
    }

    private void prepareDashboard() {

        selectOntologyButton = new JButton("Select file with ontology");
        selectOntologyButton.setBounds(20, 20, 400, 50);
        selectOntologyButton.addActionListener(this);
        add(selectOntologyButton);

        startServerButton = new JButton("Start Server");
        startServerButton.setBounds(20, 90, 400, 50);
        startServerButton.addActionListener(this);
        startServerButton.setVisible(false);
        add(startServerButton);

        stopServerButton = new JButton("Stop Server");
        stopServerButton.setBounds(20, 90, 400, 50);
        stopServerButton.addActionListener(this);
        stopServerButton.setVisible(false);
        add(stopServerButton);

        readScenarioButton = new JButton("Read scenario");
        readScenarioButton.setBounds(20, 160, 400, 50);
        readScenarioButton.addActionListener(this);
        readScenarioButton.setVisible(false);
        add(readScenarioButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object eventSource = e.getSource();

        if (eventSource == selectOntologyButton) selectOntologyAction();

        if (eventSource == startServerButton) startServerAction();

        if (eventSource == stopServerButton) stopServerAction();
        
        if (eventSource == readScenarioButton) readScenario();

    }

    private void readScenario() {
        if (scenarioFilePath == null) {
            JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                scenarioFilePath = chooser.getSelectedFile().getAbsolutePath();
            }
        }

        try {
            prepareOntology();
        } catch (OWLOntologyCreationException ex) {
            Logger.printLogMessage("unable to load ontology from file", LogMessageType.ERROR);
        }


        try (Stream<String> stream = Files.lines(Paths.get(scenarioFilePath))) {
            stream.forEach(this::readLine);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void prepareOntology() throws OWLOntologyCreationException {

        File ontologyFile = new File(owlFilePath);

        OWLOntologyManager ontologyManager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = ontologyManager.loadOntologyFromOntologyDocument(ontologyFile);

        this.myFactory = new OWLFactory(ontology);
    }

    private void readLine(String line) {
        String type = line.substring(0, line.indexOf(":"));
        String[] data = line.substring(line.indexOf(":") + 1).split(" ");

        switch (type) {
            case "VEHICLE":
                if(first) {
                    readMainVehicle(data);
                    first = false;
                } else {
                    readVehicle(data);
                }
                break;
            case "PASSENGER":
                readPassenger(data);
                break;
            case "PEDESTRIAN":
                readPedestrian(data);
                break;
            case "BIKER":
                readBiker(data);
                break;
        }
    }

    private void readBiker(String[] data) {
        Cyclist cyclist = myFactory.createCyclist(data[1]);
        cyclist.addAge(Integer.parseInt(data[2]));
        cyclist.addGender(data[3]);
        cyclist.addHealth(data[4]);
        cyclist.addWeight(Integer.parseInt(data[5]));
        cyclist.addFitness(data[6]);
        cyclist.addHasChildren(Boolean.parseBoolean(data[7]));
    }

    private void readPedestrian(String[] data) {
        Pedestrian pedestrian = myFactory.createPedestrian(data[1]);
        pedestrian.addAge(Integer.parseInt(data[2]));
        pedestrian.addGender(data[3]);
        pedestrian.addHealth(data[4]);
        pedestrian.addWeight(Integer.parseInt(data[5]));
        pedestrian.addFitness(data[6]);
        pedestrian.addHasChildren(Boolean.parseBoolean(data[7]));
    }

    private void readPassenger(String[] data) {
        Vehicle vehicle = myFactory.getVehicle(data[2]);
        Passenger passenger = myFactory.createPassenger(data[1]);
        passenger.addSeat(data[3]);
        passenger.addHasSeatbelt(Boolean.parseBoolean(data[4]));
        passenger.addAge(Integer.parseInt(data[5]));
        passenger.addGender(data[6]);
        passenger.addHealth(data[7]);
        passenger.addWeight(Integer.parseInt(data[8]));
        passenger.addFitness(data[9]);
        passenger.addHasChildren(Boolean.parseBoolean(data[10]));
        vehicle.addVehicle_has_passenger(passenger);
    }

    private void readVehicle(String[] data) {
    }

    private void readMainVehicle(String[] data) {

    }


    private void selectOntologyAction() {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "OWL Ontology Files", "owl");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            owlFilePath = chooser.getSelectedFile().getAbsolutePath();
            startServerButton.setVisible(true);
        }



    }

    private void startServerAction() {

        server = new Server(owlFilePath);

        serverThread = new Thread(server);

        serverThread.start();

        startServerButton.setVisible(false);
        stopServerButton.setVisible(true);
        readScenarioButton.setVisible(true);
    }

    private void stopServerAction() {

        server.shutdown();

    }

}
