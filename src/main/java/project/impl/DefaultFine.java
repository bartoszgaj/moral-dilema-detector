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
 * Source Class: DefaultFine <br>
 * @version generated on Tue Jul 07 20:59:15 CEST 2020 by Michał Barczyk
 */
public class DefaultFine extends WrappedIndividualImpl implements Fine {

    public DefaultFine(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_type_of_sentence
     */
     
    public Collection<? extends WrappedIndividual> getHas_type_of_sentence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_TYPE_OF_SENTENCE,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHas_type_of_sentence() {
	   return !getHas_type_of_sentence().isEmpty();
    }

    public void addHas_type_of_sentence(WrappedIndividual newHas_type_of_sentence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_TYPE_OF_SENTENCE,
                                       newHas_type_of_sentence);
    }

    public void removeHas_type_of_sentence(WrappedIndividual oldHas_type_of_sentence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_TYPE_OF_SENTENCE,
                                          oldHas_type_of_sentence);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/criminal_sentence_properties
     */
     
    public Collection<? extends Object> getCriminal_sentence_properties() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CRIMINAL_SENTENCE_PROPERTIES, Object.class);
    }

    public boolean hasCriminal_sentence_properties() {
		return !getCriminal_sentence_properties().isEmpty();
    }

    public void addCriminal_sentence_properties(Object newCriminal_sentence_properties) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CRIMINAL_SENTENCE_PROPERTIES, newCriminal_sentence_properties);
    }

    public void removeCriminal_sentence_properties(Object oldCriminal_sentence_properties) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_CRIMINAL_SENTENCE_PROPERTIES, oldCriminal_sentence_properties);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/judgement_passing_date
     */
     
    public Collection<? extends Object> getJudgement_passing_date() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_JUDGEMENT_PASSING_DATE, Object.class);
    }

    public boolean hasJudgement_passing_date() {
		return !getJudgement_passing_date().isEmpty();
    }

    public void addJudgement_passing_date(Object newJudgement_passing_date) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_JUDGEMENT_PASSING_DATE, newJudgement_passing_date);
    }

    public void removeJudgement_passing_date(Object oldJudgement_passing_date) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_JUDGEMENT_PASSING_DATE, oldJudgement_passing_date);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/pecuniary_penalty_height_dollars
     */
     
    public Collection<? extends Integer> getPecuniary_penalty_height_dollars() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PECUNIARY_PENALTY_HEIGHT_DOLLARS, Integer.class);
    }

    public boolean hasPecuniary_penalty_height_dollars() {
		return !getPecuniary_penalty_height_dollars().isEmpty();
    }

    public void addPecuniary_penalty_height_dollars(Integer newPecuniary_penalty_height_dollars) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PECUNIARY_PENALTY_HEIGHT_DOLLARS, newPecuniary_penalty_height_dollars);
    }

    public void removePecuniary_penalty_height_dollars(Integer oldPecuniary_penalty_height_dollars) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_PECUNIARY_PENALTY_HEIGHT_DOLLARS, oldPecuniary_penalty_height_dollars);
    }


}
