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
 * Source Class: DefaultLeft_hand_traffic <br>
 * @version generated on Sat Oct 24 13:29:42 CEST 2020 by Michał Barczyk
 */
public class DefaultLeft_hand_traffic extends WrappedIndividualImpl implements Left_hand_traffic {

    public DefaultLeft_hand_traffic(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/traffic_code_has
     */
     
    public Collection<? extends Traffic_type> getTraffic_code_has() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TRAFFIC_CODE_HAS,
                                               DefaultTraffic_type.class);
    }

    public boolean hasTraffic_code_has() {
	   return !getTraffic_code_has().isEmpty();
    }

    public void addTraffic_code_has(Traffic_type newTraffic_code_has) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TRAFFIC_CODE_HAS,
                                       newTraffic_code_has);
    }

    public void removeTraffic_code_has(Traffic_type oldTraffic_code_has) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TRAFFIC_CODE_HAS,
                                          oldTraffic_code_has);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/traffic_type_is
     */
     
    public Collection<? extends Left_hand_traffic> getTraffic_type_is() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TRAFFIC_TYPE_IS,
                                               DefaultLeft_hand_traffic.class);
    }

    public boolean hasTraffic_type_is() {
	   return !getTraffic_type_is().isEmpty();
    }

    public void addTraffic_type_is(Left_hand_traffic newTraffic_type_is) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TRAFFIC_TYPE_IS,
                                       newTraffic_type_is);
    }

    public void removeTraffic_type_is(Left_hand_traffic oldTraffic_type_is) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TRAFFIC_TYPE_IS,
                                          oldTraffic_type_is);
    }


}
