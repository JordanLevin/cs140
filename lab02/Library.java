package lab02;

public class Library{
    public static void main(String[] args){
    Book[] library = new Book[3];
    library[0] = new Book("book1", 10);
    library[1] = new Book("book2", 100);
    library[2] = new Book("book3", 15);
    for(int i = 0;i<library.length;i++){
        System.out.println(library[i].getTitle());
    }
    for(Book i: library){
        System.out.println(i.getNumPages());
    }

    System.out.println("Library contains 125 pages");

    System.out.println("function returned: "+ numPagesInLibrary(library));


    System.out.println("Most pages is 100");
    System.out.println("function returned: " + mostPages(library));

    }

    public static int numPagesInLibrary(Book[] books){
    int pages = 0;
    for(Book i: books){
    pages+=i.getNumPages();
    }
    return pages;
    }

    public static int mostPages(Book[] books){
    int most = 0;
    for(Book i: books){
    if(i.getNumPages()>most)
        most = i.getNumPages();
    }
    return most;
    }
}
