package com.freelanceapp.repositories;

import com.freelanceapp.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findBySender_Id(Long senderId);
    List<Message> findByRecipient_Id(Long recipientId);
}

