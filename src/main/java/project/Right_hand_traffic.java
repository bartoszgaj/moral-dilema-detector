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
 * Source Class: Right_hand_traffic <br>
 * @version generated on Tue Dec 01 08:24:38 CET 2020 by Mateusz
 */

public interface Right_hand_traffic extends Traffic_type {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/traffic_code_has
     */
     
    /**
     * Gets all property values for the traffic_code_has property.<p>
     * 
     * @returns a collection of values for the traffic_code_has property.
     */
    Collection<? extends Left_hand_traffic> getTraffic_code_has();

    /**
     * Checks if the class has a traffic_code_has property value.<p>
     * 
     * @return true if there is a traffic_code_has property value.
     */
    boolean hasTraffic_code_has();

    /**
     * Adds a traffic_code_has property value.<p>
     * 
     * @param newTraffic_code_has the traffic_code_has property value to be added
     */
    void addTraffic_code_has(Left_hand_traffic newTraffic_code_has);

    /**
     * Removes a traffic_code_has property value.<p>
     * 
     * @param oldTraffic_code_has the traffic_code_has property value to be removed.
     */
    void removeTraffic_code_has(Left_hand_traffic oldTraffic_code_has);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/traffic_type_is
     */
     
    /**
     * Gets all property values for the traffic_type_is property.<p>
     * 
     * @returns a collection of values for the traffic_type_is property.
     */
    Collection<? extends Left_hand_traffic> getTraffic_type_is();

    /**
     * Checks if the class has a traffic_type_is property value.<p>
     * 
     * @return true if there is a traffic_type_is property value.
     */
    boolean hasTraffic_type_is();

    /**
     * Adds a traffic_type_is property value.<p>
     * 
     * @param newTraffic_type_is the traffic_type_is property value to be added
     */
    void addTraffic_type_is(Left_hand_traffic newTraffic_type_is);

    /**
     * Removes a traffic_type_is property value.<p>
     * 
     * @param oldTraffic_type_is the traffic_type_is property value to be removed.
     */
    void removeTraffic_type_is(Left_hand_traffic oldTraffic_type_is);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
