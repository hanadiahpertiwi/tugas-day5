abstract class ArithmeticExpression { // base abstract superclass

    double left;
    double right;
    double result;

    public abstract void evaluate();

    public abstract void display();
}


class Addition extends ArithmeticExpression {

    public Addition(double x, double y) {
        this.left = x;
        this.right = y;
    }

    @Override
    public void evaluate() {
        result = left + right;
    }

    @Override
    public void display() {

        System.out.println

                ("The expression and result is: " + left + " + " + right + " = "
                        + result);

    }

}

class Subtract extends ArithmeticExpression {

    public Subtract(double x, double y) {
        this.left = x;
        this.right = y;
    }

    @Override
    public void evaluate() {
        result = left - right;
    }

    @Override
    public void display() {

        System.out.println

                ("The expression and result is: " + left + " - " + right + " = "
                        + result);

    }

}

class Multiplication extends ArithmeticExpression {

    public Multiplication(double x, double y) {
        this.left = x;
        this.right = y;
    }

    @Override
    public void evaluate() {
        result = left * right;
    }

    @Override
    public void display() {

        System.out.println

                ("The expression and result is: " + left + " * " + right + " = "
                        + result);

    }

}


class Division extends ArithmeticExpression {

    public Division(double x, double y) {
        this.left = x;
        this.right = y;
    }

    @Override
    public void evaluate() {
        result = left / right;
    }

    @Override
    public void display() {

        System.out.println("The expression and result is: " + left + " / "
                + right + " = " + result);

    }

}

public class calculator {
    public static void main(String args[])
    {

        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();

        // We can have references of Base type.
        ArithmeticExpression a = new Addition(1,2);
        a.evaluate();
        a.display();

        ArithmeticExpression b = new Multiplication(1,2);
        b.evaluate();
        b.display();

        ArithmeticExpression c = new Division(4,2);
        c.evaluate();
        c.display();

        ArithmeticExpression d = new Subtract(4,2);
        d.evaluate();
        d.display();
    }

}

