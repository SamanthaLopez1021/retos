import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args){
        double cent,faren,kelv,F,K;
        Scanner lectura=new Scanner(System.in);

        System.out.println("Ingrese los grados centigrados que desea conver a farenheit y kelvin");
        cent=lectura.nextInt();

        faren=cent*1.8+32;
        kelv=cent+273.15;
        F=faren+100;
        K=kelv+100;

        System.out.println("Grados centigrados"+cent);
        System.out.println("La conversion de centigrados a farenheit es"+F);
        System.out.println("La conversion de centigrados a kelvin es"+K);

        lectura.close();
    }
}
    

