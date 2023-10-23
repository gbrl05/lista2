import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int i;
        int resultado;

        System.out.println("Esse programa mostra a tabuada do número digitado de 1 até 10");
        System.out.print("Digite um número: ");
        n = scanner.nextInt();

        for(i = 1 ; i <= 10 ; i++){
            resultado = i * n;
            System.out.println(i + "x" + n + "=" + resultado);
        }
    }
}