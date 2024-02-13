public class Employee
{
	String name;
	int age;
	float salary;
	
	Employee()		//default constructor to assign default values to given fields
	{
		name="Unknown";
		age=18;
		salary=20000;
	}
	
	public void display()		//print Name, Age and Salary for current object
	{
		System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nSalary: "+this.salary);
	}
	
	void setAge(int age)	//setter method to set Age
	{
		this.age=age;
	}
	void setSalary(float salary)	//setter method to set Salary
	{
		this.salary=salary;
	}
	void setName(String name)	//setter method to set Name
	{
		this.name=name;
	}
	
	int getAge()	//getter method to get Age
	{
		return this.age;
	}
	float getSalary()	//getter method to get Salary
	{
		return this.salary;
	}
	String getName()	//getter method to get Name
	{
		return this.name;
	}
}
