import java.util.Scanner;

public class OperadorNao {

	public static void main(String[] args) {
		/*Crie um programa que permita que receba o tipo de um usu�rio em uma vari�vel String e caso esse tipo N�O SEJA "administrador", exibir a mensagem: "Aten��o, usu�rio sem poderes administrativos. Algumas tarefas ser�o bloqueadas".*/
		Scanner leitor = new Scanner(System.in);
		String tipoUsuario;
		System.out.println("Por favor, digite seu tipo de usu�rio:");
		tipoUsuario = leitor.next();
		
		//Aqui � preciso criar um if que verifique se o tipo de usu�rio digitado � DIFERENTE de "administrador"
		//A nota��o para o operador l�gico "n�o" � "!" no in�cio do teste l�gico
		
		
		if (!tipoUsuario.equals("Administrador")) {
			System.out.println("Aten��o, usu�rio sesm poderes administrativos, Algumas tarefas ser�o bloqueadas.");
		}
		
		
		leitor.close();
		

	}

}
