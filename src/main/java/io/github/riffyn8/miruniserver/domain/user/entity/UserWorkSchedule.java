package io.github.riffyn8.miruniserver.domain.user.entity;

import io.github.riffyn8.miruniserver.domain.user.enums.WorkScheduleType;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "user_work_schedules")
public class UserWorkSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private WorkScheduleType type;

    @Column(nullable = false)
    private String name;            // "A조", "B조", "평일고정" 등

    @Column(name = "work_start_time")
    private LocalTime workStartTime; // nullable (휴무일 경우)

    @Column(name = "work_end_time")
    private LocalTime workEndTime;   // nullable (휴무일 경우)

    @Column(name = "is_off_day", nullable = false)
    private Boolean isOffDay = false;

    @Column(name = "available_study_hours")
    private Integer availableStudyHours;  // 해당 스케줄의 공부 가능 시간

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
