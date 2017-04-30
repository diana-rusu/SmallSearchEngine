package nl.knowable.repository;
import nl.knowable.model.Text;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.List;

public interface TextRepository extends ElasticsearchRepository<Text, Long> {
    List<Text> findByTitle(String text);
    List<Text> findAllByOrderByIdAsc();
}