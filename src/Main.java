/*
 * Authors: Nicholas Kang, Brandon Arriaga
 * Group 10 JAVA
 *
 * Lab 3
 *
 * Purpose: Creates A linked List, Stack, and Queue objected to append, remove, and print currency objects from
 * the currencies array of dollar type elements.
 *
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our ADTs Demonstration, presented by Nicholas Kang and Brandon Arriaga");

        Currency[] currencies = new Currency[20];
        
        //intialize each index
        currencies[0] = new Dollar(57.12);
        currencies[1] = new Dollar(23.44);
        currencies[2] = new Dollar(87.43);
        currencies[3] = new Dollar(68.99);
        currencies[4] = new Dollar(111.22);
        currencies[5] = new Dollar(44.55);
        currencies[6] = new Dollar(77.77);
        currencies[7] = new Dollar(18.36);
        currencies[8] = new Dollar(543.21);
        currencies[9] = new Dollar(20.21);
        currencies[10] = new Dollar(345.67);
        currencies[11] = new Dollar(36.18);
        currencies[12] = new Dollar(48.48);
        currencies[13] = new Dollar(101.00);
        currencies[14] = new Dollar(11.00);
        currencies[15] = new Dollar(21.00);
        currencies[16] = new Dollar(51.00);
        currencies[17] = new Dollar(1.00);
        currencies[18] = new Dollar(251.00);
        currencies[19] = new Dollar(151.00);

        //Create LInked list Stack and Queue Objects
        SinglyLinkedList list = new SinglyLinkedList();
        Stack stack = new Stack(null, null);
        Queue queue = new Queue();
        
        //Code for SinglyLinkedList
        System.out.println("SinglyLinkedList: ");
        
        //A. 
        int count = 0;
        for (int i = 6; i >= 0; i--) {
        	list.addCurrency(currencies[i], count);
        	count++;
        }
        
        //B. 
        System.out.println("Find 87.43 and 44.56: ");
        System.out.println(list.findCurrency(new Dollar(87.43)));
        System.out.println(list.findCurrency(new Dollar(44.56)));
        
        //C. 
        list.removeCurrency(new Dollar(111.22));
        list.removeCurrency(2);
        
        //D. 
        System.out.println(list.printList());
        
        //E. 
        for (int i = 9; i <= 12; i++) {
        	list.addCurrency(currencies[i], i % 5);
        }
        
        //F. 
        list.removeCurrency(list.getCount() % 6);
        list.removeCurrency(list.getCount() / 7);
        
        //G. 
        System.out.println(list.printList());
        System.out.println("End of linked list");

      //Code for Stack
        //A. 
        System.out.println("Stack: ");
        
        for (int i = 13; i < 20; i++) {
        	stack.push(currencies[i]);
        }
        
        //B. 
        stack.peek();

        //C. 
        stack.pop();
        stack.pop();
        stack.pop();
        
        //D. 
        stack.printStack();
        System.out.println();
        
        
        //E. 
        for (int i = 0; i < 5; i++) {
        	stack.push(currencies[i]);
        }
        
        //F. 
        stack.pop();
        stack.pop();
        
        //G. 
        stack.printStack();
        System.out.println("end of stack code");

      //Code for Queue
        
        //A. 
        for (int i = 5; i <= 17; i++) {
            if (i % 2 == 1) {
                queue.enQueue(currencies[i]);
            }
        }
        
        //B. 
        System.out.println("Front of the queue: " + queue.peekFront());
        System.out.println("End of the queue: " + queue.peekRear());
        
        //C. 
        queue.deQueue();
        queue.deQueue();
        System.out.println("After deQueue: ");
        
        //D. 
        queue.printQueue();

        //E. 
        for (int i = 10; i < 15; i++) {
            queue.enQueue(currencies[i]);
        }

        //F. 
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        
        //G. 
        System.out.println("After enQueue and 3 deQueue: ");
        queue.printQueue();
    }
}