import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class MenuPanel/*extend JPanel*/ {
	private TextPanel textPanel;
	private JMenuBar menuBar;
	private JFileChooser fileChooser;
	private String title;
	private JMenu file;

	public MenuPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
		fileChooser = new JFileChooser();
		menuBar = new JMenuBar();
		file = new JMenu("FILE");
		JButton open = new JButton("Open");
		open.addActionListener(new TextOpen());
		file.add(open);
		JButton save = new JButton("Save");
		save.addActionListener(new TextSave());
		file.add(save);
		menuBar.add(file);
		title = "Untitled";
	}

	private class TextOpen implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				String file = fileChooser.getSelectedFile().getAbsolutePath();
				try {
					FileReader fileR = new FileReader(file);
					textPanel.getTextArea().read(fileR, null);
					fileR.close();
					setTitle(file);
				} catch (IOException e1) {}
			}
		}
	}
	
	private class TextSave implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				String file = fileChooser.getSelectedFile().getAbsolutePath();
				try {
					FileWriter fileW = new FileWriter(file);
					textPanel.getTextArea().write(fileW);
					fileW.close();
				}
				catch(IOException e1) {}
			}
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public JMenuBar getMenuBar() {
		return menuBar;
	}
}