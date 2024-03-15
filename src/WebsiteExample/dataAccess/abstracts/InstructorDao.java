package WebsiteExample.dataAccess.abstracts;

import WebsiteExample.entities.Course;
import WebsiteExample.entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);
    List<Course> getAll();
    Course getByName(String name);
}
