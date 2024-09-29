import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        double[] limites = {30, 30, 40}; 
        String[] nomesNotas = {"A1", "A2", "A3"};

        for (int i = 0; i < 3; i++) {
            do {
                System.out.print("Digite a nota " + nomesNotas[i] + " (máx " + limites[i] + "): ");
                notas[i] = scanner.nextDouble();
                if (notas[i] > limites[i]) {
                    System.out.println("Erro: A nota " + nomesNotas[i] + " não pode ser maior que " + limites[i] + ". Por favor, insira novamente.");
                }
            } while (notas[i] > limites[i]);
        }


        double notaFinal = notas[0] + notas[1] + notas[2];
        System.out.println("Nota final: " + notaFinal);
    }
}