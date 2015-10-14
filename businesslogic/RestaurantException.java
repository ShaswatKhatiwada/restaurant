/*
 * All rights reserved
 * CIsSharp
 */
package restaurant.businesslogic;

/**
 *
 * @author Pradip
 */
public class RestaurantException extends Exception {

    public RestaurantException(String message) {
        super("Restaurant Exception: " + message);
    }
}
