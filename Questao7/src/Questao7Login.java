import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;// importando a classe Scanner

public class Questao7Login {


	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("H");
		
		Calendar data = Calendar.getInstance();
			
		String hora = sdf.format(data.getTime());
		
		int horaConvertida = Integer.parseInt(hora);
		
		Scanner input = new Scanner(System.in);//instanciando e criando um objeto Scanner
		
		String login;
		String password;
		
		SimpleDate horaAtual = new SimpleDate();
		
		String[] usuario = new String[5];
		
		usuario[0]="ayrtonsenna";
		usuario[1]="neymarjunior";
		usuario[2]="acelinofreitas";

		
		String[] senha = new String[5];
		
		senha[0]="mclarenmp44";
		senha[1]="santosfc";
		senha[2]="popobox";

		
		System.out.println("Insira seu login que está cadastrado no sistema: \n");
		login = input.nextLine();
		
		System.out.println("Insira sua senha que está cadastrada no sistema: \n");
		password = input.nextLine();
		
		if (login.equals(usuario[0]) && password.equals(senha[0]) && horaConvertida >= 18 && horaConvertida < 24) {
			System.out.println("Boa noite, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[0]) && password.equals(senha[0]) && horaConvertida >= 0 && horaConvertida < 6) {
			System.out.println("Boa madrugada, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[0]) && password.equals(senha[0]) && horaConvertida >= 6 && horaConvertida < 12) {
			System.out.println("Bom dia, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[0]) && password.equals(senha[0]) && horaConvertida >= 12 && horaConvertida < 18) {
			System.out.println("Boa tarde, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[1]) && password.equals(senha[1]) && horaConvertida >= 18 && horaConvertida < 24) {
			System.out.println("Boa noite, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[1]) && password.equals(senha[1]) && horaConvertida >= 0 && horaConvertida < 6) {
			System.out.println("Boa madrugada, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[1]) && password.equals(senha[1]) && horaConvertida >= 6 && horaConvertida < 12) {
			System.out.println("Bom dia, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[1]) && password.equals(senha[1]) && horaConvertida >= 12 && horaConvertida < 18) {
			System.out.println("Boa tarde, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[2]) && password.equals(senha[2]) && horaConvertida >= 18 && horaConvertida < 24) {
			System.out.println("Boa noite, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[2]) && password.equals(senha[2]) && horaConvertida >= 0 && horaConvertida < 6) {
			System.out.println("Boa madrugada, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[2]) && password.equals(senha[2]) && horaConvertida >= 6 && horaConvertida < 12) {
			System.out.println("Bom dia, você se logou ao nosso sistema. \n");
		} else if (login.equals(usuario[2]) && password.equals(senha[2]) && horaConvertida >= 12 && horaConvertida < 18) {
			System.out.println("Boa tarde, você se logou ao nosso sistema. \n");
		} else {System.out.println("Usuário ou senha incorretos");
	}
}
}
