/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2mod9;

import entidades.Electrodoméstico;
import entidades.Lavadora;
import entidades.Televisor;
import enumerados.Colores;
import enumerados.LetraEnergia;
import java.util.ArrayList;

/*Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos*/
public class Ejercicio2Mod9 {


     
    public static void main(String[] args) {
     
     Lavadora l=new Lavadora();
        Televisor t=new Televisor();
        
        l.crearLavadora();
        System.out.println("-------------------------");
System.out.println( t.crearTelevisor());
         System.out.println("Precio final de la lavadora: "+l.precioFinal());
        System.out.println("Precio final del televisor: "+t.precioFinal());
       
        
        System.out.println(t.toString());
       System.out.println(l.toString());
    
       
       /*. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor*/
       
       ArrayList<Electrodoméstico> electrodomésticos=new ArrayList();
       Televisor t2=new Televisor(70,true,Colores.ROJO,LetraEnergia.B,80f);
       Televisor t3=new Televisor(90,false,Colores.AZUL,LetraEnergia.F,20f);
       Lavadora l2=new Lavadora(Colores.NEGRO,LetraEnergia.D,80f,50f);
       Lavadora l3=new Lavadora(Colores.BLANCO,LetraEnergia.E,70f,20f);
       
       
               
       electrodomésticos.add(t2);
       electrodomésticos.add(l2);
       electrodomésticos.add(t3);
       electrodomésticos.add(l2);
       
       for(Electrodoméstico e:electrodomésticos){
           System.out.println("--------------------------------------------");
           System.out.println(e);
            System.out.println("precio final: " + e.precioFinal() );
       }
           
       
    }
    
}
