interface Function {
    int evaluate(int value);
} 
class Half implements Function {
    @Override
    public int evaluate(int value) {
        return value / 2;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] inputArray = {10, 20, 30, 40, 50};
        int[] halfArray = halveValues(inputArray);

        // Print the results
        for (int value : halfArray) {
            System.out.println(value);
        }
    }

    public static int[] halveValues(int[] values) {
        int[] result = new int[values.length];
        Function halfFunction = new Half(); // Create an instance of Half

        for (int i = 0; i < values.length; i++) {
            result[i] = halfFunction.evaluate(values[i]); // Use the evaluate method
        }

        return result;
    }
}
