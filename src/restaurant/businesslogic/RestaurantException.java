
package restaurant.businesslogic;

/**
 *
 * @author Shaswat
 */
public class RestaurantException extends Exception {

    public RestaurantException(String message) {
        super("Restaurant Exception: " + message);
    }
}
