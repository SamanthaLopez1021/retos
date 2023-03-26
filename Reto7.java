import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        String Nom,Correo,Contraseña;
        int i=0,Tel,Opc;
        Scanner lectura =new Scanner(System.in);

        while (i>=0 && i<100) {
            System.out.println("REGISTRO DE USUARIOS");
            System.out.println("Ingrese su nombre");
            Nom=lectura.next();
            System.out.println("Ingrese su telefono");
            Tel=lectura.nextInt();
            System.out.println("Ingrese su correo");
            Correo=lectura.next();
            System.out.println("Ingrese su contraseña");
            Contraseña=lectura.next();

            System.out.println("Sus datos registrados fueron\n Nombre:"+Nom+"\n Telefono:"+Tel+"\n Correo:"+Correo+"\n Contraseña:"+Contraseña+"\n ¿Desea llenar otro formulario?\n1.Si\n2.No");
            Opc=lectura.nextInt();  
            if (Opc==1) {
                i++;
            }
            else{
                System.out.println("gracias");
                i=101;
            }
        }
        lectura.close();
       
    }
}
