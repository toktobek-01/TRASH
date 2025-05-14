import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Buy groceries"));
        tasks.add(new Task("Clean the room"));
        tasks.add(new Task("Do homework"));

        // Optional: Mark the first task as done
        tasks.get(0).markAsDone();

        // Print all tasks
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}