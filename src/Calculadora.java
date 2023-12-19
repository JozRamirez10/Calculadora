import java.util.Scanner;

public class Calculadora {
    private double op1;
    private double op2;
    Scanner scan;

    public Calculadora(){
        this.scan = new Scanner(System.in);

    }
    private void recibirDatos() throws Exception{
        System.out.print("Ingresa el número 1: ");
        this.op1 = Double.parseDouble(this.scan.nextLine());
        System.out.print("Ingresa el número 2: ");
        this.op2 = Double.parseDouble(this.scan.nextLine());
    }

    private void menu(){
        System.out.println("***** Aplicación Calculadora *****");
        System.out.println("""
                    1.Suma
                    2.Resta
                    3.Multiplicación
                    4.División
                    5.Salir
                    """);
        System.out.print("Operación a realizar? ");
    }

    public void ejecucion() {
        while (true) {
            menu();
            try {
                int operacion = Integer.parseInt(scan.nextLine());
                switch (operacion) {
                    case 1 -> { // Suma
                        recibirDatos();
                        System.out.println("Resultado = " + Operaciones.suma(this.op1, this.op2));
                    }
                    case 2 -> { // Resta
                        recibirDatos();
                        System.out.println("Resultado = " + Operaciones.resta(this.op1, this.op2));
                    }
                    case 3 -> { // Multiplicación
                        recibirDatos();
                        System.out.println("Resultado = " + Operaciones.multiplicacion(this.op1, this.op2));
                    }
                    case 4 -> { // División
                        recibirDatos();
                        System.out.println("Resultado = " + Operaciones.division(this.op1, this.op2));
                    }
                    case 5 -> { // Salir
                        System.out.println("Hasta pronto...");
                        System.exit(0);
                    }
                    default -> System.out.println("Opción erronéa: " + operacion);
                }
                System.out.println();

            } catch (Exception e) {
                System.err.println("Error: Entrada inválida\n>> Presione Enter para continuar...");
                scan.nextLine();
            }
        }
    }
}
