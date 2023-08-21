package com.freelanceapp.services.impl;

import com.freelanceapp.models.Message;
import com.freelanceapp.repositories.MessageRepository;
import com.freelanceapp.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private MessageRepository messageRepository;

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<Message> getMessageById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }

    @Override
    public List<Message> getMessagesBySenderId(Long senderId) {
        return messageRepository.findBySender_Id(senderId);
    }

    @Override
    public List<Message> getMessagesByRecipientId(Long recipientId) {
        return messageRepository.findByRecipient_Id(recipientId);
    }
}

