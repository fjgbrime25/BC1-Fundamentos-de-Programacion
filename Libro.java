public class Libro {
    String titulo;
    String autor;
    int añoPublicacion;

    public void mostrarDetalles() {
        System.out.println("Libro: " + this.titulo + ", Autor: " + this.autor + ", Año de Publicación: " + this.añoPublicacion);
    }

    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "Cien Años de Soledad";
        libro.autor = "Gabriel García Márquez";
        libro.añoPublicacion = 1967;
        libro.mostrarDetalles();
    }
}
