public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author lermontov = new Author("Михаил", "Леермонтов");
        Book bookPushkin = new Book("Капитанская дочка",pushkin, 2000);
        Book bookLermontov = new Book("Бородино",lermontov, 2010);
        System.out.println(bookPushkin);
        bookPushkin.setPublisherYear(2022);
        System.out.println(bookPushkin);
    }
}