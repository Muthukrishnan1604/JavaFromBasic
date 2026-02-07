package src.main.java.org.example.challenges.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private static String task = """
            Infrastructure, Logging, High
            Infrastructure, DB Access, Medium
            Infrastructure, Security, High
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, Medium
            Data Design, Employee Table, Medium
            Data Design, Cross Reference Tables, High
            Data Design, Encryption Policy,	High
            Data Access, Write Views, Low
            Data Access, Set Up Users,	Low
            Data Access, Set Up Access Policy, Low
            """;

    private static String muthuTasks = """
            Infrastructure,	Security, High, In Progress
            Infrastructure,	Password Policy, Medium,	 In Progress
            Research, Cloud solutions,	 Medium,	 In Progress
            Data Design, Encryption Policy,	High
            Data Design, Project Table,	Medium
            Data Access, Write Views, Low, In Progress
            """;
    private static String diviTasks = """
            Infrastructure,	 Security, High, In Progress
            Infrastructure,	 Password Policy, Medium
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low, In Progress
            """;
    private static String hemaTasks = """
            Infrastructure, Logging, High, In Progress
            Infrastructure,	DB Access, Medium
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, High
            Data Access, Write Views, Low
            """;

    public static Set<Task> getTask(String name) {
        Set<Task> taskList = new HashSet<>();
        String user = "muthu,divi,hema".contains(name.toLowerCase()) ? name : null;

        String selectedList = switch (name.toLowerCase()) {
            case "muthu" -> muthuTasks;
            case "divi" -> diviTasks;
            case "hema" -> hemaTasks;
            default -> task;
        };

        String[] splittedInput;

        for(String input : selectedList.split("\n")) {
            splittedInput = input.split(",");
            Arrays.asList(splittedInput).replaceAll(String::trim);
            Status status = (splittedInput.length <= 3) ? Status.IN_QUEUE : Status.valueOf(splittedInput[3].toUpperCase().replace(' ', '_'));
            Priority priority = Priority.valueOf(splittedInput[2].toUpperCase());
            taskList.add(new Task(name, splittedInput[0], splittedInput[1],priority, status));
        }

        return taskList;
    }

}
