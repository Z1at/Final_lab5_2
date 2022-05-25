package NikandrovLab5.data;

/**
 * Source class
 */
public class Coordinates {
    private final Float x; //Поле не может быть null
    private final Long y; //Поле не может быть null

    public Coordinates(Float x, Long y) {
        this.x = x;
        this.y = y;
    }

    public Float getX() {
        return x;
    }

    public Long getY() {
        return y;
    }
}
