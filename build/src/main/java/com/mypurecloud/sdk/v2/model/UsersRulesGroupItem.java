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
import com.mypurecloud.sdk.v2.model.UsersRulesValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UsersRulesGroupItem
 */

public class UsersRulesGroupItem  implements Serializable {
  
  private String id = null;

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
   * The operator for this group
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
  private List<UsersRulesValue> values = null;

  public UsersRulesGroupItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<UsersRulesValue>();
    }
  }

  
  /**
   * The internal ID for this group
   **/
  public UsersRulesGroupItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The internal ID for this group")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The operator for this group
   **/
  public UsersRulesGroupItem operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operator for this group")
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
  public UsersRulesGroupItem container(ContainerEnum container) {
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
   * The ids and contextIds to select for this group
   **/
  public UsersRulesGroupItem values(List<UsersRulesValue> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids and contextIds to select for this group")
  @JsonProperty("values")
  public List<UsersRulesValue> getValues() {
    return values;
  }
  public void setValues(List<UsersRulesValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersRulesGroupItem usersRulesGroupItem = (UsersRulesGroupItem) o;

    return Objects.equals(this.id, usersRulesGroupItem.id) &&
            Objects.equals(this.operator, usersRulesGroupItem.operator) &&
            Objects.equals(this.container, usersRulesGroupItem.container) &&
            Objects.equals(this.values, usersRulesGroupItem.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operator, container, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRulesGroupItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

