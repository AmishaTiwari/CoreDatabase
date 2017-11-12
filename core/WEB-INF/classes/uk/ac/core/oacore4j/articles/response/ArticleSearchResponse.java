
package uk.ac.core.oacore4j.articles.response;

import com.fasterxml.jackson.annotation.*;
import uk.ac.core.oacore4j.articles.response.json.Article;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "totalHits",
    "data"
})
public class ArticleSearchResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("totalHits")
    private Integer totalHits;
    @JsonProperty("data")
    private List<Article> data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("totalHits")
    public Integer getTotalHits() {
        return totalHits;
    }

    @JsonProperty("totalHits")
    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    @JsonProperty("data")
    public List<Article> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Article> data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
