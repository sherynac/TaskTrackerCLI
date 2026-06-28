public class TaskTracker {

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("No command was entered");
            System.out.println("Tip: Enter \"java help\" for more information on commands");
            System.exit(0);
        }

        String command = args[0];

        switch (command) {
            case "add":
                try {
                    String desc = args[1];
                    Task newTask = new Task(desc);
                    TaskManager.addTask(newTask);
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Make sure to include a task name after <add>");
                }

                System.out.println("ADD");
                break;
            case "edit":
                System.out.println("EDIT");
                break;
            case "delete":
                System.out.println("DELETE");
                break;
            case "list":
                System.out.println("LIST");
                break;
            case "help":
                System.out.println("HELP");
                break;
        }
    }
}