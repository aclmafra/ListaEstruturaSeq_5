import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m, c;

        System.out.println("Digite um numero em metros: ");
        m = sc.nextInt();
        c = m * 100;

        System.out.println(m + " metro(s)" + " equivale a " + c + " centimetro(s)");

        sc.close();
    }
}
