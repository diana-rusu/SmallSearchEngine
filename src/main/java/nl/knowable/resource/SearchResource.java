package nl.knowable.resource;

import nl.knowable.model.Text;
import nl.knowable.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/search")
public class SearchResource {

    @Autowired
    TextRepository textRepository;

    @GetMapping(value = "/name/{title}")
    public List<Text> searchTitle(@PathVariable final String title) {
        return textRepository.findByTitle(title);
    }

    @GetMapping(value = "/all")
    public List<Text> searchAll() {
        List<Text> textsList = new ArrayList<>();
        Iterable<Text> texts = textRepository.findAll();
        texts.forEach(textsList::add);
        return textsList;
    }


}

