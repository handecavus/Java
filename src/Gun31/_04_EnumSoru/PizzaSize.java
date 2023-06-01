package Gun31._04_EnumSoru;

public enum PizzaSize {
    SMALL(60),
    MEDIUM(100),
    LARGE(150);

    int fiyat;

    PizzaSize(int fiyat) {
        this.fiyat = fiyat;
    }
}
