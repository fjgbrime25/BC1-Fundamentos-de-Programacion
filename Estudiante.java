public class Estudiante {
    String nombre;
    int edad;
    String carrera;

    public void saludar() {
        System.out.println("Hola, soy " + this.nombre + ", tengo " + this.edad + " años y estudio " + this.carrera + ".");
    }
    
    public void estudiar(String asignatura){
        System.out.println(this.nombre + " estudia " + asignatura);
    }
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Ana";
        estudiante.edad = 20;
        estudiante.carrera = "Ingeniería Informática";
        estudiante.saludar();
        estudiante.estudiar("Bases de datos");
        estudiante.estudiar("Programación");
    }
}
