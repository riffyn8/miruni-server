package io.github.riffyn8.miruniserver.domain.user.enums;

public enum SkillLevel {
    BEGINNER("🌱", "입문"),
    INTERMEDIATE("🌿️", "중급"),
    ADVANCED("🌳", "고급"),
    EXPERT("🏆", "전문가");

    private final String icon;
    private final String description;

    SkillLevel(String icon, String description) {
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
