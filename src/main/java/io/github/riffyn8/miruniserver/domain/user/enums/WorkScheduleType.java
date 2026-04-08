package io.github.riffyn8.miruniserver.domain.user.enums;

public enum WorkScheduleType {
    FIXED("🏢", "고정 근무"),
    SHIFT("🔄", "교대 근무"),
    FREE("🏠", "자유");

    private final String icon;
    private final String description;

    WorkScheduleType(String icon, String description) {
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
