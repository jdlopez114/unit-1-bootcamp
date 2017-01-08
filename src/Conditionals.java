
public class Conditionals {

    public static void main(String args[]) {

    }

    public boolean isOdd(int n) {
        if (n % 2 == 0) {
            return false;
        }
        return true;

    }


    public boolean isMultipleOfThree(int n) {
        if (n % 3 == 0) {
            return false;
        }
        return true;

    }


    public boolean isOddAndMultipleOfThree(int n) {
        if (n % 2 == 0 && n % 3 == 0) {
            return false;
        }
        return true;
    }


    public void fizzMultipleOfThree(int n) {
        if (n % 3 == 0) {
            System.out.println("fizz");
        }
    }

    public void fromWhere(Person person) {

    }

    // Alarm Clock
    // Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
    // and a boolean indicating if we are on vacation, return a string of the form "7:00"
    // indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
    // and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays
    // it should be "10:00" and weekends it should be "off".

    public static String alarmClock(int day, boolean vacation) {
        if (!vacation)
            return "Off";
        switch (day) {
            case 0:
                return "10:00";
            case 1:
                return "7:00";
            case 2:
                return "7:00";
            case 3:
                return "7:00";
            case 4:
                return "7:00";
            case 5:
                return "7:00";
            case 6:
                return "10:00";
        }
        return "Off";
    }

}
