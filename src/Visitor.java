public interface Visitor {
    int visit(Book book);

    int visit(Music music);

    int visit(Movie movie);
}
