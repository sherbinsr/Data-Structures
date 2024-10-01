public class PyramidPattern {

    public static void main(String[] args) {
        int n = 5;  // Number of rows

        String star ="*";
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println(star);
            star= star+"**";


        }
    }
}
