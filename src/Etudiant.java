import java.lang.reflect.Array;
import java.util.* ;

public class Etudiant {

    /**
     * Attributs
     */

    private Identite id ;
    private Formation formati ;
    private HashMap<String, ArrayList<Float>> notes ;

    /**
     * Constructeurs
     */

    /**
     * Constructeur ou l'identite existe deja
     * @param i identite de l'etudiant
     * @param f formation de l'etudiant
     */
    public Etudiant(Identite i, Formation f) {
        this.id = i ;
        this.formati = f ;
        this.notes = new HashMap<String, ArrayList<Float>>() ;
    }

    /**
     * Constructeur ou l'identite n existe pas
     * @param f
     */
    public Etudiant(String nip, String n, String p, Formation f) {
        this.id = new Identite(nip, n, p) ;
        this.formati = f ;
        this.notes = new HashMap<String, ArrayList<Float>>() ;
    }

    /**
     * Methodes
     */

    /**
     * Getters
     */

    /**
     * @return identite de l etudiant
     */
    public Identite getId() {
        return this.id;
    }

    /**
     * @return formation de l etudiant
     */
    public Formation getFormati() {
        return this.formati;
    }

    /**
     * @return notes de l etudiant
     */
    public HashMap<String, ArrayList<Float>> getNotes() {
        return this.notes;
    }

    /**
     * toString
     */

    /**
     * @return phrase decrivant l etudiant
     */
    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", formati=" + formati +
                ", notes=" + notes +
                '}';
    }

    public void ajouterNote(String m, Float n) throws DeviseException {
        if (n>20 || n<0) {
            throw new DeviseException() ;
        } else {
            if (! this.formati.getMatieres.containsKey(m)) {
                throw new DeviseExcep() ;
            } else {

            }
        }
    }


    /**
     * equals et hashCode
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(id, etudiant.id) && Objects.equals(formati, etudiant.formati) && Objects.equals(notes, etudiant.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formati, notes);
    }
}
