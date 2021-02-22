public class EmpWag {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int WAGE_RATE=20;
	public static final int MAX_HRS_IN_MONTH=100;
	public static void main(String[] args) {
		
		int empHr=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;

		
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			
			switch(empCheck) {
		
				case IS_FULL_TIME:	
							System.out.println("employee is Present");
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
			
			totalEmpHrs+=empHr;
			
			System.out.println("days="+totalWorkingDays+" emphour="+empHr);
		}
			int salaryForMonth=totalEmpHrs * WAGE_RATE;
		    System.out.println("employee salary for a Month is ="+salaryForMonth); 	
	}
}







