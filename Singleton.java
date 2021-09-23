package day2;

public class Singleton {
        private static Singleton i;
        private String data = "Swati";

        private Singleton() {
        }

        public static Singleton getSingleton() {
            if (i == null) {
                i = new Singleton();
            }
            return i;
        }
}


