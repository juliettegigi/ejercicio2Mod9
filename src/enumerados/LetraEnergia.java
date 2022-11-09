/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

/**
 *
 * @author julie
 */
public enum LetraEnergia {
    A(1000f),B(800f),C(600f),D(500f),E(300f),F(100f);
  
    
    Float precio;
   
    LetraEnergia(Float precio){
        this.precio=precio;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    
}
