package day2;

public class ProveSingleton {
    public static void main(String[] args)
    {
       Singleton st1 = Singleton.getSingleton();
       Singleton st2 = Singleton.getSingleton();

       q3 a = new q3();
       q3 b = new q3();

       if (a == b) {
           System.out.println("Objects matched");
       } else {
           System.out.println("Objects DID NOT match");
       }

        if (st1 == st2) {
            System.out.println("Singleton Objects matched");
        } else {
            System.out.println("Singleton Objects DID NOT match");
        }


    }
}
