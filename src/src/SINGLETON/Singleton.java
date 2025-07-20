package src.SINGLETON;

public class Singleton {

	// Step 1: Create a private static instance variable
	private static Singleton instance;

	// Step 2: Make the constructor private so no other class can instantiate it
	private Singleton() {
		System.out.println("Singleton Instance Created");
	}

	// Step 3: Provide a public static method to get the instance
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton(); // Only one instance will be created
		}
		return instance;
	}

	// Example method
	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}
	
	
	public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();

        System.out.println("Are both instances same? " + (s1 == s2)); // true
    }
}
