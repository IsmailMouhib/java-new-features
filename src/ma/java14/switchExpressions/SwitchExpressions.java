package ma.java14.switchExpressions;

// Preview 12 & 13 (Project Amber)
public class SwitchExpressions {

    public static String findDayOfTheWeekBefore121314(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 0 :
                dayOfWeek = "Monday";
                break;
            case 1 :
                dayOfWeek = "Tuesday";
                break;
            case 2 :
            case 3 :
                dayOfWeek = "Wednesday";
                break;
            default:
                throw new IllegalArgumentException("Invalid option");
        }
        return dayOfWeek;
    }

    public static String findDayOfTheWeekAfter121314(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                System.out.println("Do some complex logic");
                yield "Monday"; // use yield pour retourner la valeur
            }
            case 1 -> "Tuesday";
            case 2, 3 -> "Wednesday";
            default -> throw new IllegalArgumentException("Invalid option");
        };

        return dayOfWeek;
    }

    public static void main(String[] args) {

    }
}
