import java.util.Scanner;

class Calculator {
    double a, b, c;
    String operator;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double add() { return a + b;}
    double sub() {return a - b;}
    double mul() {return a * b;}
    double div() {return a / b;}
}

public class program1 {
    public static void main(String[] args) {
        try (Scanner sr = new Scanner(System.in)) {
            System.out.println("Enter the value of a: ");
            double a = sr.nextDouble();
            System.out.println("Enter the value of b: ");
            double b = sr.nextDouble();
            System.out.println("Enter the operation: add, sub, mul, div");
            String operator = sr.next();
            double c = 0;
            Calculator obj = new Calculator(a, b);
            switch (operator) {
                case "add":c = obj.add();
                    break;
                case "sub":c = obj.sub();
                    break;
                case "div":c = obj.div();
                    break;
                case "mul":c = obj.mul();
                    break;
            }
            System.out.println(a + " " + operator + " " + b + " = " + c);
        }
    }
}
