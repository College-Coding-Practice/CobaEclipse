package GUI;
import java.awt.*;
import java.awt.event.*;

//An AWT program inherits from the top-level container java.awt.frame
public class AWTCounter extends Frame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7488361704147003624L;
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public AWTCounter() {
		setLayout(new FlowLayout());
		
		lblCount=new Label("Counter");
		add(lblCount);
		
		tfCount=new TextField("0",10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount=new Button("Count");
		add(btnCount);
		
		btnCount.addActionListener(this);
		
		setTitle("AWT Counter");
		setSize(250, 100);
		
		setVisible(true);
	}

	public static void main(String[]args) {
		new AWTCounter();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		++count;
		tfCount.setText(count+"");
	
	}
}
