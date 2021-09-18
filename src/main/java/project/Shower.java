package project;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Shower <br>
 * @version generated on Sat Sep 18 09:53:33 CEST 2021 by barto
 */

public interface Shower extends Weather {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/weather_is
     */
     
    /**
     * Gets all property values for the weather_is property.<p>
     * 
     * @returns a collection of values for the weather_is property.
     */
    Collection<? extends Shower> getWeather_is();

    /**
     * Checks if the class has a weather_is property value.<p>
     * 
     * @return true if there is a weather_is property value.
     */
    boolean hasWeather_is();

    /**
     * Adds a weather_is property value.<p>
     * 
     * @param newWeather_is the weather_is property value to be added
     */
    void addWeather_is(Shower newWeather_is);

    /**
     * Removes a weather_is property value.<p>
     * 
     * @param oldWeather_is the weather_is property value to be removed.
     */
    void removeWeather_is(Shower oldWeather_is);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
