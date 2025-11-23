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

import java.io.Serializable;
/**
 * UsersRulesLockedCriteriaSettingsGroup
 */

public class UsersRulesLockedCriteriaSettingsGroup  implements Serializable {
  

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operator for this criteria
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("And"),
    NOT("Not");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;

  private static class ContainerEnumDeserializer extends StdDeserializer<ContainerEnum> {
    public ContainerEnumDeserializer() {
      super(ContainerEnumDeserializer.class);
    }

    @Override
    public ContainerEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContainerEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The container that the ids belong to
   */
 @JsonDeserialize(using = ContainerEnumDeserializer.class)
  public enum ContainerEnum {
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

    ContainerEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContainerEnum fromString(String key) {
      if (key == null) return null;

      for (ContainerEnum value : ContainerEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContainerEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContainerEnum container = null;
  private Long maxIdCount = null;

  public UsersRulesLockedCriteriaSettingsGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The operator for this criteria
   **/
  public UsersRulesLockedCriteriaSettingsGroup operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operator for this criteria")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The container that the ids belong to
   **/
  public UsersRulesLockedCriteriaSettingsGroup container(ContainerEnum container) {
    this.container = container;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The container that the ids belong to")
  @JsonProperty("container")
  public ContainerEnum getContainer() {
    return container;
  }
  public void setContainer(ContainerEnum container) {
    this.container = container;
  }


  /**
   * Maximum number of ids that can be specified in this container
   **/
  public UsersRulesLockedCriteriaSettingsGroup maxIdCount(Long maxIdCount) {
    this.maxIdCount = maxIdCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum number of ids that can be specified in this container")
  @JsonProperty("maxIdCount")
  public Long getMaxIdCount() {
    return maxIdCount;
  }
  public void setMaxIdCount(Long maxIdCount) {
    this.maxIdCount = maxIdCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersRulesLockedCriteriaSettingsGroup usersRulesLockedCriteriaSettingsGroup = (UsersRulesLockedCriteriaSettingsGroup) o;

    return Objects.equals(this.operator, usersRulesLockedCriteriaSettingsGroup.operator) &&
            Objects.equals(this.container, usersRulesLockedCriteriaSettingsGroup.container) &&
            Objects.equals(this.maxIdCount, usersRulesLockedCriteriaSettingsGroup.maxIdCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, container, maxIdCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRulesLockedCriteriaSettingsGroup {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    maxIdCount: ").append(toIndentedString(maxIdCount)).append("\n");
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

