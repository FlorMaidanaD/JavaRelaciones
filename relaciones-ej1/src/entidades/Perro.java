
package entidades;


public class Perro {
    //nombre, raza, edad, tamano
    private String nombre;
    private String raza;
    private int edad;
    private double tam;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tam) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tam = tam;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tam=" + tam;
    }
    
}
