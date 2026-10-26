import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Objective
 * In this challenge, we're going to use loops to help us do some simple math.
 *
 * Task
 * Given an integer, N, print its first multiples. Each multiple N x i (where 1 < i < 10 ) should be printed on a
 * new line in the form: N x i = result.
 *
 * Input Format
 * A single integer, N.
 *
 * Output Format
 *
 * Print  lines of output; each line  (where 1 < i < 10 ) ) contains the  of  in the form:
 * N x i = result.
 *
 * Sample Input
 * 2
 *
 * Sample Output
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 * 2 x 4 = 8
 * 2 x 5 = 10
 * 2 x 6 = 12
 * 2 x 7 = 14
 * 2 x 8 = 16
 * 2 x 9 = 18
 * 2 x 10 = 20
 */

public class javaLoops  {
    public static void main(String[] args) throws IOException {

        // BufferedReader -> Cria um leitor otimizado que armazena os dados em memória (buffer) para ler textos de forma muito rápida
        // InputStreamReader -> Converte o fluxo de bytes brutos que vêm do teclado em caracteres de texto reconhecíveis
        // System.in -> Captura a entrada padrão do sistema, ou seja, tudo o que o usuário digita no console/teclado
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter a number: ");
        // Lê uma linha inteira do console, remove os espaços invisíveis das pontas,
        // converte o texto para um número inteiro e guarda o resultado na variável 'N'.
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            int multiples = N * i;
            System.out.printf("%d x %d = %d \n", N, i, multiples);
            bufferedReader.close();
        }
    }
}
