import java.util.ArrayList;
import java.util.Scanner;


public class Questao8Funcionarios {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scannerb = new Scanner(System.in);
		
		
		ArrayList<Usuario> usuarios = new ArrayList();
		ArrayList<Usuario> bonus = new ArrayList();
		
		System.out.println("Quantos Funcion�rios ser�o cadastrados?");
		int dados = scannerb.nextInt();
		
		System.out.println("Cadasrtro de Funcion�rio");
			for (int i = 0; i < dados; i++) {
				
				System.out.println("Digite o nome do funcion�rio: ");
				String nome = scanner.nextLine();
				System.out.println("Digite o sal�rio");
				float salario = scannerb.nextFloat();
				Usuario u = new Usuario();
				u.atribuirNome(nome);
				u.atribuirSalario(salario);
							
				usuarios.add(u);
			}
				
			for (int i = 0; i < usuarios.size(); i++) {
				
				
				Usuario uTemp = usuarios.get(i);
				System.out.println("\nFuncion�rio: " + usuarios.get(i).pegarNome());
				System.out.printf("Sal�rio: " + usuarios.get(i).pegarSalario() + "\n");
				if (usuarios.get(i).pegarSalario() <= 1000) {
					System.out.printf("B�nus: %.2f" , (usuarios.get(i).pegarSalario()/5));
					System.out.printf("\nSal�rio Final: %.2f" , (((usuarios.get(i).pegarSalario()/5)+(usuarios.get(i).pegarSalario()))));
				} else if ((usuarios.get(i).pegarSalario() > 1000 && (usuarios.get(i).pegarSalario() <= 2000))) {
					System.out.printf("B�nus: %.2f" , (usuarios.get(i).pegarSalario()/10));
					System.out.printf("\nSal�rio Final: %.2f" , (((usuarios.get(i).pegarSalario()/10)+(usuarios.get(i).pegarSalario()))));	
				} else if ((usuarios.get(i).pegarSalario() > 2000)) {
					System.out.printf("Desconto: %.2f" , (usuarios.get(i).pegarSalario()/10));
					System.out.printf("\nSal�rio Final: %.2f" , ((usuarios.get(i).pegarSalario())-((usuarios.get(i).pegarSalario()/10))));
			}
		}
	}
}
