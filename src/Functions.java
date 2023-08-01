import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        String primerNombre = scanner.nextLine();
        
       
        
        printNameLength(primerNombre);
        printNameCharacters(primerNombre);
        
        
        scanner.close();
    }

    private static void printNameLength(String nombre) {
        
        System.out.println(nombre.length());
    }

    private static void printNameCharacters(String primerNombre) {
      
        for (char ch : primerNombre.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    
  
    }

