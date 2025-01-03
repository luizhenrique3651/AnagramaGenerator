import java.util.*;

public class AnagramaGenerator {

    /**
     * Gera todos os anagramas possíveis da string de entrada fornecida.
     *
     * @param input A string de entrada contendo letras distintas.
     * @return Uma lista de anagramas gerados a partir da string de entrada.
     * @throws IllegalArgumentException se a entrada for nula, vazia ou contiver caracteres que não sejam letras.
     */
    public static List<String> generateAnagrams(String input) {
        if (input == null || input.isEmpty() || input.length() <= 1) {
            throw new IllegalArgumentException("A entrada não deve ser nula ou vazia, e deve ter mais de um caractere.");
        }
        if (!input.chars().allMatch(Character::isLetter)) {
            throw new IllegalArgumentException("A entrada deve conter apenas letras.");
        }

        List<String> results = new ArrayList<>();
        permute(input.toCharArray(), 0, results);
        return results;
    }

    /**
     * Gera recursivamente as permutações do array de caracteres fornecido.
     *
     * @param chars   O array de caracteres a ser permutado.
     * @param index   O índice atual sendo trocado.
     * @param results A lista para armazenar as permutações geradas.
     */
    private static void permute(char[] chars, int index, List<String> results) {
        if (index == chars.length - 1) {
            results.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1, results);
            swap(chars, index, i); // Retrocede para o estado anterior
        }
    }

    /**
     * Troca dois caracteres no array fornecido.
     *
     * @param chars O array de caracteres.
     * @param i     O índice do primeiro caractere.
     * @param j     O índice do segundo caractere.
     */
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Digite uma string válida: \n ");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            List<String> anagrams = generateAnagrams(input);
            System.out.println("Anagramas de: '" + input + "': " + anagrams);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
