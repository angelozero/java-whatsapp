package com.angelozero.javawhatsapp.entrypoint.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequest {

    private String to;
    private String body;

}
