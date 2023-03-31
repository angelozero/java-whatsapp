package com.angelozero.javawhatsapp.usecase.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private Integer id;
    private String sent;
    private String message;

}
