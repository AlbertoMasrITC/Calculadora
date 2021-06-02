package wsCalculadora;

public class Calculadora {
    public double suma(double x, double y)
    {
        return x + y;
    }

    public double multiplica(double x, double y) {
        return x * y;
    }

    public double seno(double x) {
        return Math.sin(x);
    }

    public double coseno(double x) {
        return Math.cos(x);
    }

    public double tangente(double x) {
        return Math.tan(x);
    }

    public double resta(double d, double e) {
        return d - e;
    }

    public double division(double d, double i) {
        return d / i;
    }
}