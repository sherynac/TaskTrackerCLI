import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    public static ArrayList<Task> tasks = new ArrayList<>();

    TaskManager(){
        tasks = loadTasks();
    }

    public static int getLastID(){
        return tasks.size();
    }

    public ArrayList<Task> loadTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        try{
            File jsonFile = new File("tasks.json");
            if (jsonFile.createNewFile()){
                System.out.println("File has been created: " + jsonFile.getName());
            }
            Scanner reader = new Scanner(jsonFile);
            while (reader.hasNextLine()){
                String data = reader.nextLine().trim();
                if (data.startsWith("{")) {
                    String[] split = data.split(",");

                    Task task = new Task();
                    tasks.add(task);
                }
            }
            reader.close();
        } catch (Exception e){
            System.out.println("An error has occurred");
            e.printStackTrace();
            System.exit(0);
        }
        return tasks;
    }

    public static void addTask(Task task){
        try{
            FileWriter fileWriter = new FileWriter("tasks.json");
            fileWriter.append("[");
            for (Task t : tasks) {
                fileWriter.append(String.valueOf(t)).append(",");
            }
            fileWriter.append(task.toString());
            fileWriter.append("\n]");
            fileWriter.close();
        } catch (Exception e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}