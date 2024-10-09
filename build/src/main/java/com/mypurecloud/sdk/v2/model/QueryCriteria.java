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
import com.mypurecloud.sdk.v2.model.CriteriaCategoryInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A criteria type that can be used in tandem with other criteria type to create queries of executionData
 */
@ApiModel(description = "A criteria type that can be used in tandem with other criteria type to create queries of executionData")

public class QueryCriteria  implements Serializable {
  

  private static class CriteriaKeyEnumDeserializer extends StdDeserializer<CriteriaKeyEnum> {
    public CriteriaKeyEnumDeserializer() {
      super(CriteriaKeyEnumDeserializer.class);
    }

    @Override
    public CriteriaKeyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CriteriaKeyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The is the name of the criteria that can be queried.
   */
 @JsonDeserialize(using = CriteriaKeyEnumDeserializer.class)
  public enum CriteriaKeyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FLOWSTARTDATETIME("FlowStartDateTime"),
    FLOWENDDATETIME("FlowEndDateTime"),
    CONVERSATIONID("ConversationId"),
    WORKITEMID("WorkitemId"),
    FLOWTYPE("FlowType"),
    FLOWID("FlowId"),
    FLOWERRORREASON("FlowErrorReason"),
    FLOWWARNINGREASON("FlowWarningReason"),
    FLOWALTERNATEEXECUTIONID("FlowAlternateExecutionId"),
    FLOWOBJECTEXECUTIONID("FlowObjectExecutionId"),
    FLOWACTIONID("FlowActionId"),
    FLOWACTIONTYPE("FlowActionType"),
    FLOWACTIONOUTPUTPATHID("FlowActionOutputPathId"),
    FLOWACTIONOUTPUTPATHNAME("FlowActionOutputPathName"),
    FLOWACTIONIDOUTPUTPATHID("FlowActionIdOutputPathId"),
    FLOWACTIONIDOUTPUTPATHNAME("FlowActionIdOutputPathName"),
    FLOWACTIONTYPEOUTPUTPATHID("FlowActionTypeOutputPathId"),
    FLOWACTIONTYPEOUTPUTPATHNAME("FlowActionTypeOutputPathName"),
    BOTID("BotId"),
    BOTERRORREASON("BotErrorReason"),
    BOTFLOWEXECUTIONID("BotFlowExecutionId"),
    BOTOBJECTEXECUTIONID("BotObjectExecutionId");

    private String value;

    CriteriaKeyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CriteriaKeyEnum fromString(String key) {
      if (key == null) return null;

      for (CriteriaKeyEnum value : CriteriaKeyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CriteriaKeyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CriteriaKeyEnum criteriaKey = null;

  private static class CriteriaGroupsEnumDeserializer extends StdDeserializer<CriteriaGroupsEnum> {
    public CriteriaGroupsEnumDeserializer() {
      super(CriteriaGroupsEnumDeserializer.class);
    }

    @Override
    public CriteriaGroupsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CriteriaGroupsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets criteriaGroups
   */
 @JsonDeserialize(using = CriteriaGroupsEnumDeserializer.class)
  public enum CriteriaGroupsEnum {
    FLOW("flow"),
    BOT("bot");

    private String value;

    CriteriaGroupsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CriteriaGroupsEnum fromString(String key) {
      if (key == null) return null;

      for (CriteriaGroupsEnum value : CriteriaGroupsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CriteriaGroupsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<CriteriaGroupsEnum> criteriaGroups = new ArrayList<CriteriaGroupsEnum>();
  private String description = null;
  private List<String> operators = new ArrayList<String>();

  private static class DataTypeEnumDeserializer extends StdDeserializer<DataTypeEnum> {
    public DataTypeEnumDeserializer() {
      super(DataTypeEnumDeserializer.class);
    }

    @Override
    public DataTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DataTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of data for the criteria (string, int, etc).
   */
 @JsonDeserialize(using = DataTypeEnumDeserializer.class)
  public enum DataTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("string"),
    GUID("guid"),
    DATETIME("dateTime");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DataTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DataTypeEnum value : DataTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DataTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DataTypeEnum dataType = null;
  private CriteriaCategoryInfo categoryInfo = null;

  
  /**
   * The is the name of the criteria that can be queried.
   **/
  public QueryCriteria criteriaKey(CriteriaKeyEnum criteriaKey) {
    this.criteriaKey = criteriaKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The is the name of the criteria that can be queried.")
  @JsonProperty("criteriaKey")
  public CriteriaKeyEnum getCriteriaKey() {
    return criteriaKey;
  }
  public void setCriteriaKey(CriteriaKeyEnum criteriaKey) {
    this.criteriaKey = criteriaKey;
  }


  /**
   * The executionData type that this criteria item can be used on.
   **/
  public QueryCriteria criteriaGroups(List<CriteriaGroupsEnum> criteriaGroups) {
    this.criteriaGroups = criteriaGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The executionData type that this criteria item can be used on.")
  @JsonProperty("criteriaGroups")
  public List<CriteriaGroupsEnum> getCriteriaGroups() {
    return criteriaGroups;
  }
  public void setCriteriaGroups(List<CriteriaGroupsEnum> criteriaGroups) {
    this.criteriaGroups = criteriaGroups;
  }


  /**
   * The is the description of the criteria.
   **/
  public QueryCriteria description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The is the description of the criteria.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * A list of operators that can be used on this criteria.
   **/
  public QueryCriteria operators(List<String> operators) {
    this.operators = operators;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of operators that can be used on this criteria.")
  @JsonProperty("operators")
  public List<String> getOperators() {
    return operators;
  }
  public void setOperators(List<String> operators) {
    this.operators = operators;
  }


  /**
   * The type of data for the criteria (string, int, etc).
   **/
  public QueryCriteria dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of data for the criteria (string, int, etc).")
  @JsonProperty("dataType")
  public DataTypeEnum getDataType() {
    return dataType;
  }
  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  /**
   * A logical grouping and display order for this item.
   **/
  public QueryCriteria categoryInfo(CriteriaCategoryInfo categoryInfo) {
    this.categoryInfo = categoryInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A logical grouping and display order for this item.")
  @JsonProperty("categoryInfo")
  public CriteriaCategoryInfo getCategoryInfo() {
    return categoryInfo;
  }
  public void setCategoryInfo(CriteriaCategoryInfo categoryInfo) {
    this.categoryInfo = categoryInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCriteria queryCriteria = (QueryCriteria) o;

    return Objects.equals(this.criteriaKey, queryCriteria.criteriaKey) &&
            Objects.equals(this.criteriaGroups, queryCriteria.criteriaGroups) &&
            Objects.equals(this.description, queryCriteria.description) &&
            Objects.equals(this.operators, queryCriteria.operators) &&
            Objects.equals(this.dataType, queryCriteria.dataType) &&
            Objects.equals(this.categoryInfo, queryCriteria.categoryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteriaKey, criteriaGroups, description, operators, dataType, categoryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCriteria {\n");
    
    sb.append("    criteriaKey: ").append(toIndentedString(criteriaKey)).append("\n");
    sb.append("    criteriaGroups: ").append(toIndentedString(criteriaGroups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    categoryInfo: ").append(toIndentedString(categoryInfo)).append("\n");
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

