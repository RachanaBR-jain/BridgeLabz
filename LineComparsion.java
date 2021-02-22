//Welcome to LineComparsion Program
public class LineComparsion {
		public static void main(String arg[])	
		{
	        double x1,x2,x3,y1,y2,y3;
	        x1=Math.floor(Math.random()*10);
	        x2=Math.floor(Math.random()*10);
	        y1=Math.floor(Math.random()*10);
	        y2=Math.floor(Math.random()*10);
	        x3=Math.floor(Math.random()*10);
	        x3=Math.floor(Math.random()*10);
	        y3=Math.floor(Math.random()*10);
	        y3=Math.floor(Math.random()*10);
		    double distance;
			
		    double distance1=Math.floor(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		    double distance2=Math.floor(Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1)));
		   
	        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance1);
	        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x3+","+y3+")===>"+distance2) ;
	        if(distance1==distance2)
		    {
		    	System.out.println("distance b/w two lines are equal");
		    }
		    else
		    {
			    System.out.println("distance b/w two lines are not equal");
		    }
		}
}
	

