package boysAndGirls;

public class Program {

	public static void main(String[] args) {
		Boy a= new Boy("a");
		Boy b= new Boy("b");
		Girl p=new Girl("p");
		Girl q=new Girl("q");
		Girl r=new Girl("r");
		
		p.boyfriends[0]=a; // a is boyfriend of p
		a.girlfriends[0]=p; // p is girlfriend of a
		
		q.boyfriends[0]=b; 
		b.girlfriends[0]=q; 
		
		r.boyfriends[0]=b; 
		b.girlfriends[1]=r; 
		
		p.boyfriends[1]=b; 
		b.girlfriends[2]=p; 
		
		Boy boys[]={a,b};
		for(Boy h:boys){
			for(Girl g:h.girlfriends){
				if(g!=null){
					System.out.println(
							h+" is "+ g+ "'s boyfriend");
				}
			}
		}
	}

}









