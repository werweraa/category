package com.category.database.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberAuthorityTypeCode {
    ROLE_USER("사용자"),
    ROLE_ADMIN("관리자"),
    ;

    private final String description;
}
