//Função do erro:
public class digitoinvalido extends Exception {
	char c;
	public digitoinvalido(char c){
		this.c=c;
		}
	public String erro(){
		if(c=='.'||c==',')
			return ("Erro: Lembre-se o programa nao reconhece '"+c+"' recomenda-se multiplicar a operacao por 10^n e dividir no final por 10^n\nReinsira a operacao a partir do operador anterior ao erro:");
		else 
			return ("Erro:O digito '"+c+"'nao eh valido \nReinsira a operacao a partir do operador anterior ao erro:");
	}
}
