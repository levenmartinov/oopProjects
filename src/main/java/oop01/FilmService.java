package oop01;

public class FilmService {

    private Repository repo = new FilmRepository();

    public void createFilmTable() {

        repo.createTable();

    }


}