import java.util.ArrayList;

public class MainDriver {

	public static void main(String[] args)
	{
		ArrayList<Employee> Employees = new ArrayList<Employee>();

		var employee = new Employee("Employee 1");
		employee.HoursWorked(Employee.Sunday, 2);
		employee.HoursWorked(Employee.Monday, 4);
		employee.HoursWorked(Employee.Tuesday, 3);
		employee.HoursWorked(Employee.Wednesday, 4);
		employee.HoursWorked(Employee.Thrusday, 5);
		employee.HoursWorked(Employee.Friday, 8);
		employee.HoursWorked(Employee.Saturday, 8);
		Employees.add(employee);

		employee = new Employee("Employee 2");
		employee.HoursWorked(Employee.Sunday, 7);
		employee.HoursWorked(Employee.Monday, 3);
		employee.HoursWorked(Employee.Tuesday, 4);
		employee.HoursWorked(Employee.Wednesday, 3);
		employee.HoursWorked(Employee.Thrusday, 3);
		employee.HoursWorked(Employee.Friday, 4);
		employee.HoursWorked(Employee.Saturday, 4);
		Employees.add(employee);

		employee = new Employee("Employee 3");
		employee.HoursWorked(Employee.Sunday, 3);
		employee.HoursWorked(Employee.Monday, 3);
		employee.HoursWorked(Employee.Tuesday, 4);
		employee.HoursWorked(Employee.Wednesday, 3);
		employee.HoursWorked(Employee.Thrusday, 3);
		employee.HoursWorked(Employee.Friday, 2);
		employee.HoursWorked(Employee.Saturday, 2);
		Employees.add(employee);

		employee = new Employee("Employee 4");
		employee.HoursWorked(Employee.Sunday, 9);
		employee.HoursWorked(Employee.Monday, 3);
		employee.HoursWorked(Employee.Tuesday, 4);
		employee.HoursWorked(Employee.Wednesday, 7);
		employee.HoursWorked(Employee.Thrusday, 3);
		employee.HoursWorked(Employee.Friday, 4);
		employee.HoursWorked(Employee.Saturday, 1);
		Employees.add(employee);

		employee = new Employee("Employee 5");
		employee.HoursWorked(Employee.Sunday, 3);
		employee.HoursWorked(Employee.Monday, 5);
		employee.HoursWorked(Employee.Tuesday, 4);
		employee.HoursWorked(Employee.Wednesday, 3);
		employee.HoursWorked(Employee.Thrusday, 6);
		employee.HoursWorked(Employee.Friday, 3);
		employee.HoursWorked(Employee.Saturday, 8);
		Employees.add(employee);

		employee = new Employee("Employee 6");
		employee.HoursWorked(Employee.Sunday, 3);
		employee.HoursWorked(Employee.Monday, 4);
		employee.HoursWorked(Employee.Tuesday, 4);
		employee.HoursWorked(Employee.Wednesday, 6);
		employee.HoursWorked(Employee.Thrusday, 3);
		employee.HoursWorked(Employee.Friday, 4);
		employee.HoursWorked(Employee.Saturday, 4);
		Employees.add(employee);

		employee = new Employee("Employee 7");
		employee.HoursWorked(Employee.Sunday, 3);
		employee.HoursWorked(Employee.Monday, 7);
		employee.HoursWorked(Employee.Tuesday, 4);
		employee.HoursWorked(Employee.Wednesday, 8);
		employee.HoursWorked(Employee.Thrusday, 3);
		employee.HoursWorked(Employee.Friday, 8);
		employee.HoursWorked(Employee.Saturday, 4);
		Employees.add(employee);

		employee = new Employee("Employee 8");
		employee.HoursWorked(Employee.Sunday, 6);
		employee.HoursWorked(Employee.Monday, 3);
		employee.HoursWorked(Employee.Tuesday, 5);
		employee.HoursWorked(Employee.Wednesday, 9);
		employee.HoursWorked(Employee.Thrusday, 2);
		employee.HoursWorked(Employee.Friday, 7);
		employee.HoursWorked(Employee.Saturday, 9);
		Employees.add(employee);

		System.out.println("Hours Worked Report:");
		System.out.println("     Name              Total");
		System.out.println("     -----------------------");
		for (var cnt = 0; cnt < Employees.size(); cnt ++)
		{
			employee = Employees.get(cnt);
			System.out.printf("     %s        %d\n", employee.GetName(), employee.TotalHoursWorked());
		}
	}

}
