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
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.UsersRulesLastRunMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Users rule dependent response
 */
@ApiModel(description = "Users rule dependent response")

public class UsersRulesDependent  implements Serializable {
  
  private String ruleId = null;
  private String typeId = null;

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
   * The type of the dependent
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LEARNING("Learning");

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
  private Date createdDate = null;
  private UserReference createdBy = null;
  private UsersRulesLastRunMetadata lastRun = null;
  private Long recentRunCount = null;
  private String selfUri = null;

  public UsersRulesDependent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The id of the rule")
  @JsonProperty("ruleId")
  public String getRuleId() {
    return ruleId;
  }


  @ApiModelProperty(example = "null", value = "The type id of the dependent")
  @JsonProperty("typeId")
  public String getTypeId() {
    return typeId;
  }


  @ApiModelProperty(example = "null", value = "The type of the dependent")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "The date/time the dependent was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }


  @ApiModelProperty(example = "null", value = "The user who created the dependent")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "Information on the last run of the dependent")
  @JsonProperty("lastRun")
  public UsersRulesLastRunMetadata getLastRun() {
    return lastRun;
  }


  @ApiModelProperty(example = "null", value = "The number of times the rule has run")
  @JsonProperty("recentRunCount")
  public Long getRecentRunCount() {
    return recentRunCount;
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
    UsersRulesDependent usersRulesDependent = (UsersRulesDependent) o;

    return Objects.equals(this.ruleId, usersRulesDependent.ruleId) &&
            Objects.equals(this.typeId, usersRulesDependent.typeId) &&
            Objects.equals(this.type, usersRulesDependent.type) &&
            Objects.equals(this.createdDate, usersRulesDependent.createdDate) &&
            Objects.equals(this.createdBy, usersRulesDependent.createdBy) &&
            Objects.equals(this.lastRun, usersRulesDependent.lastRun) &&
            Objects.equals(this.recentRunCount, usersRulesDependent.recentRunCount) &&
            Objects.equals(this.selfUri, usersRulesDependent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, typeId, type, createdDate, createdBy, lastRun, recentRunCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRulesDependent {\n");
    
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
    sb.append("    recentRunCount: ").append(toIndentedString(recentRunCount)).append("\n");
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

