public class Zombie extends Musuh {
    public Zombie() {
        super("Zombie Merangkak", 150);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " merangkak dan menggigit mangsa! Player -20 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println("Zombie: Urrrggghhh...");
    }
}