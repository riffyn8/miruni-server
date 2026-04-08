package io.github.riffyn8.miruniserver.domain.task.entity;

import io.github.riffyn8.miruniserver.domain.goal.entity.DailyPlan;
import io.github.riffyn8.miruniserver.domain.goal.enums.GoalCategory;
import io.github.riffyn8.miruniserver.domain.project.entity.Project;
import io.github.riffyn8.miruniserver.domain.project.entity.ProjectPhase;
import io.github.riffyn8.miruniserver.domain.task.enums.TaskPriority;
import io.github.riffyn8.miruniserver.domain.task.enums.TaskStatus;
import io.github.riffyn8.miruniserver.domain.user.entity.User;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daily_plan_id")
    private DailyPlan dailyPlan;            // nullable - 직접 추가한 경우 없음

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;            // nullable - 프로젝트 태스크인 경우

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phase_id")
    private ProjectPhase phase;         // nullable - 단계 연결

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Task parent;                    // nullable - SubTask용 자기참조

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GoalCategory category;

    @Column(nullable = false)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskPriority priority;

    @Column(name = "planned_start_time")
    private LocalTime plannedStartTime;     // 계획 시작 시간

    @Column(name = "planned_end_time")
    private LocalTime plannedEndTime;       // 계획 종료 시간

    @Column(name = "actual_start_time")
    private LocalTime actualStartTime;      // 실제 시작 시간 (Do)

    @Column(name = "actual_end_time")
    private LocalTime actualEndTime;        // 실제 종료 시간 (Do)

    @Column(name = "is_ai_generated", nullable = false)
    private Boolean isAiGenerated = false;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
