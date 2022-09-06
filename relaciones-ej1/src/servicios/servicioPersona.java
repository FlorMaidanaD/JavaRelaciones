/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class servicioPersona {

    Persona p = new Persona();
    Perro perro = new Perro();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     ArrayList <Persona> personas = new ArrayList ();

    public void CrearPersona() {
        System.out.println("*************Creando persona*************");
        System.out.print("Cantidad de personas a ingresar: ");
        int cant = leer.nextInt();
        String nombre;
        String apellido;
        int edad;
        int dni;
       
        for (int i = 0; i< cant; i++) {
            System.out.println("");
            System.out.println("*************");
            System.out.print("Apellido: ");
            apellido = leer.next();
            System.out.print("Nombre: ");
            nombre= leer.next();
            System.out.print("Edad: ");
            edad = leer.nextInt();
            System.out.print("DNI: ");
            dni=leer.nextInt();
            perro = CrearPerro();
            personas.add(new Persona(nombre,apellido, edad, dni, perro));         
        }
    }
    
    public Perro CrearPerro (){        
            System.out.println("");        
            System.out.println("Creando un perro para esta persona");
            System.out.print("Nombre: ");
            perro.setNombre(leer.next());            
            System.out.print("Raza: ");
            perro.setRaza(leer.next());
            System.out.print("Edad: ");
            perro.setEdad(leer.nextInt());
            System.out.print("Tamaño: ");
            perro.setTam(leer.nextDouble());
            return perro;
    }
    public void Mostrar(){
         System.out.println("");
         System.out.println("*************MOSTRAR*************");
         System.out.println("");
         for (Persona per : personas) {
             System.out.println("");
             System.out.println(per);
             
        }
    }

}


