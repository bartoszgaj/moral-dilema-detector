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
 * Source Class: DefaultDrug_offences <br>
 * @version generated on Sat Oct 24 13:29:42 CEST 2020 by Michał Barczyk
 */
public class DefaultDrug_offences extends WrappedIndividualImpl implements Drug_offences {

    public DefaultDrug_offences(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_type_of_crime
     */
     
    public Collection<? extends WrappedIndividual> getHas_type_of_crime() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_TYPE_OF_CRIME,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHas_type_of_crime() {
	   return !getHas_type_of_crime().isEmpty();
    }

    public void addHas_type_of_crime(WrappedIndividual newHas_type_of_crime) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_TYPE_OF_CRIME,
                                       newHas_type_of_crime);
    }

    public void removeHas_type_of_crime(WrappedIndividual oldHas_type_of_crime) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_TYPE_OF_CRIME,
                                          oldHas_type_of_crime);
    }


}
