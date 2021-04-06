import java.awt.Color;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public abstract class Chatbot implements Readable {

	public static JButton item1 = new JButton("Chat");
	public static JButton item2 = new JButton("Learn");
	public static JButton item3 = new JButton("Info");
	public static JButton item4 = new JButton("Help");
	public static boolean valid = false;
	public static Scanner scanner = new Scanner(System.in);
	static Extra myExtra = new Extra();
	
	public static void Menu() {

		JFrame J = new JFrame("Chatbot");
		
		JMenuBar menubar = new JMenuBar();
		JMenu Menu1 = new JMenu ();

		menubar.add(item1);
		menubar.add(item2);
		menubar.add(item3);
		menubar.add(item4);
		menubar.add(Menu1);
		
		J.setBackground(Color.BLUE);
		J.setResizable(false);
		J.add(new JLabel(new ImageIcon("C:\\Chatbot\\image.jpg")));
		J.setJMenuBar(menubar);
		J.setSize(266, 370);
		J.setVisible(true); 
		J.setLocationRelativeTo(null);
		J.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
		
	} 
	
	public static void Learn() {
	
	while (true) {
		try {

		String input = JOptionPane.showInputDialog("Prompt:");
		if (input.equals("q")) { 
			break; }

		File file = new File("C:\\Chatbot\\BotBrain\\" + input + ".txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		String input2 = JOptionPane.showInputDialog("Response:");
			bw.write(input2);
			bw.flush();
			if (input2.equals("q")) { 
				break;
			}
		
		while (true) {
			
				String input3 = JOptionPane.showInputDialog("Human:");
				if (input3.equals("q")) {
					break; }
				if (input3.equals("hi")) {
					myExtra.randomGreetings();
					input = JOptionPane.showInputDialog("Human:");}
			    if (input3.equals("hi there")) {
						myExtra.randomGreetings();
						input3 = JOptionPane.showInputDialog("Human:");}
			    if (input3.equals("hello")) {
					myExtra.randomGreetings();
					input3 = JOptionPane.showInputDialog("Human:");}
			    FileReader fwi = new FileReader ("C:\\Chatbot\\BotBrain\\" + input3 + ".txt");
			    Scanner scanner2 = new Scanner(file);
				while (scanner2.hasNextLine()) {
					String line = scanner2.nextLine();
				BufferedReader bwi = new BufferedReader(fwi);
					while ((line = bwi.readLine()) != null) {
						JOptionPane.showMessageDialog(null, "Robot: " + line);
						
						} } } }  catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} finally {  } } }
	
	public static void Chat() throws HeadlessException, IOException {
	
	while (true) {
		
		String input3 = JOptionPane.showInputDialog("Human:");
		if (input3.equals("q")) {
			break; }
		if (input3.equals("hi")) {
			myExtra.randomGreetings();
			input3 = JOptionPane.showInputDialog("Human:"); }
		if (input3.equals("hi there")) {
				myExtra.randomGreetings();
				input3 = JOptionPane.showInputDialog("Human:");}
		if (input3.equals("hello")) {
			myExtra.randomGreetings();
			input3 = JOptionPane.showInputDialog("Human:");}
	    FileReader file1 = new FileReader ("C:\\Chatbot\\BotBrain\\" + input3 + ".txt");
	    Scanner scanner2 = new Scanner("C:\\Chatbot\\BotBrain\\" + input3 + ".txt");
		while (scanner2.hasNextLine()) {
		String line2 = scanner2.nextLine();
		BufferedReader bwn = new BufferedReader(file1);
			while ((line2 = bwn.readLine()) != null) {
				JOptionPane.showMessageDialog(null, "Robot: " + line2);
			
			} } } } 
			
public static void main(String[] args) throws Exception {

	Menu();
	
	item1.addActionListener(e -> {
		
		try {
			Chat();
		} catch (HeadlessException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	});
	
	item2.addActionListener(e -> {
		
		try {
			Learn();
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
							
					});
							
	
	item3.addActionListener(e -> {
		
		JOptionPane.showMessageDialog(null, "Project name: Java Chatbot \n" + "Organisation: University of York\n" + "Author: Daniel Luke Rowlands\n" + "Current version: 1.01");
		
	 });
	
	item4.addActionListener(e -> {
		
		JOptionPane.showMessageDialog(null, "Chat > interact with robot\n\n" + "Learn > input what you would like the robot to respond to in prompt and then enter response");
 
	
	});
				 
	}  

public int read(CharBuffer cb) throws IOException {
	// TODO Auto-generated method stub
	return 0;
} } 