import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.*;

class FormationTest {

    @Test
    void getId() {
        HashMap<String,Integer> mat = new HashMap<>();
        Formation f = new Formation("123",mat);
        assertEquals("123",f.getId());
    }

    @Test
    void getMatieres() {
        HashMap<String,Integer> mat = new HashMap<>();
        Formation f = new Formation("123",mat);
        mat.put("Math",20);
        mat.put("Litterature",15);
        assertEquals("LitteratureMath",f.getMatieres());
    }

    @Test
    void testToString() {
        HashMap<String,Integer> mat = new HashMap<>();
        Formation f = new Formation("123",mat);
        mat.put("Math",20);
        mat.put("Litterature",15);
        assertEquals("Formation [id=123, matieres={Litterature=15, Math=20}]",f.toString());
    }

    @Test
    void ajouterMatiere() {
        HashMap<String,Integer> mat = new HashMap<>();
        Formation f = new Formation("123",mat);
        f.ajouterMatiere("Math",123);
        assertEquals(true,f.checkMatiere("Math"),"Math must been here");
        assertEquals(123,f.getCoef("Math"),"It must be 123 coef");
    }

    @Test
    void supprimerMatiere() {
        HashMap<String,Integer> mat = new HashMap<>();
        Formation f = new Formation("123",mat);
        f.ajouterMatiere("Math",123);
        f.supprimerMatiere("Math");
        assertEquals(false,f.checkMatiere("Math"),"Math has been deleted");
    }
}