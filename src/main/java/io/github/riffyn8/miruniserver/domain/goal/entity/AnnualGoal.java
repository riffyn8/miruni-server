package io.github.riffyn8.miruniserver.domain.goal.entity;

import io.github.riffyn8.miruniserver.domain.goal.enums.GoalCategory;
import io.github.riffyn8.miruniserver.domain.user.entity.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "annual_goals")
public class AnnualGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    private Integer year;

    @Enumerated(EnumType.STRING)
    @Column
    private GoalCategory category;

    @Column
    private String title;

    @Column
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
