package me.dio.controller.dto;

import me.dio.domain.model.User;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record UserDto(
        Long id,
        String name,
        AccountDto account,
        CardDto card,
        List<FeatureDto> features,
        List<NewsDto> news) {

    public UserDto(User model) {
        this(
                model.getId(),
                model.getName(),
                Optional.ofNulla
