package project.entities;
import java.sql.Timestamp;


public class Report {

    private int id, userId, target_type,targetId;
    private String reason,status;

    private Timestamp created_at,updated_at;

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", userId=" + userId +
                ", target_type=" + target_type +
                ", targetId=" + targetId +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Report() {
    }

    public Report(int id, int userId, int target_type, int targetId, Timestamp created_at, Timestamp updated_at, String reason, String status) {
        this.id = id;
        this.userId = userId;
        this.target_type = target_type;
        this.targetId = targetId;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.reason = reason;
        this.status = status;
    }

    public Report(int userId, int target_type, int targetId, Timestamp created_at, Timestamp updated_at, String reason, String status) {
        this.userId = userId;
        this.target_type = target_type;
        this.targetId = targetId;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.reason = reason;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public void setTarget_type(int target_type) {
        this.target_type = target_type;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public int getTargetId() {
        return targetId;
    }

    public int getTarget_type() {
        return target_type;
    }

    public int getUserId() {
        return userId;
    }

    public Report(int id, int userId, int target_type, int targetId, String reason, String status) {
        this.id = id;
        this.userId = userId;
        this.target_type = target_type;
        this.targetId = targetId;
        this.reason = reason;
        this.status = status;
    }

    public int getId() {
        return id;
    }
}
