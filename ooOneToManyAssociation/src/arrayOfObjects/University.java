package arrayOfObjects;

public class University {
	Boy[] boys=new Boy[10];
	
	void registerSomeBoys(){
		Boy a,b,c,d,e; 
		a=new Boy("a"); b=new Boy("b"); 
		c=new Boy("c"); d=new Boy("d"); 
		e=new Boy("e"); 
		a.friend=b;  b.friend=a; 
		c.friend=e; e.friend=d; 
		Boy[] myboys={a,b,c,d,e}; 
		this.boys=myboys; 
		System.out.print(c.friend.friend.name);
	}
	
}
