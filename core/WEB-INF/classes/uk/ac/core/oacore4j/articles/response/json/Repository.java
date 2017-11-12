
package uk.ac.core.oacore4j.articles.response.json;

import java.util.HashMap;
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
    "openDoarId",
    "name",
    "uri",
    "uriJournals",
    "physicalName",
    "source",
    "software",
    "metadataFormat",
    "description",
    "journal",
    "pdfStatus",
    "nrUpdates",
    "disabled",
    "lastUpdateTime",
    "metadataRecordCount",
    "metadataDeletedRecordCount",
    "metadataLinkCount",
    "metadataSize",
    "journalMetadataSize",
    "metadataAge",
    "journalMetadataAge",
    "metadataInIndexCount",
    "metadataDeletedInIndexCount",
    "metadataAlloweInIndexCount",
    "metadataDisabledInIndexCount",
    "metadataExtractionDate",
    "journalMetadataExtractionDate",
    "databaseRecordCount",
    "databaseDeletedRecordCount",
    "databasePdfLinkCount",
    "databasePdfCount",
    "databaseDeletedPdfCount",
    "hardDrivePdfSize",
    "hardDrivePdfCount",
    "hardDriveDeletedPdfCount",
    "databaseTextCount",
    "databaseTextNotDeletedCount",
    "hardDriveTextCount",
    "hardDriveDeletedTextCount",
    "databaseIndexCount",
    "indexRecordCount",
    "indexJournalCount",
    "indexTextCount",
    "metadataOnlyIndex",
    "indexTextCountDB",
    "indexedPdfDB",
    "indexedDisabledDB",
    "indexTextNotDeletedCount",
    "hardDriveCitationFiles",
    "citationFilesDb",
    "crawlingLimit",
    "citationCount",
    "citationWithDocCount",
    "citationDoiCount",
    "documentDoiCount",
    "documentDoiWithFulltextCount",
    "repositoryLocation"
})
public class Repository implements Serializable{

    @JsonProperty("id")
    private String id;
    @JsonProperty("openDoarId")
    private Integer openDoarId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("uri")
    private Object uri;
    @JsonProperty("uriJournals")
    private Object uriJournals;
    @JsonProperty("physicalName")
    private String physicalName;
    @JsonProperty("source")
    private Object source;
    @JsonProperty("software")
    private Object software;
    @JsonProperty("metadataFormat")
    private Object metadataFormat;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("journal")
    private Object journal;
    @JsonProperty("pdfStatus")
    private Object pdfStatus;
    @JsonProperty("nrUpdates")
    private Integer nrUpdates;
    @JsonProperty("disabled")
    private Boolean disabled;
    @JsonProperty("lastUpdateTime")
    private Object lastUpdateTime;
    @JsonProperty("metadataRecordCount")
    private Integer metadataRecordCount;
    @JsonProperty("metadataDeletedRecordCount")
    private Integer metadataDeletedRecordCount;
    @JsonProperty("metadataLinkCount")
    private Integer metadataLinkCount;
    @JsonProperty("metadataSize")
    private Integer metadataSize;
    @JsonProperty("journalMetadataSize")
    private Integer journalMetadataSize;
    @JsonProperty("metadataAge")
    private Object metadataAge;
    @JsonProperty("journalMetadataAge")
    private Object journalMetadataAge;
    @JsonProperty("metadataInIndexCount")
    private Integer metadataInIndexCount;
    @JsonProperty("metadataDeletedInIndexCount")
    private Integer metadataDeletedInIndexCount;
    @JsonProperty("metadataAlloweInIndexCount")
    private Integer metadataAlloweInIndexCount;
    @JsonProperty("metadataDisabledInIndexCount")
    private Integer metadataDisabledInIndexCount;
    @JsonProperty("metadataExtractionDate")
    private Object metadataExtractionDate;
    @JsonProperty("journalMetadataExtractionDate")
    private Object journalMetadataExtractionDate;
    @JsonProperty("databaseRecordCount")
    private Integer databaseRecordCount;
    @JsonProperty("databaseDeletedRecordCount")
    private Integer databaseDeletedRecordCount;
    @JsonProperty("databasePdfLinkCount")
    private Integer databasePdfLinkCount;
    @JsonProperty("databasePdfCount")
    private Integer databasePdfCount;
    @JsonProperty("databaseDeletedPdfCount")
    private Integer databaseDeletedPdfCount;
    @JsonProperty("hardDrivePdfSize")
    private Integer hardDrivePdfSize;
    @JsonProperty("hardDrivePdfCount")
    private Integer hardDrivePdfCount;
    @JsonProperty("hardDriveDeletedPdfCount")
    private Integer hardDriveDeletedPdfCount;
    @JsonProperty("databaseTextCount")
    private Integer databaseTextCount;
    @JsonProperty("databaseTextNotDeletedCount")
    private Integer databaseTextNotDeletedCount;
    @JsonProperty("hardDriveTextCount")
    private Integer hardDriveTextCount;
    @JsonProperty("hardDriveDeletedTextCount")
    private Integer hardDriveDeletedTextCount;
    @JsonProperty("databaseIndexCount")
    private Integer databaseIndexCount;
    @JsonProperty("indexRecordCount")
    private Integer indexRecordCount;
    @JsonProperty("indexJournalCount")
    private Integer indexJournalCount;
    @JsonProperty("indexTextCount")
    private Integer indexTextCount;
    @JsonProperty("metadataOnlyIndex")
    private Integer metadataOnlyIndex;
    @JsonProperty("indexTextCountDB")
    private Integer indexTextCountDB;
    @JsonProperty("indexedPdfDB")
    private Integer indexedPdfDB;
    @JsonProperty("indexedDisabledDB")
    private Integer indexedDisabledDB;
    @JsonProperty("indexTextNotDeletedCount")
    private Integer indexTextNotDeletedCount;
    @JsonProperty("hardDriveCitationFiles")
    private Integer hardDriveCitationFiles;
    @JsonProperty("citationFilesDb")
    private Integer citationFilesDb;
    @JsonProperty("crawlingLimit")
    private Integer crawlingLimit;
    @JsonProperty("citationCount")
    private Integer citationCount;
    @JsonProperty("citationWithDocCount")
    private Integer citationWithDocCount;
    @JsonProperty("citationDoiCount")
    private Integer citationDoiCount;
    @JsonProperty("documentDoiCount")
    private Integer documentDoiCount;
    @JsonProperty("documentDoiWithFulltextCount")
    private Integer documentDoiWithFulltextCount;
    @JsonProperty("repositoryLocation")
    private Object repositoryLocation;
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

    @JsonProperty("openDoarId")
    public Integer getOpenDoarId() {
        return openDoarId;
    }

    @JsonProperty("openDoarId")
    public void setOpenDoarId(Integer openDoarId) {
        this.openDoarId = openDoarId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("uri")
    public Object getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(Object uri) {
        this.uri = uri;
    }

    @JsonProperty("uriJournals")
    public Object getUriJournals() {
        return uriJournals;
    }

    @JsonProperty("uriJournals")
    public void setUriJournals(Object uriJournals) {
        this.uriJournals = uriJournals;
    }

    @JsonProperty("physicalName")
    public String getPhysicalName() {
        return physicalName;
    }

    @JsonProperty("physicalName")
    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }

    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    @JsonProperty("software")
    public Object getSoftware() {
        return software;
    }

    @JsonProperty("software")
    public void setSoftware(Object software) {
        this.software = software;
    }

    @JsonProperty("metadataFormat")
    public Object getMetadataFormat() {
        return metadataFormat;
    }

    @JsonProperty("metadataFormat")
    public void setMetadataFormat(Object metadataFormat) {
        this.metadataFormat = metadataFormat;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("journal")
    public Object getJournal() {
        return journal;
    }

    @JsonProperty("journal")
    public void setJournal(Object journal) {
        this.journal = journal;
    }

    @JsonProperty("pdfStatus")
    public Object getPdfStatus() {
        return pdfStatus;
    }

    @JsonProperty("pdfStatus")
    public void setPdfStatus(Object pdfStatus) {
        this.pdfStatus = pdfStatus;
    }

    @JsonProperty("nrUpdates")
    public Integer getNrUpdates() {
        return nrUpdates;
    }

    @JsonProperty("nrUpdates")
    public void setNrUpdates(Integer nrUpdates) {
        this.nrUpdates = nrUpdates;
    }

    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @JsonProperty("lastUpdateTime")
    public Object getLastUpdateTime() {
        return lastUpdateTime;
    }

    @JsonProperty("lastUpdateTime")
    public void setLastUpdateTime(Object lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @JsonProperty("metadataRecordCount")
    public Integer getMetadataRecordCount() {
        return metadataRecordCount;
    }

    @JsonProperty("metadataRecordCount")
    public void setMetadataRecordCount(Integer metadataRecordCount) {
        this.metadataRecordCount = metadataRecordCount;
    }

    @JsonProperty("metadataDeletedRecordCount")
    public Integer getMetadataDeletedRecordCount() {
        return metadataDeletedRecordCount;
    }

    @JsonProperty("metadataDeletedRecordCount")
    public void setMetadataDeletedRecordCount(Integer metadataDeletedRecordCount) {
        this.metadataDeletedRecordCount = metadataDeletedRecordCount;
    }

    @JsonProperty("metadataLinkCount")
    public Integer getMetadataLinkCount() {
        return metadataLinkCount;
    }

    @JsonProperty("metadataLinkCount")
    public void setMetadataLinkCount(Integer metadataLinkCount) {
        this.metadataLinkCount = metadataLinkCount;
    }

    @JsonProperty("metadataSize")
    public Integer getMetadataSize() {
        return metadataSize;
    }

    @JsonProperty("metadataSize")
    public void setMetadataSize(Integer metadataSize) {
        this.metadataSize = metadataSize;
    }

    @JsonProperty("journalMetadataSize")
    public Integer getJournalMetadataSize() {
        return journalMetadataSize;
    }

    @JsonProperty("journalMetadataSize")
    public void setJournalMetadataSize(Integer journalMetadataSize) {
        this.journalMetadataSize = journalMetadataSize;
    }

    @JsonProperty("metadataAge")
    public Object getMetadataAge() {
        return metadataAge;
    }

    @JsonProperty("metadataAge")
    public void setMetadataAge(Object metadataAge) {
        this.metadataAge = metadataAge;
    }

    @JsonProperty("journalMetadataAge")
    public Object getJournalMetadataAge() {
        return journalMetadataAge;
    }

    @JsonProperty("journalMetadataAge")
    public void setJournalMetadataAge(Object journalMetadataAge) {
        this.journalMetadataAge = journalMetadataAge;
    }

    @JsonProperty("metadataInIndexCount")
    public Integer getMetadataInIndexCount() {
        return metadataInIndexCount;
    }

    @JsonProperty("metadataInIndexCount")
    public void setMetadataInIndexCount(Integer metadataInIndexCount) {
        this.metadataInIndexCount = metadataInIndexCount;
    }

    @JsonProperty("metadataDeletedInIndexCount")
    public Integer getMetadataDeletedInIndexCount() {
        return metadataDeletedInIndexCount;
    }

    @JsonProperty("metadataDeletedInIndexCount")
    public void setMetadataDeletedInIndexCount(Integer metadataDeletedInIndexCount) {
        this.metadataDeletedInIndexCount = metadataDeletedInIndexCount;
    }

    @JsonProperty("metadataAlloweInIndexCount")
    public Integer getMetadataAlloweInIndexCount() {
        return metadataAlloweInIndexCount;
    }

    @JsonProperty("metadataAlloweInIndexCount")
    public void setMetadataAlloweInIndexCount(Integer metadataAlloweInIndexCount) {
        this.metadataAlloweInIndexCount = metadataAlloweInIndexCount;
    }

    @JsonProperty("metadataDisabledInIndexCount")
    public Integer getMetadataDisabledInIndexCount() {
        return metadataDisabledInIndexCount;
    }

    @JsonProperty("metadataDisabledInIndexCount")
    public void setMetadataDisabledInIndexCount(Integer metadataDisabledInIndexCount) {
        this.metadataDisabledInIndexCount = metadataDisabledInIndexCount;
    }

    @JsonProperty("metadataExtractionDate")
    public Object getMetadataExtractionDate() {
        return metadataExtractionDate;
    }

    @JsonProperty("metadataExtractionDate")
    public void setMetadataExtractionDate(Object metadataExtractionDate) {
        this.metadataExtractionDate = metadataExtractionDate;
    }

    @JsonProperty("journalMetadataExtractionDate")
    public Object getJournalMetadataExtractionDate() {
        return journalMetadataExtractionDate;
    }

    @JsonProperty("journalMetadataExtractionDate")
    public void setJournalMetadataExtractionDate(Object journalMetadataExtractionDate) {
        this.journalMetadataExtractionDate = journalMetadataExtractionDate;
    }

    @JsonProperty("databaseRecordCount")
    public Integer getDatabaseRecordCount() {
        return databaseRecordCount;
    }

    @JsonProperty("databaseRecordCount")
    public void setDatabaseRecordCount(Integer databaseRecordCount) {
        this.databaseRecordCount = databaseRecordCount;
    }

    @JsonProperty("databaseDeletedRecordCount")
    public Integer getDatabaseDeletedRecordCount() {
        return databaseDeletedRecordCount;
    }

    @JsonProperty("databaseDeletedRecordCount")
    public void setDatabaseDeletedRecordCount(Integer databaseDeletedRecordCount) {
        this.databaseDeletedRecordCount = databaseDeletedRecordCount;
    }

    @JsonProperty("databasePdfLinkCount")
    public Integer getDatabasePdfLinkCount() {
        return databasePdfLinkCount;
    }

    @JsonProperty("databasePdfLinkCount")
    public void setDatabasePdfLinkCount(Integer databasePdfLinkCount) {
        this.databasePdfLinkCount = databasePdfLinkCount;
    }

    @JsonProperty("databasePdfCount")
    public Integer getDatabasePdfCount() {
        return databasePdfCount;
    }

    @JsonProperty("databasePdfCount")
    public void setDatabasePdfCount(Integer databasePdfCount) {
        this.databasePdfCount = databasePdfCount;
    }

    @JsonProperty("databaseDeletedPdfCount")
    public Integer getDatabaseDeletedPdfCount() {
        return databaseDeletedPdfCount;
    }

    @JsonProperty("databaseDeletedPdfCount")
    public void setDatabaseDeletedPdfCount(Integer databaseDeletedPdfCount) {
        this.databaseDeletedPdfCount = databaseDeletedPdfCount;
    }

    @JsonProperty("hardDrivePdfSize")
    public Integer getHardDrivePdfSize() {
        return hardDrivePdfSize;
    }

    @JsonProperty("hardDrivePdfSize")
    public void setHardDrivePdfSize(Integer hardDrivePdfSize) {
        this.hardDrivePdfSize = hardDrivePdfSize;
    }

    @JsonProperty("hardDrivePdfCount")
    public Integer getHardDrivePdfCount() {
        return hardDrivePdfCount;
    }

    @JsonProperty("hardDrivePdfCount")
    public void setHardDrivePdfCount(Integer hardDrivePdfCount) {
        this.hardDrivePdfCount = hardDrivePdfCount;
    }

    @JsonProperty("hardDriveDeletedPdfCount")
    public Integer getHardDriveDeletedPdfCount() {
        return hardDriveDeletedPdfCount;
    }

    @JsonProperty("hardDriveDeletedPdfCount")
    public void setHardDriveDeletedPdfCount(Integer hardDriveDeletedPdfCount) {
        this.hardDriveDeletedPdfCount = hardDriveDeletedPdfCount;
    }

    @JsonProperty("databaseTextCount")
    public Integer getDatabaseTextCount() {
        return databaseTextCount;
    }

    @JsonProperty("databaseTextCount")
    public void setDatabaseTextCount(Integer databaseTextCount) {
        this.databaseTextCount = databaseTextCount;
    }

    @JsonProperty("databaseTextNotDeletedCount")
    public Integer getDatabaseTextNotDeletedCount() {
        return databaseTextNotDeletedCount;
    }

    @JsonProperty("databaseTextNotDeletedCount")
    public void setDatabaseTextNotDeletedCount(Integer databaseTextNotDeletedCount) {
        this.databaseTextNotDeletedCount = databaseTextNotDeletedCount;
    }

    @JsonProperty("hardDriveTextCount")
    public Integer getHardDriveTextCount() {
        return hardDriveTextCount;
    }

    @JsonProperty("hardDriveTextCount")
    public void setHardDriveTextCount(Integer hardDriveTextCount) {
        this.hardDriveTextCount = hardDriveTextCount;
    }

    @JsonProperty("hardDriveDeletedTextCount")
    public Integer getHardDriveDeletedTextCount() {
        return hardDriveDeletedTextCount;
    }

    @JsonProperty("hardDriveDeletedTextCount")
    public void setHardDriveDeletedTextCount(Integer hardDriveDeletedTextCount) {
        this.hardDriveDeletedTextCount = hardDriveDeletedTextCount;
    }

    @JsonProperty("databaseIndexCount")
    public Integer getDatabaseIndexCount() {
        return databaseIndexCount;
    }

    @JsonProperty("databaseIndexCount")
    public void setDatabaseIndexCount(Integer databaseIndexCount) {
        this.databaseIndexCount = databaseIndexCount;
    }

    @JsonProperty("indexRecordCount")
    public Integer getIndexRecordCount() {
        return indexRecordCount;
    }

    @JsonProperty("indexRecordCount")
    public void setIndexRecordCount(Integer indexRecordCount) {
        this.indexRecordCount = indexRecordCount;
    }

    @JsonProperty("indexJournalCount")
    public Integer getIndexJournalCount() {
        return indexJournalCount;
    }

    @JsonProperty("indexJournalCount")
    public void setIndexJournalCount(Integer indexJournalCount) {
        this.indexJournalCount = indexJournalCount;
    }

    @JsonProperty("indexTextCount")
    public Integer getIndexTextCount() {
        return indexTextCount;
    }

    @JsonProperty("indexTextCount")
    public void setIndexTextCount(Integer indexTextCount) {
        this.indexTextCount = indexTextCount;
    }

    @JsonProperty("metadataOnlyIndex")
    public Integer getMetadataOnlyIndex() {
        return metadataOnlyIndex;
    }

    @JsonProperty("metadataOnlyIndex")
    public void setMetadataOnlyIndex(Integer metadataOnlyIndex) {
        this.metadataOnlyIndex = metadataOnlyIndex;
    }

    @JsonProperty("indexTextCountDB")
    public Integer getIndexTextCountDB() {
        return indexTextCountDB;
    }

    @JsonProperty("indexTextCountDB")
    public void setIndexTextCountDB(Integer indexTextCountDB) {
        this.indexTextCountDB = indexTextCountDB;
    }

    @JsonProperty("indexedPdfDB")
    public Integer getIndexedPdfDB() {
        return indexedPdfDB;
    }

    @JsonProperty("indexedPdfDB")
    public void setIndexedPdfDB(Integer indexedPdfDB) {
        this.indexedPdfDB = indexedPdfDB;
    }

    @JsonProperty("indexedDisabledDB")
    public Integer getIndexedDisabledDB() {
        return indexedDisabledDB;
    }

    @JsonProperty("indexedDisabledDB")
    public void setIndexedDisabledDB(Integer indexedDisabledDB) {
        this.indexedDisabledDB = indexedDisabledDB;
    }

    @JsonProperty("indexTextNotDeletedCount")
    public Integer getIndexTextNotDeletedCount() {
        return indexTextNotDeletedCount;
    }

    @JsonProperty("indexTextNotDeletedCount")
    public void setIndexTextNotDeletedCount(Integer indexTextNotDeletedCount) {
        this.indexTextNotDeletedCount = indexTextNotDeletedCount;
    }

    @JsonProperty("hardDriveCitationFiles")
    public Integer getHardDriveCitationFiles() {
        return hardDriveCitationFiles;
    }

    @JsonProperty("hardDriveCitationFiles")
    public void setHardDriveCitationFiles(Integer hardDriveCitationFiles) {
        this.hardDriveCitationFiles = hardDriveCitationFiles;
    }

    @JsonProperty("citationFilesDb")
    public Integer getCitationFilesDb() {
        return citationFilesDb;
    }

    @JsonProperty("citationFilesDb")
    public void setCitationFilesDb(Integer citationFilesDb) {
        this.citationFilesDb = citationFilesDb;
    }

    @JsonProperty("crawlingLimit")
    public Integer getCrawlingLimit() {
        return crawlingLimit;
    }

    @JsonProperty("crawlingLimit")
    public void setCrawlingLimit(Integer crawlingLimit) {
        this.crawlingLimit = crawlingLimit;
    }

    @JsonProperty("citationCount")
    public Integer getCitationCount() {
        return citationCount;
    }

    @JsonProperty("citationCount")
    public void setCitationCount(Integer citationCount) {
        this.citationCount = citationCount;
    }

    @JsonProperty("citationWithDocCount")
    public Integer getCitationWithDocCount() {
        return citationWithDocCount;
    }

    @JsonProperty("citationWithDocCount")
    public void setCitationWithDocCount(Integer citationWithDocCount) {
        this.citationWithDocCount = citationWithDocCount;
    }

    @JsonProperty("citationDoiCount")
    public Integer getCitationDoiCount() {
        return citationDoiCount;
    }

    @JsonProperty("citationDoiCount")
    public void setCitationDoiCount(Integer citationDoiCount) {
        this.citationDoiCount = citationDoiCount;
    }

    @JsonProperty("documentDoiCount")
    public Integer getDocumentDoiCount() {
        return documentDoiCount;
    }

    @JsonProperty("documentDoiCount")
    public void setDocumentDoiCount(Integer documentDoiCount) {
        this.documentDoiCount = documentDoiCount;
    }

    @JsonProperty("documentDoiWithFulltextCount")
    public Integer getDocumentDoiWithFulltextCount() {
        return documentDoiWithFulltextCount;
    }

    @JsonProperty("documentDoiWithFulltextCount")
    public void setDocumentDoiWithFulltextCount(Integer documentDoiWithFulltextCount) {
        this.documentDoiWithFulltextCount = documentDoiWithFulltextCount;
    }

    @JsonProperty("repositoryLocation")
    public Object getRepositoryLocation() {
        return repositoryLocation;
    }

    @JsonProperty("repositoryLocation")
    public void setRepositoryLocation(Object repositoryLocation) {
        this.repositoryLocation = repositoryLocation;
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
