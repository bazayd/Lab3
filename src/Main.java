// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
        Queue queue = new Queue(null, null);
        
        //Code for SinglyLinkedList
        int count = 0;
        for (int i = 6; i >= 0; i--) {
        	list.addCurrency(currencies[i], count);
        	count++;
        }
//        System.out.println(list.findCurrency(87.43));
//        System.out.println(list.findCurrency(44.56));
        
        list.removeCurrency(new Dollar(111.22));
        list.removeCurrency(2);
        list.printList();
        
        for (int i = 9; i <= 12; i++) {
        	list.addCurrency(currencies[i], i % 5);
        }
        
        list.removeCurrency(list.getCount() % 6);
        list.removeCurrency(list.getCount() / 7);
        list.printList();
        
      //Code for Stack
        
      //Code for Queue

    }
}