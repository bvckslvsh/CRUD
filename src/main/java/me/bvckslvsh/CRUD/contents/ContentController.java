package me.bvckslvsh.CRUD.contents;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/contents")
public class ContentController {

    private final ContentService contentService;

    @GetMapping(path = "list")
    public List<Content> list() {
        return contentService.list();
    }

    @PostMapping(path = "item")
    public void add(@RequestBody Content content) {
        contentService.add(content);
    }

}
