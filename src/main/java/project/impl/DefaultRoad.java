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
 * Source Class: DefaultRoad <br>
 * @version generated on Tue Dec 01 08:24:38 CET 2020 by Mateusz
 */
public class DefaultRoad extends WrappedIndividualImpl implements Road {

    public DefaultRoad(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#ends
     */
     
    public Collection<? extends Road_point> getEnds() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ENDS,
                                               DefaultRoad_point.class);
    }

    public boolean hasEnds() {
	   return !getEnds().isEmpty();
    }

    public void addEnds(Road_point newEnds) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ENDS,
                                       newEnds);
    }

    public void removeEnds(Road_point oldEnds) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ENDS,
                                          oldEnds);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_road_attributes
     */
     
    public Collection<? extends Road_attributes> getHas_road_attributes() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ROAD_ATTRIBUTES,
                                               DefaultRoad_attributes.class);
    }

    public boolean hasHas_road_attributes() {
	   return !getHas_road_attributes().isEmpty();
    }

    public void addHas_road_attributes(Road_attributes newHas_road_attributes) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ROAD_ATTRIBUTES,
                                       newHas_road_attributes);
    }

    public void removeHas_road_attributes(Road_attributes oldHas_road_attributes) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ROAD_ATTRIBUTES,
                                          oldHas_road_attributes);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#starts
     */
     
    public Collection<? extends Road_point> getStarts() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_STARTS,
                                               DefaultRoad_point.class);
    }

    public boolean hasStarts() {
	   return !getStarts().isEmpty();
    }

    public void addStarts(Road_point newStarts) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_STARTS,
                                       newStarts);
    }

    public void removeStarts(Road_point oldStarts) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_STARTS,
                                          oldStarts);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#average_speed
     */

    public Collection<? extends Integer> getAverage_speed() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AVERAGE_SPEED, Integer.class);
    }

    public boolean hasAverage_speed() {
		return !getAverage_speed().isEmpty();
    }

    public void addAverage_speed(Integer newAverage_speed) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AVERAGE_SPEED, newAverage_speed);
    }

    public void removeAverage_speed(Integer oldAverage_speed) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AVERAGE_SPEED, oldAverage_speed);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#end_angle
     */
     
    public Collection<? extends Float> getEnd_angle() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_END_ANGLE, Float.class);
    }

    public boolean hasEnd_angle() {
		return !getEnd_angle().isEmpty();
    }

    public void addEnd_angle(Float newEnd_angle) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_END_ANGLE, newEnd_angle);
    }

    public void removeEnd_angle(Float oldEnd_angle) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_END_ANGLE, oldEnd_angle);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#speed_limit
     */

    public Collection<? extends Integer> getSpeed_limit() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEED_LIMIT, Integer.class);
    }

    public boolean hasSpeed_limit() {
		return !getSpeed_limit().isEmpty();
    }

    public void addSpeed_limit(Integer newSpeed_limit) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEED_LIMIT, newSpeed_limit);
    }

    public void removeSpeed_limit(Integer oldSpeed_limit) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEED_LIMIT, oldSpeed_limit);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#start_angle
     */
     
    public Collection<? extends Float> getStart_angle() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_START_ANGLE, Float.class);
    }

    public boolean hasStart_angle() {
		return !getStart_angle().isEmpty();
    }

    public void addStart_angle(Float newStart_angle) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_START_ANGLE, newStart_angle);
    }

    public void removeStart_angle(Float oldStart_angle) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_START_ANGLE, oldStart_angle);
    }


}
