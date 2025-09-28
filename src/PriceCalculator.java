public class PriceCalculator implements Visitor {
    @Override
    public int visit(Book book) {
        return book.getPrice();
    }

    @Override
    public int visit(Music music) {
        return music.getPrice() * 2;
    }

    @Override
    public int visit(Movie movie) {
        return movie.getPrice() * 3;
    }
}
