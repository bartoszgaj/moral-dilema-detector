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
 * Source Class: Police_on_traffic_duty <br>
 * @version generated on Sat Oct 17 14:25:25 CEST 2020 by Michał Barczyk
 */

public interface Police_on_traffic_duty extends Human {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/age
     */
     
    /**
     * Gets all property values for the age property.<p>
     * 
     * @returns a collection of values for the age property.
     */
    Collection<? extends WrappedIndividual> getAge();

    /**
     * Checks if the class has a age property value.<p>
     * 
     * @return true if there is a age property value.
     */
    boolean hasAge();

    /**
     * Adds a age property value.<p>
     * 
     * @param newAge the age property value to be added
     */
    void addAge(WrappedIndividual newAge);

    /**
     * Removes a age property value.<p>
     * 
     * @param oldAge the age property value to be removed.
     */
    void removeAge(WrappedIndividual oldAge);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/criminal_record
     */
     
    /**
     * Gets all property values for the criminal_record property.<p>
     * 
     * @returns a collection of values for the criminal_record property.
     */
    Collection<? extends Criminal_record> getCriminal_record();

    /**
     * Checks if the class has a criminal_record property value.<p>
     * 
     * @return true if there is a criminal_record property value.
     */
    boolean hasCriminal_record();

    /**
     * Adds a criminal_record property value.<p>
     * 
     * @param newCriminal_record the criminal_record property value to be added
     */
    void addCriminal_record(Criminal_record newCriminal_record);

    /**
     * Removes a criminal_record property value.<p>
     * 
     * @param oldCriminal_record the criminal_record property value to be removed.
     */
    void removeCriminal_record(Criminal_record oldCriminal_record);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/gender
     */
     
    /**
     * Gets all property values for the gender property.<p>
     * 
     * @returns a collection of values for the gender property.
     */
    Collection<? extends WrappedIndividual> getGender();

    /**
     * Checks if the class has a gender property value.<p>
     * 
     * @return true if there is a gender property value.
     */
    boolean hasGender();

    /**
     * Adds a gender property value.<p>
     * 
     * @param newGender the gender property value to be added
     */
    void addGender(WrappedIndividual newGender);

    /**
     * Removes a gender property value.<p>
     * 
     * @param oldGender the gender property value to be removed.
     */
    void removeGender(WrappedIndividual oldGender);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_at_the_back
     */
     
    /**
     * Gets all property values for the has_at_the_back property.<p>
     * 
     * @returns a collection of values for the has_at_the_back property.
     */
    Collection<? extends Entity> getHas_at_the_back();

    /**
     * Checks if the class has a has_at_the_back property value.<p>
     * 
     * @return true if there is a has_at_the_back property value.
     */
    boolean hasHas_at_the_back();

    /**
     * Adds a has_at_the_back property value.<p>
     * 
     * @param newHas_at_the_back the has_at_the_back property value to be added
     */
    void addHas_at_the_back(Entity newHas_at_the_back);

    /**
     * Removes a has_at_the_back property value.<p>
     * 
     * @param oldHas_at_the_back the has_at_the_back property value to be removed.
     */
    void removeHas_at_the_back(Entity oldHas_at_the_back);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_in_the_front
     */
     
    /**
     * Gets all property values for the has_in_the_front property.<p>
     * 
     * @returns a collection of values for the has_in_the_front property.
     */
    Collection<? extends Entity> getHas_in_the_front();

    /**
     * Checks if the class has a has_in_the_front property value.<p>
     * 
     * @return true if there is a has_in_the_front property value.
     */
    boolean hasHas_in_the_front();

    /**
     * Adds a has_in_the_front property value.<p>
     * 
     * @param newHas_in_the_front the has_in_the_front property value to be added
     */
    void addHas_in_the_front(Entity newHas_in_the_front);

    /**
     * Removes a has_in_the_front property value.<p>
     * 
     * @param oldHas_in_the_front the has_in_the_front property value to be removed.
     */
    void removeHas_in_the_front(Entity oldHas_in_the_front);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_on_the_left
     */
     
    /**
     * Gets all property values for the has_on_the_left property.<p>
     * 
     * @returns a collection of values for the has_on_the_left property.
     */
    Collection<? extends Entity> getHas_on_the_left();

    /**
     * Checks if the class has a has_on_the_left property value.<p>
     * 
     * @return true if there is a has_on_the_left property value.
     */
    boolean hasHas_on_the_left();

    /**
     * Adds a has_on_the_left property value.<p>
     * 
     * @param newHas_on_the_left the has_on_the_left property value to be added
     */
    void addHas_on_the_left(Entity newHas_on_the_left);

    /**
     * Removes a has_on_the_left property value.<p>
     * 
     * @param oldHas_on_the_left the has_on_the_left property value to be removed.
     */
    void removeHas_on_the_left(Entity oldHas_on_the_left);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_on_the_right
     */
     
    /**
     * Gets all property values for the has_on_the_right property.<p>
     * 
     * @returns a collection of values for the has_on_the_right property.
     */
    Collection<? extends Entity> getHas_on_the_right();

    /**
     * Checks if the class has a has_on_the_right property value.<p>
     * 
     * @return true if there is a has_on_the_right property value.
     */
    boolean hasHas_on_the_right();

    /**
     * Adds a has_on_the_right property value.<p>
     * 
     * @param newHas_on_the_right the has_on_the_right property value to be added
     */
    void addHas_on_the_right(Entity newHas_on_the_right);

    /**
     * Removes a has_on_the_right property value.<p>
     * 
     * @param oldHas_on_the_right the has_on_the_right property value to be removed.
     */
    void removeHas_on_the_right(Entity oldHas_on_the_right);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_within_close_distance
     */
     
    /**
     * Gets all property values for the has_within_close_distance property.<p>
     * 
     * @returns a collection of values for the has_within_close_distance property.
     */
    Collection<? extends Entity> getHas_within_close_distance();

    /**
     * Checks if the class has a has_within_close_distance property value.<p>
     * 
     * @return true if there is a has_within_close_distance property value.
     */
    boolean hasHas_within_close_distance();

    /**
     * Adds a has_within_close_distance property value.<p>
     * 
     * @param newHas_within_close_distance the has_within_close_distance property value to be added
     */
    void addHas_within_close_distance(Entity newHas_within_close_distance);

    /**
     * Removes a has_within_close_distance property value.<p>
     * 
     * @param oldHas_within_close_distance the has_within_close_distance property value to be removed.
     */
    void removeHas_within_close_distance(Entity oldHas_within_close_distance);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_within_far_distance
     */
     
    /**
     * Gets all property values for the has_within_far_distance property.<p>
     * 
     * @returns a collection of values for the has_within_far_distance property.
     */
    Collection<? extends Entity> getHas_within_far_distance();

    /**
     * Checks if the class has a has_within_far_distance property value.<p>
     * 
     * @return true if there is a has_within_far_distance property value.
     */
    boolean hasHas_within_far_distance();

    /**
     * Adds a has_within_far_distance property value.<p>
     * 
     * @param newHas_within_far_distance the has_within_far_distance property value to be added
     */
    void addHas_within_far_distance(Entity newHas_within_far_distance);

    /**
     * Removes a has_within_far_distance property value.<p>
     * 
     * @param oldHas_within_far_distance the has_within_far_distance property value to be removed.
     */
    void removeHas_within_far_distance(Entity oldHas_within_far_distance);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_within_very_close_distance
     */
     
    /**
     * Gets all property values for the has_within_very_close_distance property.<p>
     * 
     * @returns a collection of values for the has_within_very_close_distance property.
     */
    Collection<? extends Entity> getHas_within_very_close_distance();

    /**
     * Checks if the class has a has_within_very_close_distance property value.<p>
     * 
     * @return true if there is a has_within_very_close_distance property value.
     */
    boolean hasHas_within_very_close_distance();

    /**
     * Adds a has_within_very_close_distance property value.<p>
     * 
     * @param newHas_within_very_close_distance the has_within_very_close_distance property value to be added
     */
    void addHas_within_very_close_distance(Entity newHas_within_very_close_distance);

    /**
     * Removes a has_within_very_close_distance property value.<p>
     * 
     * @param oldHas_within_very_close_distance the has_within_very_close_distance property value to be removed.
     */
    void removeHas_within_very_close_distance(Entity oldHas_within_very_close_distance);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/human_makes_decision
     */
     
    /**
     * Gets all property values for the human_makes_decision property.<p>
     * 
     * @returns a collection of values for the human_makes_decision property.
     */
    Collection<? extends Decision> getHuman_makes_decision();

    /**
     * Checks if the class has a human_makes_decision property value.<p>
     * 
     * @return true if there is a human_makes_decision property value.
     */
    boolean hasHuman_makes_decision();

    /**
     * Adds a human_makes_decision property value.<p>
     * 
     * @param newHuman_makes_decision the human_makes_decision property value to be added
     */
    void addHuman_makes_decision(Decision newHuman_makes_decision);

    /**
     * Removes a human_makes_decision property value.<p>
     * 
     * @param oldHuman_makes_decision the human_makes_decision property value to be removed.
     */
    void removeHuman_makes_decision(Decision oldHuman_makes_decision);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/human_profession
     */
     
    /**
     * Gets all property values for the human_profession property.<p>
     * 
     * @returns a collection of values for the human_profession property.
     */
    Collection<? extends Human_profession> getHuman_profession();

    /**
     * Checks if the class has a human_profession property value.<p>
     * 
     * @return true if there is a human_profession property value.
     */
    boolean hasHuman_profession();

    /**
     * Adds a human_profession property value.<p>
     * 
     * @param newHuman_profession the human_profession property value to be added
     */
    void addHuman_profession(Human_profession newHuman_profession);

    /**
     * Removes a human_profession property value.<p>
     * 
     * @param oldHuman_profession the human_profession property value to be removed.
     */
    void removeHuman_profession(Human_profession oldHuman_profession);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/human_properties
     */
     
    /**
     * Gets all property values for the human_properties property.<p>
     * 
     * @returns a collection of values for the human_properties property.
     */
    Collection<? extends WrappedIndividual> getHuman_properties();

    /**
     * Checks if the class has a human_properties property value.<p>
     * 
     * @return true if there is a human_properties property value.
     */
    boolean hasHuman_properties();

    /**
     * Adds a human_properties property value.<p>
     * 
     * @param newHuman_properties the human_properties property value to be added
     */
    void addHuman_properties(WrappedIndividual newHuman_properties);

    /**
     * Removes a human_properties property value.<p>
     * 
     * @param oldHuman_properties the human_properties property value to be removed.
     */
    void removeHuman_properties(WrappedIndividual oldHuman_properties);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/move_forward
     */
     
    /**
     * Gets all property values for the move_forward property.<p>
     * 
     * @returns a collection of values for the move_forward property.
     */
    Collection<? extends WrappedIndividual> getMove_forward();

    /**
     * Checks if the class has a move_forward property value.<p>
     * 
     * @return true if there is a move_forward property value.
     */
    boolean hasMove_forward();

    /**
     * Adds a move_forward property value.<p>
     * 
     * @param newMove_forward the move_forward property value to be added
     */
    void addMove_forward(WrappedIndividual newMove_forward);

    /**
     * Removes a move_forward property value.<p>
     * 
     * @param oldMove_forward the move_forward property value to be removed.
     */
    void removeMove_forward(WrappedIndividual oldMove_forward);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/profession
     */
     
    /**
     * Gets all property values for the profession property.<p>
     * 
     * @returns a collection of values for the profession property.
     */
    Collection<? extends WrappedIndividual> getProfession();

    /**
     * Checks if the class has a profession property value.<p>
     * 
     * @return true if there is a profession property value.
     */
    boolean hasProfession();

    /**
     * Adds a profession property value.<p>
     * 
     * @param newProfession the profession property value to be added
     */
    void addProfession(WrappedIndividual newProfession);

    /**
     * Removes a profession property value.<p>
     * 
     * @param oldProfession the profession property value to be removed.
     */
    void removeProfession(WrappedIndividual oldProfession);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/stop
     */
     
    /**
     * Gets all property values for the stop property.<p>
     * 
     * @returns a collection of values for the stop property.
     */
    Collection<? extends WrappedIndividual> getStop();

    /**
     * Checks if the class has a stop property value.<p>
     * 
     * @return true if there is a stop property value.
     */
    boolean hasStop();

    /**
     * Adds a stop property value.<p>
     * 
     * @param newStop the stop property value to be added
     */
    void addStop(WrappedIndividual newStop);

    /**
     * Removes a stop property value.<p>
     * 
     * @param oldStop the stop property value to be removed.
     */
    void removeStop(WrappedIndividual oldStop);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/surrounding_item_distance
     */
     
    /**
     * Gets all property values for the surrounding_item_distance property.<p>
     * 
     * @returns a collection of values for the surrounding_item_distance property.
     */
    Collection<? extends Entity> getSurrounding_item_distance();

    /**
     * Checks if the class has a surrounding_item_distance property value.<p>
     * 
     * @return true if there is a surrounding_item_distance property value.
     */
    boolean hasSurrounding_item_distance();

    /**
     * Adds a surrounding_item_distance property value.<p>
     * 
     * @param newSurrounding_item_distance the surrounding_item_distance property value to be added
     */
    void addSurrounding_item_distance(Entity newSurrounding_item_distance);

    /**
     * Removes a surrounding_item_distance property value.<p>
     * 
     * @param oldSurrounding_item_distance the surrounding_item_distance property value to be removed.
     */
    void removeSurrounding_item_distance(Entity oldSurrounding_item_distance);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/surrounding_item_location
     */
     
    /**
     * Gets all property values for the surrounding_item_location property.<p>
     * 
     * @returns a collection of values for the surrounding_item_location property.
     */
    Collection<? extends Entity> getSurrounding_item_location();

    /**
     * Checks if the class has a surrounding_item_location property value.<p>
     * 
     * @return true if there is a surrounding_item_location property value.
     */
    boolean hasSurrounding_item_location();

    /**
     * Adds a surrounding_item_location property value.<p>
     * 
     * @param newSurrounding_item_location the surrounding_item_location property value to be added
     */
    void addSurrounding_item_location(Entity newSurrounding_item_location);

    /**
     * Removes a surrounding_item_location property value.<p>
     * 
     * @param oldSurrounding_item_location the surrounding_item_location property value to be removed.
     */
    void removeSurrounding_item_location(Entity oldSurrounding_item_location);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#is_on_lane
     */
     
    /**
     * Gets all property values for the is_on_lane property.<p>
     * 
     * @returns a collection of values for the is_on_lane property.
     */
    Collection<? extends Lane> getIs_on_lane();

    /**
     * Checks if the class has a is_on_lane property value.<p>
     * 
     * @return true if there is a is_on_lane property value.
     */
    boolean hasIs_on_lane();

    /**
     * Adds a is_on_lane property value.<p>
     * 
     * @param newIs_on_lane the is_on_lane property value to be added
     */
    void addIs_on_lane(Lane newIs_on_lane);

    /**
     * Removes a is_on_lane property value.<p>
     * 
     * @param oldIs_on_lane the is_on_lane property value to be removed.
     */
    void removeIs_on_lane(Lane oldIs_on_lane);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#accelerationX
     */
     
    /**
     * Gets all property values for the accelerationX property.<p>
     * 
     * @returns a collection of values for the accelerationX property.
     */
    Collection<? extends Float> getAccelerationX();

    /**
     * Checks if the class has a accelerationX property value.<p>
     * 
     * @return true if there is a accelerationX property value.
     */
    boolean hasAccelerationX();

    /**
     * Adds a accelerationX property value.<p>
     * 
     * @param newAccelerationX the accelerationX property value to be added
     */
    void addAccelerationX(Float newAccelerationX);

    /**
     * Removes a accelerationX property value.<p>
     * 
     * @param oldAccelerationX the accelerationX property value to be removed.
     */
    void removeAccelerationX(Float oldAccelerationX);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#accelerationY
     */
     
    /**
     * Gets all property values for the accelerationY property.<p>
     * 
     * @returns a collection of values for the accelerationY property.
     */
    Collection<? extends Float> getAccelerationY();

    /**
     * Checks if the class has a accelerationY property value.<p>
     * 
     * @return true if there is a accelerationY property value.
     */
    boolean hasAccelerationY();

    /**
     * Adds a accelerationY property value.<p>
     * 
     * @param newAccelerationY the accelerationY property value to be added
     */
    void addAccelerationY(Float newAccelerationY);

    /**
     * Removes a accelerationY property value.<p>
     * 
     * @param oldAccelerationY the accelerationY property value to be removed.
     */
    void removeAccelerationY(Float oldAccelerationY);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#distance
     */
     
    /**
     * Gets all property values for the distance property.<p>
     * 
     * @returns a collection of values for the distance property.
     */
    Collection<? extends Float> getDistance();

    /**
     * Checks if the class has a distance property value.<p>
     * 
     * @return true if there is a distance property value.
     */
    boolean hasDistance();

    /**
     * Adds a distance property value.<p>
     * 
     * @param newDistance the distance property value to be added
     */
    void addDistance(Float newDistance);

    /**
     * Removes a distance property value.<p>
     * 
     * @param oldDistance the distance property value to be removed.
     */
    void removeDistance(Float oldDistance);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#distanceToRoad
     */
     
    /**
     * Gets all property values for the distanceToRoad property.<p>
     * 
     * @returns a collection of values for the distanceToRoad property.
     */
    Collection<? extends Float> getDistanceToRoad();

    /**
     * Checks if the class has a distanceToRoad property value.<p>
     * 
     * @return true if there is a distanceToRoad property value.
     */
    boolean hasDistanceToRoad();

    /**
     * Adds a distanceToRoad property value.<p>
     * 
     * @param newDistanceToRoad the distanceToRoad property value to be added
     */
    void addDistanceToRoad(Float newDistanceToRoad);

    /**
     * Removes a distanceToRoad property value.<p>
     * 
     * @param oldDistanceToRoad the distanceToRoad property value to be removed.
     */
    void removeDistanceToRoad(Float oldDistanceToRoad);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#length
     */
     
    /**
     * Gets all property values for the length property.<p>
     * 
     * @returns a collection of values for the length property.
     */
    Collection<? extends Float> getLength();

    /**
     * Checks if the class has a length property value.<p>
     * 
     * @return true if there is a length property value.
     */
    boolean hasLength();

    /**
     * Adds a length property value.<p>
     * 
     * @param newLength the length property value to be added
     */
    void addLength(Float newLength);

    /**
     * Removes a length property value.<p>
     * 
     * @param oldLength the length property value to be removed.
     */
    void removeLength(Float oldLength);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#speedX
     */
     
    /**
     * Gets all property values for the speedX property.<p>
     * 
     * @returns a collection of values for the speedX property.
     */
    Collection<? extends Float> getSpeedX();

    /**
     * Checks if the class has a speedX property value.<p>
     * 
     * @return true if there is a speedX property value.
     */
    boolean hasSpeedX();

    /**
     * Adds a speedX property value.<p>
     * 
     * @param newSpeedX the speedX property value to be added
     */
    void addSpeedX(Float newSpeedX);

    /**
     * Removes a speedX property value.<p>
     * 
     * @param oldSpeedX the speedX property value to be removed.
     */
    void removeSpeedX(Float oldSpeedX);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#speedY
     */
     
    /**
     * Gets all property values for the speedY property.<p>
     * 
     * @returns a collection of values for the speedY property.
     */
    Collection<? extends Float> getSpeedY();

    /**
     * Checks if the class has a speedY property value.<p>
     * 
     * @return true if there is a speedY property value.
     */
    boolean hasSpeedY();

    /**
     * Adds a speedY property value.<p>
     * 
     * @param newSpeedY the speedY property value to be added
     */
    void addSpeedY(Float newSpeedY);

    /**
     * Removes a speedY property value.<p>
     * 
     * @param oldSpeedY the speedY property value to be removed.
     */
    void removeSpeedY(Float oldSpeedY);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#width
     */
     
    /**
     * Gets all property values for the width property.<p>
     * 
     * @returns a collection of values for the width property.
     */
    Collection<? extends Float> getWidth();

    /**
     * Checks if the class has a width property value.<p>
     * 
     * @return true if there is a width property value.
     */
    boolean hasWidth();

    /**
     * Adds a width property value.<p>
     * 
     * @param newWidth the width property value to be added
     */
    void addWidth(Float newWidth);

    /**
     * Removes a width property value.<p>
     * 
     * @param oldWidth the width property value to be removed.
     */
    void removeWidth(Float oldWidth);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
