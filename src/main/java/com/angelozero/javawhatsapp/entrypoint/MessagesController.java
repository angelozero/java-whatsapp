package com.angelozero.javawhatsapp.entrypoint;

import com.angelozero.javawhatsapp.entrypoint.mapper.MessageRestMapper;
import com.angelozero.javawhatsapp.entrypoint.rest.MessageRequest;
import com.angelozero.javawhatsapp.entrypoint.rest.MessageResponse;
import com.angelozero.javawhatsapp.usecase.SendMessage;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
@AllArgsConstructor
public class MessagesController {

    MessageRestMapper mapper;
    SendMessage sendMessage;

    @PostMapping(value = "/chat", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageResponse> sendMessage(@RequestBody MessageRequest messageRequest) {
        MessageResponse response = mapper.toResponse(sendMessage.execute(mapper.toMessage(messageRequest)));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
