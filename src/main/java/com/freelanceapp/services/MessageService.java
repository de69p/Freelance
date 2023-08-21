package com.freelanceapp.services;

import com.freelanceapp.models.Message;

import java.util.List;
import java.util.Optional;

public interface MessageService {

    List<Message> getAllMessages();

    Optional<Message> getMessageById(Long id);

    Message saveMessage(Message message);

    void deleteMessage(Long id);

    List<Message> getMessagesBySenderId(Long senderId);

    List<Message> getMessagesByRecipientId(Long recipientId);
}

