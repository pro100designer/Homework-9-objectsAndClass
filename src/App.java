public class App {


    public static void main(String[] args) {
        //       System.out.println("Hello world!");
//        String nameJohn = "john";
//        int ageJohn = 13;
//
//        String nameSarah = "Sarah";
//        int ageSarah = 30;
//        String[] names = {"John", "Sarah"};
//
//        int[] age = {13, 30};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Имя-" + names[i] + "Возраст" + age[i]);
//        }
//        PersonServece personServece = new PersonServece();
//        Main2 sarah = new Main2("Sarah",30);
//        if (personServece.isAdult(sarah)) {
//            System.out.println("Иди в бар");
//        } else {
//            System.out.println("Иди в школу");
//        }
//        System.out.println(sarah);
//        sarah.increaseAge(1);
//        System.out.println("sarah.name = " + sarah.getName());
//        System.out.println("sarah.age = " + sarah.getAge());
//        sarah.setAge(31);
//        System.out.println("sarah.getAge() = " + sarah.getAge());
//        Main2 john = new Main2("John",30);
        Author authorFist = new Author("Лев", "Толстой");
        Author authorSecond = new Author("Фёдор", "Достовевский");
        Book bookFirst = new Book("Война и мир", authorFist, 1963);
        Book bookSecond = new Book("Преступление и наказание", authorSecond, 1957);
        bookSecond.setPublicationBook(1970);
        System.out.println(bookFirst);
        System.out.println(bookSecond);
        System.out.println(bookFirst.equals(bookSecond));

    }
}