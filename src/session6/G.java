package session6;

public class G {

	public static void G1() {
		System.out.println("static G1 Method");
	}
	public void G2() {
		System.out.println("Non static G2 Method");
	}
	public G() {
		System.out.println("This is a constructor from class F");
	}
	public G(int a) {
		this();
		System.out.println(a + 80);
	}
	public G(String a) {
		System.out.println(a + "hi");
	}
	public G (int a, String b) {
		this(7);
		System.out.println(a +"" + b);
	}
}
