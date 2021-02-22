
public class EmpWag {
	public static void main(String[] args) {
		
		int WAGE_RATE=20;
		int empHr;
		double salary;
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
		System.out.println("employee salary="+salary);
		
	}
}


