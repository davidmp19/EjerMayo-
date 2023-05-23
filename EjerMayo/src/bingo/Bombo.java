package bingo;

import java.util.ArrayList;

public class Bombo {
	public static final int min=0;
	public static final int max=90;
	private ArrayList<Integer> numeros;
	public Bombo() {
	numeros=new ArrayList<Integer>();
			for(int i=min;i<=max;i++) {
			numeros.add(i);
		}
	}
	  public int sacarNumero() {
		  int numero=0;
		  boolean fuera=false;
	        while(!fuera) {
	        	numero=(int) (Math.random() * 88) +1;
	        	if(numero<numeros.size()) {
	        	if(numeros.contains(numero)) {
	        		fuera=true;
	        		numeros.remove(numero);  
	        	}
	        	}
	     
	        }
	        	return numero;
	  
}
	  
	@Override
	public String toString() {
		return "Bombo numeros=" + numeros ;
	}
}
