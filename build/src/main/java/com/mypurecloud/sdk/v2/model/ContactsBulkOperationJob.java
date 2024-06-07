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
import com.mypurecloud.sdk.v2.model.ErrorInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactsBulkOperationJob
 */

public class ContactsBulkOperationJob  implements Serializable {
  
  private String id = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The job state.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INPROGRESS("InProgress"),
    COMPLETE("Complete"),
    FAILED("Failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The job type.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BULKDELETE("BulkDelete"),
    BULKEDIT("BulkEdit");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private Long totalRecords = null;
  private Long completedRecords = null;
  private Integer percentComplete = null;
  private ErrorInfo failureReason = null;
  private String downloadURI = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique job identifier.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The job state.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }


  @ApiModelProperty(example = "null", value = "The job type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "Total records that will be impacted by the bulk operation.")
  @JsonProperty("totalRecords")
  public Long getTotalRecords() {
    return totalRecords;
  }


  @ApiModelProperty(example = "null", value = "Amount of records that have been impacted by the bulk operation.")
  @JsonProperty("completedRecords")
  public Long getCompletedRecords() {
    return completedRecords;
  }


  @ApiModelProperty(example = "null", value = "Percentage of records that have been impacted by the bulk operation.")
  @JsonProperty("percentComplete")
  public Integer getPercentComplete() {
    return percentComplete;
  }


  @ApiModelProperty(example = "null", value = "Information on failure reason.")
  @JsonProperty("failureReason")
  public ErrorInfo getFailureReason() {
    return failureReason;
  }


  @ApiModelProperty(example = "null", value = "URI to download the original backup contacts.")
  @JsonProperty("downloadURI")
  public String getDownloadURI() {
    return downloadURI;
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
    ContactsBulkOperationJob contactsBulkOperationJob = (ContactsBulkOperationJob) o;

    return Objects.equals(this.id, contactsBulkOperationJob.id) &&
            Objects.equals(this.state, contactsBulkOperationJob.state) &&
            Objects.equals(this.type, contactsBulkOperationJob.type) &&
            Objects.equals(this.totalRecords, contactsBulkOperationJob.totalRecords) &&
            Objects.equals(this.completedRecords, contactsBulkOperationJob.completedRecords) &&
            Objects.equals(this.percentComplete, contactsBulkOperationJob.percentComplete) &&
            Objects.equals(this.failureReason, contactsBulkOperationJob.failureReason) &&
            Objects.equals(this.downloadURI, contactsBulkOperationJob.downloadURI) &&
            Objects.equals(this.selfUri, contactsBulkOperationJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, type, totalRecords, completedRecords, percentComplete, failureReason, downloadURI, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactsBulkOperationJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    completedRecords: ").append(toIndentedString(completedRecords)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    downloadURI: ").append(toIndentedString(downloadURI)).append("\n");
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

