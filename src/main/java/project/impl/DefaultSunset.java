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
 * Source Class: DefaultSunset <br>
 * @version generated on Fri Sep 04 18:08:07 CEST 2020 by Michał Barczyk
 */
public class DefaultSunset extends WrappedIndividualImpl implements Sunset {

    public DefaultSunset(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/time_is
     */
     
    public Collection<? extends Daytime> getTime_is() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TIME_IS,
                                               DefaultDaytime.class);
    }

    public boolean hasTime_is() {
	   return !getTime_is().isEmpty();
    }

    public void addTime_is(Daytime newTime_is) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TIME_IS,
                                       newTime_is);
    }

    public void removeTime_is(Daytime oldTime_is) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TIME_IS,
                                          oldTime_is);
    }


}
