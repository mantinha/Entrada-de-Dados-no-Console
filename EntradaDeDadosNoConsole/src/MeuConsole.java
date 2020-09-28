import java.util.Scanner;

/**
 * A classe MeuConsole simplifica o uso do Scanner utilizando uma String
 * @author adriano
 *
 */
public class MeuConsole {

	private Scanner scan;
	private String data;
	
	public MeuConsole() {
		scan = new Scanner(System.in);
	}
	
	/**
	 * Atribui os dados digitados ao data
	 */
	public void leitura() {
		data = scan.nextLine();
	}
	
	/**
	 * Recupera os dados, se não houver dados exibe uma mensagem
	 * @return conteúdo de data ou null
	 */
	public String getData(){
		try {
			if(data.isEmpty())
				System.out.println("SEM DADOS | NO DATA");
		}catch(NullPointerException exc) {
			System.err.println(exc.getMessage());
			exc.printStackTrace();
		}		
		return data;
	}
	
	/**
	 * Exibe na tela os dados recuperados
	 */
	public void print() {
		System.out.println(getData());
	}
}
