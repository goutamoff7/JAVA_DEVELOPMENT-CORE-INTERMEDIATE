package wrapperClass;
class ObjectToPrimitive_UnBoxing
{
    public static void main(String[] args) {   
        Byte B = Byte.valueOf((byte)10);
        Short S = Short.valueOf((short)15);
        Integer I = Integer.valueOf(20); 
        Long L = Long.valueOf(25L); 
        Float F = Float.valueOf(10.5f);
        Double D = Double.valueOf(30.5);
    // this processes of converting Object to primitive type data is technically called UN-BOXING when we manually type <Object>.XXXValue() method XXX- byte,short,int,long,float,double
    
        byte b = B.byteValue();
        short s = S.shortValue();
        int i = I.intValue();
        long l = L.longValue();
        float f = F.floatValue();
        double d = D.doubleValue();

        System.out.println("Byte object: "+b);
        System.out.println("Short object: "+s);
        System.out.println("Integer object: "+i);
        System.out.println("Long object: "+l);
        System.out.println("Float object: "+f);
        System.out.println("Double object: "+d);

        //UpCasting must be done by compiler implicitly
        long l2 = I.intValue(); 
        //DownCasting must be done by programmer explicitly
        int i2 = (int)L.longValue(); 
        int i3 = L.intValue();  //intValue here is the method of Long class


        System.out.println(l2);
        System.out.println(i2);
        System.out.println(i3);
        
    }
}