public class Descriptografar {

    public static String descriptografar(String mensagemCriptografada) {
        StringBuilder mensagemDescriptografada = new StringBuilder();

        for (int i = 0; i < mensagemCriptografada.length(); i++) {
            char caractereCriptografado = mensagemCriptografada.charAt(i);
            char caractere = (char) (caractereCriptografado - 1); 
            mensagemDescriptografada.append(caractere);
        }

        return mensagemDescriptografada.toString();
    }

}
