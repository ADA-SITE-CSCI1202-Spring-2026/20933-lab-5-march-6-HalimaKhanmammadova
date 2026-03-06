class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square s = (Square) obj;
            return this.width == s.width;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Square(side=" + width + ")";
    }
}