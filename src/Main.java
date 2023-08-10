import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("\nЗадача 1");
        int year = 2020;
        System.out.println(year + " год" + ((isLeapYear(year)?"":" не") + " является високосным"));
    }

    private static boolean isLeapYear(int year) {
        boolean isFourHundredth = year % 400 == 0;
        boolean isHundredth = year % 100 == 0;
        boolean isFourth = year % 4 == 0;
        return isFourHundredth || (isFourth &&!isHundredth);
    }

    private static void task2() {
        System.out.println("\nЗадача 2");
        byte clientOS = 1; // 0 — iOS, 1 — Android
        int deviceYear = 2015;
        printOsMessage(clientOS, deviceYear);
    }

    public static void printOsMessage(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = clientOS == 0 ? "iOS" : "Android";
        String osVersion = deviceYear < currentYear ? "облегченную" : "";
        System.out.println("Установите " + osVersion + " версию приложения для " + osName + " по ссылке");
    }

    private static void task3() {
        System.out.println("\nЗадача 3");
        int deliveryDistance = 95;
        int days = getDays(deliveryDistance);
        System.out.println(
                (days == -1 ? "Доставки нет" : ("Потребуется дней: " + days))
        );
    }

    public static int getDays(int distance) {
        int day = 1;
        if (distance > 100 || distance < 0) {
            return -1;
        } else {
            if (distance > 20) {
                day++;
                if (distance > 60) {
                    day++;
                }
            }
        }
        return day;
    }

}