package commonadapter.server.logic.models;

import com.zeroc.Ice.Current;
import commonadapter.server.logic.services.OntologyService;
import org.protege.owl.codegeneration.WrappedIndividual;
import adapter.Weather;

public class WeatherImpl extends BaseItemImpl implements Weather {

    private project.Weather weather;

    public WeatherImpl(String id, project.Weather weather, OntologyService ontologyService) {
        super(id, ontologyService);
        this.weather = weather;
    }

    @Override
    public WrappedIndividual getWrappedIndividual() {
        return weather;
    }

    @Override
    public void setWind(String wind, Current current) {
        return;
    }

    @Override
    public void setTemperature(String temperature, Current current) {
        return;
    }
}
