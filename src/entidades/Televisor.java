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
public class Televisor extends Electrodoméstico{
    int resolución;
    boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolución, boolean sintonizadorTDT, Colores color, LetraEnergia consumoEnerg, Float peso) {
        super(color, consumoEnerg, peso);
        this.resolución = resolución;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolución() {
        return resolución;
    }

    public void setResolución(int resolución) {
        this.resolución = resolución;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.*/
    public Televisor crearTelevisor(){
       
        crearElectrodoméstico();
         Scanner leer=new Scanner(System.in);
        System.out.print("resolución: ");
        this.resolución=Integer.parseInt(leer.nextLine());
        System.out.print("sintonizador TDT: true/false");
        this.sintonizadorTDT=Boolean.parseBoolean(leer.nextLine());
        this.precio=this.precioFinal();
        return this;
    }
    
    /* Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.*/
    @Override
     public Float precioFinal(){
       Float p;
       p=(this.resolución>40)?super.precioFinal()*1.3f:super.precioFinal();
       return (this.sintonizadorTDT)?p+=500:p;
    }

    @Override
    public String toString() {
        return "Televisor{" +super.toString()+ " resoluci\u00f3n=" + resolución + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
     
     
    
}
