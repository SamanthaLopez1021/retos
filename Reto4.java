import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        String NomJug;
        int edad,Elec;
        Scanner lectura=new Scanner(System.in);
        Random aleatorio=new Random();
        System.out.println("Ingrese su nombre");
        NomJug=lectura.next();
        System.out.println("ingrese su edad");
        edad=lectura.nextInt();

        if (edad>=18 && edad<=100) {
            System.out.println("ingrese una opcion para jugar 1.Piedra, 2.Papel, 3.Tijera");
            Elec=lectura.nextInt();
            int E=aleatorio.nextInt(3)+1;
            if (Elec==2 && E==1) {
                System.out.println("Usted eligio Papel, la maquina saco Piedra"+"\n"+NomJug+" Usted gano el juego");
            }
            else if (Elec==2 && E==2) {
                System.out.println("Usted eligio Papel, la maquina saco Papel \n Empate");
                
            }
            else if (Elec==2 && E==3){
                System.out.println("Usted eligio Papel, la maquina saco Tijera \n La maquina gano el juego");

            }
            else if (Elec==1 && E==1) {
                System.out.println("Usted eligio 1.Piedra, la maquina saco Piedra \n Empate");
                
            }
            else if (Elec==1 && E==2) {
                System.out.println("Usted eligio 1.Piedra, la maquina saco Papel \n La maquina gano el juego");
                
            }
            else if (Elec==1 && E==3) {
                System.out.println("Usted eligio 1.Piedra, la maquina saco Tijera"+"\n"+NomJug+" Usted gano el juego");
                
            }
            else if (Elec==3 && E==1) {
                System.out.println("Usted eligio 3.Tijera, la maquina saco Piedra \n La maquina gano el juego");
                
            }
            else if (Elec==3 && E==2) {
                System.out.println("Usted eligio 3.Tijera, la maquina saco Papel"+"\n"+NomJug+" Usted gano el juego");
                
            }
            else if (Elec==3 && E==3) {
                System.out.println("Usted eligio 3.Tijera, la maquina saco Tijera \n Empate");
                
            }
                
                
        }
        else if (edad<=0) {
            System.out.println("Error,ingrese una edad valida");
            
        }
        else{
            System.out.println(NomJug+" no puede jugar por su edad");
        }

         lectura.close(); 
    }

        
}

    

