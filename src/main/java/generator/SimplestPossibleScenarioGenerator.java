//package generator;
//
//import project.Animal;
//import project.Driver;
//import project.Lane;
//import project.Living_entity;
//import project.MyFactory;
//import project.Passenger;
//import project.Road_type;
//import project.Scenario;
//import project.Surrounding;
//import project.Time;
//import project.Vehicle;
//import project.Weather;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//import java.util.TreeMap;
//
//
////Simp
//public class SimplestPossibleScenarioGenerator {
//    protected String baseIRI;
//    protected MyFactory factory;
//
//    protected Random rand;
//    protected RandomPositioner randomPositioner;
//    protected RandomSubclassGenerator subclassGenerator;
//
//    private int lanesCount;
//    private int mainVehicleLaneId;
//
//    public SimplestPossibleScenarioGenerator(MyFactory factory, String baseIRI) {
//        this.baseIRI = baseIRI;
//        this.factory = factory;
//        this.rand = new Random();
//        this.randomPositioner = new RandomPositioner();
//        this.subclassGenerator = new RandomSubclassGenerator(factory);
//
//        ObjectNamer.setInitScenarioId(factory.getAllScenarioInstances().size());
//    }
//
//    public Model generate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        // create scenario
//        Model model = new Model();
//        Scenario scenario = factory.createScenario(ObjectNamer.getName("scenario"));
//        model.setScenario(scenario);
//
//        // add objects
//        addRoad(model);
//        addEnvData(model);
//        addSurrounding(model);
//        addMainVehicle(model);
//        addAnimals(model);
//
//        return model;
//    }
//
//    private void addEnvData(Model model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        // create objects
//        Weather weather = subclassGenerator.generateWeatherSubclass(ObjectNamer.getName("weather"));
//        Time time = subclassGenerator.generateTimeSubclass(ObjectNamer.getName("time"));
//
//        // add to scenario
//        model.getScenario().addHas_weather(weather);
//        model.getScenario().addHas_time(time);
//
//        // add to model
//        model.setWeather(weather);
//        model.setTime(time);
//    }
//
//    private void addRoad(Model model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        Map<Model.Side, TreeMap<Integer, Lane>> lanes = new HashMap<>();
//        Map<Lane, ArrayList<Living_entity>> entities = new HashMap<>();
//        Map<Lane, ArrayList<Vehicle>> vehicles = new HashMap<>();
//
//        lanesCount = rand.nextInt(4) + 1;
//        mainVehicleLaneId = lanesCount / 2 + rand.nextInt((lanesCount + 1) / 2);
//
//        // create objects
//        Road_type roadType = subclassGenerator.generateRoadTypeSubclass(ObjectNamer.getName("road_type"));
//
//        // main lane
//        Lane lane_0 = factory.createLane(ObjectNamer.getName("lane_0"));
//        entities.put(lane_0, new ArrayList<Living_entity>() {});
//        vehicles.put(lane_0, new ArrayList<Vehicle>() {});
//        TreeMap<Integer, Lane> lane_center = new TreeMap<>() {{ put(0, lane_0); }};
//        lanes.put(Model.Side.CENTER, lane_center);
//
//        // right lanes
//        TreeMap<Integer, Lane> lanes_right = new TreeMap<>();
//        for (int i = 1; i < lanesCount - mainVehicleLaneId; i++) {
//            Lane lane = factory.createLane(ObjectNamer.getName("lane_right_" + i));
//            lanes_right.put(i, lane);
//            entities.put(lane, new ArrayList<Living_entity>() {});
//            vehicles.put(lane, new ArrayList<Vehicle>() {});
//        }
//        lanes.put(Model.Side.RIGHT, lanes_right);
//
//        // left lanes
//        TreeMap<Integer, Lane> lanes_left = new TreeMap<>();
//        for (int i = 1; i <= mainVehicleLaneId; i++) {
//            Lane lane = factory.createLane(ObjectNamer.getName("lane_left_" + i));
//            lanes_left.put(i, lane);
//            entities.put(lane, new ArrayList<Living_entity>() {
//            });
//            vehicles.put(lane, new ArrayList<Vehicle>() {
//            });
//        }
//        lanes.put(Model.Side.LEFT, lanes_left);
//
//        // add to scenario
//        model.getScenario().addHas_lane(lane_0);
//        for (Lane lane : lanes_left.values()) model.getScenario().addHas_lane(lane);
//        for (Lane lane : lanes_right.values()) model.getScenario().addHas_lane(lane);
//
//
//        // add data properties
//        roadType.addHas_lanes(lanesCount);
//        roadType.addHas_speed_limit_kmph(50 + 10 * rand.nextInt(9));
//
//        // add to model
//        model.setRoadType(roadType);
//        model.setLanes(lanes);
//        model.setEntities(entities);
//        model.setVehicles(vehicles);
//    }
//
//    private void addSurrounding(Model model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        Map<Model.Side, Surrounding> surrounding = new HashMap<>();
//
//        // create objects
//        Surrounding left_surrounding = subclassGenerator.generateSurroundingSubclass(ObjectNamer.getName("surrounding"));
//        surrounding.put(Model.Side.LEFT, left_surrounding);
//        Surrounding right_surrounding = subclassGenerator.generateSurroundingSubclass(ObjectNamer.getName("surrounding"));
//        surrounding.put(Model.Side.RIGHT, right_surrounding);
//
//        // add to model
//        model.setSurrounding(surrounding);
//    }
//
//    private void addMainVehicle(Model model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        int pass_count = rand.nextInt() % 5;
//
//        System.out.println("PASS COUNT   "  + pass_count);
//
//        // create objects
//        Vehicle vehicle = factory.createVehicle(ObjectNamer.getName("vehicle_main"));
//        Driver driver = factory.createDriver(ObjectNamer.getName("driver"));
//        ArrayList<Passenger> passengers = new ArrayList<>();
//        for (int i = 0; i < pass_count; i++)
//            passengers.add(subclassGenerator.generatePassengerSubclass(ObjectNamer.getName("passenger")));
//
//        // add to scenario
//        model.getScenario().addHas_vehicle(vehicle);
//
//        // add object properties
//        vehicle.addVehicle_has_driver(driver);
//        vehicle.addVehicle_has_location(model.getRoadType());
//        if (model.getLanes().get(Model.Side.RIGHT).isEmpty())
//            vehicle.addHas_on_the_right(model.getSurrounding().get(Model.Side.RIGHT));
//        else
//            vehicle.addHas_on_the_right(model.getLanes().get(Model.Side.RIGHT).get(1));
//        if (model.getLanes().get(Model.Side.LEFT).isEmpty())
//            vehicle.addHas_on_the_right(model.getSurrounding().get(Model.Side.LEFT));
//        else
//            vehicle.addHas_on_the_right(model.getLanes().get(Model.Side.LEFT).get(1));
//        for (Passenger passenger : passengers)
//            vehicle.addVehicle_has_passenger(passenger);
//
//        // add data properties
////        vehicle.addSpeedX((float) (50 + rand.nextInt(90)));
//        vehicle.addSpeedX(1000F);  //TODO is it in km/h or m/s ?
//        vehicle.addSpeedY(0F);
//        vehicle.addAccelerationX(0F);
//        vehicle.addAccelerationY(0F);
//        vehicle.addDistance(0F);
//        vehicle.addLength(500F);
//
//        // add to model
//        Lane lane = model.getLanes().get(Model.Side.CENTER).get(0);
//        model.getVehicles().get(lane).add(vehicle);
//        model.setDriver(driver);
//        model.setPassengers(passengers);
//        model.setVehicle(vehicle);
//    }
//
//    private void addVehicles(Model model) {
//        int lanesMovingRightCount = Math.max(lanesCount - mainVehicleLaneId, rand.nextInt((lanesCount+1)/2));
//        int lanesMovingLeftCount = lanesCount - lanesMovingRightCount;
//        int vehiclesCount = rand.nextInt(2*lanesCount);
//        float vehicleLength = 500F;
//
//        while(vehiclesCount > 0) {
//            int laneNo = randomPositioner.getRandomLaneNumber(lanesCount);
//            Lane vehicleLane = randomPositioner.getLane(model, laneNo);
//            float vehicleDistance = randomPositioner.getRandomDistance(model, vehicleLane, vehicleLength);
//
//            if(vehicleDistance == 0)
//                continue;
//
//            vehiclesCount -= 1;
//
//            // create objects
//            Vehicle vehicle = factory.createVehicle(ObjectNamer.getName("vehicle"));
//            Driver driver = factory.createDriver(ObjectNamer.getName("driver"));
//
//            // add to scenario
//            model.getScenario().addHas_vehicle(vehicle);
//
//            // add object properties
//            vehicle.addVehicle_has_driver(driver);
//            vehicle.addVehicle_has_location(model.getRoadType());
//
//            // add data properties
//            float vehicleSpeed = (float)(50 + rand.nextInt(90));
//            if(laneNo < lanesMovingLeftCount)
//                vehicleSpeed *= -1;
//
//            vehicle.addDistance(vehicleDistance);
//            vehicle.addLength(500F);
//            vehicle.addSpeedX(vehicleSpeed);
//            vehicle.addSpeedY(0F);
//            vehicle.addAccelerationY(0F);
//            vehicle.addAccelerationX(0F);
//
//            // add to model
//            model.getVehicles().get(vehicleLane).add(vehicle);
//        }
//    }
//
//    private void addAnimals(Model model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        int animalsCount = 2;
//        int j = 0;
//        while(animalsCount > 0) {
//            int laneNo = randomPositioner.getRandomLaneNumber(lanesCount);
//
////            int mainVehicleLaneNo = model.getLanes().get(Model.Side.LEFT).size() +j;
//            Lane lane = randomPositioner.getLane(model, laneNo);
//            float distance = 2000;  //it is in centimeters
//           if (distance == 0)
//                continue;
//
//            animalsCount -= 1;
//
//            // create objects
//            Animal animal = subclassGenerator.generateAnimalSubclass(ObjectNamer.getName("animal"));
//
//            // add to scenario
//            // TODO: ??
//
//            // add data properties
//            animal.addDistance(distance);
//            animal.addLength(20F);
//            animal.addWidth(20F);
//            animal.addSpeedX(0F);
//            animal.addSpeedY(0F);
//            animal.addAccelerationY(0F);
//            animal.addAccelerationX(0F);
//
//            // add to model
//            model.getLivingEntities().get(lane).add(animal);
//        }
//    }
//}