public class Main {
    public static boolean shouldWakeUp(boolean isBarking, int hour) {
        if (hour < 0 || hour > 23) {
            return false;
        }

        if (isBarking && (hour >= 8 || hour <= 20)) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }

    public static boolean isCatPlaying(boolean summer, int heat) {
        int upLimit = summer ? 45 : 35;
        return heat >= 25 && heat <= upLimit;
    }

    public static double area(double dbl1, double dbl2) {
        if (dbl1 < 0 || dbl2 < 0) {
            return -1;
        }
        return dbl1 * dbl2;
    }

    public static double area2 (double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println(area2(5.0));
        System.out.println(area2(-1));
    }
}
