package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0; // начинаем с нуля
        for (long sale : sales) {
            // аналог sum = sum + sale;
            // каждый раз прибавляем к текущей сумме новый элемент
            sum += sale;
        }
        return sum;
    }

    public long calculateMSum(long[] sales) {
        return calculateSum(sales)/sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int count = 0;
        long calculateMSum = calculateMSum(sales);
        for (long sale : sales) {
            if (sale < calculateMSum) {
                count += 1;
            }
        }
        return count;
    }

    public int monthMaxSales(long[] sales) {
        int count = 0;
        long calculateMSum = calculateMSum(sales);
        for (long sale : sales) {
            if (sale > calculateMSum) {
                count += 1;
            }
        }
        return count;
    }
}


//    public int MonthminSales(long[] sales) {
//        int count = 0;
//        long sum = 0; // начинаем с нуля
//        for (long sale : sales) {
//            sum += sale;
//            if (sale <= sum/ 12) {
//                count++;
//            }
//    }
//        return count;
//    }


//        public int MonthmaxSales(long[] sales) {
//            int count = 0;
//            long sum = 0; // начинаем с нуля
//            for (long sale : sales) {
//                // аналог sum = sum + sale;
//                sum = sum + sale;
//                if (sale <= sum /12) {
//                    count++;
//                }
//                return count;
//            }


