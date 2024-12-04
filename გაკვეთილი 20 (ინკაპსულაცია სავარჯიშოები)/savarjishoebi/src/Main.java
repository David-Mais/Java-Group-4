import library.Book;
import library.Library;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("კაცი", 37);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//        person.setName("the man");
//        System.out.println(person.getName());
//        person.setAge(90);
//        System.out.println(person.getAge());
//        person.setAge(-18);
//        System.out.println(person.getAge());

//        BankAccount acc = new BankAccount("abcde12345");
//        System.out.println(acc.getBalance());
//        acc.deposit(5600.55);
//        System.out.println(acc.getBalance());
//        acc.deposit(15_654.45);
//        System.out.println(acc.getBalance());
//
//        acc.setPassword("abc");
//        acc.withdraw(3000.45, "bca");
//        System.out.println(acc.getBalance());
//        acc.withdraw(3000.45, "abc");
//        System.out.println(acc.getBalance());
//
//        acc.withdraw(-5000, "asdf");

        Book favBook = new Book("ცეცხლი და სისხლი", "ჯორჯ რ. რ. მარტინი");
        Book otherBook = new Book("ბეჭდების მბრძანებელი", "ჯ.რ.რ ტოლკინი");
        Book bestBook = new Book("მამის მხვლელი", "ალექსანდრე ყაზბეგი");

        Book extraBook = new Book("", "");

        Library library = new Library();
        library.addBook(favBook);
        library.addBook(otherBook);
        library.addBook(bestBook);
        library.addBook(extraBook);

//        for(Book book : library.getBooks()) {
//            if (book == null) {
//                continue;
//            }
//            System.out.println("ავტორი: " + book.getAuthor());
//            System.out.println("სათაური: " + book.getTitle());
//            System.out.println();
//        }
//
//        System.out.println(Arrays.toString(library.getBooks()));

        library.getSpecificBook("ცეცხლი და სისხლი").printInfo();
    }
}