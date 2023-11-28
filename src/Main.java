import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Cadastro de administrador
		
		System.out.println("Cadastro de administrador: \n");
		
		System.out.println("Número de sua Carteira Nacional de Saúde:");
		int numeroCNS = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Nome completo:");
		String nome = entrada.nextLine();
		
		String[] dataVetor = new String[3];
		boolean condicao = true;
		
		while(condicao) {
			System.out.println("Data de nascimento (Dia/Mês/Ano): ");
			String data = entrada.nextLine();
			dataVetor = data.split("/");
			int[] dataInt = {Integer.parseInt(dataVetor[0]), Integer.parseInt(dataVetor[1]), Integer.parseInt(dataVetor[2])};
			if(dataInt[0] >= 1 && dataInt[0] <= 31 && dataInt[1] >= 1 && dataInt[1] <= 12 && dataInt[2] <= (LocalDate.now().getYear())) {
				if(dataInt[1] % 2 != 0)
					condicao = false;
				else {
					if(dataInt[1] == 2)
						if(dataInt[2] % 4 == 0) {
							if(dataInt[0] <= 29)
								condicao = false;
							else
								System.out.println("Erro: Data inválida");
						} else
							if(dataInt[0] <= 28)
								condicao = false;
							else
								System.out.println("Erro: Data inválida");
					else {
						if(dataInt[0] <= 30)
							condicao = false;
						else
							System.out.println("Erro: Data inválida");
					}
				}
			} else
				System.out.println("Erro: Data inválida");
		}
		
		System.out.println("CPF: ");
		String cpf = entrada.nextLine();
		
		String senha;
		String confirma;
		
		do {
			System.out.println("Senha: ");
			senha = entrada.nextLine();
			System.out.println("Confirmar senha: ");
			confirma = entrada.nextLine();
			if(!(senha.equals(confirma)))
				System.out.println("As senhas inseridas não são iguais. Por favor, insira novamente.");
		} while(!(senha.equals(confirma)));
		
		LocalDate dataNasc = LocalDate.parse(dataVetor[2] + "-" + dataVetor[1] + "-" + dataVetor[0]);
		Administrador admin = new Administrador(numeroCNS, nome, dataNasc, cpf, senha);
		
		System.out.println("\nCadastro realizado com sucesso!\n");
		
		System.out.println(admin);
		
		// Login de administrador
		
		System.out.println("\nLogin de administrador: \n");
		
		do {
			System.out.println("Número de sua Carteira Nacional de Saúde: ");
			numeroCNS = entrada.nextInt();
			
			entrada.nextLine();
			
			System.out.println("Senha: ");
			senha = entrada.nextLine();
			if(numeroCNS != admin.getNumeroCNS() || !(senha.equals(admin.getSenha())))
				System.out.println("Erro: Número de CNS e/ou senha inválida");
		} while(numeroCNS != admin.getNumeroCNS() || !(senha.equals(admin.getSenha())));
		
		System.out.println("\nLogin realizado com sucesso!\n");
		
		entrada.close();
	}
}