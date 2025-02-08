package linker.services;

import linker.entities.Report;
import linker.utils.Database;

import java.util.List;
import java.sql.Connection;
public class ReportService implements Service {
    public Connection connection;

    public ReportService() {
        connection = Database.getInstance().getConnection();
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void update(Object o) {

    }

    @Override
    public List get() {
        return List.of();
    }

    @Override
    public void add(Report report){}


}
