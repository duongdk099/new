import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FormationTest {

    HashMap<String,Integer> mat = new HashMap<>();
    Formation f = new Formation("123",mat);
    @Test
    public void getId() {
        assertEquals("123",f.getId());
    }

    @Test
    public void getMatieres() {
        mat.put("Math",20);
        mat.put("Litterature",15);
        HashMap<String,Integer> expected = new HashMap<>();
        expected.put("Math",20);
        expected.put("Litterature",15);
        assertEquals(expected,f.getMatieres());
    }

    @Test
    public void testToString() {
        mat.put("Math",20);
        mat.put("Litterature",15);
        assertEquals("Formation [id=123, matieres={Litterature=15, Math=20}]",f.toString());
    }

    @Test
    public void ajouterMatiere() {
        f.ajouterMatiere("Math",123);
        assertEquals("Math must been here", true, f.checkMatiere("Math"));
        assertEquals("It must be 123 coef",123,f.getCoef("Math"));
    }

    @Test
    public void supprimerMatiere() {
        f.ajouterMatiere("Math",123);
        f.supprimerMatiere("Math");
        assertEquals("Math has been deleted", false, f.checkMatiere("Math"));
    }
}