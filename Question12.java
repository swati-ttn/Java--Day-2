package day2;

    class Parent extends Grandparent {

        static {
            System.out.println("instance - parent");
        }
        public Parent() {
            System.out.println("constructor - parent");
        }
        static {
            System.out.println("static - parent");
        }
    }
    class Grandparent {

        static {
            System.out.println("static - grandparent");
        }
        {
            System.out.println("instance - grandparent");
        }
        public Grandparent() {
            System.out.println("constructor - grandparent");
        }
    }
    class Child extends Parent {
        public Child() {
            System.out.println("constructor - child");
        }
        static {
            System.out.println("static - child");
        }
        {
            System.out.println("instance - child");
        }

    }
    // Need to call Child class  in Main class(Question12) to print the output//
   public class Question12
    {
        public static void main(String[] args) {
        Child c = new Child();
    }
}

