package prob1;

public class RedMartianTest {

	public static void main(String[] args) {
		testSpeakAndToString();
		testEquals_Success();
		testEquals_Fail();
		testCompareTo_Negative();
		testCompareTo_Posotive();
		testCompareTo_Zero();

	}
	
	public static void testSpeakAndToString() {
		System.out.println("testSpeakAndToString<--------");
		Martian a = new RedMartian(1, 6, 3);
		System.out.println("expected= Red Martian 1: *very angry noises*");
		System.out.print("actual  = ");
		System.out.println(a.speak());
		System.out.println("expected= Red Martian - id=1, vol=6, ten=3");
		System.out.print("actual  = ");
		System.out.println(a);
	}
	
	public static void testEquals_Success() {
		System.out.println("testEquals_Success<--------");
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(1, 4, 2);
		System.out.println("expected= true");
		System.out.print("actual  = ");
		System.out.println(a.equals(b));
	}
	
	public static void testEquals_Fail() {
		System.out.println("testEquals_Fail<--------");
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(2, 4, 2);
		System.out.println("expected= false");
		System.out.print("actual  = ");
		System.out.println(a.equals(b));
	}
	
	public static void testCompareTo_Negative() {
		System.out.println("testCompareTo_Negative<--------");
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(2, 4, 2);
		System.out.println("expected= -1");
		System.out.print("actual  = ");
		System.out.println(a.compareTo(b));
	}
	
	public static void testCompareTo_Posotive() {
		System.out.println("testCompareTo_Posotive<--------");
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(2, 4, 2);
		System.out.println("expected= 1");
		System.out.print("actual  = ");
		System.out.println(b.compareTo(a));
	}
	
	public static void testCompareTo_Zero() {
		System.out.println("testCompareTo_Zero<--------");
		Martian b = new RedMartian(2, 4, 2);
		System.out.println("expected= 0");
		System.out.print("actual  = ");
		System.out.println(b.compareTo(b));
	}
	

}
