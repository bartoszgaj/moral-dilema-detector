package commonadapter.server.implementation;

import adapter.Road;
import com.zeroc.Ice.Current;
import project.MyFactory;

public class RoadImpl extends BaseItemImpl implements Road {

    private project.Road road;

    public RoadImpl(String id, MyFactory owlFactory) {
        super(id, owlFactory);
        this.road = owlFactory.createRoad(id);
    }

    @Override
    public void setStartAngle(float angle, Current current) {

        this.road.addStart_angle(angle);
    }

    @Override
    public void setEndAngle(float angle, Current current) {

        this.road.addEnd_angle(angle);
    }

    @Override
    public void setStarts(String roadPointId, Current current) {

        project.Road_point roadPoint = owlFactory.getRoad_point(roadPointId);
        this.road.addStarts(roadPoint);
    }

    @Override
    public void setEnds(String roadPointId, Current current) {

        project.Road_point roadPoint = owlFactory.getRoad_point(roadPointId);
        this.road.addEnds(roadPoint);
    }

    @Override
    public void setRoadAttributes(String roadAttributesId, Current current) {

        project.Road_attributes attributes = owlFactory.getRoad_attributes(roadAttributesId);
        this.road.addHas_road_attributes(attributes);
    }


}