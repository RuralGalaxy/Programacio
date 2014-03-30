package contenidors;

/**
 * 
 * @author Rafel Sastre Mas
 */

public class Element<T> {
	private T info;
	private Element seguent;

	public Element(T info, Element seguent) {
		this.info = info;
		this.seguent = seguent;
	}

	public T getInfo() {
		return info;
	}

	public Element getSeguent() {
		return seguent;
	}

	public Element setSeguent() {
		return seguent;
	}
	
	@Override
	public String toString() {
		return "Element [info=" + info + "]";
	}

}