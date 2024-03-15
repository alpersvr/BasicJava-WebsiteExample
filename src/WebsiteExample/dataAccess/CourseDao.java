package WebsiteExample.dataAccess;

import WebsiteExample.entities.Category;
import WebsiteExample.entities.Course;
import WebsiteExample.entities.Instructor;

public interface CourseDao
{
void add(Category category);
void add(Course course);

void add(Instructor instructor);
}
