package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bmicalc.BMICalculatorImpl;
import bmicalc.Gender;
import bmicalc.ObesityCategory;

public class BMIControlador implements ActionListener {

	private BMICalculatorImpl bmi;
	private BMIVista vista;
	
	
	public BMIControlador(BMICalculatorImpl bmi, BMIVista vista) {
		this.bmi = bmi;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase("Calcular")) {
			double altura = vista.getAltura();
	        double peso = vista.getMasa();
	        double cintura=vista.getCintura();
	        Gender genero = vista.getGenero();
	        bmi=new BMICalculatorImpl();
	        
	        
	        double bmi_calc ;

	        ObesityCategory category_calc = null;

	        boolean obesity_calc = false;
	        
	        String obesity_text= "";
	        
	       
	        
	        
	        if (altura!=0 && peso!=0 && cintura!=0) {
	        	
	        	 
	        	
	        	bmi_calc = bmi.calculateBodyMassIndex(peso, altura);
	        	category_calc = bmi.getObesityCategory(bmi_calc);
	        	if(( category_calc==ObesityCategory.OBESE && genero==Gender.MALE && cintura<90) || (category_calc==ObesityCategory.OBESE && genero==Gender.FEMALE && cintura<80)) {
	        		throw new RuntimeException("No tienen sentido estos valores");
	        	}else if((bmi_calc<=29.9 && category_calc!=ObesityCategory.OBESE && cintura<=90 && genero==Gender.MALE)
	        			|| (bmi_calc<=29.9 && category_calc!=ObesityCategory.OBESE  && cintura<=80 && genero==Gender.MALE)) {
	        		throw new RuntimeException("No tiene sentido esta combinacion de valores");
	        	}
	        	obesity_calc = bmi.abdominalObesity(cintura,genero);
	        	if(obesity_calc==true) {
		        	obesity_text="¡Hora de hacer deporte!";
		        }else {
		        	obesity_text="¡Estas en forma!";
		        }
	        	
	            vista.setBMI(Double.toString(bmi_calc));
	            vista.setCategory(category_calc);
	            
	            vista.setObesity(obesity_text);
	            
	            
	        }else if(cintura==0) {
	        	bmi_calc = bmi.calculateBodyMassIndex(peso, altura);
	        	category_calc = bmi.getObesityCategory(bmi_calc);
	        	vista.setBMI(Double.toString(bmi_calc));
	            vista.setCategory(category_calc);
	        }else if(cintura!=0 && altura==0 && peso==0){
	        	obesity_calc = bmi.abdominalObesity(cintura,genero);
	        	if(obesity_calc==true) {
		        	obesity_text="¡Hora de hacer deporte!";
		        }else {
		        	obesity_text="¡Estas en forma!";
		        }
	            vista.setObesity(obesity_text);

	        }

		}else if(command.equalsIgnoreCase("Salir")) {
			System.exit(0);
		}
		 


	       

	}

}