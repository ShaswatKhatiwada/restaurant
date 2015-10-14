
package restaurant.businesslogic;

/**
 * @author Shaswat
 */
public class CategoryNode {

    private String name;

    private LinkedList<FoodItem> items;

    public CategoryNode(String name) {
        this.name = name;
        this.items = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<FoodItem> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().getName().equals(CategoryNode.class.getName())) {
            return false;
        }
        CategoryNode c = ((CategoryNode) obj);
        return c.getName().equalsIgnoreCase(name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        int hashKey = 3;
        hash = hashKey * hash + name.hashCode();
        return hash;
    }
}
