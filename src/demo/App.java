package demo;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("Welcome to Employee Management system");
			System.out.println("1:Create Employee, 2:Read data, 3:Update, 4:Delete");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			if (choice<1 || choice >=5) {
				break;
			}
			
			switch(choice) {
			case 1:
				System.out.println("1:ID,2:Name,3:salary,4:email");
				int id = sc.nextInt();
				String name = sc.next();
				int salary = sc.nextInt();
				String email = sc.next();
				
				Employee employee = new Employee(id,name,salary,email);
				EmployeeDao.addStudent(employee);
				
			case 2:
				ArrayList<Employee> list = EmployeeDao.readEmp();
				for (Employee em: list) {
					System.out.println(em);
				}
				break;
				
			case 3:
				System.out.println("Put Id and Name for updation");
				int Id = sc.nextInt();
				String nameString = sc.next();
				EmployeeDao.updateEmployee(Id, nameString);
				break;
			
			case 4:
				System.out.println("Id:");
				int ID = sc.nextInt();
				EmployeeDao.deleteEmployee(ID);
				break;
			}
		}
		
	}
}
