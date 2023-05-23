package bingo;

import java.util.ArrayList;

public class Carton {
	private ArrayList<Integer> numeros;

	public Carton() {
		numeros = new ArrayList<Integer>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 2; j++) {
				int num;
				do {
					num = (i * 10) + (int) (Math.random() * 9);
				} while (numeros.contains(num));

				numeros.add(num);
			}
			numeros.sort(null);
		}
	}

	public void marcarNumero(int num) {
		
			if (numeros.contains(num)) {
				int numero=numeros.indexOf(num);
				numeros.remove(numero);
				
				}
			}
			
		
	

	@Override
	public String toString() {
		return "Cartón=" + numeros ;
	}

	public boolean estaElNumero(int num) {
		boolean devolver=false;
		if (numeros.contains(num)) {
			devolver=true;
		}
		return devolver;
	}

	public boolean estaVacio() {
	boolean devolver=false;
	if(numeros.isEmpty()) {
		devolver=true;
	}
		
		
		
		return devolver;
	}

}
