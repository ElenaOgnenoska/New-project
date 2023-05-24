public class Klasa {
    public Klasa() {
    }
    public static void main(String[] args) {
        System.out.println("hello");
        sayHello("Elena");
        sayGoodbye("Elena");
        System.out.println("git gui");
    }
//Komentar vo edna linija
    /*

     */
    public static void sayHello(String name){
        System.out.println("Hello " +name);
    }
    public static void sayGoodbye(String name){
        System.out.println("Good bye " +name);
    }
    //TODO:Add support for multiple users
}
