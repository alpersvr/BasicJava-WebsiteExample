package WebsiteExample.dataAccess;

import WebsiteExample.entities.Category;
import WebsiteExample.entities.Course;
import WebsiteExample.entities.Instructor;

import java.util.List;

public class CourseHibernateDao implements CourseDao{




    public void add(Course course){
        String data2=course.getName();
        System.out.println("Hibernate ile eklendi : "+data2);
    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public Course getByName(String name) {
        return null;
    }


}
