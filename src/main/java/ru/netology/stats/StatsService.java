package ru.netology.stats;

public class StatsService {
    public long SumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avgSumSales(long[] sales) {
        long sum = 0;
        int month = 0;
        for (long sale : sales) {
            sum += sale;
            month = month + 1;
        }
        long avgSum = sum / month;
        return avgSum;
    }

    //sum = sum + sale
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long MinAvgSumSales(long[] sales) {
        long sum = 0;
        int month = 0;
        int monthsAvgSum = 0;
        for (long sale : sales) {
            sum += sale;
            month = month + 1;
        }
        long avgSum = sum / month;
        for (long sale : sales) {

            if (sale < avgSum) {
                monthsAvgSum = monthsAvgSum + 1;
            }
            month = month + 1;
        }
        return monthsAvgSum;
    }

    public long MaxAvgSumSales(long[] sales) {
        long sum = 0;
        int month = 0;
        int monthsAvgSum = 0;
        for (long sale : sales) {
            sum += sale;
            month = month + 1;
        }
        long avgSum = sum / month;
        for (long sale : sales) {

            if (sale > avgSum) {
                monthsAvgSum = monthsAvgSum + 1;
            }
            month = month + 1;
        }
        return monthsAvgSum;
    }
}