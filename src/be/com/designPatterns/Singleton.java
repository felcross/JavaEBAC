package be.com.designPatterns;


public class Singleton {
     
	 private static Singleton singleton;

	 private Singleton() {

	    }
     // método que retorna ele mesmo. 
	    public static Singleton getInstance() {
	        if (singleton == null) {
	            singleton = new Singleton();
	        }
	        return singleton;
	    }
}
