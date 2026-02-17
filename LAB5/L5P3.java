import java.lang.reflect.Method;
import java.lang.annotation.*;
class L5P3{
	@Bullet(str="Camiln",dbl=12.3465)
	public static void anyMethod() throws NoSuchMethodException{
		Method mtd = L5P3.class.getMethod("anyMethod");
		Bullet b = mtd.getAnnotation(Bullet.class);
		System.out.println("string...."+b.str());
		System.out.println("double...."+b.dbl());
	}
	public static void main(String...args) throws NoSuchMethodException{
		anyMethod();
	}
}