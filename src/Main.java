public class Main {
    public static void main(String[] args) {

        int price = 28_000;
        int bonusMiles = 1;
        int rubles = 20;
        int totalBonus = price * bonusMiles / rubles;
        System.out.println("Ваш итоговый бонус:"+ totalBonus);
    }
}
