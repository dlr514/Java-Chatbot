import java.util.Random;
import javax.swing.JOptionPane;

public class Extra {

	static enum Greetings {
		
		mode1 ("Robot: hi there great to see you"), 
	    mode2 ("Robot: hello there"), 
	    mode3 ("Robot: greetings human :)"),
		mode4 ("Robot: hello - how may I serve?");
	
    private final String Name;       

    private Greetings(String s) {
        Name = s;
    }

    public boolean equalsName(String otherName) {
       return Name.equals(otherName);
    }

    public String toString() {
       return this.Name;
    }
    
}
	
	static Greetings randomGreetings() {
		
	    int pick = new Random().nextInt(Greetings.values().length);
	    JOptionPane.showMessageDialog(null, ""+ Greetings.values()[pick]);
	    return Greetings.values()[pick];
	    
	}
	

	public static void main(String[] args) throws Exception {
		
		randomGreetings();
		
	} }
	
