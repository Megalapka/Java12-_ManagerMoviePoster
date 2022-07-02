package ru.netology.manager;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldAddMovie() {
        PosterManager manager  = new PosterManager(2);

        manager.addMove("Film1");
        manager.addMove("Film2");
        manager.addMove("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastFive() {
        PosterManager manager = new PosterManager(5);
        manager.addMove("Film1");
        manager.addMove("Film2");
        manager.addMove("Film3");
        manager.addMove("Film4");
        manager.addMove("Film5");
        manager.addMove("Film6");

        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected,actual);

    }

    @Test
    public void shouldFindLastFiveIfContainedThree() {
        PosterManager manager = new PosterManager(5);
        manager.addMove("Film1");
        manager.addMove("Film2");
        manager.addMove("Film3");


        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected,actual);

    }

    @Test
    public void shouldFindLastTen() {
        PosterManager manager = new PosterManager();
        manager.addMove("Film1");
        manager.addMove("Film2");
        manager.addMove("Film3");
        manager.addMove("Film4");
        manager.addMove("Film5");
        manager.addMove("Film6");
        manager.addMove("Film7");
        manager.addMove("Film8");
        manager.addMove("Film9");
        manager.addMove("Film10");
        manager.addMove("Film11");
        manager.addMove("Film12");

        String[] expected = {"Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected,actual);

    }
}
