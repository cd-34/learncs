public class MazeEscape {
    public static Maze escape(Maze input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        while (!input.isFinished()) {
            if (input.canMove()) {
                input.move();
                input.turnLeft();
                if (!input.canMove()) {
                    input.turnRight();
                }
            } else {
                input.turnRight();
            }
        }
        return input;
    }
}