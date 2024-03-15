package WebsiteExample.business;

import WebsiteExample.core.logging.Logger;
import WebsiteExample.dataAccess.CourseDao;
import WebsiteExample.dataAccess.InstructorDao;
import WebsiteExample.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao=instructorDao;
        this.loggers=loggers;
    }
    public void add(Instructor instructor) throws Exception{
        if (instructorDao.getByName(instructor.getName()) !=null){
            throw new Exception("Eğitmenler aynı olamaz");
        }
        instructorDao.add(instructor);
        for (Logger logger:loggers){
            logger.log(instructor.getName());
        }
    }
}
