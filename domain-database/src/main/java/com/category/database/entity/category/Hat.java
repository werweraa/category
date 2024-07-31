package com.category.database.entity.category;

import com.category.database.entity.BaseEntity;
import com.category.database.entity.enums.Brand;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
public class Hat extends BaseEntity {
    @Id
    @Comment("모자Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hat_id", nullable = false, updatable = false, columnDefinition = "INT UNSIGNED")
    private Long id;

    @Comment("가격")
    @Column(updatable = false, columnDefinition = "DECIMAL(34,18) UNSIGNED NOT NULL")
    private BigDecimal amount;

    @Comment("브랜드")
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    private Brand brand;
}
