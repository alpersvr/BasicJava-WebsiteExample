package WebsiteExample.dataAccess.concretes;

import WebsiteExample.dataAccess.abstracts.CourseDao;
import WebsiteExample.entities.Course;

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
