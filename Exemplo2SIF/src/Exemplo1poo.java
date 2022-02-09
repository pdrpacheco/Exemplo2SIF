import java.util.Scanner;

public class Exemplo1poo {
	
	public static void main(String args[]) {
		
		int[] v = new int[5];	//variável local ao método main
		lerDados(v); 	//argumento --> variável que será enviado para o método
		int maior = maiorValor(v);
		int menor = menorValor(v);
		System.out.println("maior valor = " +  maior);
		System.out.println("menor valor = " +  menor);
	}
	
	//-----------------------------------------------------------------------------------------------
	
	public static int maiorValor(int[] v) {
		int aux = v[0] ;
		for (int i = 0; i < v.length; i++) {  //percorre o vetor
			if(v[i] > aux) {    		//verifica o valor se é maior que o aux
				aux = v[i];			//armazena no aux
			}
		}
		return aux;				//retorna para o main
	}
	
	//-----------------------------------------------------------------------------------------------
	
	public static int menorValor(int[] v) {
		int aux = v[0] ;
		for (int i = 0; i < v.length; i++) {  
			if(v[i] < aux) {    		
				aux = v[i];			
			}
		}
		return aux;
	}
	
	//-----------------------------------------------------------------------------------------------
	
	public static void lerDados(int[] v) {  //parâmetro (int[] v) --> recebe o valor do argumento
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < v.length; i++) {
			System.out.print("Valor: ");
			v[i] = teclado.nextInt();
		}
		teclado.close();
	}
	
	
	
}
