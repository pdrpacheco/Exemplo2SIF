import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Util {
	
	//array para armazenar objetos do tipo BilheteUnico
	BilheteUnico[] bd = new BilheteUnico[5];
	
	
	//variável para controla as posições do array
	int index = 0;

	
	//método principal
	public void menuPrincipal() {
		String aux = "Escolha uma operação:\n1. Admnistrador\n2. Usuário\n3. Finalizar ";
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção Inválida");
			}else if(opcao == 1) {
				menuAdm();
			}else {
				menuUser();
			}
		} while(opcao != 3);
		
	}
	
	public void menuAdm() {
		String aux = "Escolha uma operação: \n";
		aux += "1. Cadastrar bilhete \n";
		aux += "2. Consultar bilhete \n";
		aux += "3. Sair \n";
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao > 3) {
				 showMessageDialog(null, "Opção inválida");
			}else if(opcao == 1){
				
			}
		}while(opcao != 3);
	}
	
	public void menuUser() {
		String aux = "Escolha uma operação: \n";
		aux += "1. Consultar saldo  \n";
		aux += "2. Carregar Bilhete  \n";
		aux += "3. Passar na catraca \n";
		aux += "4. Sair \n";
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao > 4){		
				showMessageDialog(null, "Opção Inválida");
			}else {
				
			}
			
		}while(opcao != 4);
		
		
	}
	
	public void cadastrarBilhete() {
		
		if(index < bd.length) {
		String nome = showInputDialog("Nome: ");
		String cpf = showInputDialog("Cpf: ");
		String tipo = showInputDialog("Tipo(estudante/prof/normal): ");
		bd[index] = new BilheteUnico(nome, cpf, tipo);
		index++;
		} else {
			showMessageDialog(null, "Procure um posto autorizado");
		}
	}
	
	
	
}
