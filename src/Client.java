public class Client {
    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
//        int bookPrice = calculator.visit(new Book(100));
//        int musicPrice = calculator.visit(new Music(100));
//        int moviePrice = calculator.visit(new Movie(100));

        int bookPrice = new Book(100).accept(calculator);
        int musicPrice = new Music(100).accept(calculator);
        int moviePrice = new Movie(100).accept(calculator);

        System.out.println("Book price: " + bookPrice);
        System.out.println("Music price: " + musicPrice);
        System.out.println("Movie price: " + moviePrice);
    }
}
