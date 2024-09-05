import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao calculo de rota");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos quilometros tem a rota desejada?");
        double rota = scanner.nextDouble();

        System.out.println("Possui postos para abastecimento/paradas no caminho?");
        String resposta = scanner.next();

        //Laço para que continue até que a resposta seja sim ou não
        while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não")){
            resposta = scanner.next();

            //Verifica se a resposta
            if (resposta.equalsIgnoreCase("sim")){ //equalsIgnoreCase é usada pra comprarar Strings. Ignorando se são letras maiusculas ou minusculas
                System.out.println("Continuando o calculo da rota");
            }else if (resposta.equalsIgnoreCase("não")){
                System.out.println("Calculando a rota");
            }else {
                System.out.println("Resposta invalida digite sim ou não");
            }
        }
        System.out.println("Qual(s) tipo(s) de combustiveis seu carro usa?");

        System.out.println("1. Gasolina");
        System.out.println("2. Alcool");
        System.out.println("3. Diesel");
        System.out.println("4. GNV");

        int  combustuvel = scanner.nextInt();
        double precoDoCombustivel = 0;

        switch (combustuvel){
            case 1:
                precoDoCombustivel = 6.09;
                System.out.println("O valor em média da gasolina é de R$ 6,09");
                break;
            case 2:
                precoDoCombustivel = 4.08;
                        System.out.println("O valor em média do alcool é de R$ 4,08");
                break;
            case 3:
                precoDoCombustivel = 6.02;
                        System.out.println("O valor em média do diesel é de R$ 6,02");
                break;
            case 4:
                precoDoCombustivel = 4.59;
                        System.out.println("O valor em média do gnv é de R$ 4,59");
                break;
            default:
                System.out.println("Opção invalida, escolha um número entre 1 e 4");
                return;
        }
        System.out.println("Quantos quilometros o carro faz por litro?");
        double kms = scanner.nextDouble();

        //calcula quantos litros serão necessarios
        double litrosNecessarios = rota / kms;

        //calcula o valor total gasto de combustivel
        double valorTotal = litrosNecessarios * precoDoCombustivel;

        System.out.printf("Você precisará de %.2f litros para percorrer a rota de %.2f quilometros.%n", litrosNecessarios, rota);
        System.out.printf("O valor total gasto será de: R$ %.2f%n", valorTotal);
    }
}