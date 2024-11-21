package com.outofcity.server.dto.activity;


public record ActivityFavoritiesResponseDto(
        Long id,
        Long generalMemberId,
        Long activityId
) {
    public static ActivityFavoritiesResponseDto of(Long id, Long generalMemberId, Long activityId) {
        return new ActivityFavoritiesResponseDto(id, generalMemberId, activityId);
    }
}