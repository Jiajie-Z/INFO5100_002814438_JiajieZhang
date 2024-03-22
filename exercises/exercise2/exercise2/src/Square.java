class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side);
    }

    @Override
    public String displayInfo() {
        return String.format("%s, Area: %.2f, Perimeter: %.2f", super.displayInfo(), calculateArea(), calculatePerimeter());
    }
}
