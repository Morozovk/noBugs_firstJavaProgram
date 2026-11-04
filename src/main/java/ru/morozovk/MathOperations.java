package ru.morozovk;

public class MathOperations {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        int a = 50;
        int b = 34;
        int side = 13;
        int seconds = 178;
        double distance1 = 150;
        double time1 = 14;
        double distance2 = 356;
        double time2 = 52;
        int a1 = 52;
        int b1 = 36;
        int a2 = 150;
        int b2 = 254;
        int radius1 = 13;
        int radius2 = 156;
        double part = 156;
        double total = 43;
        double c = 23.4;
        double f = 40.3;

        System.out.println("Cумма двух чисел: " +  add(x, y));
        System.out.println("Разница двух чисел: " +  subtract(x, y));
        System.out.println("Произведение двух чисел: " +  multiply(x, y));
        System.out.println("Делениие двух чисел: " +  divide(x, y));

        System.out.println("Максимума двух чисел a и b: " + findMax(a, b));

        System.out.println("Разницы между двумя числами x и y: " + difference(x, y));

        System.out.println("Площадь квадрата: " + squareArea(side));
        System.out.println("Периметр квадрата: " + squarePerimeter(side));

        System.out.println(seconds + " секунд, это " + convertSecondsToMinutes(seconds) + " минут(ы)");

        System.out.println("Средняя скорость: " + averageSpeed(distance1, time1));
        System.out.println("Средняя скорость: " + averageSpeed(distance2, time2));

        System.out.println("Гипотенуза: " + findHypotenuse(a1, b1));
        System.out.println("Гипотенуза: " + findHypotenuse(a2, b2));

        System.out.println("Длинна окружности: " + circleCircumference(radius1));
        System.out.println("Длинна окружности: " + circleCircumference(radius2));

        System.out.println("Процент: " + calculatePercentage(part, total));

        System.out.println("Перевод цельсия в фаренгейта: " + celsiusToFahrenheit(c));
        System.out.println("Перевод фаренгейта в цельсия: " + fahrenheitToCelsius(f));
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static double divide(int x, int y){
        return (double) x / y;
    }

    public static int findMax (int a, int b){
        return Math.max(a, b);
    }

    public static int difference(int x, int y){
        return Math.abs(x - y);
    }

    public static int squareArea(int side){
        return side * side;
    }

    public static int squarePerimeter(int side){
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time){
        return distance / time;
    }

    public static double findHypotenuse(double a, double b){
        return Math.sqrt((a * a) + (b * b));
    }

    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part){
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
}