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
import com.mypurecloud.sdk.v2.model.V2WemEngagementCelebrationUpdatesTopicContestCompleteData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2WemEngagementCelebrationUpdatesTopicSourceEntity
 */

public class V2WemEngagementCelebrationUpdatesTopicSourceEntity  implements Serializable {
  
  private String id = null;

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    THANK_YOU("THANK_YOU"),
    CONGRATULATIONS("CONGRATULATIONS"),
    HIGH_PERFORMANCE("HIGH_PERFORMANCE"),
    COMPANY_VALUES("COMPANY_VALUES"),
    COMPETITION("COMPETITION"),
    RACE("RACE"),
    RAFFLE("RAFFLE"),
    TEAM_GOAL("TEAM_GOAL");

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
  private V2WemEngagementCelebrationUpdatesTopicContestCompleteData contestCompleteData = null;

  public V2WemEngagementCelebrationUpdatesTopicSourceEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicSourceEntity id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicSourceEntity type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicSourceEntity contestCompleteData(V2WemEngagementCelebrationUpdatesTopicContestCompleteData contestCompleteData) {
    this.contestCompleteData = contestCompleteData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contestCompleteData")
  public V2WemEngagementCelebrationUpdatesTopicContestCompleteData getContestCompleteData() {
    return contestCompleteData;
  }
  public void setContestCompleteData(V2WemEngagementCelebrationUpdatesTopicContestCompleteData contestCompleteData) {
    this.contestCompleteData = contestCompleteData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WemEngagementCelebrationUpdatesTopicSourceEntity v2WemEngagementCelebrationUpdatesTopicSourceEntity = (V2WemEngagementCelebrationUpdatesTopicSourceEntity) o;

    return Objects.equals(this.id, v2WemEngagementCelebrationUpdatesTopicSourceEntity.id) &&
            Objects.equals(this.type, v2WemEngagementCelebrationUpdatesTopicSourceEntity.type) &&
            Objects.equals(this.contestCompleteData, v2WemEngagementCelebrationUpdatesTopicSourceEntity.contestCompleteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, contestCompleteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WemEngagementCelebrationUpdatesTopicSourceEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contestCompleteData: ").append(toIndentedString(contestCompleteData)).append("\n");
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

