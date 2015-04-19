
import java.util.Scanner;

import javax.swing.JOptionPane;


public class CarDriver {
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car ();
		System.out.println(car1.toString());
		
		Car car2 = new Car ("red", "570", "8");
		System.out.println(car2);
		
		System.out.println(car1.getColor());
		System.out.println(car1.getEnginesize());
		System.out.println(car1.getHorsepower());
		
		String color1 = JOptionPane.showInputDialog(null, "Choose color of vehicle ");
		String horsepower1 = JOptionPane.showInputDialog(null, "Choose goal horsepower ");
		String engine1 = JOptionPane.showInputDialog(null, "Choose engine size");
		
		Car car3 = new Car (color1, horsepower1, engine1);
		JOptionPane.showMessageDialog(null, car3);
		
		String color2 = JOptionPane.showInputDialog(null, "Choose color of vehicle 2");
		String horsepower2 = JOptionPane.showInputDialog(null, "Choose goal horsepower ");
		String engine2 = JOptionPane.showInputDialog(null, "Choose engine size");
		
		Car car4 = new Car();
		car4.setColor(color2);
		car4.setHorsepower(horsepower2);
		car4.setEnginesize(engine2);
		JOptionPane.showMessageDialog(null,  car4);
		
		String color3 = JOptionPane.showInputDialog(null, "Choose color of vehicle 3");
		String horsepower3 = JOptionPane.showInputDialog(null, "Choose goal horsepower ");
		String engine3 = JOptionPane.showInputDialog(null, "Choose engine size");
		
		Car car5 = new Car();
		car4.setColor(color3);
		car4.setHorsepower(horsepower3);
		car4.setEnginesize(engine3);
		JOptionPane.showMessageDialog(null,  car5);
		
		JOptionPane.showMessageDialog(null, "Car 2 and Car 5 comparison results is " + car2.equals(car5));
		JOptionPane.showMessageDialog(null, "Inventory of vehicles are " + Car.getcarCount());
		
		
		
		
		
		
		Scanner keyboard = new Scanner(System.in);
		JOptionPane.showInputDialog(" Please provide the color of the vehicle...");
		String color = keyboard.next();
		JOptionPane.showMessageDialog(null, color);


	
	}

}

