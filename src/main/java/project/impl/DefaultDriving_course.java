package project.impl;

import project.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultDriving_course <br>
 * @version generated on Sun Nov 15 23:20:32 CET 2020 by Michał Barczyk
 */
public class DefaultDriving_course extends WrappedIndividualImpl implements Driving_course {

    public DefaultDriving_course(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#performed_by
     */
     
    public Collection<? extends Vehicle> getPerformed_by() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PERFORMED_BY,
                                               DefaultVehicle.class);
    }

    public boolean hasPerformed_by() {
	   return !getPerformed_by().isEmpty();
    }

    public void addPerformed_by(Vehicle newPerformed_by) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PERFORMED_BY,
                                       newPerformed_by);
    }

    public void removePerformed_by(Vehicle oldPerformed_by) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PERFORMED_BY,
                                          oldPerformed_by);
    }


}
