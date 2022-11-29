package com.example.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoryDBRepoAbstract<T extends MemoryDBEntity> implements MemoryDBRepoIfs<T> {

    private final List <T> db = new ArrayList<>();
    private int index = 0;

    @Override
    public Optional<T> findById(int index) {
        return db.stream().filter(it -> it.getIndex() == index).findFirst();
    }

    @Override
    public T save(T entity) {


        return null;
    }

    @Override
    public void deleteById(int index) {

    }

    @Override
    public List listAll() {
        return null;
    }
}
