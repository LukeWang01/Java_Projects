package Demo01;
import Demo02.MyUtils;

public class HW {
	
	public static void main(String[] args) {
		
		// Data type and variables
		int var = 1000000;
		long varL = 200000000000000L; // add L at end
		short v1 = -2312;
		short v2 = 9488;
		byte v3 = 127; // up to 128 but not include 128
		double v4 = 1231231234.3414335544;
		boolean v5 = false;
		char v6 = '5';
		char v7 = 'k'; // can not use "", only '' for char, " for String
		
		System.out.println("Hello new land");
		System.out.println(var);
		System.out.println(varL);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		
		
		int [] values = new int[100];
		values[0] = 888;
		System.out.println(values[1]);
		values[99] = 777;
		System.out.println(values[99]);
		
		String [] str = new String[] {"1st one,", "2nd one", "3rd one"};
		System.out.println(str[0]);
		
		String [] str2 = new String[100];
		str2[0] = "NO.1";
		str2[99] = "No.100";
		System.out.println(str2[99]);
		
		str2 = new String[1000];
		System.out.println(str2[0]);
		
		String nothing = null;
		System.out.println(nothing);

		
		
		
		// Control flow:
		
		boolean con1 = true;
		
		if(con1) {
			System.out.println("Ture");
		}else {
			System.out.println("False");
		}
		
		int month = 2;
		String monthString;
		
		switch(month) {
		
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		default: monthString = "Unkown Month";
		
		}
		
		System.out.println(monthString);
		
		MyUtils.lukebadbad();
		
		task1();
		
	}
	
	public static void task1() {
		System.out.println("task1 called");
	
	}

}


