/** HelloClient.java **/
import java.rmi.registry.*;
public class ClienteRMI {
	public static void main(String[] args) {
		String host = "5798"; //(args.length < 1) ? null : args[0];
		
		try {
			// Obtém uma referência para o registro do RMI
			Registry registry = LocateRegistry.getRegistry(4765);
			// Obtém a stub do servidor
			InterfaceContador stub= (InterfaceContador) registry.lookup("getValor");
			// Chama o método do servidor e imprime a mensagem
			int contador = stub.getValor();
			int novoValor = stub.novoValor();
			System.out.println("Mensagem do Servidor: " + contador);
			System.out.println("Mensagem do Servidor: " + novoValor);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}