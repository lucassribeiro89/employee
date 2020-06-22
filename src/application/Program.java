package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char s = sc.next().charAt(0);
			
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				if (s == 'y') {
					System.out.print("Additional charge: ");
					double additionalCharge = sc.nextDouble();
					list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				}
				else {
				list.add(new Employee(name, hours, valuePerHour));
				}
		}

		System.out.println("PAYMENTS:");
		for (Employee e : list) {
			System.out.println(e.getName() + " - R$ " + String.format("%.2f",e.payment()));						
		}
		
		sc.close();
	}

}
