import java.util.*;
public class Formation {

    private String id;
    private HashMap<String, Integer> matieres;

    public Formation (String id, HashMap<String,Integer> mat) {
        this.id = id;
        this.matieres = mat;
    }

    public String getId() {
        return id;
    }

    public HashMap<String,Integer> getMatieres() {
        return this.matieres;
    }

    @Override
    public String toString() {
        return "Formation [id=" + id + ", matieres=" + matieres + "]";
    }

    public void ajouterMatiere(String nomMatiere, int point) {
        if (this.matieres.containsKey(nomMatiere)) {
            System.out.println("Already had this one");
        }
        else {
            this.matieres.put(nomMatiere, point);
        }
    }

    public void supprimerMatiere(String nomMatiere) {
        if (!this.matieres.containsKey(nomMatiere)) {
            System.out.println("Not found");
        }
        else {
            this.matieres.remove(nomMatiere);
        }
    }

    public int getCoef(String nomMatiere){
        if(!this.matieres.containsKey(nomMatiere)){
            System.out.println("Not found Matiere");
            return -1;
        }
        else{
            return this.matieres.get(nomMatiere);
        }
    }

    public boolean checkMatiere(String nomMatiere){
        if(!this.matieres.containsKey(nomMatiere)){
            System.out.println("Not found Matiere");
            return false;
        }
        else { return  true;}
    }

}
