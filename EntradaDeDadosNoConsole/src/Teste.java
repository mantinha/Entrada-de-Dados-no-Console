/**
 * Teste da classe MeuConsole e seus métodos 
 * @author adriano
 *
 */
public class Teste {

	private static MeuConsole console;
	
	public static void main(String[] args) {
		
		console = new MeuConsole();
		console.leitura();
		console.print();
		System.out.println(console.getData());
	}

}
