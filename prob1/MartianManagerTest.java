package prob1;

import java.util.ArrayList;

public class MartianManagerTest {

	public static void main(String[] args) {
//		addMartian_Red_Success();
//		addMartian_Green_Success();
//		addMartian_RedGreen_Failure();
//		testContains_Success();
//		testContains_Failure();
//
//		testGetMartianAtClosetstTo_Index_LowerMatch();
//		testGetMartianAtClosetstTo_Martian_LowerMatch();
//		testGetMartianWithId_Success();
//		testGetMartianWithId_Failure();
//		testgetSortedMartians();
//		testGetTeleporterAt_ValidIndex();
//		testGetTeleporterAt_InvalidIndex_Low();
//		testGetTeleporterAt_InvalidIndex_High();
//		testGroupSpeak();
//		testGroupTeleport();
//		testObliterateTeleporters_One();
//		testObliterateTeleporters_Many();
//		testRemoveMartianWithId_Success_Red();
//		testRemoveMartianWithId_Failure();
//		testToString();
//		testBattle_Small();
//		testBattle_Larger();
		testincreaseTeleporterVolume();

	}
	
	public static void addMartian_Red_Success() {
		System.out.println("addMartian_Red_Success<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		UFO.addMartian(a);
		System.out.println("expected= Red Martian - id=1, vol=6, ten=3");
		System.out.print("actual  = ");
		System.out.println(UFO);
	}
	
	public static void addMartian_Green_Success() {
		System.out.println("addMartian_Green_Success<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new GreenMartian(1, 6);
		UFO.addMartian(a);
		System.out.println("expected= Green Martian - id=1, vol=6");
		System.out.print("actual  = ");
		System.out.println(UFO);
	}
	
	public static void addMartian_RedGreen_Failure() {
		System.out.println("addMartian_RedGreen_Failure()<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new GreenMartian(1, 6);
		UFO.addMartian(a);
		UFO.addMartian(b);
		System.out.println("expected= Red Martian - id=1, vol=6, ten=3");
		System.out.print("actual  = ");
		System.out.println(UFO);
	}
	
	public static void testContains_Success() {
		System.out.println("addMartian_Red_Success<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(2, 56, 99);
		Martian c = new RedMartian(3, 2, 7);
		Martian d = new RedMartian(4, 1, 2);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		System.out.println("expected= true");
		System.out.print("actual  = ");
		System.out.println(UFO.contains(2));
	}
	
	public static void testContains_Failure() {
		System.out.println("testContains_Failure<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(2, 56, 99);
		Martian c = new RedMartian(3, 2, 7);
		Martian d = new RedMartian(4, 1, 2);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		System.out.println("expected= false");
		System.out.print("actual  = ");
		System.out.println(UFO.contains(45));
	}
	
	
	
	public static void testGetMartianAtClosetstTo_Index_LowerMatch()  {
		System.out.println("testGetMartianAtClosetstTo_Index_LowerMatch<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		System.out.println("expected= Red Martian - id=3, vol=56, ten=99");
		System.out.print("actual  = ");
		System.out.println(UFO.getMartianClosestTo(4));
		System.out.println("expected= Green Martian - id=8, vol=2");
		System.out.print("actual  = ");
		System.out.println(UFO.getMartianClosestTo(6));
	}
	
	public static void testGetMartianAtClosetstTo_Martian_LowerMatch()  {
		System.out.println("testGetMartianAtClosetstTo_Martian_LowerMatch<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		Martian e = new GreenMartian(6, 1);
		
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		
		System.out.println("expected= Green Martian - id=8, vol=2");
		System.out.print("actual  = ");
		System.out.println(UFO.getMartianClosestTo(e));
	}
	
	public static void testGetMartianWithId_Success() {
		System.out.println("testGetMartianWithId_Success<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		
		System.out.println("expected= Red Martian - id=3, vol=56, ten=99");
		System.out.print("actual  = ");
		System.out.println(UFO.getMartian(3));
	}
	
	public static void testGetMartianWithId_Failure() {
		System.out.println("testGetMartianWithId_Failure<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		
		System.out.println("expected= null");
		System.out.print("actual  = ");
		System.out.println(UFO.getMartian(4));
	}
	
	public static void testgetSortedMartians() {
		System.out.println("getSortedMartians<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(4, 6, 3);
		Martian b = new RedMartian(8, 56, 99);
		Martian c = new GreenMartian(1, 2);
		Martian d = new GreenMartian(2, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		
		System.out.println("-------->Original Order*");

		System.out.println(UFO);
		
		System.out.println("-------->Order Sorted via ID*");
		System.out.println("expected=\n[Green Martian - id=1, vol=2, Green Martian - id=2, vol=1, Red Martian - id=4, vol=6, ten=3, Red Martian - id=8, vol=56, ten=99]");
		System.out.print("actual  = \n");
		System.out.println(UFO.getSortedMartians("ID"));
		
		System.out.println("-------->Order Sorted via VOLUME*");
		System.out.println("expected=\n[Green Martian - id=2, vol=1, Green Martian - id=1, vol=2, Red Martian - id=4, vol=6, ten=3, Red Martian - id=8, vol=56, ten=99]");
		System.out.print("actual  = \n");
		System.out.println(UFO.getSortedMartians("VOLUME"));
	}
	
	public static void testGetTeleporterAt_ValidIndex() {
		System.out.println("testGetTeleporterAt_ValidIndex<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		Martian e = new GreenMartian(4, 7);
		Martian f = new GreenMartian(5, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		UFO.addMartian(e);
		UFO.addMartian(f);
		
		System.out.println("expected= Green Martian - id=4, vol=7");
		System.out.print("actual  = ");
		System.out.println(UFO.getTeleporter(4));
	}
	
	public static void testGetTeleporterAt_InvalidIndex_Low() {
		System.out.println("testGetTeleporterAt_InValidIndex_Low<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		Martian e = new GreenMartian(4, 7);
		Martian f = new GreenMartian(5, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		UFO.addMartian(e);
		UFO.addMartian(f);
		
		System.out.println("expected= null");
		System.out.print("actual  = ");
		System.out.println(UFO.getTeleporter(-4));
	}
	
	public static void testGetTeleporterAt_InvalidIndex_High() {
		System.out.println("testGetTeleporterAt_InvalidIndex_High<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		Martian e = new GreenMartian(4, 7);
		Martian f = new GreenMartian(5, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		UFO.addMartian(e);
		UFO.addMartian(f);
		
		System.out.println("expected= null");
		System.out.print("actual  = ");
		System.out.println(UFO.getTeleporter(22));
	}
	
	public static void testGroupSpeak() {
		System.out.println("testGroupSpeak<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(4, 6, 3);
		Martian b = new RedMartian(8, 56, 99);
		Martian c = new GreenMartian(1, 2);
		Martian d = new GreenMartian(2, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		System.out.println("expected= \nGreen Martian 1: *angry noises*\r\n"
				+ "Green Martian 2: *angry noises*\r\n"
				+ "Red Martian 4: *very angry noises*\r\n"
				+ "Red Martian 8: *very angry noises*");
		System.out.print("actual  = ");
		System.out.println(UFO.groupSpeak());
	}
	
	public static void testGroupTeleport() {
		System.out.println("testGroupTeleport<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(4, 6, 3);
		Martian b = new GreenMartian(8, 56);
		Martian c = new GreenMartian(1, 2);
		Martian d = new GreenMartian(2, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		System.out.println("expected= \nGreen Martian 1 is teleporting to Timbuktu\r\n"
				+ "Green Martian 2 is teleporting to Timbuktu\r\n"
				+ "Green Martian 8 is teleporting to Timbuktu");
		System.out.print("actual  = ");
		System.out.println(UFO.groupTeleport("Timbuktu"));
	}
	
	public static void testObliterateTeleporters_One() {
		System.out.println("testObliterateTeleporters_One<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		
		
		System.out.println("expected= \nRed Martian - id=1, vol=6, ten=3\r\n"
				+ "Red Martian - id=3, vol=56, ten=99");
		System.out.print("actual  = \n");
		UFO.obliterateTeleporters();
		System.out.println(UFO);
	}
	
	public static void testObliterateTeleporters_Many() {
		System.out.println("testObliterateTeleporters_Many<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new RedMartian(8, 2, 9);
		Martian d = new GreenMartian(13, 1);
		Martian e = new GreenMartian(4, 7);
		Martian f = new GreenMartian(5, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		UFO.addMartian(e);
		UFO.addMartian(f);
		
		System.out.println("expected= \nRed Martian - id=1, vol=6, ten=3\r\n"
				+ "Red Martian - id=3, vol=56, ten=99\r\n"
				+ "Red Martian - id=8, vol=2, ten=9");
		System.out.print("actual  = \n");
		UFO.obliterateTeleporters();
		System.out.println(UFO);
	}
	
	public static void testRemoveMartianWithId_Success_Red() {
		System.out.println("testRemoveMartianWithId_Success_Red<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		
		System.out.println("expected= Red Martian - id=1, vol=6, ten=3");
		System.out.print("actual  = ");
		System.out.println(UFO.removeMartian(1));
		
		System.out.println("expected= Green Martian - id=8, vol=2");
		System.out.print("actual  = ");
		System.out.println(UFO.removeMartian(8));
	}
	
	public static void testRemoveMartianWithId_Failure() {
		System.out.println("testRemoveMartianWithId_Failure<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		
		System.out.println("expected= null");
		System.out.print("actual  = ");
		System.out.println(UFO.removeMartian(99));
	}
	
	public static void testToString() {
		System.out.println("testToString<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3);
		Martian b = new RedMartian(3, 56, 99);
		Martian c = new GreenMartian(8, 2);
		Martian d = new GreenMartian(13, 1);
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		
		System.out.println("expected= \nRed Martian - id=1, vol=6, ten=3\r\n"
				+ "Red Martian - id=3, vol=56, ten=99\r\n"
				+ "Green Martian - id=8, vol=2\r\n"
				+ "Green Martian - id=13, vol=1");
		System.out.print("actual  = \n");
		System.out.println(UFO);
	}
	
	public static void testBattle_Small() {
		System.out.println("testBattle_Small<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3); //pow 9
		Martian b = new RedMartian(3, 56, 99); // pow 155
		Martian c = new GreenMartian(8, 6); // pow 6
		Martian d = new GreenMartian(13, 6); //pow 6
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		
		ArrayList<Martian> UFO2 = new ArrayList<>();
		Martian e = new RedMartian(6, 5, 5); // pow 10
		Martian f = new GreenMartian(7, 5); // pow 5
		UFO2.add(e);
		UFO2.add(f);
		
		System.out.println("expected= \nThe Dead = \r\n"
				+ "[Red Martian - id=1, vol=6, ten=3]\r\n"
				+ "Martians Left = \r\n"
				+ "Red Martian - id=3, vol=56, ten=99\r\n"
				+ "Green Martian - id=8, vol=6\r\n"
				+ "Green Martian - id=13, vol=6\r\n"
				+ "");
		System.out.print("actual  = ");
		System.out.println("\nThe Dead = \n" + UFO.battle(UFO2)
				+ "\nMartians Left = \n" + UFO);
	}
	
	public static void testBattle_Larger() {
		System.out.println("testBattle_Larger<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3); //pow 9
		Martian b = new RedMartian(3, 56, 99); // pow 155
		Martian c = new GreenMartian(8, 6); // pow 6
		Martian d = new GreenMartian(13, 6); //pow 6
		Martian z = new GreenMartian(7, 3); //pow 3
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		UFO.addMartian(z);
		
		ArrayList<Martian> UFO2 = new ArrayList<>();
		Martian e = new RedMartian(6, 5, 5); // pow 10
		Martian f = new GreenMartian(66, 2); // pow 2
		Martian g = new RedMartian(22, 5, 5); // pow 10
		UFO2.add(e);
		UFO2.add(f);
		UFO2.add(g);
		
		System.out.println("expected= \nThe Dead = \r\n"
				+ "[Red Martian - id=1, vol=6, ten=3, Green Martian - id=7, vol=3]\r\n"
				+ "Martians Left = \r\n"
				+ "Red Martian - id=3, vol=56, ten=99\r\n"
				+ "Green Martian - id=8, vol=6\r\n"
				+ "Green Martian - id=13, vol=6");
		System.out.print("actual  = ");
		System.out.println("\nThe Dead = \n" + UFO.battle(UFO2)
				+ "\nMartians Left = \n" + UFO);
	}
	
	public static void testincreaseTeleporterVolume() {
		System.out.println("testincreaseTeleporterVolume_under_ID_10<--------");
		MartianManager UFO = new MartianManager();
		Martian a = new RedMartian(1, 6, 3); 
		Martian b = new RedMartian(3, 56, 99); 
		Martian c = new GreenMartian(8, 6); 
		Martian d = new GreenMartian(13, 4);
		Martian z = new GreenMartian(7, 3); 
		UFO.addMartian(a);
		UFO.addMartian(b);
		UFO.addMartian(c);
		UFO.addMartian(d);
		UFO.addMartian(z);
		
		UFO.increaseTeleporterVolume(10);
		
		System.out.println("Before method call= \nRed Martian - id=1, vol=6, ten=3\r\n"
				+ "Red Martian - id=3, vol=56, ten=99\r\n"
				+ "Green Martian - id=7, vol=3\r\n"
				+ "Green Martian - id=8, vol=6\r\n"
				+ "Green Martian - id=13, vol=4");
		
		System.out.println("expected= \nRed Martian - id=1, vol=6, ten=3\r\n"
				+ "Red Martian - id=3, vol=56, ten=99\r\n"
				+ "Green Martian - id=7, vol=4\r\n"
				+ "Green Martian - id=8, vol=7\r\n"
				+ "Green Martian - id=13, vol=4");
		System.out.print("actual  = \n");
		System.out.println(UFO);
	}

}
