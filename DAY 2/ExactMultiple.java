public class ExactMultiple {

    public static boolean isExactMultiple(int N, int M) {
        return N % M == 0;
    }

    public static void main(String[] args) {
        int N = 10;
        int M = 5;
        
        if (isExactMultiple(N, M)) {
            System.out.println(N + " is an exact multiple of " + M);
        } else {
            System.out.println(N + " is not an exact multiple of " + M);
        }
    }
}
