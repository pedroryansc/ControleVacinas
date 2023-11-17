import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		LocalDate dataNasc = LocalDate.parse("2005-01-05");
		Administrador admin = new Administrador(2023004505, "Pedro Ryan", dataNasc, "093.415.709-05");
		
		System.out.print(admin);
	}
}