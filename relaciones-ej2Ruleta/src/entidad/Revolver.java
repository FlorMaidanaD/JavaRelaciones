/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;


public class Revolver {
    private int posActual;
    private int posAgua;
    

    public Revolver() {
        this.llenarRevolver();
    }

   

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }


    @Override
    public String toString() {
        return "Pos. Actual= " + posActual + ", Pos. Agua= " + posAgua;
    }
    
    public void llenarRevolver(){
        this.posActual = (int) (Math.random()*7);
        this.posAgua = (int) (Math.random()*7);
    }
    
    public boolean mojar (){
        if (this.posActual == this.posAgua){
            return true;
        }  
        return false;
    }
    
    public void siguienteChorro (){
        if (this.posActual<6){
            this.posActual ++;
                       
        }else{
            if (this.posActual==6){
                this.posActual=1;
            }
        }
        
    }

}
