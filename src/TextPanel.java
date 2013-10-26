import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TextPanel extends JPanel {
	JTextArea textArea;

	public TextPanel() {
		textArea = new JTextArea(33, 70);
		add(textArea);
		setVisible(true);
		setBackground(Color.WHITE);
		JScrollPane scroll = new JScrollPane(textArea);
		add(scroll, BorderLayout.CENTER);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
	}

	public JTextArea getTextArea() {
		return textArea;
	}
}