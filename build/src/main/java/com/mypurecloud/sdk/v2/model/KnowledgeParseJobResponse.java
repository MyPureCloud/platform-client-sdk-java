package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.KnowledgeParseImportResult;
import com.mypurecloud.sdk.v2.model.KnowledgeParseRecord;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeParseJobResponse
 */

public class KnowledgeParseJobResponse  implements Serializable {
  
  private String id = null;
  private String downloadURL = null;
  private List<String> hints = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of the parse job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    READYTOPARSE("ReadyToParse"),
    PARSEINPROGRESS("ParseInProgress"),
    PARSECOMPLETED("ParseCompleted"),
    READYTOIMPORT("ReadyToImport"),
    IMPORTINPROGRESS("ImportInProgress"),
    IMPORTCOMPLETED("ImportCompleted"),
    IMPORTPARTIALCOMPLETED("ImportPartialCompleted"),
    IMPORTFAILED("ImportFailed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private List<KnowledgeParseRecord> parseResults = null;
  private KnowledgeParseImportResult importResult = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public KnowledgeParseJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      hints = new ArrayList<String>();
      parseResults = new ArrayList<KnowledgeParseRecord>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "Id of the parse job")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The URL of the location at which the caller can download the original html file.
   **/
  public KnowledgeParseJobResponse downloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL of the location at which the caller can download the original html file.")
  @JsonProperty("downloadURL")
  public String getDownloadURL() {
    return downloadURL;
  }
  public void setDownloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
  }


  /**
   * Hinted titles for the parser.
   **/
  public KnowledgeParseJobResponse hints(List<String> hints) {
    this.hints = hints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hinted titles for the parser.")
  @JsonProperty("hints")
  public List<String> getHints() {
    return hints;
  }
  public void setHints(List<String> hints) {
    this.hints = hints;
  }


  @ApiModelProperty(example = "null", value = "Status of the parse job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "Results of the parse")
  @JsonProperty("parseResults")
  public List<KnowledgeParseRecord> getParseResults() {
    return parseResults;
  }


  @ApiModelProperty(example = "null", value = "Result of the import phase")
  @JsonProperty("importResult")
  public KnowledgeParseImportResult getImportResult() {
    return importResult;
  }


  /**
   * The user who created the operation
   **/
  public KnowledgeParseJobResponse createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who created the operation")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  @ApiModelProperty(example = "null", value = "Created date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeParseJobResponse knowledgeParseJobResponse = (KnowledgeParseJobResponse) o;

    return Objects.equals(this.id, knowledgeParseJobResponse.id) &&
            Objects.equals(this.downloadURL, knowledgeParseJobResponse.downloadURL) &&
            Objects.equals(this.hints, knowledgeParseJobResponse.hints) &&
            Objects.equals(this.status, knowledgeParseJobResponse.status) &&
            Objects.equals(this.parseResults, knowledgeParseJobResponse.parseResults) &&
            Objects.equals(this.importResult, knowledgeParseJobResponse.importResult) &&
            Objects.equals(this.createdBy, knowledgeParseJobResponse.createdBy) &&
            Objects.equals(this.dateCreated, knowledgeParseJobResponse.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeParseJobResponse.dateModified) &&
            Objects.equals(this.selfUri, knowledgeParseJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadURL, hints, status, parseResults, importResult, createdBy, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeParseJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
    sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    parseResults: ").append(toIndentedString(parseResults)).append("\n");
    sb.append("    importResult: ").append(toIndentedString(importResult)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

