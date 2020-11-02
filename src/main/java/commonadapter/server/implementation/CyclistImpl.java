package commonadapter.server.implementation;

import adapter.Cyclist;
import project.MyFactory;

public class CyclistImpl extends EntityImpl implements Cyclist {

    private project.Cyclist cyclist;

    public CyclistImpl(String id, MyFactory owlFactory) {
        super(id, owlFactory);
        super.entity = this.cyclist = owlFactory.createCyclist(id);
    }
}
