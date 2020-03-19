package interfaces.avec.animaux;

public class LauncherAnimaux {

    public static void main(String[] args) {
        Chien chien = new Chien();
        cri(chien);

        Chat chat = new Chat();
        cri(chat);
    }

    /**
     * Une seule méthode, le code est factorisé
     */
    public static void cri(Animal animal) {
        System.out.print("cri de l'animal: ");
        animal.cri();
    }
}
