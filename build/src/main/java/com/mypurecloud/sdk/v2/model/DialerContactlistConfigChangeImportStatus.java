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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DialerContactlistConfigChangeImportStatus
 */

public class DialerContactlistConfigChangeImportStatus  implements Serializable {
  

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
  private Integer totalRecords = null;
  private Integer completedRecords = null;
  private Integer percentageComplete = null;
  private String failureReason = null;

  
  /**
   * current status of the import
   **/
  public DialerContactlistConfigChangeImportStatus importState(ImportStateEnum importState) {
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
  public DialerContactlistConfigChangeImportStatus totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "total number of records to be imported")
  @JsonProperty("totalRecords")
  public Integer getTotalRecords() {
    return totalRecords;
  }
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }


  /**
   * number of records finished importing
   **/
  public DialerContactlistConfigChangeImportStatus completedRecords(Integer completedRecords) {
    this.completedRecords = completedRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "number of records finished importing")
  @JsonProperty("completedRecords")
  public Integer getCompletedRecords() {
    return completedRecords;
  }
  public void setCompletedRecords(Integer completedRecords) {
    this.completedRecords = completedRecords;
  }


  /**
   * percentage of records finished importing
   **/
  public DialerContactlistConfigChangeImportStatus percentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "percentage of records finished importing")
  @JsonProperty("percentageComplete")
  public Integer getPercentageComplete() {
    return percentageComplete;
  }
  public void setPercentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
  }


  /**
   * if the import has failed, the reason for the failure
   **/
  public DialerContactlistConfigChangeImportStatus failureReason(String failureReason) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerContactlistConfigChangeImportStatus dialerContactlistConfigChangeImportStatus = (DialerContactlistConfigChangeImportStatus) o;

    return Objects.equals(this.importState, dialerContactlistConfigChangeImportStatus.importState) &&
            Objects.equals(this.totalRecords, dialerContactlistConfigChangeImportStatus.totalRecords) &&
            Objects.equals(this.completedRecords, dialerContactlistConfigChangeImportStatus.completedRecords) &&
            Objects.equals(this.percentageComplete, dialerContactlistConfigChangeImportStatus.percentageComplete) &&
            Objects.equals(this.failureReason, dialerContactlistConfigChangeImportStatus.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importState, totalRecords, completedRecords, percentageComplete, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContactlistConfigChangeImportStatus {\n");
    
    sb.append("    importState: ").append(toIndentedString(importState)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    completedRecords: ").append(toIndentedString(completedRecords)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

