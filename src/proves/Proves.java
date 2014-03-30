package proves;

import contenidors.ElementSencer;
import contenidors.PilaSencers;
import utilitats.OrdenacioICerca;

/**
 *
 * @author Rafel Sastre Mas
 */
public class Proves {

    public static void mostraArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

    public void provaOrdenacio(int metode) {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + (int) (Math.random() * ((100 - 1) + 1));

        }
        mostraArray(a);
        switch (metode) {
            case 1:
                OrdenacioICerca.Bombolla(a);
                break;

            case 2:
                OrdenacioICerca.quickSort(a, 0, a.length - 1);
                break;
        }
        mostraArray(a);
    }

    public void provaCercaBinaria() {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
            if (i == a.length - 1) {
                System.out.println("");
            }
        }
        OrdenacioICerca.cercaBinaria2(a, a.length - 1);
    }

    public void provaPilaSencers() {
        int primer = 2;
        int segon = 3;
        ElementSencer pila1 = null;
        ElementSencer element1 = new ElementSencer(primer, pila1);
        ElementSencer element2 = new ElementSencer(segon, pila1);
        PilaSencers pila = new PilaSencers();
        pila.empty();
        pila.push(element1.getInfo());
        pila.pop();
        pila.poll();
        
    }

    public static void main(String[] args) {
        Proves obj = new Proves();
        obj.provaOrdenacio(1);
        obj.provaCercaBinaria();
        obj.provaPilaSencers();
    }

}
