package oop01;

import java.util.List;

public interface Repository<S, U> {

    void createTable();

    void save(S entity);

    List<S> findAll();

    S findById(U id);

    void update(S entity);

    void deleteById(U id);

}