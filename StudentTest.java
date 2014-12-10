package lab21;


public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Mujo", "Mujic", 231);
		Student s2 = new Student("Suljo", "Suljic", 242);
		System.out.println("Prvi student: \n" + s1.toString());
		System.out.println("Drugi student: \n" + s2.toString());
		System.out.println("Da li su studenti isti?");
		System.out.println(s1.compare(s2));
		System.out.println("Ime prvog studenta: " + s1.getIme());
		System.out.println("Prezime prvog studenta: " + s1.getPrezime());
		System.out.println("Idex prvog studenta: " + s1.getIndex());
		s1.setIme("Haso");
		s1.setPrezime("Hasic");
		s1.setIndex(253);
		System.out.println("Sada je prvi student: \n" + s1.toString());
	}

}
