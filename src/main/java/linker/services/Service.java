package linker.services;

import linker.entities.Report;

import java.util.List;

public interface Service<X> {
    void add(X x);
    void delete (X x);
    void update(X x);
    List<X> get();

    void add(Report report);
}
