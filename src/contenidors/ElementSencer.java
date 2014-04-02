package contenidors;

/**
 *  
 * @author Rafel Sastre Mas
 */

public class ElementSencer {

	public int info;
	private ElementSencer seguent;

	public ElementSencer(int info, ElementSencer seguent) {
		this.info = info;
		this.seguent = seguent;
	}

	public int getInfo() {
		return info;
	}
	
	public ElementSencer getSeguent() {
		return seguent;
	}
	
	public void setSeguent(ElementSencer seguent) {
		this.seguent = seguent;
	}

	@Override
	public String toString() {
		return "ElementSencer [info=" + info + "]";
	}

}
