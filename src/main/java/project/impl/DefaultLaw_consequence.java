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
 * Source Class: DefaultLaw_consequence <br>
 * @version generated on Thu Nov 12 17:28:25 CET 2020 by Piotr
 */
public class DefaultLaw_consequence extends WrappedIndividualImpl implements Law_consequence {

    public DefaultLaw_consequence(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_broken_law
     */
     
    public Collection<? extends Laws> getHas_broken_law() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_BROKEN_LAW,
                                               DefaultLaws.class);
    }

    public boolean hasHas_broken_law() {
	   return !getHas_broken_law().isEmpty();
    }

    public void addHas_broken_law(Laws newHas_broken_law) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_BROKEN_LAW,
                                       newHas_broken_law);
    }

    public void removeHas_broken_law(Laws oldHas_broken_law) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_BROKEN_LAW,
                                          oldHas_broken_law);
    }


}
