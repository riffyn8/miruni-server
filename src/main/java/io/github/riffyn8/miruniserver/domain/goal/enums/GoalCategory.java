package io.github.riffyn8.miruniserver.domain.goal.enums;

public enum GoalCategory {
    CAREER("💼", "취업/개발"),
    HEALTH("💪", "건강"),
    HABIT("📝", "습관"),
    FINANCE("💰", "재정");

    private final String icon;
    private final String description;

    GoalCategory(String icon, String description) {
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
