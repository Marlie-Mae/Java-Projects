package inheretance;

public class Toddler extends Person {
	
	String favoriteGame;
	
	Toddler(String name, String sex, int age,String favoriteGame){
		super(name,sex,age);
		
		this.favoriteGame = favoriteGame; //new added variable
		
	}
	void drink() {
		System.out.println("Drinking Milk");
	}
	
	void checkStatus() { //new added method
		super.checkStatus();
		System.out.println("Favorite Game: " + favoriteGame);
	}

}