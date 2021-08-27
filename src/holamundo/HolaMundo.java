package holamundo;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 1;
        int sum;

        System.out.println("Digite el numero que desea sacarle el Fibo\n");
        Scanner entrada = new Scanner(System.in);
        int fibo = entrada.nextInt();

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 0; i <= fibo; i++) {
            sum = n2 + n1;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
            sum = n2 + n1;
        }
    }
}
