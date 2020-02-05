package GulaSidor.GulaSidor;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public void GUI() {
		mainFrame = new JFrame("Contact Book");
		mainFrame.setSize(400, 600);
		mainFrame.setLayout(new GridLayout(4, 1));

		headerLabel = new JLabel("headerLabel new JLabel", JLabel.CENTER);
		statusLabel = new JLabel("statusLabel new JLabel", JLabel.CENTER);
		statusLabel.setSize(300, 100);

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void eventDemo() {
		headerLabel.setText("headerLabel setText");
		
		JButton chooseButton = new JButton("Choose");
		JButton addButton = new JButton("Add");
		JButton searchButton = new JButton("Search");
		JButton removeButton = new JButton("Remove");

		chooseButton.setActionCommand("Choose");
		addButton.setActionCommand("Add");
		searchButton.setActionCommand("Search");
		removeButton.setActionCommand("Remove");

		chooseButton.addActionListener(new ButtonClickListener());
		addButton.addActionListener(new ButtonClickListener());
		searchButton.addActionListener(new ButtonClickListener());
		removeButton.addActionListener(new ButtonClickListener());

		controlPanel.add(chooseButton);
		controlPanel.add(addButton);
		controlPanel.add(searchButton);
		controlPanel.add(removeButton);

		mainFrame.setVisible(true);

	}

	private class ButtonClickListener implements ActionListener {

		
		
		public void actionPerformed(ActionEvent e) {

			String command = e.getActionCommand();

			if (command.equals("Choose")) {
				statusLabel.setText("Du tryckte Choose");
			} else if (command.equals("Add")) {
				statusLabel.setText("Du tryckte Add");
			} else if (command.equals("Search")) {
				statusLabel.setText("Du tryckte Search");
			} else if (command.equals("Remove")) {
				statusLabel.setText("Du tryckte Remove");
			}
		}
	}
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.eventDemo();
	}
}
