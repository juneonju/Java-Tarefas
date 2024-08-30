import java.util.ArrayList;
import java.util.List;

public class Course {
    String name;
    String description;
    List<String> students;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
        this.students = new ArrayList<>();
    }
    
}
