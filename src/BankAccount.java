public class BankAccount {
    private String name;
    private Card card;

    public BankAccount(String name, int ordinalNumber, int lastFourNumbers, String validDate) {
        this.name = name;
        card = new Card(ordinalNumber, lastFourNumbers, validDate);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Ordinal number: " + card.ordinalNumber);
        System.out.println("Last four digits of card number: " + "**" + " " + "****" + " " + "****" + " " + "****" + " " + "****" + " " + "****" + " " + card.lastFourNumbers);
        System.out.println("Valid date: " + card.validDate);
    }

    private class Card {
        private int ordinalNumber;
        private int lastFourNumbers;
        private String validDate;

        public Card(int ordinalNumber, int lastFourDigits, String validDate) {
            this.ordinalNumber = ordinalNumber;
            this.lastFourNumbers = lastFourDigits;
            this.validDate = validDate;
        }
    }
}

