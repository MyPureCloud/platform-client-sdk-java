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
import com.mypurecloud.sdk.v2.model.ListItem;
import com.mypurecloud.sdk.v2.model.ListValues;
import com.mypurecloud.sdk.v2.model.StaticListValuesAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * StaticListValues
 */

public class StaticListValues extends ListValues implements Serializable {
  
  private List<ListItem> items = null;

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
   * Defines how matching should work.
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

  public StaticListValues() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      items = new ArrayList<ListItem>();
    }
  }

  public StaticListValues(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      items = new ArrayList<ListItem>();
    }
  }

  
  /**
   * Array of list items. Each item contains a value and optional synonyms.
   **/
  public StaticListValues items(List<ListItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Array of list items. Each item contains a value and optional synonyms.")
  @JsonProperty("items")
  public List<ListItem> getItems() {
    return items;
  }
  public void setItems(List<ListItem> items) {
    this.items = items;
  }


  /**
   * Defines how matching should work.
   **/
  public StaticListValues matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines how matching should work.")
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
    StaticListValues staticListValues = (StaticListValues) o;

    return Objects.equals(this.items, staticListValues.items) &&
            Objects.equals(this.matchType, staticListValues.matchType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, matchType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticListValues {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

