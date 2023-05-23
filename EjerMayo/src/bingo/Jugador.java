package bingo;



public class Jugador {
	private Carton carton ;
	  public Jugador(String nombre) {
		 
	            carton = new Carton();
	          
	        }
	    

	    public Carton getCarton() {
	        return carton;
	    }
	    public void marcarNumero(int num) {
	  
					carton.marcarNumero(num);
				}
	    	
	    public void estaElNumero(int num) {
	    	carton.estaElNumero(num);
	    }
	public void estaVacio() {
		carton.estaVacio();
	}
		public String toString() {
			
			return "\n "+ carton +"" ;
		}

}
