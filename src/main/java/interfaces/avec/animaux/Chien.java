package interfaces.avec.animaux;

public class Chien implements Animal {

    public void aboie() {
        System.out.println("ouaf ouaf");
    }

    /**
     * Exemple en gardant une méthode spécifique "aboie" mais en général, on renomme tout simplement aboie() en cri()
     * et c'est fini.
     */
    public void cri() {
        aboie();
    }
}
