package quiz_prova_entregar;

import java.util.Scanner;

public class Questao6Quiz {

public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);//instanciando e criando um objeto Scanner
			
			String nome;
			int ano;
			int acertos = 0;
			int erros = 0;
			
			String[] pergunta = new String[5];
			
			pergunta[0]="Em qua ano o Brasil foi descoberto?\n";
			pergunta[1]="Em qua ano o Brasil foi pentacampeão mundial de futebol?\n";
			pergunta[2]="Em que ano Ayrton Senna conquistou seu terceiro título mundial de Fórmula 1?\n";
			pergunta[3]="Em que ano foi declarada a independência do Brasil?\n";
			pergunta[4]="Em que ano foi promulgada a atual Constituição brasileira?\n";
			
			int[] resposta = new int[5];
			
			resposta[0]=1500;
			resposta[1]=2002;
			resposta[2]=1991;
			resposta[3]=1822;
			resposta[4]=1988;
			
			
			System.out.println("Digite seu Nome: \n\n");
			nome = ler.nextLine();//entrada de dados: lendo uma string
			
			System.out.println("\nBem vindo " + nome + "!" + " Você é fera em História???\nSe for, se prepare, pois vamos começar o grande jogo EM QUE ANO!!!\nE vamos combinar uma coisa? Na hora de responder os anos, digite apenas números, sem pontuações, blz???\nBOA SORTE!!!\n");
			
			System.out.println(pergunta[0]);
			ano = ler.nextInt();
			if (ano == resposta[0]) {
				System.out.println("Você acertou!\n");
				acertos++;
			} else {
				System.out.println("Você errou!\n");
				erros++;
			}
			
			System.out.println(pergunta[1]);
			ano = ler.nextInt();
			if (ano == resposta[1]) {
				System.out.println("Você acertou!\n");
				acertos++;
			} else {
				System.out.println("Você errou!\n");
				erros++;
			}
			
			System.out.println(pergunta[2]);
			ano = ler.nextInt();
			if (ano == resposta[2]) {
				System.out.println("Você acertou!\n");
				acertos++;
			} else {
				System.out.println("Você errou!\n");
				erros++;
			}
			
			System.out.println(pergunta[3]);
			ano = ler.nextInt();
			if (ano == resposta[3]) {
				System.out.println("Você acertou!\n");
				acertos++;
			} else {
				System.out.println("Você errou!\n");
				erros++;
			}
			
			System.out.println(pergunta[4]);
			ano = ler.nextInt();
			if (ano == resposta[4]) {
				System.out.println("Você acertou!\n");
				acertos++;
			} else {
				System.out.println("Você errou!\n");
				erros++;
			}		
			
			System.out.println("Resultado: " + nome + " você teve " + acertos + " acertos e " + erros + " erros");
					
			
		}
}
