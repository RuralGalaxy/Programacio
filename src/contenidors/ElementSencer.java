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

    public ElementSencer(int primer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public int getInfo() {
		return info;
	}
	
	public ElementSencer getSeguent() {
		return seguent;
	}
	
	public ElementSencer setSeguent() {
		return seguent;
	}

	@Override
	public String toString() {
		return "ElementSencer [info=" + info + "]";
	}

}
