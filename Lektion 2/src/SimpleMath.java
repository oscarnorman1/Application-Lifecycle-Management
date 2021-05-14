public class SimpleMath {

    public int add(int a, int b) {
        if (a < 0 && b < 0) {
            throw new IndexOutOfBoundsException("Error");
        }

        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
        
    }


}
