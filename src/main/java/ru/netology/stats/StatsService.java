package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avgSumSales(long[] sales) {
        int month = sales.length;
        long avgSum = sumSales(sales)/month;
        return avgSum;
    }


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

    public long minAvgSumSales(long[] sales) {
        int month = 0;
        int monthsAvgSum = 0;
        long avgSum = avgSumSales(sales);
        for (long sale : sales) {

            if (sale < avgSum) {
                monthsAvgSum = monthsAvgSum + 1;
            }
            month = month + 1;
        }
        return monthsAvgSum;
    }

    public long maxAvgSumSales(long[] sales) {
        int month = 0;
        int monthsAvgSum = 0;
        long avgSum = avgSumSales(sales);
        for (long sale : sales) {

            if (sale > avgSum) {
                monthsAvgSum = monthsAvgSum + 1;
            }
            month = month + 1;
        }
        return monthsAvgSum;
    }
}