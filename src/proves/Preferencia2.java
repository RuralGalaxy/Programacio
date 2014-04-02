package proves;

/**
 *
 * @author Rafel Sastre Mas
 */
public class Preferencia2 implements Comparable<Preferencia2> {

    private int ordre;
    private String plat;

    public Preferencia2(int ordre, String plat) {
        super();
        this.ordre = ordre;
        this.plat = plat;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    @Override
    public int compareTo(Preferencia2 b) {
        if (this.ordre < b.ordre) {
            return 1;
        } else if (this.ordre == b.ordre) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public int hashCode() {
        final int primer = 31;
        int resultat = 1;
        resultat = primer * resultat + ordre;
        resultat = primer * resultat + ((plat == null) ? 0 : plat.hashCode());
        return resultat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Preferencia2 other = (Preferencia2) obj;
        if (ordre != other.ordre) {
            return false;
        }
        if (plat == null) {
            if (other.plat != null) {
                return false;
            }
        } else if (!plat.equals(other.plat)) {
            return false;
        }
        return true;
    }
}
