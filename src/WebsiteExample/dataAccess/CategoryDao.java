package WebsiteExample.dataAccess;

import WebsiteExample.entities.Category;
import WebsiteExample.entities.Course;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    List<Category> getAll();
    Course getByName(String name);
}
