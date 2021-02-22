
public class EmpWag {
	public static void main(String[] args) {
		
		int WAGE_RATE=20;
		int empHr;
		double salary;
		double salaryForMonth;
		//Computation
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		
		switch(empCheck) {
		
		case 1:
		{
			System.out.println("employee is Present");
			empHr=8;
			break;
		}
		case 2:
		{
			System.out.println("employee is Part-time Employee");
			empHr=4;
			break;
		}
		default:
		{
			System.out.println("employee is Absent");
		    empHr=0;	
		}
		}
		salary=(WAGE_RATE*empHr);
		salaryForMonth=20*salary;
		System.out.println("employee salary is ="+salary);
		System.out.println("employee salary for a Month is ="+salaryForMonth);

		
		
	}
}


