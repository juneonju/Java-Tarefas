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
            if (findStudentByRegister(register) != -1) {
                students.get(findStudentByRegister(register)).notes.put(matter, notes);
            } 
    }

    public Double calculateAverage(String register, String matter){
        Double averageNotes = 0.0;
        Double sumNotes = 0.0;

        if (findStudentByRegister(register) != -1) {
            if (students.get(findStudentByRegister(register)).notes.containsKey(matter)) {

                List<Double> noteList = students.get(findStudentByRegister(register)).notes.get(matter);

                for (Double double1 : noteList) {
                    sumNotes += double1;          
                }
                averageNotes = sumNotes / noteList.size();
                return averageNotes;
            }
        }
        return null;
    }

    public List<Student> showStudants(){
        return students;
    }

    private int findStudentByRegister(String register){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).register.equals(register)) {
                return i;
            }        
        }
        return -1;
    }
}
