package ru.netology.stats.StatsService;

public class StatsService {
    public int totalSum(int[] array) {
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
        for (int arr : array) {
            sum = sum + arr;
        }
        return sum;
    }

    public int averageSum(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
        int totalSum = totalSum(array);
        int average = totalSum / array.length;
        return average;
    }

    public int getMaxMonth(int[] array) {
        int maxMonth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxMonth] <= array[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] array) {
        int minMonth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minMonth] >= array[i]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getLessAverage(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        int average = sum / array.length;

        int averageSum = averageSum(array);
        int lessAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= averageSum) {
                lessAverage++;
            }
        }
        return lessAverage;
    }

    public int getMoreAverage(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        int average = sum / array.length;
        int averageSum = averageSum(array);
        int moreAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= averageSum) {
                moreAverage++;
            }
        }
        return moreAverage;
    }
}
