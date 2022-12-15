import java.util.Scanner;

public class Console {
    private static final Stack<Visitors> stack = new Stack<>();
    private static final Console sample = new Console();

    public static Console getSample() {
        return sample;
    }

    public void declare(String s) {
        System.out.print(s);
    }

    public static void addNew() {
        Scanner input = new Scanner(System.in);
        System.out.println("First Name:  ");
        String surname = input.nextLine();
        System.out.println("Last Name:  ");
        String name = input.nextLine();
        System.out.println("How many companions with the Author?  ");
        int companions = input.nextInt();

        Visitors author = stack.push(new Visitors(surname, name, companions, null));
        System.out.println("Author is added to the list.");
        show();
    }

    public static void show() {
        if (stack.isEmpty()) {
            System.out.println("List is empty");
        } else {
            stack.print();
        }


    }
}

