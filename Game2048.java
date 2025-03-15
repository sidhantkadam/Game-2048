import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Game2048 extends Application {

    private static final int SIZE = 4;
    private static final int tile_size = 100;
    private int[][] board;
//    private Lable [][] tiles;
    private GridPane grid;

    public Game2048()
    {
        board = new int[SIZE][SIZE];
//        startGame();
    }

    @Override
    public void start(Stage stage) throws Exception {

    }

    public static void main(String[] args) {
        Game2048 game = new Game2048();
        Application.launch(Game2048.class, args);
    }
}
