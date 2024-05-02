package wrapperClass;

class ObjectToPrimitive_AutoUnBoxing
{
    public static void main(String[] args) {   
        Byte B = Byte.valueOf((byte)10);
        Short S = Short.valueOf((short)15);
        Integer I = Integer.valueOf(20); 
        Long L = Long.valueOf(25L); 
        Float F = Float.valueOf(30.5f);
        Double D = Double.valueOf(40.5);

    // this processes of converting Object to primitive type data is technically called AUTO-UN-BOXING when we don't manually type <Object>.XXXValue() method XXX- byte,short,int,long,float,double
    
    // B should be of Byte Wrapper class else Compilation error arise
        byte b = B;   
        short s = S;
        int i = I;
        long l = L;
        float f = F;
        double d = D;

        System.out.println("Byte object: "+b);
        System.out.println("Short object: "+s);
        System.out.println("Integer object: "+i);
        System.out.println("Long object: "+l);
        System.out.println("Float object: "+f);
        System.out.println("Double object: "+d);

        //UpCasting must be done by compiler implicitly
        long l2 = I; 
        //Type Mismatch: cannot convert from Long to int 
        //int i2 = L;  
        // can't be solved using explicit typecasting also
        //but can be solved using L.intValue() method of Long class

        System.out.println(l2);



        
    }
}