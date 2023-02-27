public class Main {
    public static void main(String[] args) {
        int start = 100;
        int refill = 1400;
        int bonus = (start + refill) / 100;
        int SumTotal = start + refill + bonus;
        if (refill > 1000) {
            System.out.println(bonus);
        } else {
            System.out.println(SumTotal);
        }

    }
}