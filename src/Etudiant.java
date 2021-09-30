import java.lang.reflect.Array;
import java.util.* ;
package exceptions;
public class Etudiant {

    /**
     * Attributs
     */

    private Identite id ;
    private Formation formati ;
    private HashMap<String, ArrayList<Float>> notes ;

    /**
     * Constructeur
     */

    /**
     * Constructeur ou l'identite existe deja
     *
     * @param i identite de l'etudiant
     * @param f formation de l'etudiant
     */
    public Etudiant(Identite i, Formation f) {
        this.id = i ;
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
     * methode getID
     *
     * @return identite de l etudiant
     */
    public Identite getId() {
        return this.id;
    }

    /**
     * methode getFormati
     *
     * @return formation de l etudiant
     */
    public Formation getFormati() {
        return this.formati;
    }

    /**
     * methode getNotes
     *
     * @return notes de l etudiant
     */
    public HashMap<String, ArrayList<Float>> getNotes() {
        return this.notes;
    }

    /**
     * toString
     */

    /**
     * methode toString
     *
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

    /**
     * methode ajouterNote permet d ajouter une note a un etudiant dans une matiere donnee
     *
     * @param m nom de la matiere
     * @param n note a ajouter
     * @throws DeviseException leve l exception si la note n est pas entre 0 et 20
     * @throws DeviseExcep leve l exception si la matiere n est pas dans la formation
     */
    public void ajouterNote(String m, Float n) throws DeviseException, DeviseExcep {
        if (n>20 || n<0) {
            throw new DeviseException() ;
        } else {
            if (! this.formati.getMatieres().containsKey(m)) {
                throw new DeviseExcep() ;
            } else {
                this.notes.get(m).add(n) ;
            }
        }
    }

    /**
     * methode calculerMoyenneMat
     *
     * @param m nom matiere
     * @return moyenne de la matiere
     * @throws DeviseExcep leve une exception si la matiere ne fait pas parti de la formation
     */
    public Float calculerMoyenneMat(String m) throws DeviseExcep{
        Float res = 0.0f;
        Float resultat ;
        if (! this.formati.getMatieres().containsKey(m)) {
            throw new DeviseExcep() ;
        } else {
            int total = this.notes.get(m).size();
            for (int i=0 ; i<total ; i++) {
                res += this.notes.get(m).get(i) ;
            }
            resultat = res/total ;
        }
        return resultat ;
    }

    /**
     * methode calculerMoyenneGe
     *
     * @return moyenne de l etudiant
     */
    public Float calculerMoyenneGe() {
        Float res = 0.0f ;
        int total =0 ;
        Float moyenne ;
        Set<String> mati = new HashSet<String>() ;
        mati = this.formati.getMatieres().keySet() ;
        Iterator<String> i = mati.iterator() ;
        while (i.hasNext()) {
            String s = i.next() ;
            Float no = calculerMoyenneMat(s) ;
            res += no * this.formati.getCoef(s) ;
            total += this.formati.getCoef(s);
        }
        moyenne = res/total ;
        return moyenne ;
    }

    /**
     * equals et hashCode
     */

    /**
     * methode equals
     *
     * @param o est ce que c est egal a l objet o
     * @return vrai si c est egal sinon faux
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(id, etudiant.id) && Objects.equals(formati, etudiant.formati) && Objects.equals(notes, etudiant.notes);
    }

    /**
     * metjode hashCode
     *
     * @return entier
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, formati, notes);
    }
}
