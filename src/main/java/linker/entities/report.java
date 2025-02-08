package linker.entities;
import java.time.LocalDateTime;
import linker.enums.category;
import linker.enums.status;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

public class report {
    int reportId;
    int reporterId;
    int reportedId;
    EnumType category;
    EnumType status;
    LocalDateTime createdat;
    LocalDateTime updatedat;
}
