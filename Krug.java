package lab21;

public class Krug {

	public static double poluprecnik;
	private static double povrsina;
	private static double obim;
	public static double MOJ_PI = Math.PI;
	
	
	public static void ispisiKrug()
	{
		System.out.println("#####");
		System.out.println("Poluprečnik: " + poluprecnik);
		System.out.println("Izračunaj obim: " + obim);
		System.out.println("Izračunaj površinu: " + povrsina);
	}
	
	public Krug(double poluprecnikKruga) {
		setPoluprecnik(poluprecnikKruga);
	
	}
	
	public void setPoluprecnik(double poluprecnik)
	{
		if (poluprecnik > 0)
		{
			this.poluprecnik = poluprecnik;
			postaviObim();
			postaviPovrsinu();
		}
		else
		{
			throw new RuntimeException("Poluprecnik nije pozitivan!");
		}
	}
	
	private void postaviObim()
	{
		obim = 2 * poluprecnik * MOJ_PI;
	}
	
	private void postaviPovrsinu()
	{
		povrsina = poluprecnik * poluprecnik * MOJ_PI;
	}
	
}
