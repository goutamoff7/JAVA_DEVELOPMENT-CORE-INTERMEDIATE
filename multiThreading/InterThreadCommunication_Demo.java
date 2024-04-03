package multiThreading;
class Value
{
    int num;
    boolean setValue = false;
    synchronized public void set(int num)
    {
        while(setValue)
        {
            try{ wait();} catch(Exception e){ e.printStackTrace();}
        }
        System.out.println("Set : "+num);
        this.num = num;
        setValue = true;
       notify();        
    }
    synchronized public void get()
    {
        while(!setValue)
        {
            try{ wait();} catch(Exception e){ e.printStackTrace();}
        }
        System.out.println("Get : "+num);
        setValue=false;
        notify();   
    }
}

class Producer implements Runnable
{
    Value v;
    public Producer(Value v)
    {
        this.v=v;
        Thread t = new Thread(this,"Producer");
        t.start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            v.set(i++);
            try{ Thread.sleep(2000);}
            catch(Exception e) { e.printStackTrace();}            
        }
    }
}

class Consumer implements Runnable
{
    Value v;
    public Consumer(Value v)
    {
        this.v=v;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    public void run()
    { 
        while(true)
        {
            v.get();
            try{ Thread.sleep(2000);}
            catch(Exception e) { e.printStackTrace();}
            
        }
    }
}
class InterThreadCommunication_Demo
{
    public static void main(String[] args) 
    {
        Value v = new Value();
        new Producer(v);
        new Consumer(v);
    }
}