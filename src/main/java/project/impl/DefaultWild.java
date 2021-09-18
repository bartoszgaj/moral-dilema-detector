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
 * Source Class: DefaultWild <br>
 * @version generated on Sat Sep 18 09:53:34 CEST 2021 by barto
 */
public class DefaultWild extends WrappedIndividualImpl implements Wild {

    public DefaultWild(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/animal_has_spieces
     */
     
    public Collection<? extends WrappedIndividual> getAnimal_has_spieces() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ANIMAL_HAS_SPIECES,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasAnimal_has_spieces() {
	   return !getAnimal_has_spieces().isEmpty();
    }

    public void addAnimal_has_spieces(WrappedIndividual newAnimal_has_spieces) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ANIMAL_HAS_SPIECES,
                                       newAnimal_has_spieces);
    }

    public void removeAnimal_has_spieces(WrappedIndividual oldAnimal_has_spieces) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ANIMAL_HAS_SPIECES,
                                          oldAnimal_has_spieces);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/criminal_record
     */
     
    public Collection<? extends Criminal_record> getCriminal_record() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_CRIMINAL_RECORD,
                                               DefaultCriminal_record.class);
    }

    public boolean hasCriminal_record() {
	   return !getCriminal_record().isEmpty();
    }

    public void addCriminal_record(Criminal_record newCriminal_record) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_CRIMINAL_RECORD,
                                       newCriminal_record);
    }

    public void removeCriminal_record(Criminal_record oldCriminal_record) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_CRIMINAL_RECORD,
                                          oldCriminal_record);
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
     * Object Property http://webprotege.stanford.edu/human_makes_decision
     */
     
    public Collection<? extends Decision> getHuman_makes_decision() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HUMAN_MAKES_DECISION,
                                               DefaultDecision.class);
    }

    public boolean hasHuman_makes_decision() {
	   return !getHuman_makes_decision().isEmpty();
    }

    public void addHuman_makes_decision(Decision newHuman_makes_decision) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HUMAN_MAKES_DECISION,
                                       newHuman_makes_decision);
    }

    public void removeHuman_makes_decision(Decision oldHuman_makes_decision) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HUMAN_MAKES_DECISION,
                                          oldHuman_makes_decision);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/human_profession
     */
     
    public Collection<? extends Human_profession> getHuman_profession() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HUMAN_PROFESSION,
                                               DefaultHuman_profession.class);
    }

    public boolean hasHuman_profession() {
	   return !getHuman_profession().isEmpty();
    }

    public void addHuman_profession(Human_profession newHuman_profession) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HUMAN_PROFESSION,
                                       newHuman_profession);
    }

    public void removeHuman_profession(Human_profession oldHuman_profession) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HUMAN_PROFESSION,
                                          oldHuman_profession);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/human_properties
     */
     
    public Collection<? extends WrappedIndividual> getHuman_properties() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HUMAN_PROPERTIES,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHuman_properties() {
	   return !getHuman_properties().isEmpty();
    }

    public void addHuman_properties(WrappedIndividual newHuman_properties) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HUMAN_PROPERTIES,
                                       newHuman_properties);
    }

    public void removeHuman_properties(WrappedIndividual oldHuman_properties) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HUMAN_PROPERTIES,
                                          oldHuman_properties);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/move_forward
     */
     
    public Collection<? extends WrappedIndividual> getMove_forward() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_MOVE_FORWARD,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasMove_forward() {
	   return !getMove_forward().isEmpty();
    }

    public void addMove_forward(WrappedIndividual newMove_forward) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_MOVE_FORWARD,
                                       newMove_forward);
    }

    public void removeMove_forward(WrappedIndividual oldMove_forward) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_MOVE_FORWARD,
                                          oldMove_forward);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/pedestrian_has_location
     */
     
    public Collection<? extends Road_segment> getPedestrian_has_location() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_HAS_LOCATION,
                                               DefaultRoad_segment.class);
    }

    public boolean hasPedestrian_has_location() {
	   return !getPedestrian_has_location().isEmpty();
    }

    public void addPedestrian_has_location(Road_segment newPedestrian_has_location) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_HAS_LOCATION,
                                       newPedestrian_has_location);
    }

    public void removePedestrian_has_location(Road_segment oldPedestrian_has_location) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_HAS_LOCATION,
                                          oldPedestrian_has_location);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/pedestrian_makes_action
     */
     
    public Collection<? extends Pedestrian_action> getPedestrian_makes_action() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_MAKES_ACTION,
                                               DefaultPedestrian_action.class);
    }

    public boolean hasPedestrian_makes_action() {
	   return !getPedestrian_makes_action().isEmpty();
    }

    public void addPedestrian_makes_action(Pedestrian_action newPedestrian_makes_action) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_MAKES_ACTION,
                                       newPedestrian_makes_action);
    }

    public void removePedestrian_makes_action(Pedestrian_action oldPedestrian_makes_action) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PEDESTRIAN_MAKES_ACTION,
                                          oldPedestrian_makes_action);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/profession
     */
     
    public Collection<? extends WrappedIndividual> getProfession() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PROFESSION,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasProfession() {
	   return !getProfession().isEmpty();
    }

    public void addProfession(WrappedIndividual newProfession) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PROFESSION,
                                       newProfession);
    }

    public void removeProfession(WrappedIndividual oldProfession) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PROFESSION,
                                          oldProfession);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/stop
     */
     
    public Collection<? extends WrappedIndividual> getStop() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_STOP,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasStop() {
	   return !getStop().isEmpty();
    }

    public void addStop(WrappedIndividual newStop) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_STOP,
                                       newStop);
    }

    public void removeStop(WrappedIndividual oldStop) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_STOP,
                                          oldStop);
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
     * Data Property http://webprotege.stanford.edu/age
     */
     
    public Collection<? extends Integer> getAge() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AGE, Integer.class);
    }

    public boolean hasAge() {
		return !getAge().isEmpty();
    }

    public void addAge(Integer newAge) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AGE, newAge);
    }

    public void removeAge(Integer oldAge) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_AGE, oldAge);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/animal_has_species
     */
     
    public Collection<? extends String> getAnimal_has_species() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ANIMAL_HAS_SPECIES, String.class);
    }

    public boolean hasAnimal_has_species() {
		return !getAnimal_has_species().isEmpty();
    }

    public void addAnimal_has_species(String newAnimal_has_species) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ANIMAL_HAS_SPECIES, newAnimal_has_species);
    }

    public void removeAnimal_has_species(String oldAnimal_has_species) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ANIMAL_HAS_SPECIES, oldAnimal_has_species);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/gender
     */
     
    public Collection<? extends String> getGender() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_GENDER, String.class);
    }

    public boolean hasGender() {
		return !getGender().isEmpty();
    }

    public void addGender(String newGender) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_GENDER, newGender);
    }

    public void removeGender(String oldGender) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_GENDER, oldGender);
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
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#fitness
     */
     
    public Collection<? extends String> getFitness() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FITNESS, String.class);
    }

    public boolean hasFitness() {
		return !getFitness().isEmpty();
    }

    public void addFitness(String newFitness) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FITNESS, newFitness);
    }

    public void removeFitness(String oldFitness) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_FITNESS, oldFitness);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#hasChildren
     */
     
    public Collection<? extends Boolean> getHasChildren() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCHILDREN, Boolean.class);
    }

    public boolean hasHasChildren() {
		return !getHasChildren().isEmpty();
    }

    public void addHasChildren(Boolean newHasChildren) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCHILDREN, newHasChildren);
    }

    public void removeHasChildren(Boolean oldHasChildren) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCHILDREN, oldHasChildren);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#health
     */
     
    public Collection<? extends String> getHealth() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HEALTH, String.class);
    }

    public boolean hasHealth() {
		return !getHealth().isEmpty();
    }

    public void addHealth(String newHealth) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HEALTH, newHealth);
    }

    public void removeHealth(String oldHealth) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HEALTH, oldHealth);
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
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#weight
     */
     
    public Collection<? extends Integer> getWeight() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WEIGHT, Integer.class);
    }

    public boolean hasWeight() {
		return !getWeight().isEmpty();
    }

    public void addWeight(Integer newWeight) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WEIGHT, newWeight);
    }

    public void removeWeight(Integer oldWeight) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_WEIGHT, oldWeight);
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
