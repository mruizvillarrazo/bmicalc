package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bmicalc.BMICalcImpl;

public class BMIControlador implements ActionListener {

	private BMICalcImpl bmi;
	private BMIVista vista;
	
	
	public BMIControlador(BMICalcImpl bmi, BMIVista vista) {
		this.bmi = bmi;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase("Calcular")) {
			double altura = vista.getAltura();
	        double peso = vista.getMasa();
	        double cintura = vista.getCintura();
	        char genero = vista.getGenero();
	        bmi=new BMICalcImpl();
	        double bmi_calc = bmi.bmi(peso, altura);

	        String category_calc = bmi.category(bmi_calc);

	        boolean obesity_calc = bmi.abdominalObesity(cintura,genero);
	        String obesity_text= "";
	        if(obesity_calc==true) {
	        	obesity_text="True";
	        }else {
	        	obesity_text="False";
	        }
	        
	        if (altura!=0 && peso!=0 && cintura!=0) {
	            vista.setBMI(Double.toString(bmi_calc));
	            vista.setCategory(category_calc);
	            vista.setObesity(obesity_text);
	        }else if(cintura==0) {
	        	vista.setBMI(Double.toString(bmi_calc));
	            vista.setCategory(category_calc);
	        }else {
	            vista.setObesity(obesity_text);

	        }

		}else if(command.equalsIgnoreCase("Salir")) {
			System.exit(0);
		}
		 


	       

	}

}