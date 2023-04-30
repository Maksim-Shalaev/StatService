package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldFindTotalSum() {
        StatsService service = new StatsService();
        int[] array = {
                1, 0, 2
        };
        int expected = 3;
        int actual = service.totalSum(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSum() {
        StatsService service = new StatsService();
        int[] array = {
                100, 200
        };
        int expected = 150;
        int actual = service.averageSum(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        int[] array = {
                7, 3, 10, 15, 70, 70
        };
        int expected = 6;
        int actual = service.getMaxMonth(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        int[] array = {
                7, 3, 10, 15, 70, 70
        };
        int expected = 2;
        int actual = service.getMinMonth(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTotalLessAverage() {
        StatsService service = new StatsService();
        int[] array = {
                2, 2, 4, 4
        };
        int expected = 2;
        int actual = service.getLessAverage(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTotalMoreAverage() {
        StatsService service = new StatsService();
        int[] array = {
                2, 2, 6, 6, 5, 7
        };
        int expected = 4;
        int actual = service.getMoreAverage(array);
        Assertions.assertEquals(expected, actual);
    }
}
