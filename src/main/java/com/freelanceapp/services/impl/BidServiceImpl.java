package com.freelanceapp.services.impl;

import com.freelanceapp.models.Bid;
import com.freelanceapp.repositories.BidRepository;
import com.freelanceapp.services.BidService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BidServiceImpl implements BidService {

    private BidRepository bidRepository;

    public List<Bid> getAllBids() {
        return bidRepository.findAll();
    }

    public Optional<Bid> getBidById(Long id) {
        return bidRepository.findById(id);
    }

    public Bid saveBid(Bid bid) {
        return bidRepository.save(bid);
    }

    public void deleteBid(Long id) {
        bidRepository.deleteById(id);
    }

    public List<Bid> getBidsByProjectId(Long projectId) {
        return bidRepository.findByProjectId(projectId);
    }

    public List<Bid> getBidsByFreelancerId(Long freelancerId) {
        return bidRepository.findByFreelancerId(freelancerId);
    }
}

