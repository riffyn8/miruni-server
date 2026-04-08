package io.github.riffyn8.miruniserver.domain.project.enums;

public enum PhaseStatus {
    TODO("📋", "예정"),
    IN_PROGRESS("🔄", "진행 중"),
    DONE("✅", "완료");

    private final String icon;
    private final String description;

    PhaseStatus(String icon, String description) {
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
