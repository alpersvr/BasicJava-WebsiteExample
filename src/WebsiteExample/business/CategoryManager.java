package WebsiteExample.business;

import WebsiteExample.core.logging.Logger;
import WebsiteExample.dataAccess.abstracts.CategoryDao;
import WebsiteExample.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    public CategoryManager(CategoryDao categoryDao,Logger[] loggers){
        this.categoryDao=categoryDao;
        this.loggers=loggers;
    }
    public void add(Category category) throws Exception{
        if(categoryDao.getByName(category.getName()) !=null){
            throw new Exception("Kategori ismi tekrar edemez");
        }
        categoryDao.add(category);
        for (Logger logger:loggers){
            logger.log(category.getName());
        }
    }
}
