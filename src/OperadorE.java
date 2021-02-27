import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		/*Faça um programa que verifique se o usuário digitado é igual a 'administrador' e se a senha digitada é igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.next();	
		//Aqui é preciso criar um if que verifique as duas condições para o login ser bem sucedido
		//O operador lógico E é representado pelo símbolo && (duplo & comercial)
		//Para comparação de variável string, foram utilizados os comandos ".equals" e ".equalsIgnoreCase" para ignorar letras maiúsculas e minúsculas
		//importante resaltar que como boas práticas de segurança nunca se informa ser o erro de login está no usuário ou senha.
		
		if (usuario.equalsIgnoreCase("administrador") && senha.equals("123")) {
			System.out.println("Usuário logado");
		} else {
			System.out.println("Usuário ou senha incorretos");
		}
		
		leitor.close();

	}

}
