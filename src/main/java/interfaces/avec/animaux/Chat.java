package interfaces.avec.animaux;

public class Chat implements Animal {
    public void miaule() {
        System.out.println("miaou miaou");
    }

    /**
     * Exemple en gardant une méthode spécifique "miaule" mais en général, on renomme tout simplement miaule() en cri()
     * et c'est fini.
     */
    public void cri() {
        miaule();
    }
}
