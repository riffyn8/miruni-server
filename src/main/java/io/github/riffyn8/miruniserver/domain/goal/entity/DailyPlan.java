package io.github.riffyn8.miruniserver.domain.goal.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "daily_plans")
public class DailyPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "weekly_plan_id", nullable = false)
    private WeeklyPlan weeklyPlan;

    @Column(name = "plan_date", nullable = false)
    private LocalDate planDate;

    @Column(name = "plan_content", columnDefinition = "TEXT")
    private String planContent;         // Plan - AI 작성 오늘 계획

    @Column(name = "see_content", columnDefinition = "TEXT")
    private String seeContent;          // See - KPT 회고

    @Column(name = "achievement_rate")
    private Integer achievementRate;    // 0~100

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
