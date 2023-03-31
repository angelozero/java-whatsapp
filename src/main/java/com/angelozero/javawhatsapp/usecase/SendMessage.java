package com.angelozero.javawhatsapp.usecase;

import com.angelozero.javawhatsapp.config.MessageConfiguration;
import com.angelozero.javawhatsapp.usecase.constants.MessageConstants;
import com.angelozero.javawhatsapp.usecase.domain.Message;
import com.angelozero.javawhatsapp.usecase.domain.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendMessage {


    private final MessageConfiguration messageConfiguration;

    public Response execute(Message message) {
        Unirest.setTimeouts(0, 0);

        try {
            HttpResponse<String> response = Unirest.post(messageConfiguration.getUrl() +
                            messageConfiguration.getInstanceId() +
                            messageConfiguration.getPath())
                    .header(MessageConstants.CONTENT_TYPE, MessageConstants.X_WWW_FORM_URLENCODED)
                    .field(MessageConstants.TOKEN, messageConfiguration.getToken())
                    .field(MessageConstants.TO, message.getTo())
                    .field(MessageConstants.BODY, message.getBody())
                    .asString();

            return new ObjectMapper().readValue(response.getBody(), Response.class);

        } catch (UnirestException | JsonProcessingException e) {
            throw new RuntimeException("Error to send message: " + e.getMessage());
        }
    }
}
