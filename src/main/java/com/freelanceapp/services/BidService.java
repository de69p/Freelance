package com.freelanceapp.services;

import com.freelanceapp.models.Bid;

import java.util.List;
import java.util.Optional;

public interface BidService {

    List<Bid> getAllBids();
    Optional<Bid> getBidById(Long id);
    Bid saveBid(Bid bid);
    void deleteBid(Long id);
    List<Bid> getBidsByProjectId(Long projectId);
    List<Bid> getBidsByFreelancerId(Long freelancerId);
}
