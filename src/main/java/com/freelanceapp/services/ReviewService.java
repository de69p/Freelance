package com.freelanceapp.services;

import com.freelanceapp.models.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    List<Review> getAllReviews();

    Optional<Review> getReviewById(Long id);

    Review saveReview(Review review);

    void deleteReview(Long id);

    List<Review> getReviewsByAuthorId(Long authorId);

    List<Review> getReviewsByRecipientId(Long recipientId);
}

