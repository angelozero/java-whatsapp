package com.angelozero.javawhatsapp.entrypoint.mapper;

import com.angelozero.javawhatsapp.entrypoint.rest.MessageRequest;
import com.angelozero.javawhatsapp.entrypoint.rest.MessageResponse;
import com.angelozero.javawhatsapp.usecase.domain.Message;
import com.angelozero.javawhatsapp.usecase.domain.Response;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageRestMapper {

    Message toMessage(MessageRequest request);

    MessageResponse toResponse(Response response);
}
