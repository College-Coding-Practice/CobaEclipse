package GUI;
import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

public class WindowEventDemo extends Frame implements ActionListener, WindowListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public WindowEventDemo() {
		setLayout(new FlowLayout());
		
		new Label("Counter");
		
		tfCount=new TextField("0",10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount=new Button("Count");
		add(btnCount);
		
		btnCount.addActionListener((ActionListener) this);
		
		addWindowListener(this);
		
		setTitle("WindowEvent Demo");
		setSize(250, 100);
		setVisible(true);
	}

	public static void main(String[]args) {
		new WindowEventDemo();
	}

	public void actionPerformed(ActionEvent evt) {
		++count;
		tfCount.setText(count+"");
	
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}

}
