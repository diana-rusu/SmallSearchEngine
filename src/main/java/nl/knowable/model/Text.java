package nl.knowable.model;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by Diana on 4/29/2017.
 */
@Document(indexName = "text", type = "text", shards = 1)
public class Text {
    private String title;
    private String content;
    private Long id;

    public Text(String title, String content, Long id) {
        this.title = title;
        this.content = content;
        this.id = id;
    }

    public Text(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
