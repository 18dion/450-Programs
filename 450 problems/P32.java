public class P32{
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int length = String.valueOf(n).length();

        while (n != 0) {
            int remainder = n % 10;
            sum = sum + (int) Math.pow(remainder, length);
            n = n / 10;
        }

        if (sum == originalNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}