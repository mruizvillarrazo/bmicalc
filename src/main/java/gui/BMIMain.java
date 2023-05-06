package gui;

import java.awt.EventQueue;

import bmicalc.BMICalculatorImpl;


public class BMIMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMICalculatorImpl model = new BMICalculatorImpl();
					BMIVista vista = new BMIVista();
					vista.setVisible(true);;
					BMIControlador controller = new BMIControlador(model, vista);
					vista.registerControllerBMI(controller);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
