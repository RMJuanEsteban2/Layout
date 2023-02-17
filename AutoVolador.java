/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 *
 * @author MessiCR7
 * @AutoVolador
 * @Version 1.0
 * Clse de un auto volador que hereda de la clase carro para su implementacion
 */
public class AutoVolador extends Carro{
    public boolean esta_Volando=false;

    public AutoVolador(String llantas, String volante, String color, String marca, char placa, Date aniocompra) {
        super(llantas, volante, color, marca, placa, aniocompra);
    }

    public AutoVolador() {
    }

    public boolean isEsta_Volanado() {
        return esta_Volando;
    }

    public void setEsta_Volanado(boolean esta_Volanado) {
        this.esta_Volando = esta_Volanado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getAniocompra() {
        return aniocompra;
    }

    public void setAniocompra(Date aniocompra) {
        this.aniocompra = aniocompra;
    }
    /**
    * Metodo volar para que nuestro  auto vuele o aterrice
    * @param estado
    * el estado es booleano que controla si esta volando o no
    */
    
    public void  Volar(boolean estado){
        this.esta_Volando=estado;
        
    }
}
