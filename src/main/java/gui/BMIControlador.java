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
	        bmi=BMICalcImpl.getInstancia();
	        
	        
	        double bmi_calc ;

	        String category_calc = null;

	        boolean obesity_calc = false;
	        
	        String obesity_text= "";
	        
	       
	        
	        
	        if (altura!=0 && peso!=0 && cintura!=0) {
	        	
	        	 
	        	
	        	bmi_calc = bmi.bmi(peso, altura);
	        	category_calc = bmi.category(bmi_calc);
	        	if(( category_calc=="OBESE" && genero=='M' && cintura<90) || (category_calc=="OBESE" && genero=='F' && cintura<80)) {
	        		throw new RuntimeException("No tienen sentido estos valores");
	        	}else if((bmi_calc<=29.9 && category_calc!="OBESE" && cintura<=90 && genero=='M')
	        			|| (bmi_calc<=29.9 && category_calc!="OBESE" && cintura<=80 && genero=='F')) {
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
	        	bmi_calc = bmi.bmi(peso, altura);
	        	category_calc = bmi.category(bmi_calc);
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