// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int score = 100;
        int replenishment = 900;;
        int bonus = 1;

        int scorebonus;
        if (replenishment > 1000) {
            scorebonus = replenishment / 100;
        } else {
            scorebonus = 0;
        }
        System.out.println( "Итоговыый бонус:" + scorebonus);

        int total = replenishment + scorebonus + score;

        System.out.println("Итоговый счет:" + total);

     }
    }