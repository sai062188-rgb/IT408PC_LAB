import java.util.*;
class L7P3 extends Thread{
	public static void main(String...args) throws Exception{
		L7P3 s = new L7P3();
		System.out.println(s.getState());
        	s.start();
		System.out.println(s.getState());
		Thread.sleep(200);
		System.out.println(s.getState());
		s.join();
		System.out.println(s.getState());
	}
	@Override
	public void run(){
		System.out.println(this.getName()+"is running");
		System.out.println(this.getState());
		try{
			for(int i=0;i<=3;i++){
				System.out.println("awating step:"+i);
				System.out.println(this.getState());
				this.sleep(200);
			}
		}catch(Exception e){
		}
	}
}