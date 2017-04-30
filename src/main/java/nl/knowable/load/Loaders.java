package nl.knowable.load;


import nl.knowable.model.Text;
import nl.knowable.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    TextRepository textRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        operations.putMapping(Text.class);
        System.out.println("Loading Data");
        textRepository.save(getData());
        System.out.printf("Loading Completed");

    }

    private List<Text> getData() {
        List<Text> texts = new ArrayList<>();
        texts.add(new Text("sometitle","Some Content", 1L));
        texts.add(new Text("sometitle2","Some Content", 1L));
        texts.add(new Text("sometitle3","Some Content", 3L));

        return texts;
    }
}
