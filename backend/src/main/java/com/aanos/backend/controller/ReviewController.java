package com.aanos.backend.controller;


import com.aanos.backend.entity.Review;
import com.aanos.backend.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;


//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping("/reviews/customer/{id}")
//    public Review getReviewByCustomer(@PathVariable Long customerId) {
//        List<Review> reviews = new ArrayList<Review>();
//        reviews = reviewService.getAllReviews();
//        return reviewService.getReviewByCustomer(customerId);
//    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/reviews")
    public Review createReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/reviews/{id}")
    public ResponseEntity<Review> updateReview(@PathVariable Long id, @RequestBody Review reviewDetails){
        return ResponseEntity.ok(reviewService.updateReview(id, reviewDetails));
    }

    @DeleteMapping("/reviews/{id}")
    public ResponseEntity<Review> deleteReviewById(@PathVariable Long id){
        reviewService.deleteReviewById(id);
        return ResponseEntity.noContent().build();
    }


}
