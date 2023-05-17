import java.util.Scanner;

public class Criptografar {

    public static String criptografar(String mensagem) {
        StringBuilder mensagemCriptografada = new StringBuilder();

        for (int i = 0; i < mensagem.length(); i++) {
            char caractere = mensagem.charAt(i);
            char caractereCriptografado = (char) (caractere + 1);
            mensagemCriptografada.append(caractereCriptografado);
        }

        return mensagemCriptografada.toString();
    }

}
