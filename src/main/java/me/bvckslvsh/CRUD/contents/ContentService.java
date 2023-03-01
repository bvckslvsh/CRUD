package me.bvckslvsh.CRUD.contents;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContentService {

    private final ContentRepository contentRepository;

    public List<Content> list() {
        return contentRepository.findAll();
    }

    public void add(Content content) {
        contentRepository.save(content);
    }
}
