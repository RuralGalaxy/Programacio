package utilitats;

/**
 * La ordenació de bombolla és un senzill algoritme d'ordenació. Funciona
 * revisant cada element de la llista que va ser ordenada amb el següent,
 * intercanviant-los de posició si estan amb ordre incorrecte.
 *
 * @author Rafel Sastre Mas
 *
 */
public class OrdenacioICerca {

    public static void Bombolla(int[] a) {

        for (int i = 2; i <= a.length; i++) {
            for (int j = 0; j <= a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }

    public static void Bombolla(Comparable[] a) {

        for (int i = 2; i <= a.length; i++) {
            for (int j = 0; j <= a.length - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    Comparable aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }

    public static void quickSort(int[] vector, int esquerra, int dreta) {
        int i = esquerra;
        int j = dreta;
        int vPivot = vector[(i + j) / 2];
        do {
            while (vector[i] < vPivot) {
                i++;
            }
            while (vector[j] > vPivot) {
                j--;
            }
            if (i <= j) {
                int aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
                i++;
                j--;
            }
        } while (i < j);
        if (esquerra < j) {
            quickSort(vector, esquerra, j);
        }
        if (i < dreta) {
            quickSort(vector, i, dreta);
        }
    }

    public static int cercaBinaria(int[] a, int cercat) {
        int inici = 0;
        int fi = a.length - 1;
        int mig = -1;

        while (inici <= fi) {
            mig = (inici + fi) / 2;
            if (cercat == a[mig]) {
                return mig;
            } else if (a[mig] > cercat) {
                fi = mig - 1;
            } else {
                inici = mig + 1;
            }
        }
        return -1;
    }

    public static int cercaBinaria2(int[] a, int cercat) {
        int inici = 0;
        int fi = a.length - 1;
        int mig = -1;
        int comptador = 0;

        while (inici <= fi) {
            mig = (inici + fi) / 2;
            comptador++;
            if (cercat == a[mig]) {
                System.out.println(comptador + " Càlculs realitzats");
                return mig;
            } else if (a[mig] > cercat) {
                fi = mig - 1;
            } else {
                inici = mig + 1;
            }
        }
        System.out.println(comptador + " Càlculs realitzats");
        return -1;
    }

}
