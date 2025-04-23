package com.plantory.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Plant {
    private Long id;
    private String name;
    private String scientificName;
    private String description;
    private Integer price;
    private Integer stock;
    private String thumbnailImage;
    private String category;
    private String careLevel; // 초급, 중급, 고급
    private String lightRequirement; // 낮은, 중간, 높은
    private String waterRequirement; // 낮은, 중간, 높은
    private String humidity; // 낮은, 중간, 높은
    private String growthRate; // 느린, 중간, 빠른
    private Boolean isPetFriendly;
    private Boolean isAirPurifying;
    private String maintenanceTips;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}