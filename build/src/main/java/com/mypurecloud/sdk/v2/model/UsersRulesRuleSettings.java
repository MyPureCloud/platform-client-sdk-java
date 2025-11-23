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
import com.mypurecloud.sdk.v2.model.UsersRulesLockedCriteriaSettingsCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Users rule type-specific settings response
 */
@ApiModel(description = "Users rule type-specific settings response")

public class UsersRulesRuleSettings  implements Serializable {
  

  private static class AllowedContainersEnumDeserializer extends StdDeserializer<AllowedContainersEnum> {
    public AllowedContainersEnumDeserializer() {
      super(AllowedContainersEnumDeserializer.class);
    }

    @Override
    public AllowedContainersEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AllowedContainersEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets allowedContainers
   */
 @JsonDeserialize(using = AllowedContainersEnumDeserializer.class)
  public enum AllowedContainersEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACDSKILL("AcdSkill"),
    BUSINESSUNIT("BusinessUnit"),
    DIRECTORYGROUP("DirectoryGroup"),
    DIVISION("Division"),
    LANGUAGE("Language"),
    LOCATION("Location"),
    MANAGEMENTUNIT("ManagementUnit"),
    QUEUE("Queue"),
    REPORTSTO("ReportsTo"),
    STAFFINGGROUP("StaffingGroup"),
    TEAM("Team"),
    USER("User");

    private String value;

    AllowedContainersEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AllowedContainersEnum fromString(String key) {
      if (key == null) return null;

      for (AllowedContainersEnum value : AllowedContainersEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AllowedContainersEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<AllowedContainersEnum> allowedContainers = null;
  private List<UsersRulesLockedCriteriaSettingsCriteria> lockedCriteria = null;

  public UsersRulesRuleSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      allowedContainers = new ArrayList<AllowedContainersEnum>();
      lockedCriteria = new ArrayList<UsersRulesLockedCriteriaSettingsCriteria>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The allowed containers for the rule")
  @JsonProperty("allowedContainers")
  public List<AllowedContainersEnum> getAllowedContainers() {
    return allowedContainers;
  }


  @ApiModelProperty(example = "null", value = "The locked criteria settings for the rule")
  @JsonProperty("lockedCriteria")
  public List<UsersRulesLockedCriteriaSettingsCriteria> getLockedCriteria() {
    return lockedCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersRulesRuleSettings usersRulesRuleSettings = (UsersRulesRuleSettings) o;

    return Objects.equals(this.allowedContainers, usersRulesRuleSettings.allowedContainers) &&
            Objects.equals(this.lockedCriteria, usersRulesRuleSettings.lockedCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedContainers, lockedCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRulesRuleSettings {\n");
    
    sb.append("    allowedContainers: ").append(toIndentedString(allowedContainers)).append("\n");
    sb.append("    lockedCriteria: ").append(toIndentedString(lockedCriteria)).append("\n");
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

