package application;

/*System.out � um fluxo de bytes, a sa�da no console baseada em bytes ainda � ampla-
mente usada. A  sa�da  no  console  �  obtida  mais  facilmente  com  os  m�todos  print(  )  e 
println( ), que voc� j� conhece. Esses m�todos s�o definidos pela classe PrintStream
(que � o tipo do objeto referenciado por System.out). Mesmo com System.out sen-
do um fluxo de bytes, � aceit�vel usar esse fluxo para sa�das simples no console.
J� que PrintStream � um fluxo de sa�da derivado de OutputStream, ele tam-
b�m implementa o m�todo de baixo n�vel write( ). Portanto, � poss�vel gravar no 
console usando write( )*/

public final class WriteDemo {

	public static void main(String[] args) {
		
		int b = 'X'; //casting
		
		//exibir um byte na tela
		System.out.write(b);
		System.out.write('\n');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
