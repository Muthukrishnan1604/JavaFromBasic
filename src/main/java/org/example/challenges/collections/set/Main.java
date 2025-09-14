package src.main.java.org.example.challenges.collections.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Task> allTasks = TaskData.getTask("all");
        sortAndPrint("All Tasks", allTasks);

        Comparator<Task> comparator = Comparator.comparing(Task::getPriority);

        Set<Task> muthuTasks = TaskData.getTask("muthu");
        sortAndPrint("Muthu", muthuTasks, comparator);

        Set<Task> diviTasks = TaskData.getTask("divi");

        Set<Task> hemaTasks = TaskData.getTask("hema");

        // Fetch all unique task
        Set<Task> allAssignedTask = getUnion(List.of(muthuTasks, diviTasks, hemaTasks));
        sortAndPrint("All Assigned Task", allAssignedTask);

        Set<Task> everyTask = getUnion(List.of(allAssignedTask, allTasks));
        sortAndPrint("The true All Tasks", everyTask);

        Set<Task> missingTasks = getDifference(everyTask, allTasks);
        sortAndPrint("Missing Task", missingTasks);

        Set<Task> unAssignedTask = getDifference(allTasks, allAssignedTask);
        sortAndPrint("UnAssigned Task", unAssignedTask, comparator);

        // Which task assigned to multiple employees
        Set<Task> multipleAssignment = getUnion(List.of(getIntersect(muthuTasks, diviTasks), getIntersect(diviTasks, hemaTasks), getIntersect(hemaTasks, muthuTasks)));
        sortAndPrint("Assigned to multiple persons", multipleAssignment, comparator);

    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter) {
        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

    private static Set<Task> getUnion(List<Set<Task>> inputList) {
        Set<Task> allTask = new HashSet<>();
        for(var input : inputList) {
            allTask.addAll(input);
        }
        return allTask;
    }

    private static Set<Task> getIntersect(Set<Task> task1, Set<Task> task2) {
        Set<Task> intersect = new HashSet<>(task1);
        intersect.retainAll(task2);
        return intersect;
    }

    private static Set<Task> getDifference(Set<Task> task1, Set<Task> task2) {
        Set<Task> difference = new HashSet<>(task1);
        difference.removeAll(task2);
        return difference;
    }
}
