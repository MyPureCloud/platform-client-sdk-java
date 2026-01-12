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
import com.mypurecloud.sdk.v2.model.UsersRulesCriteria;
import com.mypurecloud.sdk.v2.model.UsersRulesLastRunMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Users rule response
 */
@ApiModel(description = "Users rule response")

public class UsersRulesRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

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
   * The type of the rule
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LEARNING("Learning"),
    ACTIVITYPLAN("ActivityPlan");

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
  private List<UsersRulesCriteria> criteria = null;
  private Date createdDate = null;
  private UserReference createdBy = null;
  private Date modifiedDate = null;
  private UserReference modifiedBy = null;
  private UsersRulesLastRunMetadata lastRun = null;
  private Long recentRunCount = null;
  private Long dependentCount = null;
  private String selfUri = null;

  public UsersRulesRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      criteria = new ArrayList<UsersRulesCriteria>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public UsersRulesRule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @ApiModelProperty(example = "null", value = "The description of the rule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }


  @ApiModelProperty(example = "null", value = "The type of the rule")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "The criteria of the rule")
  @JsonProperty("criteria")
  public List<UsersRulesCriteria> getCriteria() {
    return criteria;
  }


  @ApiModelProperty(example = "null", value = "The date/time the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }


  @ApiModelProperty(example = "null", value = "The user who created the rule")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "The date/time the rule was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }


  @ApiModelProperty(example = "null", value = "The last user to modify the rule")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  @ApiModelProperty(example = "null", value = "Information on the last run of the rule")
  @JsonProperty("lastRun")
  public UsersRulesLastRunMetadata getLastRun() {
    return lastRun;
  }


  @ApiModelProperty(example = "null", value = "The number of times the rule has run")
  @JsonProperty("recentRunCount")
  public Long getRecentRunCount() {
    return recentRunCount;
  }


  @ApiModelProperty(example = "null", value = "The number of dependents this rule has")
  @JsonProperty("dependentCount")
  public Long getDependentCount() {
    return dependentCount;
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
    UsersRulesRule usersRulesRule = (UsersRulesRule) o;

    return Objects.equals(this.id, usersRulesRule.id) &&
            Objects.equals(this.name, usersRulesRule.name) &&
            Objects.equals(this.description, usersRulesRule.description) &&
            Objects.equals(this.type, usersRulesRule.type) &&
            Objects.equals(this.criteria, usersRulesRule.criteria) &&
            Objects.equals(this.createdDate, usersRulesRule.createdDate) &&
            Objects.equals(this.createdBy, usersRulesRule.createdBy) &&
            Objects.equals(this.modifiedDate, usersRulesRule.modifiedDate) &&
            Objects.equals(this.modifiedBy, usersRulesRule.modifiedBy) &&
            Objects.equals(this.lastRun, usersRulesRule.lastRun) &&
            Objects.equals(this.recentRunCount, usersRulesRule.recentRunCount) &&
            Objects.equals(this.dependentCount, usersRulesRule.dependentCount) &&
            Objects.equals(this.selfUri, usersRulesRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, criteria, createdDate, createdBy, modifiedDate, modifiedBy, lastRun, recentRunCount, dependentCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRulesRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
    sb.append("    recentRunCount: ").append(toIndentedString(recentRunCount)).append("\n");
    sb.append("    dependentCount: ").append(toIndentedString(dependentCount)).append("\n");
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

