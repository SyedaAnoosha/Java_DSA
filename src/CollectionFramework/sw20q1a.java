package CollectionFramework;

import java.util.*;

public class sw20q1a {

    public static void main(String[] args) {

        // Creating a Collection of Stacks
        Collection<Stack<String>> collection = new ArrayList<>();

        // Creating the first Stack for train names
        Stack<String> trainNames = new Stack<>();
        trainNames.push("Karachi Express");
        trainNames.push("Jaffar Express");
        trainNames.push("Awam Express");

        // Adding the first Stack to the Collection
        collection.add(trainNames);

        // Creating the second Stack for train classes
        Stack<String> trainClasses = new Stack<>();
        trainClasses.push("First Class");
        trainClasses.push("Second Class");
        trainClasses.push("Third Class");

        // Adding the second Stack to the Collection
        collection.add(trainClasses);

        // Creating the third Stack for train routes
        Stack<String> trainRoutes = new Stack<>();
        trainRoutes.push("KHI to RWP");
        trainRoutes.push("HYD to SUK");
        trainRoutes.push("LHR to PSH");

        // Adding the third Stack to the Collection
        collection.add(trainRoutes);

        // Checking the size of the Collection
        System.out.println("Size of Collection: " + collection.size());

        // Printing the Collection
        for (Stack<String> stack : collection) {
            System.out.println(stack);
        }

        // Removing the second Stack from the Collection using an Iterator
        Iterator<Stack<String>> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Stack<String> currentStack = iterator.next();
            if (currentStack == trainClasses) {
                iterator.remove();
                break;
            }
        }

        // Printing the Collection after removing the second Stack
        System.out.println("Collection after removing the second Stack: ");
        for (Stack<String> stack : collection) {
            System.out.println(stack);
        }
    }
}
