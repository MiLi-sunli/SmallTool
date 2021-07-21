package com.mnc.smalltool.function.DTO;

import lombok.Data;

import java.util.List;

@Data
public class JsonForFrontDTO {
    private String id;

    private Integer level;

    private String name;

    private String parentId;

    private String parentName;

    private List<JsonForFrontDTO> child;

    private String value;

    private String dataType;
}
