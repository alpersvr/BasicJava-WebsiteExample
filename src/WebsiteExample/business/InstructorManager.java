package WebsiteExample.business;

import WebsiteExample.core.logging.Logger;
import WebsiteExample.dataAccess.CourseDao;
import WebsiteExample.entities.Instructor;

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
