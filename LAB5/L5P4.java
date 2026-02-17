import java.lang.reflect.Method;
import java.lang.annotation.*;
class L5P4{
	@Bullet(str="Camiln",dbl=12.3465)
	public static void anyMethod(){
		try{
			Method mtd = L5P4.class.getMethod("anyMethod");
			Bullet b = mtd.getAnnotation(Bullet.class);
			System.out.println("string...."+b.str());
			System.out.println("double...."+b.dbl());
		}catch(NoSuchMethodException e){
			System.out.println("Method not found:"+e.getMessage());
		}catch(Exception e){
			System.out.println("general Exception:"+e.getMessage());
		}
		}
	public static void main(String...args) {
		anyMethod();
	}
}