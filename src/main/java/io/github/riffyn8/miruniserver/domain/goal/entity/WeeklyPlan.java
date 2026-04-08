package io.github.riffyn8.miruniserver.domain.goal.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "weekly_plans")
public class WeeklyPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "monthly_goal_id", nullable = false)
    private MonthlyGoal monthlyGoal;

    @Column(name = "week_start_date")
    private LocalDate weekStartDate;

    @Column(name = "week_end_date")
    private LocalDate weekEndDate;

    @Column
    private String content;

    @Column(name = "achievement_rate")
    private Integer achievementRate;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
