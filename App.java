/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._examen_practico2;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class App {

    public static void main(String[] args) {
        
        int piedra = 1, papel = 2, tijera = 3;
        String usuario = null;
        String respuesta;
        
        System.out.println("ROCK, PAPER, SCISSORS");
 
        Scanner captu = new Scanner(System.in);
   
        while (true){
        System.out.println("Piedra(1), papel(2), tijera(3)");
        int usuarioElige = captu.nextInt();
        

        if (usuario.equals("salir")) {
        System.out.println("El juego ha terminado");
        break;
        }
        
        if(!usuario.equals("Piedra") && !usuario.equals("Papel") && !usuario.equals("Piedra")){
            
           System.out.println("Seguimos en el juego") ;
           continue;
            
        }
        }
        
               
    
        
                               
    } 
}

