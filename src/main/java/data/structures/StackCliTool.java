package data.structures;

import java.util.*;

public class StackCliTool {

    public static void main(String[] args) {
        boolean loopRunning = true;
        String userChosenMode;
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackedValues = new Stack<>();
        List<String> terms = Arrays.asList("push", "pop", "peek", "all", "leave");
        System.out.println("Type leave to quit the program");
        System.out.println("(push) to push a new item onto the stack\n(pop) to pop the item on top of the stack\n(peek) to display the item on top of the stack\n(all) to display all the stack items");
        do {
            System.out.print("Enter a command to interact with the program : ");
            if(scanner.hasNext("[A-Za-z]*")){
                userChosenMode = scanner.next();
                scanner.nextLine();
                if(terms.contains(userChosenMode)){
                    if(userChosenMode.equals("push")){
                        boolean pushLoop = true;
                        do {
                            System.out.print("Enter the item to push : ");
                            if(scanner.hasNext("[A-Za-z]*")){
                                String itemToPush = "";
                                itemToPush = scanner.nextLine();
                                stackedValues.push(itemToPush);
                                pushLoop = false;
                            }else{
                                System.out.println("Make sure that the item to push is a string");
                                scanner.nextLine();
                            }
                        }while (pushLoop);
                    } else if (userChosenMode.equals("peek")) {
                        if(stackedValues.isEmpty()){
                            System.out.println("The stack is currently empty");
                            System.out.println("Type push to add new items to the stack");
                        }else{
                            System.out.println("Current value of stack : "+stackedValues.peek());
                        }
                    } else if (userChosenMode.equals("pop")) {
                        if(stackedValues.isEmpty()){
                            System.out.println("You can't pop the stack because it's currently empty");
                            System.out.println("Type push to add new items to the stack");
                        }else{
                            String popped = stackedValues.peek();
                            stackedValues.pop();
                            System.out.println("The value ("+popped+") has been popped");
                        }
                    } else if (userChosenMode.equals("all")) {
                        if(stackedValues.isEmpty()){
                            System.out.println("The stack is currently empty");
                            System.out.println("Type push to add new items to the stack");
                        }else{
                            System.out.println(Arrays.toString(stackedValues.toArray()));
                        }
                    }
                    else {
                        loopRunning = false;
                    }
                }else{
                    System.out.println("The valid commands are (push / peek / pop / all / leave)");
                }
            }else{
                System.out.println("Please enter a valid string !");
                scanner.nextLine();
            }
        }while (loopRunning);
    }

}
