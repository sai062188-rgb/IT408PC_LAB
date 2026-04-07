import java.util.*;
class L7P6 extends Thread{
	int amount = 5000
	L7P6(String str){
        	super(str);
    	}
    	public static void main(String... args){
        L7P6 t1 = new L7P6("Withdrawal");
        L7P6 t2 = new L7P6("Deposit");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        t2.start();
    	}
   	 @Override
    	public void run(){
        	String name = Thread.currentThread().getName();
        	if (name.equals("Deposit")){
			System.out.println(amount + " before deposit");
            		amount += 1000;
            		System.out.println(amount + " after deposit");
        	}else if(name.equals("Withdrawal")){
			System.out.println(amount + " before withdrawl");
            		amount -= 2000;
            		System.out.println(amount + " after withdrawal");
        	}
   	}
}		
	



