package com.angelozero.javawhatsapp.entrypoint.mapper;

import com.angelozero.javawhatsapp.entrypoint.rest.MessageRequest;
import com.angelozero.javawhatsapp.entrypoint.rest.MessageResponse;
import com.angelozero.javawhatsapp.entrypoint.rest.MessageResponse.MessageResponseBuilder;
import com.angelozero.javawhatsapp.usecase.domain.Message;
import com.angelozero.javawhatsapp.usecase.domain.Message.MessageBuilder;
import com.angelozero.javawhatsapp.usecase.domain.Response;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-31T15:22:52-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.2 (Homebrew)"
)
@Component
public class MessageRestMapperImpl implements MessageRestMapper {

    @Override
    public Message toMessage(MessageRequest request) {
        if ( request == null ) {
            return null;
        }

        MessageBuilder message = Message.builder();

        message.to( request.getTo() );
        message.body( request.getBody() );

        return message.build();
    }

    @Override
    public MessageResponse toResponse(Response response) {
        if ( response == null ) {
            return null;
        }

        MessageResponseBuilder messageResponse = MessageResponse.builder();

        messageResponse.id( response.getId() );
        messageResponse.sent( response.getSent() );
        messageResponse.message( response.getMessage() );

        return messageResponse.build();
    }
}
