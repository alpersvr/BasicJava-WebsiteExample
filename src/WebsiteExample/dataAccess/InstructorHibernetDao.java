package WebsiteExample.dataAccess;

import WebsiteExample.entities.Course;
import WebsiteExample.entities.Instructor;

import java.util.List;

public class InstructorHibernetDao implements InstructorDao{
    @Override
    public void add(Instructor instructor){
        String data3=instructor.getName();
        System.out.println("Hibernate ile eklendi : "+data3);
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
