package linker.entities;

import jakarta.persistence.Enumerated;
import linker.enums.ReportStatus;
import linker.enums.ReportCategory;
import java.time.LocalDateTime;
import jakarta.persistence.EnumType;

public class Report {
    int reportId;
    int reporterId;
    int reportedId;

    @Enumerated(EnumType.STRING)
    private ReportStatus status;

    @Enumerated(EnumType.STRING)
    private ReportCategory category;

    LocalDateTime createdat;
    LocalDateTime updatedat;
}
