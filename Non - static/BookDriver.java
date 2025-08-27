class Book 
{
    String title;
    String author;
    String publisher;
    double price;
    int pages;
    String genre;
    int publicationYear;
    double rating;

    public void displayBookInfo() 
	{
        	System.out.println("\n Book Info ");
        	System.out.printf("Title           : %s%n", title);
       		System.out.printf("Author          : %s%n", author);
        	System.out.printf("Publisher       : %s%n", publisher);
        	System.out.printf("Price           : %.2f Rs%n", price);
        	System.out.printf("Pages           : %d%n", pages);
        	System.out.printf("Publication Year: %d%n", publicationYear);
        	System.out.printf("Rating          : %.1f/5%n", rating);
    
	}
}

class BookDriver
 {
    public static void main(String[] args) 
	{
        	Book b1 = new Book();
        	b1.title = "Clean Code";
        	b1.author = "Robert C. Martin";
        	b1.publisher = "Penguin";
        	b1.price = 550.75;
        	b1.pages = 464;
       		b1.genre = "Programming";
        	b1.publicationYear = 2008;
        	b1.rating = 4.7;
        	b1.displayBookInfo();

        	Book b2 = new Book();
        	b2.title = "Atomic Habits";
        	b2.author = "James Clear";
        	b2.publisher = "Penguin";
        	b2.price = 399.99;
        	b2.pages = 320;
        	b2.genre = "Self-help";
       	 
       	 	b2.publicationYear = 2018;
        	b2.rating = 4.8;
        	b2.displayBookInfo();
    }
}
