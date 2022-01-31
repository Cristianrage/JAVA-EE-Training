import java.util.Scanner;
public class Ejercicio1{

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        float z = 0;
        String cadena1;
        String cadena2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        x = teclado.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        y = teclado.nextInt();
        System.out.println("Ingrese el tercer numero decimal");
        z = teclado.nextFloat();
        System.out.println("Ingrese un texto");
        cadena1 = teclado.next();
        System.out.println("Ingrese otro texto");
        cadena2 = teclado.next();
        float suma = (float) ((float)x +(float) y + z);
        System.out.printf("La suma de los tres numeros es %f", suma );

    }

}