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
 * Source Class: Honk <br>
 * @version generated on Thu Sep 16 00:32:03 CEST 2021 by barto
 */

public interface Honk extends Other_driver_action {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#performed_by
     */
     
    /**
     * Gets all property values for the performed_by property.<p>
     * 
     * @returns a collection of values for the performed_by property.
     */
    Collection<? extends Vehicle> getPerformed_by();

    /**
     * Checks if the class has a performed_by property value.<p>
     * 
     * @return true if there is a performed_by property value.
     */
    boolean hasPerformed_by();

    /**
     * Adds a performed_by property value.<p>
     * 
     * @param newPerformed_by the performed_by property value to be added
     */
    void addPerformed_by(Vehicle newPerformed_by);

    /**
     * Removes a performed_by property value.<p>
     * 
     * @param oldPerformed_by the performed_by property value to be removed.
     */
    void removePerformed_by(Vehicle oldPerformed_by);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
