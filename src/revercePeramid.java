public class revercePeramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
           for(int k = 1; k <= i; k++){
                System.out.print(" ");
           }
            for (int j = 5-i; j >= 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}