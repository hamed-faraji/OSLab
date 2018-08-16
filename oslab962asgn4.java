

class Sum_Runner extends Thread{
	int Sum, x;
	boolean type;
	
	
	public Sum_Runner(){
		this.x = x;
		this.type = type;
	}
	public void run()
    {
		try
        {	
        	if(type) {
        	for ( int i = 0 ; i < x; i++) {
				Sum += i;
			}
        	System.out.println("Sum is "+ Sum  + " and Thread ID is  " + Thread.currentThread().getId());
        	}
        	else
        		System.out.println("Subtract is:  "+ (x-2)  + "  and Thread ID is:   " + Thread.currentThread().getId());
        	}
        catch (Exception e){}
		
		
	}
		
}

public class oslab962asgn4{
	public static void main(String[] args){
		for (int i=0; i < args.length; i++)
        {
        	if(i%2 == 0) {
            Sum_Runner object0 = new Sum_Runner(Integer.parseInt(args[i]),true);
            object0.start();}
        	else {
        		Sum_Runner object0 = new Sum_Runner(Integer.parseInt(args[i]),false);
                  object0.start();
        	}
        }
		   
	}
}
