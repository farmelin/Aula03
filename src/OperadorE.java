import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		/*Fa�a um programa que verifique se o usu�rio digitado � igual a 'administrador' e se a senha digitada � igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.next();	
		//Aqui � preciso criar um if que verifique as duas condi��es para o login ser bem sucedido
		//O operador l�gico E � representado pelo s�mbolo && (duplo & comercial)
		//Para compara��o de vari�vel string, foram utilizados os comandos ".equals" e ".equalsIgnoreCase" para ignorar letras mai�sculas e min�sculas
		//importante resaltar que como boas pr�ticas de seguran�a nunca se informa ser o erro de login est� no usu�rio ou senha.
		
		if (usuario.equalsIgnoreCase("administrador") && senha.equals("123")) {
			System.out.println("Usu�rio logado");
		} else {
			System.out.println("Usu�rio ou senha incorretos");
		}
		
		leitor.close();

	}

}
