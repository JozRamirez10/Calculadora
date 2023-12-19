public class Operaciones {
    public static double suma(double op1, double op2) {
        return op1 + op2;
    }
    public static double resta(double op1, double op2){
        return op1 - op2;
    }

    public static double multiplicacion(double op1, double op2){
        return op1 * op2;
    }

    public static double division(double op1, double op2) {
        if(op2 == 0)
            throw new ArithmeticException();
        return op1 / op2;
    }
}
