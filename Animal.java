public class Animal {
    String nombre;
    String especie;
    int edad;

    public void hacerSonido() {
        System.out.println("El " + this.especie + " " + this.nombre + " hace un sonido característico." + " Tiene " + this.edad + " años.");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.nombre = "Simba";
        animal.especie = "León";
        animal.edad = 5;
        animal.hacerSonido();

        Animal otroAnimal = new Animal();
        otroAnimal.nombre = "Milo";
        otroAnimal.especie = "Perro";
        otroAnimal.edad = 3;
        otroAnimal.hacerSonido();

    }
    
}
