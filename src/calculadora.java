import java.util.Scanner; //biblioteca para receber a linha digitada.

public class calculadora {

	public static void main(String[] args) {
		//inicialização de variáveis.
		Scanner entrada = new Scanner(System.in);
		char c='0';
		int a, counter;
		String s;
		Valor valores=new Valor();
		
		//Interação com o usuário.
		System.out.printf("Vamos iniciar a calculadora, digite o calculo que deseja executar: \n");
		
		//Iniciado laço que recebe os digitos do usuário e chama a função correspondente da classe Valor.
		//O contador é usado pra navegar na string.
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
				
				
				//Identifica se é operação ou número e chama a função correspondente:
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


