public class App {
    public static void main(String[] args) throws Exception {
        Platform plataforma = new Platform();
        Course curso1 = new Course("programação", "inferno");
        Course curso2 = new Course("engenharia", "sofrimento");
        plataforma.addCourse(curso1);
        plataforma.addCourse(curso2);
        System.out.println(plataforma.ListCourses());
        plataforma.subscribeStudent("programação", "junin");
        System.out.println(plataforma.ListStudentsByCourse("programação"));   
    }
}
