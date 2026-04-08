package io.github.riffyn8.miruniserver.domain.project.enums;

public enum ProjectStatus {
    ACTIVE("🔥", "진행 중"),
    COMPLETED("✅", "완료"),
    ARCHIVED("📦", "보관");

    private final String icon;
    private final String description;

    ProjectStatus(String icon, String description) {
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
