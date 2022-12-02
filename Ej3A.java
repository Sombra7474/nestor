import java.util.*;
public class Ej3A {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int numeros[] = new int[10];
        System.out.println("Piensa 10 numeros");
        for (int i=0;i<numeros.length;i++) {
            System.out.print("\nEscribe un numero: ");
            numero=leer.nextInt();
            numeros[i]=numero;
        }
        int max = numeros[0];
        int min = numeros[0];

        for (int i = 0;i<numeros.length;i++) {
            if (max<numeros[i]) {
                max=numeros[i];
            }
            if (min>numeros[i]) {
                min=numeros[i];
                
            }
            
        }
        System.out.println("El valor máximo introducido es: " + max);
        System.out.println("El valor mínimo introducido es: " + min);
    }
}
