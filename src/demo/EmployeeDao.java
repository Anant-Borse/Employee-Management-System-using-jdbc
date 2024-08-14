package demo;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDao {
	
	public static void addStudent(Employee employee) throws Exception {
		Connection con = Db.connect();
		String query = Query.insert;
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, employee.getEmpId());
		pst.setString(2, employee.getEmpName());
		pst.setInt(3, employee.getSalary());
		pst.setString(4, employee.getEmail());
		
		pst.executeUpdate();
		pst.close();
	}
	
	public static ArrayList<Employee> readEmp() throws Exception {
		ArrayList<Employee> emplist = new ArrayList<>();
		Connection con = Db.connect();
		String query = Query.read;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
			emplist.add(emp);
		}
		st.close();
		return emplist;
	}
	
	public static void updateEmployee(int Id, String Name)throws Exception {
		Connection con = Db.connect();
		String query = Query.update;
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, Id);
		pst.setString(2, Name);
		pst.executeUpdate();
		
		pst.close();
		
	}
	public static void deleteEmployee(int Id )throws Exception {
		Connection con = Db.connect();
		String query = Query.delete;
		PreparedStatement  pst =con.prepareStatement(query);
		pst.setInt(1, Id);
		pst.execute();
	}

	
}	

