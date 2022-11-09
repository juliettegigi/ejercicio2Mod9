/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumerados.Colores;
import enumerados.LetraEnergia;

import java.util.Scanner;

/**
 *
 * @author julie
 */
public abstract class  Electrodoméstico {
    protected Float precio;
    protected Colores color;
    protected LetraEnergia consumoEnerg; 
    protected Float peso;

    public Electrodoméstico() {
    }

    public Electrodoméstico(Colores color, LetraEnergia consumoEnerg, Float peso) {
        this.precio = 1000f;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    public Colores getColor() {
        return color;
    }

    public LetraEnergia getConsumoEnerg() {
        return consumoEnerg;
    }

    public Float getPeso() {
        return peso;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setConsumoEnerg(LetraEnergia consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.*/
    public Electrodoméstico crearElectrodoméstico(){
        this.precio = 1000f;
        Scanner leer=new Scanner(System.in);
        System.out.print("Color: ");
        this.color=Colores.values()[comprobarColor(leer.nextLine())];
        char letra;
        System.out.print("Consumo de energía: ");
        String s =leer.nextLine().toUpperCase();
        if(s.length()>1)
          letra='F';
        else
          letra=comprobarConsumoEnergetico(s.charAt(0))?s.charAt(0):'F';
        s=String.valueOf(letra);
        this.consumoEnerg=LetraEnergia.valueOf(s);
        System.out.print("Peso: ");  
        this.peso=Float.parseFloat(leer.nextLine());
    
        return this;
    }
    
    /* Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.*/
    
  private  boolean comprobarConsumoEnergetico(char letra){
     
     LetraEnergia[] s= LetraEnergia.values();
     for(int i=0; i<s.length;i++)
        if(s[i].toString().charAt(0)==letra)
            return true;
     return false;
    }
  
  
  /*• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible*/
    private int comprobarColor(String color){
        
        Colores []c=Colores.values();
        for(int i=0;i<c.length;i++)
            if(c[i].toString().equalsIgnoreCase(color))
                return i;
        return 0;
    }
    
 /*Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios*/
    
    public Float precioFinal(){
        return this.consumoEnerg.getPrecio()+this.precio+(this.peso>=80?1000:
                            this.peso>=50?800:
                            this.peso>=20?500:100);
                
                
      
      
    }

    @Override
    public String toString() {
        return "Electrodom\u00e9stico{" + "precio=" + precio + ", color=" + color + ", consumoEnerg=" + consumoEnerg + ", peso=" + peso + '}';
    }
    
    
  
}
