import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
																					  // Exercício 2021 - Fase 2 - Média ou mediana
public class mediaM {                                                                 // Explicacao:
                                                                                      // Metodo principal com o metodo do bufferedreader/inputstreamreader
	                                                                              // Foi utilizado o bufferedreader por conta dele ser mais rápido, pois ele simplesmente le a sequencia de caracteres, enquanto o scanner faz a analise dos dados de entrada 
    public static void main(String[] args) throws IOException {                       // IOException e utilizado para evitar erros no sistema de leitura                                                                                                                                     
    BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	// Declaração de variáveis
	int a = Integer.parseInt(leitor.readLine());                                      // Integer.parseInt e utilizado para converter uma string em um int
	int b = Integer.parseInt(leitor.readLine());

	// Processamento & Saída
	if (a < b)                                                                       // A mediana sempre sera determinada pelo menor numero (A/B) para atender o menor inteiro possível para C
	    System.out.println(2*a-b);                                                   // explicação matemática: ((a+b+c)/3)=a) {caso A seja menor que b}
	else                                                                             // igualando os dois lados da equação fica (a=(1/2)*b+(1/2)*c)
	    System.out.println(2*b-a);                                                   // Como queremos descobrir a variavel c, e não podemos declarar meia variavel como na expressão anterior
    }                                                                                    // multiplicamos a igualdade por 2 e isolamos o c, ficando (c=(2*a)-b)
}

