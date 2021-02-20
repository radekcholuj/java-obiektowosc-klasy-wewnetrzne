public class Invoice {
    private int number;
    private Item item;

    public Invoice(int number, int ordinalNumber, double price) {
        this.number = number;
        item = new Item(ordinalNumber, price);
    }

    public void display(){
        System.out.println("Number: "+number);
        System.out.println("Ordinal number: "+item.ordinalNumber);
        System.out.println("Price: "+item.price);
    }

    private class Item{
        private int ordinalNumber;
        private double price;

        public Item(int ordinalNumber, double price) {
            this.ordinalNumber = ordinalNumber;
            this.price = price;
        }
    }

}
