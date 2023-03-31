import java.util.Random;
import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        String NomJug;
        int edad,Elec;
        Scanner lectura=new Scanner (System.in);
    
        
        System.out.println("Ingrese su nombre");
        NomJug=lectura.next();
        System.out.println("ingrese su edad");
        edad=lectura.nextInt();
       
        if (edad>=18 && edad<=100 ) {
            System.out.println("ingrese una opcion para jugar 1.Cara, 2.Sello");
            Elec=lectura.nextInt();

            Random aleatorio=new Random();
            int Moneda=aleatorio.nextInt(2)+1;

            if (Elec==Moneda) {

                switch (Moneda) {
                    case 1:
                        System.out.println("Su eleccion fue: "+Elec +" \nEl resultado de la moneda fue Cara");

                        break;
                    case 2:
                        System.out.println("Su eleccion fue: "+Elec+ " \nEl resultado de la moneda fue Sello");
                
                    default:
                        break;
                }
                
                System.out.println(NomJug+" Usted gano el juego, la maquina ha perdido");
                
            }
            else{
                switch (Moneda) {
                    case 1:
                        System.out.println("Su eleccion fue: "+Elec +"\nEl resultado de la moneda fue Cara");
                        break;
                    case 2:
                        System.out.println("Su eleccion fue: "+Elec+ "\n El resultado de la moneda fue Sello");
                
                    default:
                        break;
                }
                System.out.println(NomJug+" usted perdio el juego, la maquina ha ganado");
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
