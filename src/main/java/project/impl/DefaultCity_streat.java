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
 * Source Class: DefaultCity_streat <br>
 * @version generated on Sat Sep 18 09:05:47 CEST 2021 by barto
 */
public class DefaultCity_streat extends WrappedIndividualImpl implements City_streat {

    public DefaultCity_streat(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_at_the_back
     */
     
    public Collection<? extends Entity> getHas_at_the_back() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                               DefaultEntity.class);
    }

    public boolean hasHas_at_the_back() {
	   return !getHas_at_the_back().isEmpty();
    }

    public void addHas_at_the_back(Entity newHas_at_the_back) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                       newHas_at_the_back);
    }

    public void removeHas_at_the_back(Entity oldHas_at_the_back) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                          oldHas_at_the_back);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_in_the_front
     */
     
    public Collection<? extends Entity> getHas_in_the_front() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                               DefaultEntity.class);
    }

    public boolean hasHas_in_the_front() {
	   return !getHas_in_the_front().isEmpty();
    }

    public void addHas_in_the_front(Entity newHas_in_the_front) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                       newHas_in_the_front);
    }

    public void removeHas_in_the_front(Entity oldHas_in_the_front) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                          oldHas_in_the_front);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_on_the_left
     */
     
    public Collection<? extends Entity> getHas_on_the_left() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                               DefaultEntity.class);
    }

    public boolean hasHas_on_the_left() {
	   return !getHas_on_the_left().isEmpty();
    }

    public void addHas_on_the_left(Entity newHas_on_the_left) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                       newHas_on_the_left);
    }

    public void removeHas_on_the_left(Entity oldHas_on_the_left) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                          oldHas_on_the_left);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_on_the_right
     */
     
    public Collection<? extends Entity> getHas_on_the_right() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                               DefaultEntity.class);
    }

    public boolean hasHas_on_the_right() {
	   return !getHas_on_the_right().isEmpty();
    }

    public void addHas_on_the_right(Entity newHas_on_the_right) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                       newHas_on_the_right);
    }

    public void removeHas_on_the_right(Entity oldHas_on_the_right) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                          oldHas_on_the_right);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_close_distance
     */
     
    public Collection<? extends Entity> getHas_within_close_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                               DefaultEntity.class);
    }

    public boolean hasHas_within_close_distance() {
	   return !getHas_within_close_distance().isEmpty();
    }

    public void addHas_within_close_distance(Entity newHas_within_close_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                       newHas_within_close_distance);
    }

    public void removeHas_within_close_distance(Entity oldHas_within_close_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                          oldHas_within_close_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_far_distance
     */
     
    public Collection<? extends Entity> getHas_within_far_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                               DefaultEntity.class);
    }

    public boolean hasHas_within_far_distance() {
	   return !getHas_within_far_distance().isEmpty();
    }

    public void addHas_within_far_distance(Entity newHas_within_far_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                       newHas_within_far_distance);
    }

    public void removeHas_within_far_distance(Entity oldHas_within_far_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                          oldHas_within_far_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_very_close_distance
     */
     
    public Collection<? extends Entity> getHas_within_very_close_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                               DefaultEntity.class);
    }

    public boolean hasHas_within_very_close_distance() {
	   return !getHas_within_very_close_distance().isEmpty();
    }

    public void addHas_within_very_close_distance(Entity newHas_within_very_close_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                       newHas_within_very_close_distance);
    }

    public void removeHas_within_very_close_distance(Entity oldHas_within_very_close_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                          oldHas_within_very_close_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/road_has_type
     */
     
    public Collection<? extends Highway> getRoad_has_type() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ROAD_HAS_TYPE,
                                               DefaultHighway.class);
    }

    public boolean hasRoad_has_type() {
	   return !getRoad_has_type().isEmpty();
    }

    public void addRoad_has_type(Highway newRoad_has_type) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ROAD_HAS_TYPE,
                                       newRoad_has_type);
    }

    public void removeRoad_has_type(Highway oldRoad_has_type) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ROAD_HAS_TYPE,
                                          oldRoad_has_type);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/surrounding_item_distance
     */
     
    public Collection<? extends Entity> getSurrounding_item_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SURROUNDING_ITEM_DISTANCE,
                                               DefaultEntity.class);
    }

    public boolean hasSurrounding_item_distance() {
	   return !getSurrounding_item_distance().isEmpty();
    }

    public void addSurrounding_item_distance(Entity newSurrounding_item_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SURROUNDING_ITEM_DISTANCE,
                                       newSurrounding_item_distance);
    }

    public void removeSurrounding_item_distance(Entity oldSurrounding_item_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SURROUNDING_ITEM_DISTANCE,
                                          oldSurrounding_item_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/surrounding_item_location
     */
     
    public Collection<? extends Entity> getSurrounding_item_location() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SURROUNDING_ITEM_LOCATION,
                                               DefaultEntity.class);
    }

    public boolean hasSurrounding_item_location() {
	   return !getSurrounding_item_location().isEmpty();
    }

    public void addSurrounding_item_location(Entity newSurrounding_item_location) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SURROUNDING_ITEM_LOCATION,
                                       newSurrounding_item_location);
    }

    public void removeSurrounding_item_location(Entity oldSurrounding_item_location) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SURROUNDING_ITEM_LOCATION,
                                          oldSurrounding_item_location);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#is_on_lane
     */
     
    public Collection<? extends Lane> getIs_on_lane() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_IS_ON_LANE,
                                               DefaultLane.class);
    }

    public boolean hasIs_on_lane() {
	   return !getIs_on_lane().isEmpty();
    }

    public void addIs_on_lane(Lane newIs_on_lane) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_IS_ON_LANE,
                                       newIs_on_lane);
    }

    public void removeIs_on_lane(Lane oldIs_on_lane) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_IS_ON_LANE,
                                          oldIs_on_lane);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#on_lane
     */
     
    public Collection<? extends Lane> getOn_lane() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ON_LANE,
                                               DefaultLane.class);
    }

    public boolean hasOn_lane() {
	   return !getOn_lane().isEmpty();
    }

    public void addOn_lane(Lane newOn_lane) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ON_LANE,
                                       newOn_lane);
    }

    public void removeOn_lane(Lane oldOn_lane) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ON_LANE,
                                          oldOn_lane);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/has_lanes
     */
     
    public Collection<? extends Integer> getHas_lanes() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_LANES, Integer.class);
    }

    public boolean hasHas_lanes() {
		return !getHas_lanes().isEmpty();
    }

    public void addHas_lanes(Integer newHas_lanes) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_LANES, newHas_lanes);
    }

    public void removeHas_lanes(Integer oldHas_lanes) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_LANES, oldHas_lanes);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/has_speed_limit_km/h
     */
     
    public Collection<? extends Integer> getHas_speed_limit_kmph() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_SPEED_LIMIT_KMPH, Integer.class);
    }

    public boolean hasHas_speed_limit_kmph() {
		return !getHas_speed_limit_kmph().isEmpty();
    }

    public void addHas_speed_limit_kmph(Integer newHas_speed_limit_kmph) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_SPEED_LIMIT_KMPH, newHas_speed_limit_kmph);
    }

    public void removeHas_speed_limit_kmph(Integer oldHas_speed_limit_kmph) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_SPEED_LIMIT_KMPH, oldHas_speed_limit_kmph);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#accelerationX
     */
     
    public Collection<? extends Float> getAccelerationX() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACCELERATIONX, Float.class);
    }

    public boolean hasAccelerationX() {
		return !getAccelerationX().isEmpty();
    }

    public void addAccelerationX(Float newAccelerationX) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACCELERATIONX, newAccelerationX);
    }

    public void removeAccelerationX(Float oldAccelerationX) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACCELERATIONX, oldAccelerationX);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#accelerationY
     */
     
    public Collection<? extends Float> getAccelerationY() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACCELERATIONY, Float.class);
    }

    public boolean hasAccelerationY() {
		return !getAccelerationY().isEmpty();
    }

    public void addAccelerationY(Float newAccelerationY) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACCELERATIONY, newAccelerationY);
    }

    public void removeAccelerationY(Float oldAccelerationY) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ACCELERATIONY, oldAccelerationY);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#distance
     */
     
    public Collection<? extends Float> getDistance() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DISTANCE, Float.class);
    }

    public boolean hasDistance() {
		return !getDistance().isEmpty();
    }

    public void addDistance(Float newDistance) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DISTANCE, newDistance);
    }

    public void removeDistance(Float oldDistance) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DISTANCE, oldDistance);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#distanceToRoad
     */
     
    public Collection<? extends Float> getDistanceToRoad() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DISTANCETOROAD, Float.class);
    }

    public boolean hasDistanceToRoad() {
		return !getDistanceToRoad().isEmpty();
    }

    public void addDistanceToRoad(Float newDistanceToRoad) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DISTANCETOROAD, newDistanceToRoad);
    }

    public void removeDistanceToRoad(Float oldDistanceToRoad) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DISTANCETOROAD, oldDistanceToRoad);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#lanes_count
     */
     
    public Collection<? extends Integer> getLanes_count() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LANES_COUNT, Integer.class);
    }

    public boolean hasLanes_count() {
		return !getLanes_count().isEmpty();
    }

    public void addLanes_count(Integer newLanes_count) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LANES_COUNT, newLanes_count);
    }

    public void removeLanes_count(Integer oldLanes_count) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LANES_COUNT, oldLanes_count);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#left_lanes_count
     */
     
    public Collection<? extends Integer> getLeft_lanes_count() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LEFT_LANES_COUNT, Integer.class);
    }

    public boolean hasLeft_lanes_count() {
		return !getLeft_lanes_count().isEmpty();
    }

    public void addLeft_lanes_count(Integer newLeft_lanes_count) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LEFT_LANES_COUNT, newLeft_lanes_count);
    }

    public void removeLeft_lanes_count(Integer oldLeft_lanes_count) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LEFT_LANES_COUNT, oldLeft_lanes_count);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#length
     */
     
    public Collection<? extends Float> getLength() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LENGTH, Float.class);
    }

    public boolean hasLength() {
		return !getLength().isEmpty();
    }

    public void addLength(Float newLength) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LENGTH, newLength);
    }

    public void removeLength(Float oldLength) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_LENGTH, oldLength);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#main_vehicle_lane_id
     */
     
    public Collection<? extends Integer> getMain_vehicle_lane_id() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAIN_VEHICLE_LANE_ID, Integer.class);
    }

    public boolean hasMain_vehicle_lane_id() {
		return !getMain_vehicle_lane_id().isEmpty();
    }

    public void addMain_vehicle_lane_id(Integer newMain_vehicle_lane_id) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAIN_VEHICLE_LANE_ID, newMain_vehicle_lane_id);
    }

    public void removeMain_vehicle_lane_id(Integer oldMain_vehicle_lane_id) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAIN_VEHICLE_LANE_ID, oldMain_vehicle_lane_id);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#right_lanes_count
     */
     
    public Collection<? extends Integer> getRight_lanes_count() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RIGHT_LANES_COUNT, Integer.class);
    }

    public boolean hasRight_lanes_count() {
		return !getRight_lanes_count().isEmpty();
    }

    public void addRight_lanes_count(Integer newRight_lanes_count) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RIGHT_LANES_COUNT, newRight_lanes_count);
    }

    public void removeRight_lanes_count(Integer oldRight_lanes_count) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_RIGHT_LANES_COUNT, oldRight_lanes_count);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#speedX
     */
     
    public Collection<? extends Float> getSpeedX() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEEDX, Float.class);
    }

    public boolean hasSpeedX() {
		return !getSpeedX().isEmpty();
    }

    public void addSpeedX(Float newSpeedX) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEEDX, newSpeedX);
    }

    public void removeSpeedX(Float oldSpeedX) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEEDX, oldSpeedX);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#speedY
     */
     
    public Collection<? extends Float> getSpeedY() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEEDY, Float.class);
    }

    public boolean hasSpeedY() {
		return !getSpeedY().isEmpty();
    }

    public void addSpeedY(Float newSpeedY) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEEDY, newSpeedY);
    }

    public void removeSpeedY(Float oldSpeedY) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SPEEDY, oldSpeedY);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#valueInDollars
     */
     
    public Collection<? extends Float> getValueInDollars() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALUEINDOLLARS, Float.class);
    }

    public boolean hasValueInDollars() {
		return !getValueInDollars().isEmpty();
    }

    public void addValueInDollars(Float newValueInDollars) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALUEINDOLLARS, newValueInDollars);
    }

    public void removeValueInDollars(Float oldValueInDollars) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALUEINDOLLARS, oldValueInDollars);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#width
     */
     
    public Collection<? extends Float> getWidth() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WIDTH, Float.class);
    }

    public boolean hasWidth() {
		return !getWidth().isEmpty();
    }

    public void addWidth(Float newWidth) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WIDTH, newWidth);
    }

    public void removeWidth(Float oldWidth) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WIDTH, oldWidth);
    }


}
