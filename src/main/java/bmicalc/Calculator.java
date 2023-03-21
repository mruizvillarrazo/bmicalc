package bmicalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.border.MatteBorder;

public class Calculator {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 775, 604);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(134, 63, 58, 35);
		frame.getContentPane().add(panel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0.0, 0.0, 350.0, 1.0));
		panel.add(spinner);
		
		JLabel lblNewLabel = new JLabel("Masa (kg)");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(49, 49, 75, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(134, 139, 58, 35);
		frame.getContentPane().add(panel_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0.0, null, 250.0, 1.0));
		panel_1.add(spinner_1);
		
		JLabel lblAlturakg = new JLabel("Altura (cm)");
		lblAlturakg.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblAlturakg.setBounds(27, 120, 97, 61);
		frame.getContentPane().add(lblAlturakg);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(134, 210, 58, 35);
		frame.getContentPane().add(panel_2);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 150, 1));
		panel_2.add(spinner_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cintura (cm)");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(27, 199, 97, 61);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rdbtnM.setSelected(true);
		rdbtnM.setBounds(134, 276, 58, 21);
		frame.getContentPane().add(rdbtnM);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rdbtnF.setBounds(134, 322, 58, 21);
		frame.getContentPane().add(rdbtnF);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Genero");
		lblNewLabel_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(49, 282, 97, 61);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Calcular ");
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btnNewButton.setBounds(49, 420, 143, 44);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(216, 191, 216));
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) UIManager.getColor("inactiveCaption")));
		panel_3.setForeground(UIManager.getColor("menu"));
		panel_3.setBounds(10, 32, 207, 362);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
	}
}
