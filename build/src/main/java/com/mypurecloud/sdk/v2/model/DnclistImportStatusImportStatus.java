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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DnclistImportStatusImportStatus
 */

public class DnclistImportStatusImportStatus  implements Serializable {
  

  private static class ImportStateEnumDeserializer extends StdDeserializer<ImportStateEnum> {
    public ImportStateEnumDeserializer() {
      super(ImportStateEnumDeserializer.class);
    }

    @Override
    public ImportStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ImportStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * current status of the import
   */
 @JsonDeserialize(using = ImportStateEnumDeserializer.class)
  public enum ImportStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IN_PROGRESS("IN_PROGRESS"),
    FAILED("FAILED");

    private String value;

    ImportStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ImportStateEnum fromString(String key) {
      if (key == null) return null;

      for (ImportStateEnum value : ImportStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ImportStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ImportStateEnum importState = null;
  private Long totalRecords = null;
  private Long completedRecords = null;
  private Long percentageComplete = null;
  private String failureReason = null;
  private List<String> targetContactListIds = null;
  private String listNamePrefix = null;
  private Map<String, Object> additionalProperties = null;

  public DnclistImportStatusImportStatus() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      targetContactListIds = new ArrayList<String>();
    }
  }

  
  /**
   * current status of the import
   **/
  public DnclistImportStatusImportStatus importState(ImportStateEnum importState) {
    this.importState = importState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "current status of the import")
  @JsonProperty("importState")
  public ImportStateEnum getImportState() {
    return importState;
  }
  public void setImportState(ImportStateEnum importState) {
    this.importState = importState;
  }


  /**
   * total number of records to be imported
   **/
  public DnclistImportStatusImportStatus totalRecords(Long totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "total number of records to be imported")
  @JsonProperty("totalRecords")
  public Long getTotalRecords() {
    return totalRecords;
  }
  public void setTotalRecords(Long totalRecords) {
    this.totalRecords = totalRecords;
  }


  /**
   * number of records finished importing
   **/
  public DnclistImportStatusImportStatus completedRecords(Long completedRecords) {
    this.completedRecords = completedRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "number of records finished importing")
  @JsonProperty("completedRecords")
  public Long getCompletedRecords() {
    return completedRecords;
  }
  public void setCompletedRecords(Long completedRecords) {
    this.completedRecords = completedRecords;
  }


  /**
   * percentage of records finished importing
   **/
  public DnclistImportStatusImportStatus percentageComplete(Long percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "percentage of records finished importing")
  @JsonProperty("percentageComplete")
  public Long getPercentageComplete() {
    return percentageComplete;
  }
  public void setPercentageComplete(Long percentageComplete) {
    this.percentageComplete = percentageComplete;
  }


  /**
   * if the import has failed, the reason for the failure
   **/
  public DnclistImportStatusImportStatus failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "if the import has failed, the reason for the failure")
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  /**
   * The ids for target contact lists
   **/
  public DnclistImportStatusImportStatus targetContactListIds(List<String> targetContactListIds) {
    this.targetContactListIds = targetContactListIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ids for target contact lists")
  @JsonProperty("targetContactListIds")
  public List<String> getTargetContactListIds() {
    return targetContactListIds;
  }
  public void setTargetContactListIds(List<String> targetContactListIds) {
    this.targetContactListIds = targetContactListIds;
  }


  /**
   * The prefix used for target contact list names
   **/
  public DnclistImportStatusImportStatus listNamePrefix(String listNamePrefix) {
    this.listNamePrefix = listNamePrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The prefix used for target contact list names")
  @JsonProperty("listNamePrefix")
  public String getListNamePrefix() {
    return listNamePrefix;
  }
  public void setListNamePrefix(String listNamePrefix) {
    this.listNamePrefix = listNamePrefix;
  }


  /**
   **/
  public DnclistImportStatusImportStatus additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnclistImportStatusImportStatus dnclistImportStatusImportStatus = (DnclistImportStatusImportStatus) o;

    return Objects.equals(this.importState, dnclistImportStatusImportStatus.importState) &&
            Objects.equals(this.totalRecords, dnclistImportStatusImportStatus.totalRecords) &&
            Objects.equals(this.completedRecords, dnclistImportStatusImportStatus.completedRecords) &&
            Objects.equals(this.percentageComplete, dnclistImportStatusImportStatus.percentageComplete) &&
            Objects.equals(this.failureReason, dnclistImportStatusImportStatus.failureReason) &&
            Objects.equals(this.targetContactListIds, dnclistImportStatusImportStatus.targetContactListIds) &&
            Objects.equals(this.listNamePrefix, dnclistImportStatusImportStatus.listNamePrefix) &&
            Objects.equals(this.additionalProperties, dnclistImportStatusImportStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importState, totalRecords, completedRecords, percentageComplete, failureReason, targetContactListIds, listNamePrefix, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnclistImportStatusImportStatus {\n");
    
    sb.append("    importState: ").append(toIndentedString(importState)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    completedRecords: ").append(toIndentedString(completedRecords)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    targetContactListIds: ").append(toIndentedString(targetContactListIds)).append("\n");
    sb.append("    listNamePrefix: ").append(toIndentedString(listNamePrefix)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

