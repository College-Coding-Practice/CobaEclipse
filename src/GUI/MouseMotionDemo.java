package GUI;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;

public class MouseMotionDemo extends Frame implements MouseListener, MouseMotionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6568149677605311335L;
	private TextField tfMouseClickX;
	private TextField tfMouseClickY;
	private TextField tfMousePositionX;
	private TextField tfMousePositionY;
	
	public MouseMotionDemo() {
		setLayout(new FlowLayout());

		add(new Label("X-Click:"));
		tfMouseClickX=new TextField(10);
		tfMouseClickX.setEditable(false);
		add(tfMouseClickX);
		
		add(new Label("Y-Click:"));
		tfMouseClickY=new TextField(10);
		tfMouseClickY.setEditable(false);
		add(tfMouseClickY);
		
		add(new Label("X-Position:"));
		tfMousePositionX=new TextField(10);
		tfMousePositionX.setEditable(false);
		add(tfMousePositionX);
		
		add(new Label("Y-Position:"));
		tfMousePositionY=new TextField(10);
		tfMousePositionY.setEditable(false);
		add(tfMousePositionY);
		
		addMouseListener(this);
		addMouseMotionListener(this);

		setTitle("MouseMotion Demo");
		setSize(400, 120);
		setVisible(true);
	}
	public static void main(String[]args) {
		new MouseMotionDemo();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		tfMouseClickX.setText(e.getX()+"");
		tfMouseClickY.setText(e.getY()+"");
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}

@Override
public void mouseMoved(MouseEvent e) {
	tfMousePositionX.setText(e.getX()+"");
	tfMousePositionY.setText(e.getY()+"");
}
@Override
public void mouseDragged(MouseEvent e) {}
}