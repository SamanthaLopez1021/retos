import java.util.Random;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        int i=3,Elec,Opc;
        

        Scanner lectura= new Scanner(System.in);
        Random aleatorio=new Random();

        while (i<=3 && i>0) {
            System.out.println("ingrese una opcion para jugar 1.Piedra, 2.Papel, 3.Tijera");
            Elec=lectura.nextInt();
            int E=aleatorio.nextInt(3)+1;
            if (Elec==2 && E==1) {
                System.out.println("Usted eligio Papel, la maquina saco Piedra"+"\n Usted gano el juego");
            }
            else if (Elec==2 && E==2) {
                System.out.println("Usted eligio Papel, la maquina saco Papel \n Empate");
                
            }
            else if (Elec==2 && E==3){
                System.out.println("Usted eligio Papel, la maquina saco Tijera \n La maquina gano el juego");
                i=i-1;
                System.out.println("le quedan"+i+"vidas");
            }
            else if (Elec==1 && E==1) {
                System.out.println("Usted eligio Piedra, la maquina saco Piedra \n Empate");
                
            }
            else if (Elec==1 && E==2) {
                System.out.println("Usted eligio Piedra, la maquina saco Papel \n La maquina gano el juego");
                i=i-1;
                System.out.println("le quedan"+i+"vidas");
            }
            else if (Elec==1 && E==3) {
                System.out.println("Usted eligio Piedra, la maquina saco Tijera"+"\nUsted gano el juego");
                
            }
            else if (Elec==3 && E==1) {
                System.out.println("Usted eligio Tijera, la maquina saco Piedra \n La maquina gano el juego");
                i=i-1;
                System.out.println("le quedan"+i+"vidas");
            }
            else if (Elec==3 && E==2) {
                System.out.println("Usted eligio Tijera, la maquina saco Papel"+"\n Usted gano el juego");
                
            }
            else if (Elec==3 && E==3) {
                System.out.println("Usted eligio Tijera, la maquina saco Tijera \n Empate");
                
            }
            if (i==0){
            System.out.println("No tiene mas vidas, ¿desea volver a jugar? \n 1.si \n 2.no");
            Opc=lectura.nextInt();
                if (Opc==1) {
                    i=3;
 
                }else{
                    System.out.println("Juego terminado");
                }
                

            
            }
           
                
    
        }
        
        lectura.close();
    }
    
}
