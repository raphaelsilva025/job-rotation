package exercicios;

public class ReverterString {
	public static void main(String[] args) {
		
		String nome = "Meu nome é Raphael";
	    int len = nome.length();
	    char[] tempCharNome = new char[len];
	    char[] charNome = new char[len];
	 
	   
	    for (int i = 0; i < len; i++) {
	      tempCharNome[i] = nome.charAt(i);
	    }
	 
	    
	    for (int j = 0; j < len; j++) {
	      charNome[j] = tempCharNome[len - 1 - j];
	    }
	 
	    String reverseNome = new String(charNome);
	    System.out.println(reverseNome);
	  }
	}
	 
	


