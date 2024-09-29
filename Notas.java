import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota A1 (máx 30): ");
        double A1 = scanner.nextDouble();
        
        System.out.print("Digite a nota A2 (máx 30): ");
        double A2 = scanner.nextDouble();
        
        System.out.print("Digite a nota A3 (máx 40): ");
        double A3 = scanner.nextDouble();

        if (A1 > 30 || A2 > 30 || A3 > 40) {
            System.out.println("Erro: As notas inseridas estão fora dos limites permitidos.");
        } else {
            double notaFinal = A1 + A2 + A3;
            System.out.println("Nota final: " + notaFinal);
        }
    }
}