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
import com.mypurecloud.sdk.v2.model.DataActionInput;
import com.mypurecloud.sdk.v2.model.DynamicListValuesAllOf;
import com.mypurecloud.sdk.v2.model.FieldMapping;
import com.mypurecloud.sdk.v2.model.ListValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DynamicListValues
 */

public class DynamicListValues extends ListValues implements Serializable {
  
  private String dataActionId = null;
  private List<DataActionInput> inputs = null;
  private FieldMapping fieldMapping = null;

  private static class MatchTypeEnumDeserializer extends StdDeserializer<MatchTypeEnum> {
    public MatchTypeEnumDeserializer() {
      super(MatchTypeEnumDeserializer.class);
    }

    @Override
    public MatchTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MatchTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Defines how matching should work at runtime. Only 'Exact' matching is supported for dynamic lists.
   */
 @JsonDeserialize(using = MatchTypeEnumDeserializer.class)
  public enum MatchTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXACT("Exact"),
    SEMANTIC("Semantic");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MatchTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MatchTypeEnum value : MatchTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MatchTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MatchTypeEnum matchType = null;

  public DynamicListValues() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      inputs = new ArrayList<DataActionInput>();
    }
  }

  public DynamicListValues(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      inputs = new ArrayList<DataActionInput>();
    }
  }

  
  /**
   * The ID of the data action to invoke at runtime to retrieve list values and synonyms.
   **/
  public DynamicListValues dataActionId(String dataActionId) {
    this.dataActionId = dataActionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the data action to invoke at runtime to retrieve list values and synonyms.")
  @JsonProperty("dataActionId")
  public String getDataActionId() {
    return dataActionId;
  }
  public void setDataActionId(String dataActionId) {
    this.dataActionId = dataActionId;
  }


  /**
   * Array of input mappings for the data action. Maps guide variables to data action input parameters.
   **/
  public DynamicListValues inputs(List<DataActionInput> inputs) {
    this.inputs = inputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of input mappings for the data action. Maps guide variables to data action input parameters.")
  @JsonProperty("inputs")
  public List<DataActionInput> getInputs() {
    return inputs;
  }
  public void setInputs(List<DataActionInput> inputs) {
    this.inputs = inputs;
  }


  /**
   **/
  public DynamicListValues fieldMapping(FieldMapping fieldMapping) {
    this.fieldMapping = fieldMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fieldMapping")
  public FieldMapping getFieldMapping() {
    return fieldMapping;
  }
  public void setFieldMapping(FieldMapping fieldMapping) {
    this.fieldMapping = fieldMapping;
  }


  /**
   * Defines how matching should work at runtime. Only 'Exact' matching is supported for dynamic lists.
   **/
  public DynamicListValues matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines how matching should work at runtime. Only 'Exact' matching is supported for dynamic lists.")
  @JsonProperty("matchType")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }
  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicListValues dynamicListValues = (DynamicListValues) o;

    return Objects.equals(this.dataActionId, dynamicListValues.dataActionId) &&
            Objects.equals(this.inputs, dynamicListValues.inputs) &&
            Objects.equals(this.fieldMapping, dynamicListValues.fieldMapping) &&
            Objects.equals(this.matchType, dynamicListValues.matchType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataActionId, inputs, fieldMapping, matchType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicListValues {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataActionId: ").append(toIndentedString(dataActionId)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    fieldMapping: ").append(toIndentedString(fieldMapping)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

