public class P30 {
    public static void main(String[] args) {
        int num = 1202;
        int reverse = 0;
        int temp = num;

        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }

        if (num == reverse) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}