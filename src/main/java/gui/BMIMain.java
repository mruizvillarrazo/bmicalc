package gui;

import java.awt.EventQueue;

import bmicalc.BMICalcImpl;


public class BMIMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMICalcImpl model = BMICalcImpl.getInstancia();
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
