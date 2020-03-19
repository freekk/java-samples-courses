package interfaces.sans.animaux;

public class LauncherAnimaux {
    public static void main(String[] args) {
        Chien chien = new Chien();
        cri(chien);

        Chat chat = new Chat();
        cri(chat);
    }

    public static void cri(Chien chien) {
        System.out.print("cri de l'animal: ");
        chien.aboie();
    }

    public static void cri(Chat chat) {
        System.out.print("cri de l'animal: ");
        chat.miaule();
    }
}
