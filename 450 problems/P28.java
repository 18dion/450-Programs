class P28 {
    static int Fibonacci(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return Fibonacci(N - 1) + Fibonacci(N - 2);
        }
    }

    public static void main(String args[]) {
        int N = 10;
        System.out.println("Fibonacci Series till " + N + " terms:");
        for (int i = 0; i < N; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
}