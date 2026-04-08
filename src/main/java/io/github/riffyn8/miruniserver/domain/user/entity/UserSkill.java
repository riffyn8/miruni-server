package io.github.riffyn8.miruniserver.domain.user.entity;

import io.github.riffyn8.miruniserver.domain.user.enums.SkillCategory;
import io.github.riffyn8.miruniserver.domain.user.enums.SkillLevel;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_skills")
public class UserSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column
    private SkillCategory category;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    @Column
    private SkillLevel level;

    @Column
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
