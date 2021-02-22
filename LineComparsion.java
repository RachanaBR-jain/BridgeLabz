x//Welcome to LineComparsion Program
public class LineComparsion {
		public static void main(String arg[]){
	        double x1,x2,y1,y2;
	        x1=Math.floor(Math.random()*10);
	        x2=Math.floor(Math.random()*10);
	        y1=Math.floor(Math.random()*10);
	        y2=Math.floor(Math.random()*10);	
		double distance;
		distance=Math.floor(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));	 	    
	        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);		
	}
}
