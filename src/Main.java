import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println(isYearLeap(2022));

        //task 2
        System.out.println(recommendedApp(0, 2015));

        //task 3
        System.out.println(deliveryTimeCalc(50));

        //task 4
        checkForDuplicates("abcdefghijkk");
    }

    public static String isYearLeap (int year) {
        String outputString;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            outputString = year + " — високосный год";
        } else {
            outputString = year + " — не високосный год";
        }
        return outputString;
    }

    public static String recommendedApp (int deviceOS, int clientDeviceYear) {
        String outputString = "";
        int currentYear = LocalDate.now().getYear();
        if (deviceOS == 0 && clientDeviceYear < currentYear){
            outputString = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (deviceOS == 0 && clientDeviceYear >= currentYear) {
            outputString = "Установите версию приложения для iOS по ссылке";
        } else if (deviceOS == 1 && clientDeviceYear < currentYear) {
            outputString = "Установите облегченную версию приложения для Android по ссылке";
        } else if (deviceOS == 1 && clientDeviceYear >= currentYear) {
            outputString = "Установите версию приложения для Android по ссылке";
        }
        return outputString;
    }


    public static String deliveryTimeCalc (int deliveryDistance) {
        String outputString = "";
        if (deliveryDistance <= 20) {
            outputString = "Доставка карты займет одни сутки";
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            outputString = "Доставка карты займет двое суток";
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            outputString = "Доставка карты займет трое суток";
        }
        return outputString;
    }

    public static void checkForDuplicates (String stringWithRepeats) {
        char[] charArray = stringWithRepeats.toCharArray();
        Arrays.sort(charArray);
        boolean isDuplicateFound = false;

        label:
        for (int i = 0; i < charArray.length-1; i++) {
            if (charArray[i] == charArray[i+1]){
                System.out.print("Найден повторяющийся символ - " + charArray[i]);
                isDuplicateFound = true;
                break label;
            }
        }
        if (!isDuplicateFound) {
            System.out.println("В строке нет повторяющихся символов");
        }

    }

}