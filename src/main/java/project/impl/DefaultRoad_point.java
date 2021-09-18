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
 * Source Class: DefaultRoad_point <br>
 * @version generated on Sat Sep 18 09:53:34 CEST 2021 by barto
 */
public class DefaultRoad_point extends WrappedIndividualImpl implements Road_point {

    public DefaultRoad_point(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#latitude
     */
     
    public Collection<? extends String> getLatitude() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LATITUDE, String.class);
    }

    public boolean hasLatitude() {
		return !getLatitude().isEmpty();
    }

    public void addLatitude(String newLatitude) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LATITUDE, newLatitude);
    }

    public void removeLatitude(String oldLatitude) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LATITUDE, oldLatitude);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#longitude
     */
     
    public Collection<? extends String> getLongitude() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LONGITUDE, String.class);
    }

    public boolean hasLongitude() {
		return !getLongitude().isEmpty();
    }

    public void addLongitude(String newLongitude) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LONGITUDE, newLongitude);
    }

    public void removeLongitude(String oldLongitude) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LONGITUDE, oldLongitude);
    }


}
