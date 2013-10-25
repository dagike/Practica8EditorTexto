import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @class TextFrame
 * @author cursos
 *
 */

public class TextFrame {

	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
//http://forum.codecall.net/topic/49721-simple-text-editor/
	public static void createAndShowGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		TextPanel textPanel = new TextPanel();
		MenuPanel menuPanel = new MenuPanel(textPanel);
		JFrame frame = new JFrame("NEW FRAME");
		frame.add(menuPanel, BorderLayout.NORTH);
		frame.add( textPanel, BorderLayout.CENTER);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
