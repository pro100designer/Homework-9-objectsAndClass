public class App {


  public static void main(String[] args) {

      Author authorFist = new Author("Лев","Толстой");
      Author authorSecond = new Author("Фёдор","Достовевский");
      Book bookFirst = new Book("Война и мир",authorFist,1963);
      Book bookSecond = new Book("Преступление и наказание", authorSecond,1957);
      bookSecond.setPublicationBook(1970);
      System.out.println(bookFirst);
      System.out.println(bookSecond);

    }
}