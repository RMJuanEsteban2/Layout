/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * @author sistemas
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro twingo = new Carro();
        twingo.marca="twingo";
        System.out.println("Hola mundo");
        AutoVolador carro=new AutoVolador();
        
        carro.setEsta_Volanado(true);
        
        if(carro.isEsta_Volanado()){
            System.out.println("Esta volando");
            }else{
           System.out.println("No esta volando");
        }
    }
    
}
