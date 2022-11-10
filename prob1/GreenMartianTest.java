package prob1;

public class GreenMartianTest {

	public static void main(String[] args) {
		testTeleportAndSpeakAndToString();
		testEquals_Success();
		testEquals_Fail();
		testEquals_RedAndGreen_Success();
		testCompareTo_RedAndGreen_Posotive();

	}
	
	public static void testTeleportAndSpeakAndToString() {
		System.out.println("testTeleportAndSpeakAndToString<--------");
		GreenMartian a = new GreenMartian(1, 6);
		System.out.println("expected= Green Martian 1 is teleporting to Your Mama's House");
		System.out.print("actual  = ");
		System.out.println(a.teleport("Your Mama's House"));
		System.out.println("expected= Green Martian 1: *angry noises*");
		System.out.print("actual  = ");
		System.out.println(a.speak());
		System.out.println("expected= Green Martian - id=1, vol=6");
		System.out.print("actual  = ");
		System.out.println(a);
	}
	
	public static void testEquals_Success() {
		System.out.println("testEquals_Success<--------");
		GreenMartian a = new GreenMartian(1, 6);
		GreenMartian b = new GreenMartian(1, 24);
		System.out.println("expected= true");
		System.out.print("actual  = ");
		System.out.println(a.equals(b));
	}
	
	public static void testEquals_Fail() {
		System.out.println("testEquals_Fail<--------");
		GreenMartian a = new GreenMartian(1, 6);
		GreenMartian b = new GreenMartian(2, 24);
		System.out.println("expected= false");
		System.out.print("actual  = ");
		System.out.println(a.equals(b));
	}
	
	public static void testEquals_RedAndGreen_Success() {
		System.out.println("testEquals_RedAndGreen_Success<--------");
		GreenMartian a = new GreenMartian(1, 6);
		Martian b = new RedMartian(1, 24, 5);
		System.out.println("expected= true");
		System.out.print("actual  = ");
		System.out.println(a.equals(b));
	}
	
	public static void testCompareTo_RedAndGreen_Posotive() {
		System.out.println("testCompareTo_RedAndGreen_Posotive<--------");
		GreenMartian a = new GreenMartian(1, 6);
		Martian b = new RedMartian(2, 24, 5);
		System.out.println("expected= 1");
		System.out.print("actual  = ");
		System.out.println(b.compareTo(a));
	}

}
