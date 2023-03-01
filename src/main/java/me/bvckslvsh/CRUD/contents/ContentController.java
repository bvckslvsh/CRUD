package me.bvckslvsh.CRUD.contents;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api")
public class ContentController {

    private final ContentService contentService;

    @GetMapping(path = "contents")
    public List<Content> list() {
        return contentService.list();
    }

    @PostMapping(path = "contents/item")
    public void add(@RequestBody Content content) {
        contentService.add(content);
    }

    @DeleteMapping(path = "contents/item/{Id}")
    public void delete(@PathVariable Long Id) {
        contentService.delete(Id);
    }

    @PutMapping(path = "contents/item")
    public void update(@RequestBody Content content) {
        contentService.update(content);
    }

}
