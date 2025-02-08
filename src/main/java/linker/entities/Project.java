package linker.entities;

import linker.enums.ProjectStatus;
import linker.enums.ProjectTag;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import java.time.LocalDateTime;

public class Project {
    private int id;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @Enumerated(EnumType.STRING)
    private ProjectTag tag;

    public Project() {
    }
}
