public class EmpWag
 {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int WAGE_RATE=20;
	
	public static void main(String[] args) {
		
		int empHr=0;
		int salary=0;
		int salaryForMonth=0;
	
		
		//Computation
		for(int day=0;day<NUM_OF_WORKING_DAYS;day++)
		{
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch(empCheck) {
		
				case IS_FULL_TIME:System.out.println("employee is Present");
							empHr=8;
							break;
				case IS_PART_TIME:
							System.out.println("employee is Part-time Employee");
							empHr=4;
							break;
				default:
						System.out.println("employee is Absent");
						empHr=0;	
			}
	
			salary=WAGE_RATE*empHr;
			salaryForMonth+=salary;
			System.out.println("employee salary is ="+salary);
		}
		System.out.println("employee salary for a Month is ="+salaryForMonth);	 	
	}
}





