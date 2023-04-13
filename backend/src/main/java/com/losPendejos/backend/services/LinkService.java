package com.losPendejos.backend.services;

import com.losPendejos.backend.models.Link;
import com.losPendejos.backend.models.LinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinkService {
    private final LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> findAllLinks() {
        return linkRepository.findAll();
    }

    public Optional<Link> findLinkById(Long id) {
        return linkRepository.findById(id);
    }

    public void saveLink(Link link) {
        linkRepository.save(link);
    }

    public void deleteLinkById(Long id) {
        linkRepository.deleteById(id);
    }
}

