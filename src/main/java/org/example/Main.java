public class Main {
    public static void main(String[] args) {
    int balance = 100;
    int topUpBalance = 1100;
    int bonus = 0;
    if (topUpBalance > 1000) {
        bonus = topUpBalance / 100;
            }
    int finalBalance = balance + topUpBalance + bonus;
        System.out.printf("Баланс: " + finalBalance);

        }
    }
