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
import com.mypurecloud.sdk.v2.model.FlowPathsFlowFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowPathsQuery
 */

public class FlowPathsQuery  implements Serializable {
  

  private static class CategoryEnumDeserializer extends StdDeserializer<CategoryEnum> {
    public CategoryEnumDeserializer() {
      super(CategoryEnumDeserializer.class);
    }

    @Override
    public CategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Category (use case) of the paths within a given domain.
   */
 @JsonDeserialize(using = CategoryEnumDeserializer.class)
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("All"),
    ABANDONED("Abandoned"),
    AGENTESCALATION("AgentEscalation"),
    COMPLETE("Complete"),
    DISCONNECT("Disconnect"),
    ERROR("Error"),
    RECOGNITIONFAILURE("RecognitionFailure"),
    TRANSFER("Transfer");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoryEnum fromString(String key) {
      if (key == null) return null;

      for (CategoryEnum value : CategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CategoryEnum category = null;
  private List<FlowPathsFlowFilter> flows = null;

  public FlowPathsQuery() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      flows = new ArrayList<FlowPathsFlowFilter>();
    }
  }

  
  /**
   * Category (use case) of the paths within a given domain.
   **/
  public FlowPathsQuery category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Category (use case) of the paths within a given domain.")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   * List of flows to query the paths result.
   **/
  public FlowPathsQuery flows(List<FlowPathsFlowFilter> flows) {
    this.flows = flows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of flows to query the paths result.")
  @JsonProperty("flows")
  public List<FlowPathsFlowFilter> getFlows() {
    return flows;
  }
  public void setFlows(List<FlowPathsFlowFilter> flows) {
    this.flows = flows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowPathsQuery flowPathsQuery = (FlowPathsQuery) o;

    return Objects.equals(this.category, flowPathsQuery.category) &&
            Objects.equals(this.flows, flowPathsQuery.flows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, flows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowPathsQuery {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    flows: ").append(toIndentedString(flows)).append("\n");
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

