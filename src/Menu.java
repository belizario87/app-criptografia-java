import java.util.Scanner;

public class Menu {

    public static void chamarMenu() {

        Scanner sc = new Scanner(System.in);

        String flag = "";

        while (!flag.equalsIgnoreCase("s")) {

            System.out.println("\u001B[47m\u001B[30mDigite a mensagem a ser criptografada:\u001B[0m");
            String mensagem = sc.nextLine();
            System.out.println();

            // Criptografar a mensagem

            System.out
                    .println("\u001B[47m\u001B[30mMensagem criptografada:\u001B[0m "
                            + Criptografar.criptografar(mensagem));
            System.out.println();
            // Descriptografar a mensagem
            System.out.println("\u001B[45mVoce deseja descriptografar a mensagem? (S/N)\u001B[0m");

            String resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                System.exit(0);
            } else {

                System.out.println("\u001B[47m\u001B[30mDigite a mensagem a ser descriptografada:\u001B[0m");
                mensagem = sc.nextLine();

                System.out.println();
                System.out.println(
                        "\u001B[47m\u001B[30mMensagem descriptografada:\u001B[0m "
                                + Descriptografar.descriptografar(mensagem));

            }

            System.out.println("\u001B[45mVoce deseja criptografar outra mensagem? (S/N)\u001B[0m");
            resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                System.exit(0);
            }

        }
        sc.close();
    }
}
