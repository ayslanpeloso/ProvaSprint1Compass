import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDate {
	
	public static void main(String[] args) {
		
	SimpleDateFormat sdf = new SimpleDateFormat("H");
		
	Calendar data = Calendar.getInstance();
		
	String hora = sdf.format(data.getTime());
	
	int horaConvertida = Integer.parseInt(hora);
	
	System.out.println(horaConvertida);
	
	if (horaConvertida > 17 && horaConvertida < 24){
		System.out.println("Boa noite!");
	}
		else if (horaConvertida > 0 && horaConvertida < 6){
			System.out.println("Boa madrugada!");
		}
		else if (horaConvertida > 6 && horaConvertida < 12 ) {
			System.out.println("Bom dia!");
		}
		else if (horaConvertida > 11 && horaConvertida < 18) {
			System.out.println("Boa tarde!");
		}
	}
	
	}




