package HashTable;

import java.util.Scanner;
public class HashMapPractice {
    public static void main(String[] args){

        Scanner textIO=new Scanner(System.in);

        HashMap table = new HashMap();

        String key,value;

        while (true) {

            System.out.println("\nMenu:");

            System.out.println(" 1.Add contact: ");

            System.out.println(" 2.Search Contact: ");

            System.out.println(" 3.Update: ");

            System.out.println(" 4.Delete Contact: ");

            System.out.println(" 5.Display all contacts: ");

            System.out.println(" 6. EXIT");

            System.out.print("Enter your command: ");

            switch (textIO.nextInt()) {

                case 1:

                    System.out.print("\n Name = ");

                    key = textIO.next();

                    System.out.print("");

                    System.out.print(" Number = ");

                    value = textIO.next();

                    table.put(key,value);

                    System.out.print("");

                    break;

                case 2:

                    System.out.print("\n Name = ");

                    key = textIO.next();

                    System.out.println(" Number is: " + table.get(key));

                    break;

                case 3:

                    System.out.print("\n Name = ");

                    key = textIO.next();
                    if(table.containsKey(key)){
                        Object oldNumber=table.get(key);
                        System.out.println("Number is: "+oldNumber);
                        System.out.println("Enter new number to change: ");
                        Object number=textIO.next();
                        table.remove(key);
//                        oldNumber=number;
                        table.put(key,number);

                    }

                    System.out.println(" containsKey(" + key + ") is "

                            + table.containsKey(key));

                    break;

                case 4:

                    System.out.print("\n Name = ");

                    key = textIO.next();

                    table.remove(key);

                    break;

                case 5:

                    table.dump();

                    break;

                case 6:

                    return; // End program by returning from main()

                default:

                    System.out.println(" Illegal command.");

                    break;

            }

            System.out.println("\nHash table size is " + table.size());

        }

    }
}
