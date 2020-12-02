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
 * Source Class: Pecuniary_penalty <br>
 * @version generated on Tue Dec 01 08:24:38 CET 2020 by Mateusz
 */

public interface Pecuniary_penalty extends Type_of_sentence {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_type_of_sentence
     */
     
    /**
     * Gets all property values for the has_type_of_sentence property.<p>
     * 
     * @returns a collection of values for the has_type_of_sentence property.
     */
    Collection<? extends WrappedIndividual> getHas_type_of_sentence();

    /**
     * Checks if the class has a has_type_of_sentence property value.<p>
     * 
     * @return true if there is a has_type_of_sentence property value.
     */
    boolean hasHas_type_of_sentence();

    /**
     * Adds a has_type_of_sentence property value.<p>
     * 
     * @param newHas_type_of_sentence the has_type_of_sentence property value to be added
     */
    void addHas_type_of_sentence(WrappedIndividual newHas_type_of_sentence);

    /**
     * Removes a has_type_of_sentence property value.<p>
     * 
     * @param oldHas_type_of_sentence the has_type_of_sentence property value to be removed.
     */
    void removeHas_type_of_sentence(WrappedIndividual oldHas_type_of_sentence);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/criminal_sentence_properties
     */
     
    /**
     * Gets all property values for the criminal_sentence_properties property.<p>
     * 
     * @returns a collection of values for the criminal_sentence_properties property.
     */
    Collection<? extends Object> getCriminal_sentence_properties();

    /**
     * Checks if the class has a criminal_sentence_properties property value.<p>
     * 
     * @return true if there is a criminal_sentence_properties property value.
     */
    boolean hasCriminal_sentence_properties();

    /**
     * Adds a criminal_sentence_properties property value.<p>
     * 
     * @param newCriminal_sentence_properties the criminal_sentence_properties property value to be added
     */
    void addCriminal_sentence_properties(Object newCriminal_sentence_properties);

    /**
     * Removes a criminal_sentence_properties property value.<p>
     * 
     * @param oldCriminal_sentence_properties the criminal_sentence_properties property value to be removed.
     */
    void removeCriminal_sentence_properties(Object oldCriminal_sentence_properties);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/judgement_passing_date
     */
     
    /**
     * Gets all property values for the judgement_passing_date property.<p>
     * 
     * @returns a collection of values for the judgement_passing_date property.
     */
    Collection<? extends Object> getJudgement_passing_date();

    /**
     * Checks if the class has a judgement_passing_date property value.<p>
     * 
     * @return true if there is a judgement_passing_date property value.
     */
    boolean hasJudgement_passing_date();

    /**
     * Adds a judgement_passing_date property value.<p>
     * 
     * @param newJudgement_passing_date the judgement_passing_date property value to be added
     */
    void addJudgement_passing_date(Object newJudgement_passing_date);

    /**
     * Removes a judgement_passing_date property value.<p>
     * 
     * @param oldJudgement_passing_date the judgement_passing_date property value to be removed.
     */
    void removeJudgement_passing_date(Object oldJudgement_passing_date);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/pecuniary_penalty_height_dollars
     */
     
    /**
     * Gets all property values for the pecuniary_penalty_height_dollars property.<p>
     * 
     * @returns a collection of values for the pecuniary_penalty_height_dollars property.
     */
    Collection<? extends Integer> getPecuniary_penalty_height_dollars();

    /**
     * Checks if the class has a pecuniary_penalty_height_dollars property value.<p>
     * 
     * @return true if there is a pecuniary_penalty_height_dollars property value.
     */
    boolean hasPecuniary_penalty_height_dollars();

    /**
     * Adds a pecuniary_penalty_height_dollars property value.<p>
     * 
     * @param newPecuniary_penalty_height_dollars the pecuniary_penalty_height_dollars property value to be added
     */
    void addPecuniary_penalty_height_dollars(Integer newPecuniary_penalty_height_dollars);

    /**
     * Removes a pecuniary_penalty_height_dollars property value.<p>
     * 
     * @param oldPecuniary_penalty_height_dollars the pecuniary_penalty_height_dollars property value to be removed.
     */
    void removePecuniary_penalty_height_dollars(Integer oldPecuniary_penalty_height_dollars);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
