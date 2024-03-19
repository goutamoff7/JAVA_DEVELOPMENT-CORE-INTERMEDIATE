package wrapperClass;
class PrimitiveToObject_Boxing
{
    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10.5f;
        double d = 10.5;

    // Converting primitive type data to Object (Wrapper class)
        Integer I = new Integer(i); // this process has been @deprecated, not used 
        System.out.println(i);

    // this processes of converting primitive type data to Object is technically called BOXING when we manually type <Wrapper_class>.valueOf() static method
        Byte B = Byte.valueOf(b);
        Short S = Short.valueOf(s);
        Integer I2 = Integer.valueOf(i); 
        Long L = Long.valueOf(l); 
        Float F = Float.valueOf(f);
        Double D = Double.valueOf(d);
        System.out.println("Byte object: "+B);
        System.out.println("Short object: "+S);
        System.out.println("Integer object: "+I2);
        System.out.println("Long object: "+L);
        System.out.println("Float object: "+F);
        System.out.println("Double object: "+D);

        // both the case can't be solved using explicit typecasting also 

        //Type Mismatch : cannot convert from Integer to Long
        //Long L2 = Integer.valueOf(56); 
        
        //Type Mismatch : cannot convert from Long to Integer
        //Integer I2 = Long.valueOf(68L); 

        
    }
}