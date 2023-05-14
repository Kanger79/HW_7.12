package ru.netology.domain;

public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 4;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] reverse() {
        String[] reverse = new String[films.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = films[films.length - 1 - i];
        }
        return reverse;
    }

    public String[] findLast() {
        int resultlength;
        if (films.length < limit) {
            resultlength = films.length;
        } else {
            resultlength = limit;
        }
        String[] reverse = new String[resultlength];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = films[films.length - 1 - i];
        }
        return reverse;
    }
}
