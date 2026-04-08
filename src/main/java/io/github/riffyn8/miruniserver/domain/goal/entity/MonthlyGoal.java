package io.github.riffyn8.miruniserver.domain.goal.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "monthly_goals")
public class MonthlyGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "annual_goal_id", nullable = false)
    private AnnualGoal annualGoal;

    @Column(name = "year_month")
    private String yearMonth;

    @Column
    private String title;

    @Column
    private String content;

    @Column(name = "achievement_rate")
    private Integer achievementRate;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
