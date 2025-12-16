package profesor;

public class Main {

    public static void main(String[] args) {

        Profesor profe = new Profesor();

        Alumno ana = new Alumno("Ana");
        Alumno david = new Alumno("David");

        profe.agregarAlumno(ana);
        profe.agregarAlumno(david);

        profe.publicarNota();
    }
}
