/*
 * All rights reserved
 * CIsSharp
 */
package restaurant.businesslogic;

/**
 *
 * @author Pradip
 */
public class FoodItem {

    private String name;

    private Double price;

    private Integer quantity;

    private String description;

    private String size;

    private Boolean specialOrder;

    public FoodItem(String name, Double price, Integer Quantity, String description, Boolean specialOrder) {
        this.name = name;
        this.price = price;
        this.quantity = Quantity;
        this.description = description;
        this.specialOrder = specialOrder;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @return the Quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @return the specialOrder
     */
    public Boolean getSpecialOrder() {
        return specialOrder;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().getName().equals(FoodItem.class.getName())) {
            return false;
        }
        FoodItem f = (FoodItem) obj;
        return name.equals(f.getName()) && description.equals(f.getDescription())
                && price == f.getPrice() && quantity == f.getQuantity()
                && specialOrder == f.getSpecialOrder() && size == f.getSize();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        int hashKey = 3;
        hash = hashKey * hash + name.hashCode();
        hash = hashKey * hash + quantity.hashCode();
        hash = hashKey * hash + price.hashCode();
        hash = hashKey * hash + description.hashCode();
        hash = hashKey * hash + size.hashCode();
        hash = hashKey * hash + specialOrder.hashCode();

        return hash;
    }

}
