
package uri.ufms.exercicio;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int tempagora = 0,cont = 0, a, n;
        a = Integer.parseInt(leia.next());
        do {
            n = Integer.parseInt(leia.next());
        } while (n <=0);
        while (cont < n) {
            if (cont == 0) {
                tempagora = a;
                    cont++;
            } else {

                tempagora += (a+1);
                a++;
                cont++;
            }
        }
        System.out.println(tempagora);
    }

}
