
public class Actor {
	String firstname;
	String lastname;
	public Actor(String first, String last) 
	{
		firstname=first;
		lastname=last;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor actor= new Actor ("Rajeanne", "Robinson");
		System.out.println(actor.firstname);
		System.out.println(actor.lastname);
	}

}
