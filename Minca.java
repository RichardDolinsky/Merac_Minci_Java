
public class Minca implements Merac, Comparable{
	private String nazov;
	private double hodnota;
	
	// vytvaram mincu s nazvom a hodnote
	public Minca(String nazov, double hodnota) {
		
		this.nazov = nazov;
		this.hodnota = hodnota;
	}
	// vracia nazov
	public String getNazov() {
		return nazov;
	}
// vracia hodnotu
	public double getHodnota() {
		return hodnota;
	}
/**
 * metoda porovnava mincu s inou mincou
 * 1 ak je vacsia ako druhe
 * -1 ak je mensia ako druha
 * 0 ak su rovnake
 */
	@Override
	public int compareTo(Minca other) {
		if(this.nazov.compareTo(other.nazov) > 0) {
			//System.out.println("Hodnota eurovej minci je mensia ako hodnota dvojeurovej minci");
			System.out.println("Prva minca: " + this.nazov + " je VACSIA ako druha porovnavana: " + other.nazov);
			
			return 1; 
			
		}
		else if(this.nazov.compareTo(other.nazov) <0) {
			//System.out.println("Hodnota  eurovej minci je vacsia ako hodnota dvojeurovej minci");
			System.out.println("Prva minca: " + this.nazov +" je MENSIA ako druha porovnavana: " + other.nazov);
			return -1;
		
		}
		
		 else 
	        {
	           // System.out.println("Hodnota eurovej minci je rovna hodnote dvojeurovej minci");
			 System.out.println("Prva minca "  + this.nazov + " je ROVNAKA ako druha porovnavana " + other.nazov);
	        }
		return 0;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
