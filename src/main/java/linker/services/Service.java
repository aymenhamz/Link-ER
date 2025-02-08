package linker.services;

public interface Service<X> {
    void add(X x);
    void delete (X x);
    void update(X x);

}
