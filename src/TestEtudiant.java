import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.Assert.*;

class TestEtudiant {

    /**
     * Creation d une identite
     */
    String n ="nip" ;
    String nom = "DuPont" ;
    String prenom = "Jean" ;
    Identite i = new Identite(n,nom,prenom) ;

    /**
     * Creation d une formation
     */
    String id = "info" ;
    HashMap<String,Integer> mat = new HashMap<String,Integer>() ;
    Formation f = new Formation(id,mat) ;

    /**
     * creation d un etudiant
     */
    Etudiant e = new Etudiant(i,f) ;

    /**
     * ajout de matieres a la formation
     */
    f.ajouterMatiere("programmation",4) ;
    f.ajouterMatiere("reseaux",2) ;

    /**
     * Tests
     */

    /**
     * Tests ajouterNote
     */

    // test normal
    @Test
    public void ajouterNoteNormal() {
        e.ajouterNote("programmation",15.0f) ;
        assertTrue("15 doit etre dans la liste des notes de la matiere programmation",e.getNotes().get("programmation").contains(15.0f)) ;
    }

    // note trop elevee
    @Test
    public void ajouterNoteSup() {
        e.ajouterNote("programmation",25.0f) ;
        assertFalse("25 ne doit pas etre dans la liste des notes car la note est au dessus de 20",e.getNotes().get("programmation").contains(25.0f)) ;
    }

    // note trop basse
    @Test
    public void ajouterNoteInf() {
        Float n = -5.0f ;
        e.ajouterNote("programmation",n) ;
        assertFalse("-5 ne doit pas etre dans la liste des notes car la note est en dessous de 0",e.getNotes().get("programmation").contains(-5.0f)) ;
    }

    @Test
    public void calculerMoyenneMat() {

    }

    @Test
    public void calculerMoyenneGe() {

    }
}