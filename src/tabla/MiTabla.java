package tabla;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class MiTabla extends JFrame {

	private JPanel MiPanel;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public MiTabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		MiPanel = new JPanel();
		MiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MiPanel);
		MiPanel.setLayout(null);
		
		
		table = new JTable();
		table.setBounds(100, 100, 400, 400);
		MiPanel.add(table);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(357, 117, 2, 2);
		MiPanel.add(scrollPane);
		
	
	}
}
