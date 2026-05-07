public class Slime extends Musuh {
    public Slime() {
        super("Asam Jawa", 15);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " melompat dan menyiramkan cairan asam! Player -15 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println("Slime: blurp blurp!");
    }
}