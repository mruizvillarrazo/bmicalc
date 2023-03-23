package gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;

import javax.swing.JSpinner;

import java.awt.Color;
import javax.swing.UIManager;



import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;

import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.border.MatteBorder;


public class BMIVista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton bCalcular, bExit;
	private ButtonGroup grupobotones;
	private JRadioButton rb_Female;

	private JSpinner spinner_masa, spinner_altura, spinner_cintura;
	private JLabel output_BMI,output_obesity,category_output;


	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public BMIVista() {
		initialize();
		setVisible(true);
	}

	/**
	 * Initialize the contents of the 
	 */
	private void initialize() {
		//frame = new JFrame();
		getContentPane().setBackground(new Color(143, 188, 143));
		getContentPane().setForeground(new Color(100, 149, 237));
		setBounds(100, 100, 536, 519);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel_masa = new JPanel();
		panel_masa.setBackground(new Color(112, 128, 144));
		panel_masa.setBounds(134, 63, 58, 35);
		getContentPane().add(panel_masa);
		
		JSpinner spinner_masa = new JSpinner();
		spinner_masa.setModel(new SpinnerNumberModel(0.0, 0.0, 350.0, 1.0));
		panel_masa.add(spinner_masa);
		
		JLabel Label_masa = new JLabel("Masa (kg)");
		Label_masa.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Label_masa.setBounds(49, 49, 75, 61);
		getContentPane().add(Label_masa);
		
		JPanel panel_altura = new JPanel();
		panel_altura.setBackground(new Color(112, 128, 144));
		panel_altura.setBounds(134, 139, 58, 35);
		getContentPane().add(panel_altura);
		
		JSpinner spinner_altura = new JSpinner();
		spinner_altura.setModel(new SpinnerNumberModel(0.0, null, 250.0, 1.0));
		panel_altura.add(spinner_altura);
		
		JLabel Label_altura = new JLabel("Altura (cm)");
		Label_altura.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Label_altura.setBounds(27, 120, 97, 61);
		getContentPane().add(Label_altura);
		
		JPanel panel_cintura = new JPanel();
		panel_cintura.setBackground(new Color(112, 128, 144));
		panel_cintura.setBounds(134, 210, 58, 35);
		getContentPane().add(panel_cintura);
		
		JSpinner spinner_cintura = new JSpinner();
		spinner_cintura.setModel(new SpinnerNumberModel(0, 0, 150, 1));
		panel_cintura.add(spinner_cintura);
		
		JLabel Label_cintura = new JLabel("Cintura (cm)");
		Label_cintura.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Label_cintura.setBounds(27, 199, 97, 61);
		getContentPane().add(Label_cintura);
		
		JRadioButton rb_Male = new JRadioButton("M");
		rb_Male.setBackground(new Color(112, 128, 144));
		rb_Male.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rb_Male.setSelected(true);
		rb_Male.setBounds(134, 276, 58, 21);
		getContentPane().add(rb_Male);
		
		grupobotones.add(rb_Male);
		
		JRadioButton rb_Female = new JRadioButton("F");
		rb_Female.setBackground(new Color(112, 128, 144));
		rb_Female.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		rb_Female.setBounds(134, 322, 58, 21);
		getContentPane().add(rb_Female);
		
		grupobotones.add(rb_Female);
		
			
		
		
		
		JLabel Label_genero = new JLabel("Genero");
		Label_genero.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Label_genero.setBounds(49, 282, 97, 61);
		getContentPane().add(Label_genero);
		
		bCalcular = new JButton("Calcular ");
		bCalcular.setBackground(new Color(0, 0, 0));
		bCalcular.setForeground(new Color(147, 112, 219));
		bCalcular.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		bCalcular.setBounds(49, 420, 143, 44);
		getContentPane().add(bCalcular);
		
		JPanel panel_inputs = new JPanel();
		panel_inputs.setBackground(new Color(173, 216, 230));
		panel_inputs.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_inputs.setForeground(UIManager.getColor("menu"));
		panel_inputs.setBounds(10, 32, 207, 362);
		getContentPane().add(panel_inputs);
		panel_inputs.setLayout(new CardLayout(0, 0));
		
		JLabel output_BMI = new JLabel("");
		output_BMI.setEnabled(false);
		output_BMI.setToolTipText("");
		output_BMI.setForeground(new Color(255, 218, 185));
		output_BMI.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		output_BMI.setBounds(339, 63, 169, 44);
		getContentPane().add(output_BMI);
		
		JButton bExit = new JButton("Salir");
		bExit.setBackground(new Color(0, 0, 0));
		bExit.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		bExit.setBounds(331, 420, 143, 44);
		getContentPane().add(bExit);
		
		JLabel Label_BMI = new JLabel("BMI");
		Label_BMI.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Label_BMI.setBounds(254, 49, 75, 61);
		getContentPane().add(Label_BMI);
		
		JLabel Label_Category = new JLabel("Category");
		Label_Category.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Label_Category.setBounds(254, 149, 75, 61);
		getContentPane().add(Label_Category);
		
		JLabel ouput_obesity = new JLabel("");
		ouput_obesity.setForeground(new Color(255, 218, 185));
		ouput_obesity.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		ouput_obesity.setEnabled(false);
		ouput_obesity.setBounds(339, 276, 169, 44);
		getContentPane().add(ouput_obesity);
		
		JLabel Label_Obesity = new JLabel("Obesity");
		Label_Obesity.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Label_Obesity.setBounds(254, 256, 75, 61);
		getContentPane().add(Label_Obesity);
		
		JLabel category_output = new JLabel("");
		category_output.setForeground(new Color(255, 218, 185));
		category_output.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		category_output.setEnabled(false);
		category_output.setBounds(339, 166, 169, 44);
		getContentPane().add(category_output);
		
		
	}
	
	//Solo botones
	
	public void registerControllerBMI(ActionListener ctrl) {
		bCalcular.addActionListener(ctrl);
		bCalcular.setActionCommand("Calcular");
		bExit.addActionListener(ctrl);
		bExit.setActionCommand("Salir");
		
	}
	
	
	
	public double getMasa() {
	    return ((Double)spinner_masa.getValue()*0.01);

	}
	
	public double getAltura() {
	    return ((Double)spinner_altura.getValue()*0.01);

	}
	
	public double getCintura() {
	    return ((double)spinner_cintura.getValue());
	   

	}
	
	public char getGenero() {
		char resultado='M';
		if(grupobotones.isSelected(rb_Female.getModel())) {
			resultado='F';
		}
		return resultado;
	}
	
 
	public void setBMI(String res) {
		output_BMI.setText(res);
	}
	
	public void setCategory(String res) {
		category_output.setText(res);
	}
	
	public void setObesity(String res) {
		output_obesity.setText(res);
	}
}
