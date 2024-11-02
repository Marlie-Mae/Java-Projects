public class main {

	public static void main(String[] args)throws InterruptedException {
		
		String s = "Happy Birthday dearest!";
		String message = "May all your wishes come true!";
		
		for(int i = 5; i >= 0; i--) {
			System.out.print("Time remaining:"+i+"\r");
			Thread.sleep(1000);
		}
		System.out.println();
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			Thread.sleep(200);
		}

		System.out.println();
		
		for(int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			Thread.sleep(200);
		}
		
	}
}