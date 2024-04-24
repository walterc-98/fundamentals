package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.entity.Release;
import com.pluralsight.fundamentals.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService{
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> listRelease() {
        return releaseRepository.findAll();
    }
}
