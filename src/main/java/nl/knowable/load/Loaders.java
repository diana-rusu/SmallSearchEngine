package nl.knowable.load;
import nl.knowable.model.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.PostConstruct;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @PostConstruct
    @Transactional
    public void loadAll(){
        operations.putMapping(Text.class);
    }

}
