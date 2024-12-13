package oop01;

import java.sql.SQLException;
import java.util.List;

public class FilmRepository implements Repository<Film, Integer> {


    @Override
    public void createTable() {

        JdbcUtils.setConnection();
        JdbcUtils.setStatement();

        try {
            JdbcUtils.statement.execute("CREATE TABLE IF NOT EXISTS filmler (id SERIAL UNIQUE, film_adi VARCHAR(50)," +
                    " tur VARCHAR(50),sure REAL, yonetmen_adi VARCHAR(50), konu VARCHAR(50), yapimci VARCHAR(50) )");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                JdbcUtils.statement.close();
                JdbcUtils.connection.close();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void save(Film entity) {


    }

    @Override
    public List<Film> findAll() {
        return List.of();
    }

    @Override
    public Film findById(Integer id) {
        return null;
    }

    @Override
    public void update(Film entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}