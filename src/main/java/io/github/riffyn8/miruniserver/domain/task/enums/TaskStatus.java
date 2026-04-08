package io.github.riffyn8.miruniserver.domain.task.enums;

public enum TaskStatus {
    TODO("📋", "할 일"),
    IN_PROGRESS("🔄", "진행 중"),
    DONE("✅", "완료");

    private final String icon;
    private final String description;

    TaskStatus(String icon, String description) {
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
