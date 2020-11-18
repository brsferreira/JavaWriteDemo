package application;

/*System.out é um fluxo de bytes, a saída no console baseada em bytes ainda é ampla-
mente usada. A  saída  no  console  é  obtida  mais  facilmente  com  os  métodos  print(  )  e 
println( ), que você já conhece. Esses métodos são definidos pela classe PrintStream
(que é o tipo do objeto referenciado por System.out). Mesmo com System.out sen-
do um fluxo de bytes, é aceitável usar esse fluxo para saídas simples no console.
Já que PrintStream é um fluxo de saída derivado de OutputStream, ele tam-
bém implementa o método de baixo nível write( ). Portanto, é possível gravar no 
console usando write( )*/

public final class WriteDemo {

	public static void main(String[] args) {
		
		int b = 'X'; //casting
		
		//exibir um byte na tela
		System.out.write(b);
		System.out.write('\n');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
