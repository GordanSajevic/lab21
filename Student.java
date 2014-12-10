package lab21;

public class Student {

	private String ime;
	private String prezime;
	private int brIndexa;

	public Student(String postaviIme, String postaviPrezime, int postaviIndex)
	{
		ime = postaviIme;
		prezime = postaviPrezime;
		brIndexa = postaviIndex;
	}
	
	public Student()
	{
		ime = "Gordan";
		prezime = "Sajević";
		brIndexa = 1;
	}
	
	public String getIme()
	{
		return ime;
	}
	
	public String getPrezime()
	{
		return prezime;
	}
	
	public int getIndex()
	{
		return brIndexa;
	}
	
	public void setIme(String ime)
	{
		for (int i=0; i<ime.length(); i++)
		{
			int a = 0;
			a = (int)ime.charAt(i);
			if (a < 65 || a > 122)
			{
				throw new IllegalArgumentException("Niste unijeli ispravno ime");
			}
			else
			{
				this.ime = ime;
			}
		}
	}
	
	public void setPrezime(String prezime)
	{
		for (int i=0; i<prezime.length(); i++)
		{
			int a = 0;
			a = (int)prezime.charAt(i);
			if (a < 65 || a > 122)
			{
				throw new IllegalArgumentException("Niste unijeli ispravno prezime");
			}
			else
			{
				this.prezime = prezime;
			}
		}
	}
	
	public void setIndex(int brIndexa)
	{
		if (brIndexa < 0)
		{
			throw new IllegalArgumentException ("Niste unijeli ispravan index!");
		}
		else
		{
			this.brIndexa = brIndexa;
		}
	}
	
	
	public String toString()
	{
		String strStudent = "";
		strStudent = ime + " " + prezime + ", " + brIndexa;
		return strStudent;
	}
	
	public Student(Student other)
	{
		this.ime = other.ime;
		this.prezime = other.prezime;
		this.brIndexa = other.brIndexa;
	}
	
	public boolean compare (Student other)
	{
		if (this.ime.equals(other.ime) && this.prezime.equals(prezime) && this.brIndexa == other.brIndexa)
		{
			return true;
		}
		return false;
	}
}
