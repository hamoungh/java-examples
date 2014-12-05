package arrays;

public class Randomlocations {

	public static void main(String[] args) {
		int points_num=1000;
		int[] x=new int[points_num];
		int[] y=new int[points_num];
		for(int i=0; i<points_num; i++){
			x[i]= (int)(Math.random()*100);
			y[i]= (int)(Math.random()*40);
		}
		
		
		for(int i=0; i<points_num; i++){
			if(x[i]==22 && y[i]>=10 && y[i]<=30) {
				System.out.println(x[i] +","+ y[i]);
			}
		}
		
		// find all the points with x of 22
		
		
		
	}

}
