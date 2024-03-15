package WebsiteExample.business;

import WebsiteExample.core.logging.Logger;
import WebsiteExample.dataAccess.CourseDao;
import WebsiteExample.entities.Category;

public class CategoryManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    public CategoryManager(CourseDao courseDao,Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }
    public void add(Category category) throws Exception{
        if(category.getName().equals(category.getName())){
            throw new Exception("Aynı katagoriden 2 tane olamaz");
        }
        courseDao.add(category);
        for (Logger logger:loggers){
            logger.log(category.getName());
        }
    }
}
