package kodlamaİo;

import kodlamaİo.business.CategoryManager;
import kodlamaİo.business.CourseManager;
import kodlamaİo.business.InstructorManager;
import kodlamaİo.core.logging.DatabaseLogger;
import kodlamaİo.core.logging.FileLogger;
import kodlamaİo.core.logging.Logger;
import kodlamaİo.core.logging.MailLogger;
import kodlamaİo.dataAccess.HibernateDao;
import kodlamaİo.entities.Category;
import kodlamaİo.entities.Course;
import kodlamaİo.entities.Instructor;

public class main {
    public static void main(String[] args) throws Exception{
        Course course1=new Course(1,"Java",100);
        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger(),};
        CourseManager courseManager=new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course1);

        Category category1=new Category(1,"Web");
        CategoryManager categoryManager=new CategoryManager(new HibernateDao(),loggers);
        categoryManager.add(category1);

        Instructor instructor1=new Instructor(1,"Engin Demiroğ");
        InstructorManager instructorManager=new InstructorManager(new HibernateDao(),loggers);
        instructorManager.add(instructor1);
    }
}
