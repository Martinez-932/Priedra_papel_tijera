/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedra.papel.o.tijera;
import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author MINEDUCYT
 */
public class PiedraPapelOTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Random rnd = new Random ();
        
         int jugador,pc;
        System.out.println("Ingresa el valor que vas a jugar:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("4. Lagarto");
        System.out.println("5.Spock");
        System.out.println("Valor:");
        do {
            jugador = sc.nextInt();
            sc.nextLine();
            if (jugador<1 || jugador>5)
                System.out.print("valor incorrecto. ingresalo de nuevo: ");
        } while (jugador<1 || jugador>5);
        pc = rnd.nextInt(3)+1;
        if (jugador ==1)
            System.out.println("El jugador jugo piedra:");
        if (jugador ==2)         
        System.out.println("El jugador jugo papel:");
        if (jugador ==3)
        System.out.println("El jugador jugo tijera:");
        if (jugador ==4)
        System.out.println("El jugador jugo Lagarto:");
        if (jugador ==5)
        System.out.println("El jugador jugo Spock:");
        System.out.println("La computadora jugo el valor:" + pc);
        if (pc ==1)
            System.out.println("La computadora jugo piedra:");  
        if (pc ==2)
        System.out.println("La computadora jugo papel:");
        if (pc ==3)
        System.out.println("la computadora jugo tijera:");
        if (pc ==4)
        System.out.println("la computadora jugo Lagarto:");
        if (pc ==5)
        System.out.println("la computadora jugo Spock:");
            if (jugador == pc)
            System.out.println("Empate");
        if ((jugador==1&&pc==3)||(jugador==2&&pc==1)||(jugador==3&&pc==2)||(jugador==4&&pc==5)||(jugador==5&&pc==4))
        System.out.println("jugador gana");
        if ((jugador==3&&pc==1)||(jugador==1&&pc==2)||(jugador==2&&pc==3)||(jugador==5&&pc==4)||(jugador==4&&pc==5))
        System.out.println("Computadora gana");
        }
        
        
                
}

        
    
    

