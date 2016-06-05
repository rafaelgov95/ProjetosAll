    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package uri.ufms.exer1172;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    /**
     *
     * @author rafaelgov
     */
    public class Main {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) throws IOException {
            int[] x = new int[10];
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < x.length  ; i++) {
                x[i] = Integer.parseInt(reader.readLine());
                if (x[i] <= 1) {
                    x[i] = 1;
                }
                System.out.println("X[" + i + "] = " + x[i]);
            }

        }

    }
