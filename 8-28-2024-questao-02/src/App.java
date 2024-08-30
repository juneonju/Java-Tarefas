import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        School escola = new School();
        Student estudante = new Student("salis", "1010");
        escola.addStudent(estudante);
        System.out.println(estudante);
        System.out.println(escola.showStudants());
        escola.registerNote("1010", "matematica", List.of(6.0, 8.0, 9.0));
        System.out.println(escola.calculateAverage("1010", "matematica"));
    }
}
