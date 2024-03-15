package WebsiteExample.dataAccess;

import WebsiteExample.entities.Category;
import WebsiteExample.entities.Course;
import WebsiteExample.entities.Instructor;

import java.util.List;

public class CourseJdbcDao implements CourseDao {



    public void add(Course course) {
        String data2=course.getName();
        System.out.println("Jdbc ile eklendi :" + data2);
    }

    public List<Course> getAll() {
        return null;
    }

    public Course getByName(String name) {
        return null;
    }



}
