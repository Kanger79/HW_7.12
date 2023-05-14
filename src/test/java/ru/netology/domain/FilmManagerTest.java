package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;
import ru.netology.domain.FilmManager;

import java.util.Arrays;

public class FilmManagerTest {

//    FilmManager manager = new FilmManager();

//    @BeforeEach
//    public void setup() {
//        manager.addFilm("Film_1");
//        manager.addFilm("Film_2");
//        manager.addFilm("Film_3");
//        manager.addFilm("Film_4");
//        manager.addFilm("Film_5");
//        manager.addFilm("Film_6");
//        manager.addFilm("Film_7");
//    }

    @Test
    public void sholudShowAllFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film_1");
        manager.addFilm("Film_2");
        manager.addFilm("Film_3");
        manager.addFilm("Film_4");

        String[] expected = {"Film_1", "Film_2", "Film_3", "Film_4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
        System.out.print("Тест_1 - выводим список всех фильмов по порядку: ");
        System.out.println(Arrays.toString(actual));
    }

    @Test
    public void sholudShowReverseFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film_1");
        manager.addFilm("Film_2");
        manager.addFilm("Film_3");
        manager.addFilm("Film_4");
        manager.addFilm("Film_5");
        manager.addFilm("Film_6");
        manager.addFilm("Film_7");
        manager.addFilm("Film_8");

        String[] expected = {"Film_8", "Film_7", "Film_6", "Film_5", "Film_4", "Film_3", "Film_2", "Film_1"};
        String[] actual = manager.reverse();

        Assertions.assertArrayEquals(expected, actual);
        System.out.print("Тест_2 - выводим список фильмов в обратном порядке: ");
        System.out.println(Arrays.toString(actual));
    }

    @Test
    public void LastFilmsLimitMoreLength() {
        FilmManager manager = new FilmManager(6);

        manager.addFilm("Film_1");
        manager.addFilm("Film_2");
        manager.addFilm("Film_3");
        manager.addFilm("Film_4");

        String[] expected = {"Film_4", "Film_3", "Film_2", "Film_1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
        System.out.print("Тест_3 - выводим " + manager.getLimit() + " последних фильмов в обратном порядке: ");
        System.out.println(Arrays.toString(actual));
    }

    @Test
    public void LastFilmsLimitLessLength() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film_1");
        manager.addFilm("Film_2");
        manager.addFilm("Film_3");
        manager.addFilm("Film_4");
        manager.addFilm("Film_5");
        manager.addFilm("Film_6");
        manager.addFilm("Film_7");

        String[] expected = {"Film_7", "Film_6", "Film_5", "Film_4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
        System.out.print("Тест_4 - выводим " + manager.getLimit() + " последних фильмов в обратном порядке: ");
        System.out.println(Arrays.toString(actual));
    }
}
