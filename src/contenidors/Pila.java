package contenidors;

/**
 *
 * @author Rafel Sastre Mas
 */
public class Pila<T> {

    private Element<T> inici;

    public Pila() {
        super();
        this.inici = null;
    }

    public boolean empty() {
        return inici == null;
    }

    public T peek() {
        return inici.getInfo();
    }

    public void pop() {
        this.inici = inici.getSeguent();
    }

    public void push(T valor) {
        Element<T> element = new Element<>(null, valor);
        if (inici == null) {
            this.inici = element;
        } else {
            element.setSeguent(this.inici);
            this.inici = element;

        }

    }

    public T poll() {
        Element<T> torna = inici;
        this.inici = inici.getSeguent();
        return torna.getInfo();
    }
}
