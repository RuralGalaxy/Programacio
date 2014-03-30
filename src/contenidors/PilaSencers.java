package contenidors;

/**
 * 
 * @author Rafel Sastre Mas
 */

public class PilaSencers {

	ElementSencer pila = null;

	// Torna true si la pila �s buida i false en cas contrari.
	public boolean empty() {
		return pila == null;
	}

	// Posa l'element x a la pila.
	public int push() {
		pila = pila.getSeguent();
		return pila.getInfo();
	}

	// Torna l'element de la part superior de la pila, per� no l'esborra.
	public int peek() {
		return pila.getInfo();
	}

	// Esborra l'element de la part superior de la pila, per� no el torna.
	public void pop() {
		pila = pila.getSeguent();
	}

	// Torna i esborra l'element de la part superior de la pila.
	public int poll() {
		pila=pila.getSeguent();
		return pila.getInfo();
	}
	
	public PilaSencers(){
		super();
		this.pila=null;
	}

    public void push(int info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
