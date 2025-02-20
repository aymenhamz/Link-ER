package project.services;

import project.entities.Report;
import project.utils.MyDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReportServices implements IServices<Report> {

    private Connection con;

    public ReportServices() {
        con = MyDatabase.getInstance().getCon();
    }

    @Override
    public void add(Report report) throws SQLException {
        String query = "INSERT INTO `report` (`user_id`, `target_type`, `target_id`, `created_at`, `updated_at`, `reason`, `status`) " +
                "VALUES (?, ?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, report.getUserId());
            stmt.setInt(2, report.getTarget_type());
            stmt.setInt(3, report.getTargetId());
            stmt.setString(4, report.getReason());
            stmt.setString(5, report.getStatus());

            stmt.executeUpdate();
            System.out.println("✅ Report added successfully.");
        }
    }

    @Override
    public List<Report> returnList() throws SQLException {
        List<Report> reports = new ArrayList<>();
        String query = "SELECT * FROM `report`";

        try (PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                reports.add(new Report(
                        rs.getInt("id"),
                        rs.getInt("user_id"),  // Corrected column name
                        rs.getInt("target_type"),
                        rs.getInt("target_id"),  // Corrected column name
                        rs.getTimestamp("created_at"),
                        rs.getTimestamp("updated_at"),
                        rs.getString("reason"),
                        rs.getString("status")
                ));
            }
        }

        System.out.println("✅ Report list retrieved: " + reports.size() + " reports.");
        return reports;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM `report` WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("✅ Report deleted successfully.");
            } else {
                System.out.println("⚠️ No report found with ID: " + id);
            }
        }
    }

    public Report getReportById(int reportId) throws SQLException {
        String query = "SELECT * FROM `report` WHERE id = ?";

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, reportId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Report(
                        rs.getInt("id"),
                        rs.getInt("user_id"),  // Corrected column name
                        rs.getInt("target_type"),
                        rs.getInt("target_id"),  // Corrected column name
                        rs.getString("reason"),
                        rs.getString("status")
                );
            } else {
                return null; // No report found
            }
        }
    }

    @Override
    public void update(Report report) throws SQLException {
        String query = "UPDATE `report` SET user_id = ?, target_type = ?, target_id = ?, updated_at = CURRENT_TIMESTAMP, " +
                "reason = ?, status = ? WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, report.getUserId());
            stmt.setInt(2, report.getTarget_type());
            stmt.setInt(3, report.getTargetId());
            stmt.setString(4, report.getReason());
            stmt.setString(5, report.getStatus());
            stmt.setInt(6, report.getId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("✅ Report updated successfully.");
            } else {
                System.out.println("⚠️ No report found with ID: " + report.getId());
            }
        }
    }

}
