package me.dio.controller.dto;

import me.dio.domain.model.Feature;

public record FeatureDto(Long id, String icon, String description) {

    public FeatureDto(Feature model) {
        this(model.get
