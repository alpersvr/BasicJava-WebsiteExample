package WebsiteExample.dataAccess.abstracts;

import WebsiteExample.entities.Category;
import WebsiteExample.entities.Course;
import WebsiteExample.entities.Instructor;

import java.util.List;

public interface CourseDao {

    void add(Course course);
    List<Course>getAll();
    Course getByName(String name);




}
