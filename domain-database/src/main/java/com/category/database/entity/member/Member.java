package com.category.database.entity.member;

import com.category.database.entity.BaseEntity;
import com.category.database.entity.enums.MemberAuthorityTypeCode;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false, updatable = false, columnDefinition = "INT UNSIGNED")
    private Long id;

    @Comment("사용자ID")
    @Column(length = 20, nullable = false, unique = true)
    private String userId;

    @Comment("패스워드")
    @Column(length = 20, nullable = false)
    private String password;

    @Comment("권한유형코드 ROLE_USER : 사용자, ROLE_ADMIN : 관리자")
    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    @Enumerated(EnumType.STRING)
    private MemberAuthorityTypeCode groupCode;
}
