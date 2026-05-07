public class Naga extends Musuh {
   public Naga() {
        super("Ireng Boy", 50);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + " terbang dan menyemburkan cairan tinta hitam! Player -50 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println("Naga: ROOAARR!");
    }
}