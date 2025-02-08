package linker.entites;

import java.util.UUID;


public class UserSkills {


    private Long id;


    private User user;

    private String skillName;


    private ProficiencyLevel proficiencyLevel;

    public UserSkills() {}

    public UserSkills(User user, String skillName, ProficiencyLevel proficiencyLevel) {
        this.user = user;
        this.skillName = skillName;
        this.proficiencyLevel = proficiencyLevel;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getSkillName() { return skillName; }
    public void setSkillName(String skillName) { this.skillName = skillName; }

    public ProficiencyLevel getProficiencyLevel() { return proficiencyLevel; }
    public void setProficiencyLevel(ProficiencyLevel proficiencyLevel) { this.proficiencyLevel = proficiencyLevel; }

    public enum ProficiencyLevel {
        BEGINNER,
        INTERMEDIATE,
        EXPERT
    }
}
