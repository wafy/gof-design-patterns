package composite.before;



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

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream()
                .mapToInt(Item::getPrice).sum();
    }
}
