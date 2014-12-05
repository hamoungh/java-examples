package testForLoops;


class SumSquare
{
    public static void main(String[] args){
    	double sum=0;
        for(double i=1.5;i<=100.5;i++){
        	sum+=Math.pow(i,2); 
        }
        System.out.println(sum);
    }
}