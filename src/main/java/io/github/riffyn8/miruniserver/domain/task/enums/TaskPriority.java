package io.github.riffyn8.miruniserver.domain.task.enums;

public enum TaskPriority {
    DO("🔴", "중요하고 긴급함 - 즉시 실행"),
    SCHEDULE("🟡", "중요하지만 긴급하지 않음 - 일정 잡기"),
    DELEGATE("🟢", "긴급하지만 중요하지 않음 - 나중에"),
    ELIMINATE("⚪", "중요하지도 긴급하지도 않음 - 제거 고려");

    private final String icon;
    private final String description;

    TaskPriority(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }
}
