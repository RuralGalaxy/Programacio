package contenidors;

/**
 *
 * @author Rafel Sastre Mas
 */
public class Element<T> {

    private Element<T> seguent;
    private T info;

    public Element(Element<T> seguent,
            T info) {
        super();
        this.seguent = seguent;
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setSeguent(Element<T> seguent) {
        this.seguent = seguent;
    }

    public Element<T> getSeguent() {
        return seguent;
    }

    @Override
    public String toString() {
        return "ElementSencer [info=" + info + "]";
    }

}
