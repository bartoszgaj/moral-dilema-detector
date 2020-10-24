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
 * Source Class: Vehicle <br>
 * @version generated on Sat Oct 24 13:29:42 CEST 2020 by Michał Barczyk
 */

public interface Vehicle extends Non_living_entity {

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
     * Property http://webprotege.stanford.edu/vehicle_autonomy
     */
     
    /**
     * Gets all property values for the vehicle_autonomy property.<p>
     * 
     * @returns a collection of values for the vehicle_autonomy property.
     */
    Collection<? extends WrappedIndividual> getVehicle_autonomy();

    /**
     * Checks if the class has a vehicle_autonomy property value.<p>
     * 
     * @return true if there is a vehicle_autonomy property value.
     */
    boolean hasVehicle_autonomy();

    /**
     * Adds a vehicle_autonomy property value.<p>
     * 
     * @param newVehicle_autonomy the vehicle_autonomy property value to be added
     */
    void addVehicle_autonomy(WrappedIndividual newVehicle_autonomy);

    /**
     * Removes a vehicle_autonomy property value.<p>
     * 
     * @param oldVehicle_autonomy the vehicle_autonomy property value to be removed.
     */
    void removeVehicle_autonomy(WrappedIndividual oldVehicle_autonomy);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_driver
     */
     
    /**
     * Gets all property values for the vehicle_has_driver property.<p>
     * 
     * @returns a collection of values for the vehicle_has_driver property.
     */
    Collection<? extends Driver> getVehicle_has_driver();

    /**
     * Checks if the class has a vehicle_has_driver property value.<p>
     * 
     * @return true if there is a vehicle_has_driver property value.
     */
    boolean hasVehicle_has_driver();

    /**
     * Adds a vehicle_has_driver property value.<p>
     * 
     * @param newVehicle_has_driver the vehicle_has_driver property value to be added
     */
    void addVehicle_has_driver(Driver newVehicle_has_driver);

    /**
     * Removes a vehicle_has_driver property value.<p>
     * 
     * @param oldVehicle_has_driver the vehicle_has_driver property value to be removed.
     */
    void removeVehicle_has_driver(Driver oldVehicle_has_driver);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_location
     */
     
    /**
     * Gets all property values for the vehicle_has_location property.<p>
     * 
     * @returns a collection of values for the vehicle_has_location property.
     */
    Collection<? extends Location> getVehicle_has_location();

    /**
     * Checks if the class has a vehicle_has_location property value.<p>
     * 
     * @return true if there is a vehicle_has_location property value.
     */
    boolean hasVehicle_has_location();

    /**
     * Adds a vehicle_has_location property value.<p>
     * 
     * @param newVehicle_has_location the vehicle_has_location property value to be added
     */
    void addVehicle_has_location(Location newVehicle_has_location);

    /**
     * Removes a vehicle_has_location property value.<p>
     * 
     * @param oldVehicle_has_location the vehicle_has_location property value to be removed.
     */
    void removeVehicle_has_location(Location oldVehicle_has_location);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_passenger
     */
     
    /**
     * Gets all property values for the vehicle_has_passenger property.<p>
     * 
     * @returns a collection of values for the vehicle_has_passenger property.
     */
    Collection<? extends Passenger> getVehicle_has_passenger();

    /**
     * Checks if the class has a vehicle_has_passenger property value.<p>
     * 
     * @return true if there is a vehicle_has_passenger property value.
     */
    boolean hasVehicle_has_passenger();

    /**
     * Adds a vehicle_has_passenger property value.<p>
     * 
     * @param newVehicle_has_passenger the vehicle_has_passenger property value to be added
     */
    void addVehicle_has_passenger(Passenger newVehicle_has_passenger);

    /**
     * Removes a vehicle_has_passenger property value.<p>
     * 
     * @param oldVehicle_has_passenger the vehicle_has_passenger property value to be removed.
     */
    void removeVehicle_has_passenger(Passenger oldVehicle_has_passenger);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_type
     */
     
    /**
     * Gets all property values for the vehicle_has_type property.<p>
     * 
     * @returns a collection of values for the vehicle_has_type property.
     */
    Collection<? extends Van> getVehicle_has_type();

    /**
     * Checks if the class has a vehicle_has_type property value.<p>
     * 
     * @return true if there is a vehicle_has_type property value.
     */
    boolean hasVehicle_has_type();

    /**
     * Adds a vehicle_has_type property value.<p>
     * 
     * @param newVehicle_has_type the vehicle_has_type property value to be added
     */
    void addVehicle_has_type(Van newVehicle_has_type);

    /**
     * Removes a vehicle_has_type property value.<p>
     * 
     * @param oldVehicle_has_type the vehicle_has_type property value to be removed.
     */
    void removeVehicle_has_type(Van oldVehicle_has_type);


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
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#autonomy_level
     */
     
    /**
     * Gets all property values for the autonomy_level property.<p>
     * 
     * @returns a collection of values for the autonomy_level property.
     */
    Collection<? extends Integer> getAutonomy_level();

    /**
     * Checks if the class has a autonomy_level property value.<p>
     * 
     * @return true if there is a autonomy_level property value.
     */
    boolean hasAutonomy_level();

    /**
     * Adds a autonomy_level property value.<p>
     * 
     * @param newAutonomy_level the autonomy_level property value to be added
     */
    void addAutonomy_level(Integer newAutonomy_level);

    /**
     * Removes a autonomy_level property value.<p>
     * 
     * @param oldAutonomy_level the autonomy_level property value to be removed.
     */
    void removeAutonomy_level(Integer oldAutonomy_level);



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
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#vehicle_has_speed_kmph
     */
     
    /**
     * Gets all property values for the vehicle_has_speed_kmph property.<p>
     * 
     * @returns a collection of values for the vehicle_has_speed_kmph property.
     */
    Collection<? extends Integer> getVehicle_has_speed_kmph();

    /**
     * Checks if the class has a vehicle_has_speed_kmph property value.<p>
     * 
     * @return true if there is a vehicle_has_speed_kmph property value.
     */
    boolean hasVehicle_has_speed_kmph();

    /**
     * Adds a vehicle_has_speed_kmph property value.<p>
     * 
     * @param newVehicle_has_speed_kmph the vehicle_has_speed_kmph property value to be added
     */
    void addVehicle_has_speed_kmph(Integer newVehicle_has_speed_kmph);

    /**
     * Removes a vehicle_has_speed_kmph property value.<p>
     * 
     * @param oldVehicle_has_speed_kmph the vehicle_has_speed_kmph property value to be removed.
     */
    void removeVehicle_has_speed_kmph(Integer oldVehicle_has_speed_kmph);



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
