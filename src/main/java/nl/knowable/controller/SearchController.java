package nl.knowable.controller;

import nl.knowable.model.Text;
import nl.knowable.repository.TextRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    private final Logger slf4jLogger = LoggerFactory.getLogger(MainController.class);

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

    @RequestMapping(value = "/text", method = RequestMethod.POST)
    public
    @ResponseBody
    void addText(@RequestBody Text newScenario) {
        textRepository.save(newScenario);
        slf4jLogger.info("Title: {}",newScenario.getTitle());
        slf4jLogger.info("Content: {}",newScenario.getContent());
        slf4jLogger.info("ID: {}",newScenario.getId());
    }


}

