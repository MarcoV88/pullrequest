package profesor;

public class Alumno {

    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void recibirAviso(){
        System.out.println(nombre + " ha recibido la notificación");
    }
}
