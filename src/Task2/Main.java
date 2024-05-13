package Task2;

public class Main {
    public static void main(String[] args) {
        String st = new String("Hello");
        StringA stringA = new StringA(st);
        ChainHandler chainHandler = new ChainHandler();
        chainHandler.startTask(stringA);
        System.out.println(stringA.st);
    }
}
