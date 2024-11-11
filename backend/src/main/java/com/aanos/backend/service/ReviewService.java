package com.aanos.backend.service;

import com.aanos.backend.entity.Review;
import com.aanos.backend.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Customer not found with ID: " + id));
    }

    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long id, Review reviewDetails){
        Review updatedReview = getReviewById(id);
        updatedReview.setReviewDescription(reviewDetails.getReviewDescription());
        return reviewRepository.save(updatedReview);
    }

    public void deleteReviewById(Long id) { reviewRepository.deleteById(id); }

}
