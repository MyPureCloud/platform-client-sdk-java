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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.RelationshipsExportQueryConditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RelationshipsExport
 */

public class RelationshipsExport  implements Serializable {
  
  private String id = null;
  private List<String> divisionIds = null;
  private DomainEntityRef createdBy = null;
  private Date dateCreated = null;
  private Date dateCompletion = null;

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
   * The status of the request
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RUNNING("RUNNING"),
    SUCCEEDED("SUCCEEDED"),
    FAILED("FAILED");

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
  private String downloadUrl = null;
  private Integer resultRowCount = null;
  private RelationshipsExportQueryConditions queryConditions = null;
  private String selfUri = null;

  public RelationshipsExport() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      divisionIds = new ArrayList<String>();
    }
  }

  public RelationshipsExport(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      divisionIds = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Division IDs of entities
   **/
  public RelationshipsExport divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Division IDs of entities")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  @ApiModelProperty(example = "null", value = "The user that created this request")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "When the request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "When the request reached a terminal state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompletion")
  public Date getDateCompletion() {
    return dateCompletion;
  }


  @ApiModelProperty(example = "null", value = "The status of the request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "The location where the results of the request can be retrieved")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }


  @ApiModelProperty(example = "null", value = "Number of rows returned by the export query")
  @JsonProperty("resultRowCount")
  public Integer getResultRowCount() {
    return resultRowCount;
  }


  /**
   * Query conditions to apply on export
   **/
  public RelationshipsExport queryConditions(RelationshipsExportQueryConditions queryConditions) {
    this.queryConditions = queryConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query conditions to apply on export")
  @JsonProperty("queryConditions")
  public RelationshipsExportQueryConditions getQueryConditions() {
    return queryConditions;
  }
  public void setQueryConditions(RelationshipsExportQueryConditions queryConditions) {
    this.queryConditions = queryConditions;
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
    RelationshipsExport relationshipsExport = (RelationshipsExport) o;

    return Objects.equals(this.id, relationshipsExport.id) &&
            Objects.equals(this.divisionIds, relationshipsExport.divisionIds) &&
            Objects.equals(this.createdBy, relationshipsExport.createdBy) &&
            Objects.equals(this.dateCreated, relationshipsExport.dateCreated) &&
            Objects.equals(this.dateCompletion, relationshipsExport.dateCompletion) &&
            Objects.equals(this.status, relationshipsExport.status) &&
            Objects.equals(this.downloadUrl, relationshipsExport.downloadUrl) &&
            Objects.equals(this.resultRowCount, relationshipsExport.resultRowCount) &&
            Objects.equals(this.queryConditions, relationshipsExport.queryConditions) &&
            Objects.equals(this.selfUri, relationshipsExport.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, divisionIds, createdBy, dateCreated, dateCompletion, status, downloadUrl, resultRowCount, queryConditions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipsExport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCompletion: ").append(toIndentedString(dateCompletion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    resultRowCount: ").append(toIndentedString(resultRowCount)).append("\n");
    sb.append("    queryConditions: ").append(toIndentedString(queryConditions)).append("\n");
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

