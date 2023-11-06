package ru.netology;

public class AfficheManager {
    private final int defaultFilms;
    private String[] films = new String[0];

    public AfficheManager(int defaultFilms) {
        this.defaultFilms = defaultFilms;
    }

    public AfficheManager() {
        this.defaultFilms = 5;
    }

    public void add(String movie) {
        String[] tmp = new String[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = movie;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < defaultFilms) {
            resultLength = films.length;
        } else {
            resultLength = defaultFilms;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
