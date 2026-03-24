package SPCAR;
import java.util.Scanner;
public class spcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
        // Criação do objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Leitura do modelo do carro
        System.out.print("Digite o modelo do carro alugado: ");
        String modeloCarro = scanner.nextLine();

        // Leitura do valor da diária
        System.out.print("Digite o valor da diária para locação: ");
        double valorDiaria = scanner.nextDouble();

        // Leitura da quantidade de dias de locação
        System.out.print("Digite a quantidade de dias de locação: ");
        int quantidadeDias = scanner.nextInt();

        // Leitura da quantidade de Km percorridos
        System.out.print("Digite a quantidade de Km percorridos: ");
        int quantidadeKm = scanner.nextInt();

        // Cálculo do valor total a pagar
        double valorDiariasTotal = valorDiaria * quantidadeDias;
        double valorKmPercorridos = quantidadeKm * 0.20;
        double valorTotal = valorDiariasTotal + valorKmPercorridos;

        // Exibição do modelo do carro e valor total a pagar
        System.out.println("Modelo do carro: " + modeloCarro);
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        // Fechamento do objeto Scanner
        scanner.close();
    }
}
