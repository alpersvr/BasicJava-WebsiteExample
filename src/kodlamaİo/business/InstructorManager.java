package kodlamaİo.business;

import kodlamaİo.core.logging.Logger;
import kodlamaİo.dataAccess.CourseDao;
import kodlamaİo.entities.Course;
import kodlamaİo.entities.Instructor;

public class InstructorManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public InstructorManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao=courseDao;
        this.loggers=loggers;
    }
    public void add(Instructor instructor) throws Exception{
        if (instructor.getName().equals(instructor.getName())){
            throw new Exception("Eğitmenler aynı olamaz");
        }
        courseDao.add(instructor);
        for (Logger logger:loggers){
            logger.log(instructor.getName());
        }
    }
}
