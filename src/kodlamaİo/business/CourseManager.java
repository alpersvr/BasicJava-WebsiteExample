package kodlamaİo.business;

import kodlamaİo.core.logging.Logger;
import kodlamaİo.dataAccess.CourseDao;
import kodlamaİo.dataAccess.HibernateDao;
import kodlamaİo.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao,Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }
    public void add(Course course)throws Exception{
        if (course.getPrice()<0){
            throw new Exception("Kursun fiyatı 0dan küçük olamaz");
        }
        courseDao.add(course);
        for (Logger logger:loggers){
            logger.log(course.getName());
        }
    }
}
