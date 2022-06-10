package GUI;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyEventDemo extends Frame implements KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4718059785705750297L;
	private TextField tfInput;
	private TextArea taDisplay;
	
	public KeyEventDemo() {
		setLayout(new FlowLayout());
		
		add(new Label("Enter Text:"));
		tfInput=new TextField(10);
		add(tfInput);
		taDisplay=new TextArea(5, 40);
		add(taDisplay);
		
		tfInput.addKeyListener(this);
		
		setTitle("KeyEventDemo");
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[]args) {
		new KeyEventDemo();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		taDisplay.append("You have typed "+e.getKeyChar()+"\n");
	}
	@Override
	public void keyPressed(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}

}
