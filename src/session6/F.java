package session6;

public class F {

	public static void main(String[] args) {
		G g = new G(8, "Ruby");
		
	}

	public static void F1() {
		System.out.println("static F1 Method");
	}
	public void A2() {
		System.out.println("Non static F2 Method");
	}
}Public, Protected, default and private

Public, declarations are visible everywhere

Protected, declarations are visible within the package or all subclass

Default declarations,are visible only within the package (package private)

Private, declaretions are visible within the class only
