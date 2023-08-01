public class CalculatorBrain {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        // Prueba de las funciones
        int a = 10;
        int b = 5;

        System.out.println(suma(a, b));
        System.out.println(resta (a, b));
        System.out.println(multiplicacion(a, b));
    }//main
}//CalculatorBrain

