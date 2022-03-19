package modelo;
import java.util.Scanner;

public class index {
	 public static void main (String[] a)   {   
		 try (Scanner ler = new Scanner(System.in)) {
			int opcao;
			String userName;
			 
			 UserExperimental userExperimental = new UserExperimental(220, "maria", "brasileira", 111111111, null, 40029009, "maria@gmail.com", 1110, false);
			 System.out.println("Bem-vindo(a) ao bicigama!");
			 System.out.println("----MENU----");
			 System.out.println("1 - Mostrar usuário");
			 System.out.println("2 - Mostrar estacao");
			 opcao = ler.nextInt();
			 
			 if(opcao==1) {
				 userName = userExperimental.getNome();
				 System.out.println(userName);
				 System.out.println(userExperimental.getIdUsuario());
			 }else {
				 if(opcao==2) {
					 System.out.println("Essa funcionalidade ainda não está disponível :( ");
				 }
			 }
		}
     }  
}
