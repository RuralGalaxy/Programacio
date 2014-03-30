package contenidors;

/**
 * 
 * @author Rafel Sastre Mas
 */

public class Pila<T> {

	Element <T> pila;

	// Torna true si la pila �s buida i false en cas contrari.
	public boolean empty() {
		return pila == null;
	}

	// Posa l'element x a la pila.
	public void push(T element) {
		Element<T> seguent = new Element<T>(element,pila);
	}

	// Torna l'element de la part superior de la pila, per� no l'esborra.
	public T peek() {
		return pila.getInfo();
	}

	// Esborra l'element de la part superior de la pila, per� no el torna.
	public void pop() {
		pila = pila.getSeguent();
	}

	// Torna i esborra l'element de la part superior de la pila.
	public T poll() {
		pila=pila.getSeguent();
		return pila.getInfo();
	}
	
	public Pila(){
		super();
		this.pila=null;
	}

}
