import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class TextPanel extends JPanel{
	JTextArea textArea;

	public TextPanel() {
		textArea = new JTextArea(32,70);
		add(textArea);
		setVisible(true);
		setBackground(Color.WHITE);
		JScrollPane scroll = new JScrollPane(textArea);
		add(scroll, BorderLayout.CENTER);
		// Para que se partan automáticamente las líneas al llegar al final 
		textArea.setLineWrap(true);

		// Para que el partido se haga respetando las palabras. Sólo se parte la
		// línea en los espacios entre palabras.
		textArea.setWrapStyleWord(true);
		
	}
}
