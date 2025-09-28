public class Book implements Element {

    private final int price;

    public Book(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
