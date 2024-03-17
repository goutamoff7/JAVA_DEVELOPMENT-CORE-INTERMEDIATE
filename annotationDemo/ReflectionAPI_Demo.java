package annotationDemo;
import java.lang.reflect.*;

public class ReflectionAPI_Demo {
    public static void main(String[] args) {
        Animal c = new Cow();
        c.getSound(); 

        Class obj = c.getClass();
        System.out.println(obj);
        System.out.println(obj.getName());

        Method methods[] = obj.getMethods();
        System.out.println(methods[0]);
        Method m = methods[0];
        

        int modifier = m.getModifiers();
        System.out.println(modifier);
        System.out.println("Modifier : "+Modifier.toString(modifier));

        Class superClass =obj.getSuperclass();
        System.out.println("Super Class Name : "+superClass.getName());

        System.out.println(obj.isInstance(c));
        System.out.println(obj.isInterface());
        
        
    }
    
}
