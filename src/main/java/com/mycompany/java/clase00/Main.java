/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.clase00;

/**
 *
 * @author EducaciónIT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio de Aplicacion");
        MiHilo hilo = new MiHilo();
        hilo.start();

        MiRunnable runnable1 = new MiRunnable();
        Thread hilo2 = new Thread(runnable1);
        hilo2.start();
        
        
        Thread hilo3 = new Thread (new Runnable() {
            
            @Override
            public void run() {
                System.out.println("Soy un runner anonimo");
                
            }
        } );
        
        //otras formas con Lamda
        
        Thread hilo4 = new Thread(){
            
        
        };
        

        System.out.println("Fin de aplicación");

    }

}
