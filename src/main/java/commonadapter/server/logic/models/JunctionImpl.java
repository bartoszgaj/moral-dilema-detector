package commonadapter.server.logic.models;

import adapter.Junction;
import project.MyFactory;

public class JunctionImpl extends RoadPointImpl implements Junction {

    private project.Junction junction;

    public JunctionImpl(String id, project.Junction junction, MyFactory owlFactory) {
        super(id, owlFactory);
        super.roadPoint = this.junction = junction;
    }
}