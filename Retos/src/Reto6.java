import java.util.Scanner;

// Descubra la palabra
public class Reto6 {
    public static void main(String[] args) {
        int CP,i=3;
        String palabra;
        Scanner lectura=new Scanner(System.in);
        System.out.println("¿cuantas palabras desea descubrir?");
        while (i>0 && i<=3) {
            System.out.println("la cantidad de palabra maxima que puede descubrir son 4 y la tematica es animales");
            CP=lectura.nextInt();
            System.out.println("ingrese una palabra para decubrir");
            palabra=lectura.next();

            if (palabra.equalsIgnoreCase("perro")) {
                System.out.println("usted adivino la palabra");
                
            }
            else{
                System.out.println("usted no adivino la palabra");
            }

            
        }





        
        lectura.close();

    }

}
