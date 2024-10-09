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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SourceSyncResponse
 */

public class SourceSyncResponse  implements Serializable {
  

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
   * Sync state.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESS("Success"),
    FAILED("Failed"),
    INPROGRESS("InProgress"),
    UNKNOWN("Unknown");

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
  private ErrorBody error = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private AddressableEntityRef knowledgeBase = null;
  private AddressableEntityRef source = null;

  
  /**
   * Sync state.
   **/
  public SourceSyncResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sync state.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Sync error.
   **/
  public SourceSyncResponse error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sync error.")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  /**
   * Synchronization creation date-time for this source. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SourceSyncResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Synchronization creation date-time for this source. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Synchronization last modification date-time for this source. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SourceSyncResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Synchronization last modification date-time for this source. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Knowledge base to which this synchronization belongs.
   **/
  public SourceSyncResponse knowledgeBase(AddressableEntityRef knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base to which this synchronization belongs.")
  @JsonProperty("knowledgeBase")
  public AddressableEntityRef getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(AddressableEntityRef knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  /**
   * Source to which this synchronization belongs.
   **/
  public SourceSyncResponse source(AddressableEntityRef source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source to which this synchronization belongs.")
  @JsonProperty("source")
  public AddressableEntityRef getSource() {
    return source;
  }
  public void setSource(AddressableEntityRef source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceSyncResponse sourceSyncResponse = (SourceSyncResponse) o;

    return Objects.equals(this.state, sourceSyncResponse.state) &&
            Objects.equals(this.error, sourceSyncResponse.error) &&
            Objects.equals(this.dateCreated, sourceSyncResponse.dateCreated) &&
            Objects.equals(this.dateModified, sourceSyncResponse.dateModified) &&
            Objects.equals(this.knowledgeBase, sourceSyncResponse.knowledgeBase) &&
            Objects.equals(this.source, sourceSyncResponse.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, error, dateCreated, dateModified, knowledgeBase, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceSyncResponse {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

