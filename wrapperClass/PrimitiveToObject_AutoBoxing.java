package wrapperClass;
class PrimitiveToObject_AutoBoxing
{
    public static void main(String[] args) {
        byte a = 10;
        short b = 10;
        int c = 10;
        long d = 10;
        float e = 10.5f;
        double f = 10.5;


        // this processes of converting primitive type data to Object is technically called Auto-BOXING when we don't manually type <Wrapper_class>.valueOf() method. Here compiler will automatically use <Wrapper_class>.valueOf(<primitive_Data>)

        Byte B = a; 
        Short S = b;
        Integer I = c; 
        Long L = d; 
        Float F = e;
        Double D = f;
        System.out.println("Byte object: "+B);
        System.out.println("Short object: "+S);
        System.out.println("Integer object: "+I);
        System.out.println("Long object: "+L);
        System.out.println("Float object: "+F);
        System.out.println("Double object: "+D);

        //UpCasting must be done by programmer explicitly
        Long L2 = (long)34; 
        //DownCasting must be done by programmer explicitly
        Integer I2 = (int)68L; 

        System.out.println(L2);
        System.out.println(I2);


        
    }
}