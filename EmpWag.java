
public class EmpWag {
	public static void main(String[] args) {
		//contanst
		int IS_FULL_TIME=1;
		int WAGE_RATE=20;
		int empHr;
		double salary;
		//Computation
		int empCheck=(int)Math.floor(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME)
		{
			System.out.println("employee is Present");
			empHr=8;
		}
		else
		{
			System.out.println("employee is Absent");
			empHr=0;	
		}
		salary=(WAGE_RATE*empHr);
		System.out.println("employee salary="+salary);
	}
}



