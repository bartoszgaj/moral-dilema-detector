package commonadapter.server.logic.models;

import adapter.BaseItem;
import com.zeroc.Ice.Current;
import project.MyFactory;

public abstract class BaseItemImpl implements BaseItem {

    protected String id;
    protected MyFactory owlFactory;

    public BaseItemImpl(String id, MyFactory owlFactory) {
        this.id = id;
        this.owlFactory = owlFactory;
    }

    @Override
    public String getId(Current current) {
        return id;
    }

    public String getId() {
        return id;
    }
}