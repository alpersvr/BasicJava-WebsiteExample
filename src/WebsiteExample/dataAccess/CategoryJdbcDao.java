package WebsiteExample.dataAccess;

import WebsiteExample.entities.Category;
import WebsiteExample.entities.Course;

import java.util.List;

public class CategoryJdbcDao implements CategoryDao{

    public void add(Category category) {
        String data = category.getName();
        System.out.println("Jdbc ile eklendi : " + data);
    }


    public List<Category> getAll() {
        return null;
    }


    public Course getByName(String name) {
        return null;
    }
}
