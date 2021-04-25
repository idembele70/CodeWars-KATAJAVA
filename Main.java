public class Main {
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] { 1, 2, }, 5));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0, average, classPointsLength = classPoints.length;
        for (int number : classPoints) {
            sum+=number;
        }
        average = sum/classPointsLength;
        return average < yourPoints;
    }

}