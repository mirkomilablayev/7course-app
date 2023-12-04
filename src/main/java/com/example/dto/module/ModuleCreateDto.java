package com.example.dto.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ModuleCreateDto {

    private Long courseId;
    private String name;

}
