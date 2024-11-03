package inheretance;

public class Main {

	public static void main(String[] args) {
		
		//class instantiation
		Person p = new Person("David","Male",24);
		Toddler t = new Toddler("Marlie Mae","Female",19,"Bowling");
		Kid k = new Kid("Man","Male", 4, "Basketball", 5);
		p.checkStatus();
		t.checkStatus();
		k.checkStatus();
		k.sayGradeLevel();
		
		t.drink();


	}

}