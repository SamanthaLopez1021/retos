import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        String NomBebe,NomMed,Vacuna,Eps;
        double Dosis,Meses,Peso;
        
    

        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingrese el nombre del bebe");
        NomBebe=lectura.next();
        System.out.print("Ingrese el peso del bebe");
        Peso=lectura.nextDouble();
        System.out.print("Ingrese los meses del bebe");
        Meses=lectura.nextDouble();
        System.out.print("Ingrese el nombre del medico");
        NomMed=lectura.next();
        System.out.print("Ingrese el nombre de la vacuna");
        Vacuna=lectura.next();
        System.out.print("Ingrese el nombre de la eps");
        Eps=lectura.next();

        Dosis=(Peso+15)/(Meses*10)*10;

        System.out.print("Los datos registrados son:");
        System.out.print("\nnombre del bebe: "+NomBebe +"\nPeso del bebe :"+ Peso +"\nmeses del bebe:"+Meses);
        System.out.print("\nnombre del medico:"+NomMed + "\nnombre de la vacuna:"+Vacuna + "\nEps:"+ Eps+ "\ndosis vacuna:"+Dosis);
        lectura.close();
        
    }
    
}
