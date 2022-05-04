public class App {

    public static void main(String[] args) throws Exception {

        asalSayiBul();

    }

    public static void asalSayiBul() {
        
        int k = 0;

        for (int i = 2; i < 101; i++) {
            
            for (int j = 1; j < i; j++) {

                if(i % j == 0) {

                    k = k + 1;

                }
                
            }

            System.out.print((k >= 2) ? "" : i + " ");
            k = 0;

        }

    }
}
