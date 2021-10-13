import java.util.List;

public class Groupe {

    private Formation f;
    private List<Etudiant> l;

    public Groupe(Formation f1 , List<Etudiant> l1){
        this.f=f1;
        this.l=l1;
    }

    public Formation getF() {
        return f;
    }

    public List<Etudiant> getL() {
        return l;
    }


}
