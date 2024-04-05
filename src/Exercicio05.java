import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma palavra ou frase para inverter: ");
    String entrada = scanner.nextLine();
    scanner.close();

    String invertida = inverterString(entrada);
    System.out.println("String invertida: " + invertida);
}

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
