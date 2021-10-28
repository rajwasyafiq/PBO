package id.ac.upj;

interface MahlukHidup {
    public void bernafas();
    public void bernama(String nama);

}
interface Mamalia {
    public void habitat();
}
class Paus implements Mamalia, MahlukHidup {
    public void bernafas() {
        System.out.println("Bernafas dengan paru-paru");
    }
    public void bernama(String nama) {
        System.out.println("Bernama: " + nama);
    }
    public void habitat() {
        System.out.println("Habitat di laut");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Paus paus = new Paus();
        paus.bernama("Paus");
        paus.bernafas();
        paus.habitat();
    }
}