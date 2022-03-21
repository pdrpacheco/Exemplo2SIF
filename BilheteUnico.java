import java.util.Random;

public class BilheteUnico {
	
	int numero;
	double saldo;
	static double valorDaPassagem = 4.40;
	Usuario usuario;
	
	
	public BilheteUnico(String nome, String cpf, String tipo) {
		Random gerador = new Random();
		this.numero = gerador.nextInt(10000);
		this.saldo = 0;
		this.usuario = new Usuario(nome, cpf, tipo);
	}
	
	public double consultarSaldo() {
		return this.saldo;
	}
	
	//metodo para debitar um valor do bilhete
	public void passarNaCatraca() {
		if(saldo >= valorDaPassagem) {
			if (usuario.tipo.equalsIgnoreCase("estudante") || usuario.tipo.equalsIgnoreCase("professor"))
				saldo -= valorDaPassagem / 2;
		}else {
			saldo -= valorDaPassagem;
		}
	}
	
	
	//Método para carregar o bilhete
	public void carregar(double valor) {
		this.saldo += valor; 
	}

}
