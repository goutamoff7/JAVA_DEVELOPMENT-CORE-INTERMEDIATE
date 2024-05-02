package multiThreading;

public class MainThread {
    public static void main(String[] args) {
       System.out.println("Getting the curruent thread name and priority-");
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName()); 
        System.out.println(t.getPriority());
        System.out.println(t.getState());

        System.out.println("\nSetting the curruent thread name and priority-");

        t.setName("Goutam_main");
        t.setPriority(10);
        System.out.println(t);
        System.out.println(t.getName()); 
        System.out.println(t.getPriority());
        System.out.println(t.getState());

       
    }
}
