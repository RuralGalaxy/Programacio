package proves;

import contenidors.ElementSencer;
import contenidors.PilaSencers;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import utilitats.Algorismes;
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

    private void provaPilaSencers() {

        PilaSencers pila = new PilaSencers();
        System.out.println("EMPTY? " + pila.empty());
        for (int contador = 0; contador < 10; contador++) {
            pila.push(contador);
        }
        System.out.println("EMPTY? " + pila.empty());
        System.out.println("PEEK " + pila.peek());
        pila.pop();
        System.out.println("EMPTY? " + pila.peek());
        System.out.println("Prova POLL" + pila.poll());
        System.out.println("PEEK " + pila.peek());

    }

    private void provaCoaArrayDeque() {
        ArrayDeque<String> array = new ArrayDeque<>();
        System.out.println("EMPTY? " + array.isEmpty());
        for (int comptador = 0; comptador < 10; comptador++) {
            array.add(comptador + "");
        }

        System.out.println("EMPTY? " + array.isEmpty());
        System.out.println("Total? " + array.size());
        System.out.println(array.remove());
        System.out.println("Total? " + array.size());
        System.out.println(array.element());
        array.clear();
        System.out.println("Total? " + array.size());

    }

    private void provaHashSet() {
        HashSet<Preferencia> hash = new HashSet<>();
        Preferencia paella = new Preferencia(0, "Paella");
        System.out.println(hash.add(paella));
        Preferencia garrova = new Preferencia(0, "Garrova");
        System.out.println(hash.add(garrova));
        System.out.println("Ha inserit dues vegades");
        Preferencia panada = new Preferencia(1, "Panada");
        System.out.println(hash.add(panada));
        System.out.println("Hi ha sa garrova? " + hash.contains(garrova));
        for (Preferencia a : hash) {
            System.out.println(a.getPlat());
        }
        System.out.println("Hash size: " + hash.size());
        System.out.println(hash.remove(paella));
        for (Preferencia b : hash) {
            System.out.println(b.getPlat());
        }
        System.out.println("EMPTY? " + hash.isEmpty());
    }

    private void provaHashSet2() {
        HashSet<Preferencia2> hash = new HashSet<>();
        Preferencia2 paella = new Preferencia2(0, "Paella");
        System.out.println(hash.add(paella));
        Preferencia2 garrova = new Preferencia2(0, "Garrova");
        System.out.println(hash.add(garrova));
        System.out.println("Comprova els valors i no l'insereix dues vegades");
        Preferencia2 panada = new Preferencia2(1, "panada");
        System.out.println(hash.add(panada));
        System.out.println("Hi ha sa garrova? " + hash.contains(garrova));
        for (Preferencia2 a : hash) {
            System.out.println(a.getPlat());
        }
        System.out.println("Hash size: " + hash.size());
        System.out.println(hash.remove(paella));
        for (Preferencia2 b : hash) {
            System.out.println(b.getPlat());
        }
        System.out.println("EMPTY? " + hash.isEmpty());
    }
    
    	private void provesHashMap() {
		HashMap<String, Preferencia> mapa = new HashMap<>();
		for (int index = 0; index < 3; index++) {
			Preferencia a = new Preferencia(index, index + " Paella");
			mapa.put(a.getPlat(), a);
		}
		Preferencia prova = new Preferencia(10, "Xeremia");
		System.out.println(mapa.put(prova.getPlat(), prova));
		System.out.println("Hi ha sa xeremia ? " + mapa.containsKey("Xeremia"));
		System.out.println("És al mapa? " + mapa.containsValue(prova));
		System.out.println(mapa.get(prova.getPlat()).toString());
		System.out.println("Tots els valors del mapa");
		for (Preferencia b : mapa.values()) {
			System.out.println(b.toString());
		}
		System.out.println(mapa.size());
		System.out.println(mapa.remove(prova.getPlat()));
		System.out.println("EMPTY?" + mapa.isEmpty());
	}
        
        	private void provaOrdenacio(Algorismes condicio) {
		
		int tamany = 99;
		int[] array = new int[tamany];
		for (int i = 0; i < array.length; i++) {
			array[i] = (1 + (int) (Math.random() * (100 - 1 + 1)));
		}
		int[] array2 = new int[tamany];
		array2 = array.clone();
		System.out.println("Array sense ordenar: ");
		// mostraArray(array);

		System.out.println();
		System.out.println();
		if (condicio == Algorismes.QUICK_SORT) {
			OrdenacioICerca.quickSort(array, 0, array.length - 1);
			System.out.println("Array ordenat (QuickSort) : ");
			mostraArray(array);
			} else if (condicio == Algorismes.BOMBOLLA) {

			System.out.println("Array ordenat (Bubble) : ");
			OrdenacioICerca.Bombolla(array2);
			mostraArray(array2);			
		} else {
			System.out.println("Error!");
		}

		System.out.println("Error!");

	}

    public static void main(String[] args, int Algorismes) {
        Proves obj = new Proves();
        obj.provaOrdenacio(Algorismes);
        obj.provaCercaBinaria();
        obj.provaPilaSencers();
    }

}
