import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> students;

    public School() {
        this.students = new ArrayList<Student>();
    }
    
    public void addStudent(Student student){
        this.students.add(student);
    }

    public void registerNote(String register, String matter, List<Double> notes){
            if (findStudentByRegister(register) != null) {
                student.notes.put(matter, notes);
            } 
    }

    public Double calcularMedia(String matricula, String disciplina){
        return null;
    }

    public List<Student> listarAlunos(){
        return students;
    }

    private Student findStudentByRegister(String register){
        for (Student student : students) {
            if (student.register.equals(register)) {
                return student;
            }           
        }
        return null;
    }
}
