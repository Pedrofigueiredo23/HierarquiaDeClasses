import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array de veiculos
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();


        boolean continuarPrograma = true;

        while (continuarPrograma) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Crie uma instância de carro ");
            System.out.println("2. Crie uma instância de moto ");
            System.out.println("3. Sair ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.println("Digite a marca do carro: ");
                    String marca = scanner.nextLine();
                    System.out.println("Digite o ano do carro: ");
                    int anoFabrico = scanner.nextInt();
                    System.out.println("Digite o número de portas do carro: ");
                    int nrPortas = scanner.nextInt();

                    //Método construtor Carro
                    Carro carro = new Carro(marca, anoFabrico, nrPortas);
                    System.out.println("Carro criado com sucesso!");
                    carro.apresentar();
                    listaVeiculos.add(carro);
                }
                case 2 -> {
                    System.out.println("Digite a marca da moto: ");
                    String marca = scanner.nextLine();
                    System.out.println("Digite o ano da moto: ");
                    int anoFabrico = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o tipo de moto: ");
                    String tipoMoto = scanner.nextLine();

                    //Método construtor Moto
                    Moto moto = new Moto(marca, anoFabrico, tipoMoto);
                    System.out.println("Moto criada com sucesso!");
                    moto.apresentar();
                    listaVeiculos.add(moto);
                }
                case 3 -> {
                    System.out.println("A sair do programa...");
                    continuarPrograma = false;
                }
                default -> System.out.println("Opção Inválida.");
            }

        }

    }
}