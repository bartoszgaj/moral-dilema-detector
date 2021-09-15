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
 * Source Class: DefaultPriority_right <br>
 * @version generated on Thu Sep 16 00:32:04 CEST 2021 by barto
 */
public class DefaultPriority_right extends WrappedIndividualImpl implements Priority_right {

    public DefaultPriority_right(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/traffic_code_has
     */
     
    public Collection<? extends Left_hand_traffic> getTraffic_code_has() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TRAFFIC_CODE_HAS,
                                               DefaultLeft_hand_traffic.class);
    }

    public boolean hasTraffic_code_has() {
	   return !getTraffic_code_has().isEmpty();
    }

    public void addTraffic_code_has(Left_hand_traffic newTraffic_code_has) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TRAFFIC_CODE_HAS,
                                       newTraffic_code_has);
    }

    public void removeTraffic_code_has(Left_hand_traffic oldTraffic_code_has) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TRAFFIC_CODE_HAS,
                                          oldTraffic_code_has);
    }


}
