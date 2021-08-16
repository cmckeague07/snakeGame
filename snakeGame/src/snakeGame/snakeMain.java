package snakeGame;
import javax.swing.JFrame;

public class snakeMain extends JFrame {

	public snakeMain() {
		JFrame frame = new JFrame();
		gPanel gamepanel = new gPanel();
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKE");
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.pack();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new snakeMain();
	}

}
