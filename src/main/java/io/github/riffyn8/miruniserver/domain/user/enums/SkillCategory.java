package io.github.riffyn8.miruniserver.domain.user.enums;

public enum SkillCategory {
    LANGUAGE("📝", "프로그래밍 언어"),
    FRAMEWORK("🏗️", "프레임워크"),
    DB("💾", "데이터베이스"),
    TOOL("🔧", "개발 도구"),
    ETC("📦", "기타");

    private final String icon;
    private final String description;

    SkillCategory(String icon, String description) {
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
