package kodlamaİo.dataAccess;

import kodlamaİo.entities.Category;
import kodlamaİo.entities.Course;
import kodlamaİo.entities.Instructor;

public class JdbcDao implements CourseDao {

    public void add(Category category) {
        String data = category.getName();
        System.out.println("Jdbc ile eklendi :" + data);
    }


    public void add(Course course) {
        String data2=course.getName();
        System.out.println("Jdbc ile eklendi :" + data2);
    }


    public void add(Instructor instructor) {
        String data3= instructor.getName();
        System.out.println("Jdbc ile eklendi :" + data3);
    }
}
