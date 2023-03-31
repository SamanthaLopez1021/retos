//dados 
import java.util.Random;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        int i=3,j=3,Opc;
        int d1,d2;

        Scanner lectura=new Scanner(System.in);
        Random dado=new Random();
        while (i<=3 && i>0) {
            while (j<=3 && j>0) {
                System.out.println("Jugador 1 presione cualquier numero para lanzar el dado");
                d1=lectura.nextInt();
                int dado1=dado.nextInt(6)+1;
                System.out.println("el resultado del dado es: "+dado1);
                System.out.println("Jugador 2 presione cualquier tecla para lanzar el dado");
                d2=lectura.nextInt();
                int dado2=dado.nextInt(6)+1;
                System.out.println("el resultado del dado es: "+dado2);

                    if (dado1>dado2) {
                        System.out.println("el jugador 1 ha ganado");
                        j=j-1;
                        System.out.println("Jugador 2 le quedan"+j+"vidas");

                        
                    }else if (dado1<dado2) {
                        System.out.println("el jugador 2 ha ganado");
                        i=i-1;
                        System.out.println(" Jugador 1 le quedan"+i+"vidas");
                        
                    }else if (dado1==dado2) {
                        System.out.println("Empate");
                    }
                    if (i==0) {
                        System.out.println("Jugador 1 le quedan 0 vidas, el jugador 2 ha ganado");
                        System.out.println("No tiene mas vidas, ¿desea volver a jugar? \n 1.si \n 2.no");
                        Opc=lectura.nextInt();
                            if (Opc==1) {
                                i=3;
                                j=3;
             
                            }else{
                                System.out.println("Juego terminado, gracias por jugar");
                            }
                        
                    }else if (j==0) {
                        System.out.println("Jugador 2 le quedan 0 vidas, el jugador 1 ha ganado"); 
                        System.out.println("No tiene mas vidas, ¿desea volver a jugar? \n 1.si \n 2.no");
                        Opc=lectura.nextInt();
                            if (Opc==1) {
                                i=3;
                                j=3;
             
                            }else{
                                System.out.println("Juego terminado, gracias por jugar");
                            }  
                    }

            }

            }
        
            lectura.close();
        }
        


        

    }
   
    

