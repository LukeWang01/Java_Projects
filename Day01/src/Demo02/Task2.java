package Demo02;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefgHIJK";
		int str_len = str.length();
		
		String str1 = str.substring(0,9);  // extract string
		
		System.out.println(str);
		System.out.println(str_len);
		System.out.println(str1);
		
		
		String str2 = "Luke Wang wa wa";
		int a = str2.indexOf("wang");
		int a1 = str2.indexOf("wa");
		int a2 = str2.indexOf("Wang");
		System.out.println(str2);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		
		int b = str2.lastIndexOf("wa");
		int b1 = str2.indexOf("wa");
		
		System.out.println(b);
		System.out.println(b1);

		for (int i = 0; i <= 5; i++){
			System.out.println(i);
		}

		for(int idx = 0; idx <= 5; idx++){
			for (int j = 0; j <= 50; j = j + 10) {
				System.out.println(idx);
				System.out.println(j);
			}
		}


	}

}
