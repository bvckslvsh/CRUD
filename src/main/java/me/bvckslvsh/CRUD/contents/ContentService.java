package me.bvckslvsh.CRUD.contents;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void delete(Long id) {
        contentRepository.deleteById(id);
    }

    public void update(Content content) {
        Optional<Content> estimated = contentRepository.findById(content.getId());
        if(estimated.isPresent()){
            Content edited = estimated.get();
            if(!content.getName().isEmpty()){
                edited.setName(content.getName());
            }
            if(content.getDescription() != null){
                edited.setDescription(content.getDescription());
            }
            contentRepository.save(edited);
        }
    }
}
