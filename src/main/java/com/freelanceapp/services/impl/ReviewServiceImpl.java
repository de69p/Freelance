package com.freelanceapp.services.impl;

import com.freelanceapp.models.Review;
import com.freelanceapp.repositories.ReviewRepository;
import com.freelanceapp.services.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public List<Review> getReviewsByAuthorId(Long authorId) {
        return reviewRepository.findByAuthor_Id(authorId);
    }

    @Override
    public List<Review> getReviewsByRecipientId(Long recipientId) {
        return reviewRepository.findByRecipient_Id(recipientId);
    }
}

