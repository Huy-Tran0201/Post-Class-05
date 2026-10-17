/**
 * Chương trình chạy thử Exercise 9.
 */
public class Main {
    public static void main(String[] args) {
        GameModel a = GameModel.instance();
        GameModel b = GameModel.instance();

        System.out.println("a == b: " + (a == b));

        a.newGame();
        System.out.println("Da goi newGame() lan 1");

        b.newGame();
        System.out.println("Da goi newGame() lan 2");
    }
}
