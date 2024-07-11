import java.util.Arrays;

public class P18 {
    public static void main(String[] args) {
        // Print integer
        int num = 42;
        System.out.println("Integer: " + num);

        // Print double
        double pi = 3.14159;
        System.out.println("Double: " + pi);

        // Print character
        char letter = 'A';
        System.out.println("Character: " + letter);

        // Print string
        String message = "Hello, world!";
        System.out.println("String: " + message);

        // Print boolean
        boolean flag = true;
        System.out.println("Boolean: " + flag);

        // Print formatted string
        int age = 25;
        double height = 175.5;
        String name = "John";
        System.out.printf("Name: %s, Age: %d, Height: %.1f cm\n", name, age, height);

        // Print array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(numbers));

        // Print multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Multi-dimensional array: " + Arrays.deepToString(matrix));
    }
}
