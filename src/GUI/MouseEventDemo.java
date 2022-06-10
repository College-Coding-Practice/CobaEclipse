package GUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import java.awt.TextField;

public class MouseEventDemo extends Frame implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9020637477733086397L;
	private TextField tfMouseX;
	private TextField tfMouseY;
	
	public MouseEventDemo() {
		setLayout(new FlowLayout());

		add(new Label("X-Click:"));
		tfMouseX=new TextField(10);
		tfMouseX.setEditable(false);
		add(tfMouseX);
		
		add(new Label("Y-Click:"));
		tfMouseY=new TextField(10);
		tfMouseY.setEditable(false);
		add(tfMouseY);
		
		addMouseListener(this);
		
		setTitle("MouseEvent Demo");
		setSize(350, 100);
		setVisible(true);
	}
	public static void main(String[]args) {
		new MouseEventDemo();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		tfMouseX.setText(e.getX()+"");
		tfMouseY.setText(e.getY()+"");
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}

}
