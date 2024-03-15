package src;

public class Questao5 {
    public static void main(String[] args) {
        String a = "abcde";
        String reverso = stringReversa(a);
        System.out.println("String invertida: " + reverso);
    }

    private static String stringReversa(String str) {
        char[] caracteres = str.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;
        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            esquerda++;
            direita--;
        }
        return new String(caracteres);
    }
    }

