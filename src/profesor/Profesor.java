package profesor;

import java.util.ArrayList;

public class Profesor {
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno a){
        alumnos.add(a);
    }

    public void publicarNota(){
        for (Alumno a : alumnos){
            a.recibirAviso();
        }
    }
}
