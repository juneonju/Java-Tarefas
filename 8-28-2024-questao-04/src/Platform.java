import java.util.ArrayList;
import java.util.List;

public class Platform {
    List<Course> courses;

    public Platform() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void subscribeStudent(String nameCourse, String nameStudent){
        if (findCourseByName(nameCourse) != null) {
            findCourseByName(nameCourse).students.add(nameStudent);
        }
    }

    public List<String> ListStudentsByCourse(String nameCourse){
        List<String> listStudents = new ArrayList<>();
        if (findCourseByName(nameCourse) != null) {
            listStudents.addAll(findCourseByName(nameCourse).students);
            return listStudents;
        }
        return null;
    }

    public List<Course> ListCourses(){
        return courses;
    }

    public Course findCourseByName(String name){
        for (Course course : courses) {
            if (course.name.equals(name)) {
                return course;
            }
        }
        return null;
    }


}
