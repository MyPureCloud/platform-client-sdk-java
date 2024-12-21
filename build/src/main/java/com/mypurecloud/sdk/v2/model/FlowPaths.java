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
import com.mypurecloud.sdk.v2.model.FlowPathsElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * FlowPaths
 */

public class FlowPaths  implements Serializable {
  

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
  private Date dateStart = null;
  private Date dateEnd = null;
  private Map<String, FlowPathsElement> elements = null;

  
  /**
   * Category (use case) of the paths within a given domain.
   **/
  public FlowPaths category(CategoryEnum category) {
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
   * Start date of the date range included in the flow paths data. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FlowPaths dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start date of the date range included in the flow paths data. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * End date of the date range included in the flow paths data. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FlowPaths dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End date of the date range included in the flow paths data. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * Unique element identifiers and their corresponding elements in the trie data structure representing the paths.
   **/
  public FlowPaths elements(Map<String, FlowPathsElement> elements) {
    this.elements = elements;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique element identifiers and their corresponding elements in the trie data structure representing the paths.")
  @JsonProperty("elements")
  public Map<String, FlowPathsElement> getElements() {
    return elements;
  }
  public void setElements(Map<String, FlowPathsElement> elements) {
    this.elements = elements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowPaths flowPaths = (FlowPaths) o;

    return Objects.equals(this.category, flowPaths.category) &&
            Objects.equals(this.dateStart, flowPaths.dateStart) &&
            Objects.equals(this.dateEnd, flowPaths.dateEnd) &&
            Objects.equals(this.elements, flowPaths.elements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, dateStart, dateEnd, elements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowPaths {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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

