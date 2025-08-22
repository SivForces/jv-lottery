package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors color = colorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1; // випадкове число від 1 до 100
        return new Ball(color.toString(), number);
    }
}
