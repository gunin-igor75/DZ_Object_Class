public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("���������", "������");
        Author lermontov = new Author("������", "����������");
        Book bookPushkin = new Book("����������� �����",pushkin, 2000);
        Book bookLermontov = new Book("��������",lermontov, 2010);
        System.out.println(bookPushkin);
        bookPushkin.setPublisherYear(2022);
        System.out.println(bookPushkin);
    }
}