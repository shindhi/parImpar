import java.util.Scanner;

public class Dojo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome1 = "", nome2 = "";
        int P1, P2, opt1, soma, opt2;
        int optionPartida;
        int scoreP1 = 0, scoreP2 = 0;

        System.out.println("Escolha:");
        System.out.println("1: Jogar contra pc");
        System.out.println("2: Jogar contra outro jogador");
        System.out.println("3: sair");

        optionPartida = scanner.nextInt();

        switch (optionPartida) {
            case 1:
                System.out.println("Digite o nome do jogador: ");
                scanner.nextLine();
                nome1 = scanner.nextLine();
                nome2 = "PC";
                break;
            case 2:
                System.out.println("Digite o nome do primeiro jogador: ");
                scanner.nextLine();
                nome1 = scanner.nextLine();

                System.out.println("Digite o nome do segundo jogador: ");
                nome2 = scanner.nextLine();
                break;
            case 3:
                System.out.println("SAINDO!!");
                break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }


        while (optionPartida != 3) {
            switch (optionPartida) {
                case 1:
                    System.out.println("Escolha: ");
                    System.out.println("1: Par");
                    System.out.println("2: Impar");
                    P1 = scanner.nextInt();

                    System.out.println("Digite um valor: ");
                    opt1 = scanner.nextInt();

                    if (P1 == 1) {
                        if ((opt1 + Math.random() * 11) % 2 == 0) {
                            scoreP1++;
                        } else {
                            scoreP2++;
                        }

                    } else {
                        if ((opt1 + Math.random() * 11) % 2 == 0) {
                            scoreP2++;
                        } else {
                            scoreP1++;
                        }
                    }

                    break;
                case 2:
                    System.out.println("Jogador " + nome1 + " escolha 1 para par ou 2 para impar");
                    P1 = scanner.nextInt();

                    System.out.println("Jogador " + nome1 + " digite um valor:");
                    opt1 = scanner.nextInt();
                    System.out.println("Jogador " + nome2 + " digite um valor:");
                    opt2 = scanner.nextInt();

                    if (P1 == 1) {

                        if ((opt1 + opt2) % 2 == 0) {
                            scoreP1++;
                        } else {
                            scoreP2++;
                        }
                    } else {
                        if ((opt1 + opt2) % 2 == 0) {
                            scoreP2++;
                        } else {
                            scoreP1++;
                        }
                    }
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
            }

            System.out.println("Escolha:");
            System.out.println("1: Jogar contra pc");
            System.out.println("2: Jogar contra outr jogador");
            System.out.println("3: sair");
            optionPartida = scanner.nextInt();

        }

        System.out.printf("A pontuacao do jogador %s é %d%n", nome1, scoreP1);
        System.out.printf("A pontuacao do jogador %s é %d", nome2, scoreP2);


        scanner.close();
    }
}
