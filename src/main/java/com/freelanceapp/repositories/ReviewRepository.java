package com.freelanceapp.repositories;

import com.freelanceapp.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByAuthor_Id(Long authorId);
    List<Review> findByRecipient_Id(Long recipientId);
}

