public class Main {
    public static void main(String[] args) {
        Osoba osobaJas = new Osoba("Jaś","Kowalski",12);
        System.out.println("Imie: "+osobaJas.getImie());
        osobaJas.setImie("Jan");
        System.out.println("Imie nowe"+osobaJas.getImie());
        Osoba osobaIsia = new Osoba("Isia","Iksińska");
        Osoba osbaX = new Osoba();
        System.out.println(osobaIsia.getWiek());
        System.out.println(osbaX.getWiek());

        System.out.println(osobaIsia);
    }
}