package proves;

public class Preferencia {

    public interface Comparable {

        public int compareTo(Object o);
    }

    private int ordenar;
    private String plat;

    public int getOrdenar() {
        return ordenar;
    }

    public void setOrdenar(int ordenar) {
        this.ordenar = ordenar;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    @Override
    public String toString() {
        return "Preferencia{" + "ordenar=" + ordenar + ", plat=" + plat + '}';
    }

}
