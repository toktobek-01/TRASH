public class Task {
    String description;
    boolean isDone;
    boolean markAsDone;

 //Constructor
    public Task(String description) {
     this.description = description;
     this.isDone = false;
    }
    //Mark the task as done
    public void markAsDone() {
     this.isDone = true;
    }
    // Return a string representation of the task
    public String toString() {
        return (isDone ? "[X] " : "[ ]") + description;
    }

    public static void main(String[] args) {
        Task t = new Task("Buy groceries");
        System.out.println(t);        // prints: [ ] Buy groceries
        t.markAsDone();
        System.out.println(t);    // prints: [X] Buy groceries
    }

}

//Create a class called Book with:

//a field String title
//a constructor that takes a title and stores it
//a method printTitle() that prints:
      //  "Title: <the title>"

public class Book{
    String title;

    public Book(String title) {
        this.title = title;
    }

    public String title () {
        return "Title:" + title;
    }

    public static void main(String[] args) {
        Book b = new Book("Boobby Hobbit");
        System.out.println(b.getTitleInfo());
    }
}


