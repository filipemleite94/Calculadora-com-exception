import java.util.Scanner; //biblioteca para receber a linha digitada.

public class calculadora {

	public static void main(String[] args) {
		//inicializa��o de vari�veis.
		Scanner entrada = new Scanner(System.in);
		char c='0';
		int a, counter;
		String s;
		Valor valores=new Valor();
		
		//Intera��o com o usu�rio.
		System.out.printf("Vamos iniciar a calculadora, digite o calculo que deseja executar: \n");
		
		//Iniciado la�o que recebe os digitos do usu�rio e chama a fun��o correspondente da classe Valor.
		//O contador � usado pra navegar na string.
		for(counter=0;;counter=0){
			s=entrada.nextLine();
			while(counter<s.length()){				
				c=s.charAt(counter);
				counter++;
				
				//verifica o char:
				try {
					valores.checarerro(c);
				}catch(digitoinvalido e){
					System.out.print(e.erro());
					break;
				};
				
				
				//Identifica se � opera��o ou n�mero e chama a fun��o correspondente:
				if((c<'0')||(c>'9')){
					if(c=='c'||c=='C'){
						valores.clear();
					}
					else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='='){
						valores.operacoes(c);
					}
				}
				else {
					a=(((int)c)-((int)'0'));
					valores.read(a);
				}
			}
		}

	}
}


