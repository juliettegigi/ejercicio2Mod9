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
public class Lavadora extends Electrodoméstico {
    private Float cargaKg;
    public Lavadora() {
    }

    public Lavadora(Colores color, LetraEnergia consumoEnerg, Float peso,Float cargaKg) {
        super(color, consumoEnerg, peso);
        this.cargaKg=cargaKg;
    }

    public Float getCarga() {
        return cargaKg;
    }

    public void setCarga(Float carga) {
        this.cargaKg = carga;
    }
    
    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora*/
    public void crearLavadora(){
       
        super.crearElectrodoméstico();
         Scanner leer=new Scanner(System.in);
         System.out.print("Carga: ");
        this.cargaKg=Float.parseFloat(leer.nextLine());
        this.precio=this.precioFinal();
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio*/
    
    @Override
    public Float precioFinal(){
        Float p=super.precioFinal();//
        return(this.cargaKg>30)?p+=500:p;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString()+" cargaKg=" + cargaKg + '}';
    }
    
    
 
    
}
