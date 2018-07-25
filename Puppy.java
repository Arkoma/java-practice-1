public class Puppy {
	int puppyAge;

	public Puppy(String name) {
		System.out.println("The Puppy's name is :" + name );
	}

	public void setAge( int age ) {
		puppyAge = age;
	}

	public int getAge( ) {
		System.out.println("The Puppy's age is :" + puppyAge );
		return puppyAge;
	}

	public static void main(String []args) {
		Puppy myPuppy = new Puppy( args[0] );

		int n = Integer.parseInt( args[1] );
		myPuppy.setAge( n );

		myPuppy.getAge( ) ;
	}
}

