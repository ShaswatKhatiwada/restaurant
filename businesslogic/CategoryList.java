/*
 * All rights reserved
 * CIsSharp
 */
package restaurant.businesslogic;

/**
 *
 * @author Pradip
 */
public class CategoryList {

    LinkedList<CategoryNode> categories;

    public CategoryList() {
        categories = new LinkedList<>();
    }

    public void add(CategoryNode c) {
        categories.add(c);
    }

    public Boolean delete(CategoryNode c) {
        return categories.delete(c);
    }

    public Boolean deleteByName(String name) {
        for (CategoryNode c : categories) {
            if (c.getName().equals(name)) {
                categories.delete(c);
                return true;
            }
        }
        return false;
    }

    public boolean updateByName(String oldName, String newName) {
        for (CategoryNode c : categories) {
            if (c.getName().equals(oldName)) {
                c.setName(newName);
                return true;
            }
        }
        return false;
    }

    public LinkedList<CategoryNode> search(String query) {
        if (query.isEmpty()) {
            return categories;
        }

        LinkedList<CategoryNode> result = new LinkedList<>();
        for (CategoryNode c : categories) {
            if (c.getName().toLowerCase().matches(".*" + query.toLowerCase() + ".*")) {
                result.add(c);
            }
        }
        return result;
    }

    public LinkedList<CategoryNode> getCategories() {
        return categories;
    }

}
