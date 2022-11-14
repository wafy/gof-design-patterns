package composite.after;


public class Client {

    public static void main(String[] args) {
        Item 호순 = new Item("호순", 8);
        Item 구름 = new Item("구름", 10);

        Bag bag = new Bag();
        bag.add(호순);
        bag.add(구름);

        Client client = new Client();
        client.printPrice(bag);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
