package calculadora; 

public class operaciones {

    private double num1;
    private double num2;

    public operaciones ( double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        } 

        public double suma () {
            return num1 + num2;
            } 

            public double resta () {
            return num1 - num2;
            } 

            public double multiplicacion () {
            return num1 * num2;
            } 

            public double division () {
            if (num2 != 0 ) {
                return num1 / num2;
                } else { 
                    system.out.println ("no se puede dividir entre cero");
                return Double.Nan; //devuelve "not a number" cuando es una division por 0
                }
            }
}






