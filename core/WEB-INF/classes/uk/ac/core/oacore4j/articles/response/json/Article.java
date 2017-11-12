
package uk.ac.core.oacore4j.articles.response.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "authors",
    "citations",
    "contributors",
    "datePublished",
    "description",
    "fullText",
    "identifiers",
    "language",
    "relations",
"uk/ac/core/oacore4j/repositories",
    "similarities",
    "subjects",
    "title",
    "topics",
    "types",
    "year",
    "duplicates",
    "fulltextUrls",
    "rawRecordXml",
    "fulltextIdentifier",
    "oai"
})
public class Article implements Serializable {

    @JsonProperty("id")
    private String id;
    @JsonProperty("authors")
    private List<String> authors = null;
    @JsonProperty("citations")
    private List<Object> citations = null;
    @JsonProperty("contributors")
    private List<Object> contributors = null;
    @JsonProperty("datePublished")
    private String datePublished;
    @JsonProperty("description")
    private String description;
    @JsonProperty("fullText")
    private String fullText;
    @JsonProperty("identifiers")
    private List<String> identifiers = null;
    @JsonProperty("language")
    private Language language;
    @JsonProperty("relations")
    private List<Object> relations = null;
    @JsonProperty("uk/ac/core/oacore4j/repositories")
    private List<Repository> repositories = null;
    @JsonProperty("similarities")
    private List<Similarity> similarities = null;
    @JsonProperty("subjects")
    private List<Object> subjects = null;
    @JsonProperty("title")
    private String title;
    @JsonProperty("topics")
    private List<Object> topics = null;
    @JsonProperty("types")
    private List<Object> types = null;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("duplicates")
    private List<Object> duplicates = null;
    @JsonProperty("fulltextUrls")
    private List<String> fulltextUrls = null;
    @JsonProperty("rawRecordXml")
    private RawRecordXml rawRecordXml;
    @JsonProperty("fulltextIdentifier")
    private String fulltextIdentifier;
    @JsonProperty("oai")
    private String oai;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("authors")
    public List<String> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @JsonProperty("citations")
    public List<Object> getCitations() {
        return citations;
    }

    @JsonProperty("citations")
    public void setCitations(List<Object> citations) {
        this.citations = citations;
    }

    @JsonProperty("contributors")
    public List<Object> getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(List<Object> contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("datePublished")
    public String getDatePublished() {
        return datePublished;
    }

    @JsonProperty("datePublished")
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("fullText")
    public String getFullText() {
        return fullText;
    }

    @JsonProperty("fullText")
    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    @JsonProperty("identifiers")
    public List<String> getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("identifiers")
    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @JsonProperty("language")
    public Language getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Language language) {
        this.language = language;
    }

    @JsonProperty("relations")
    public List<Object> getRelations() {
        return relations;
    }

    @JsonProperty("relations")
    public void setRelations(List<Object> relations) {
        this.relations = relations;
    }

    @JsonProperty("uk/ac/core/oacore4j/repositories")
    public List<Repository> getRepositories() {
        return repositories;
    }

    @JsonProperty("uk/ac/core/oacore4j/repositories")
    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    @JsonProperty("similarities")
    public List<Similarity> getSimilarities() {
        return similarities;
    }

    @JsonProperty("similarities")
    public void setSimilarities(List<Similarity> similarities) {
        this.similarities = similarities;
    }

    @JsonProperty("subjects")
    public List<Object> getSubjects() {
        return subjects;
    }

    @JsonProperty("subjects")
    public void setSubjects(List<Object> subjects) {
        this.subjects = subjects;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("topics")
    public List<Object> getTopics() {
        return topics;
    }

    @JsonProperty("topics")
    public void setTopics(List<Object> topics) {
        this.topics = topics;
    }

    @JsonProperty("types")
    public List<Object> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<Object> types) {
        this.types = types;
    }

    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    @JsonProperty("duplicates")
    public List<Object> getDuplicates() {
        return duplicates;
    }

    @JsonProperty("duplicates")
    public void setDuplicates(List<Object> duplicates) {
        this.duplicates = duplicates;
    }

    @JsonProperty("fulltextUrls")
    public List<String> getFulltextUrls() {
        return fulltextUrls;
    }

    @JsonProperty("fulltextUrls")
    public void setFulltextUrls(List<String> fulltextUrls) {
        this.fulltextUrls = fulltextUrls;
    }

    @JsonProperty("rawRecordXml")
    public RawRecordXml getRawRecordXml() {
        return rawRecordXml;
    }

    @JsonProperty("rawRecordXml")
    public void setRawRecordXml(RawRecordXml rawRecordXml) {
        this.rawRecordXml = rawRecordXml;
    }

    @JsonProperty("fulltextIdentifier")
    public String getFulltextIdentifier() {
        return fulltextIdentifier;
    }

    @JsonProperty("fulltextIdentifier")
    public void setFulltextIdentifier(String fulltextIdentifier) {
        this.fulltextIdentifier = fulltextIdentifier;
    }

    @JsonProperty("oai")
    public String getOai() {
        return oai;
    }

    @JsonProperty("oai")
    public void setOai(String oai) {
        this.oai = oai;
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
