package WebsiteExample;

import WebsiteExample.business.CategoryManager;
import WebsiteExample.business.CourseManager;
import WebsiteExample.business.InstructorManager;
import WebsiteExample.core.logging.DatabaseLogger;
import WebsiteExample.core.logging.FileLogger;
import WebsiteExample.core.logging.Logger;
import WebsiteExample.core.logging.MailLogger;
import WebsiteExample.dataAccess.concretes.CategoryHibernateDao;
import WebsiteExample.dataAccess.concretes.CourseHibernateDao;
import WebsiteExample.dataAccess.concretes.InstructorHibernetDao;
import WebsiteExample.entities.Category;
import WebsiteExample.entities.Course;
import WebsiteExample.entities.Instructor;

public class main {
    public static void main(String[] args) throws Exception{
        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger(),};
        Course course1=new Course(1,"Java",100);
        CourseManager courseManager=new CourseManager(new CourseHibernateDao(),loggers);
        courseManager.add(course1);

        Category category1=new Category(1,"Programlama");
        CategoryManager categoryManager=new CategoryManager(new CategoryHibernateDao(),loggers);
        categoryManager.add(category1);

        Instructor instructor1=new Instructor(1,"Engin Demiroğ");
        InstructorManager instructorManager=new InstructorManager(new InstructorHibernetDao(),loggers);
        instructorManager.add(instructor1);

    }
}
