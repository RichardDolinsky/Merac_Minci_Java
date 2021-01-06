
public class MincaTester {

	public static void main(String[] args) {
		// vytvaram mince o danej hodnote
        Minca eurovka = new Minca("Eurovka", 1.0);
        Minca dvojeurovka = new Minca("Dvojeurovka", 2.0);
        Minca sto = new Minca("Stoeurovkova", 100);
        Minca desatCentovka = new Minca( "Desatcentovka", 0.10);
        Minca dvadsattCentovka = new Minca( "Dvadsatcentovka", 0.20);
        
      // testujem ich porovnanie velkosti
      eurovka.compareTo(dvojeurovka);
      eurovka.compareTo(sto);
      dvojeurovka.compareTo(sto);
      desatCentovka.compareTo(dvadsattCentovka);
      dvadsattCentovka.compareTo(desatCentovka);
      desatCentovka.compareTo(desatCentovka);
      desatCentovka.compareTo(sto);
      

	}

}
