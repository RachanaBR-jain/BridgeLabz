
public class EmpWageBuliderUCI {
	public static void main(String[] args) {
		//contanst
		int IS_FULL_TIME=1;
		//Computation
		double empCheck=Math.floor(Math.random()*10)%2;
		int empCheck1=(int)Math.floor(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME)
			System.out.println("employee is Present");
			else
				System.out.println("employee is Absent");

		}
	
}


