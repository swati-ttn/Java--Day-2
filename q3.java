package day2;

public class q3 {

    public static void main(String args[]) {
        try {
            Class.forName("SwatiPanwar");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

