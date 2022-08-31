public class Main {
    public static void main(String[] args) {

        int ticketPrice = 550;
        final int promotionalConverter = 20;

        int milesAmount = ticketPrice / promotionalConverter;
        System.out.println("Выш билет стоил " + ticketPrice);
        System.out.println("У вас начисленно " + milesAmount + " бонусных миль");
    }
}
