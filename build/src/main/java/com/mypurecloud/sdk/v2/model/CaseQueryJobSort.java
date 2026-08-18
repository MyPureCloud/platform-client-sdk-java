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
 * CaseQueryJobSort
 */

public class CaseQueryJobSort  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The attribute to sort by. The default is dateDue.
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DATECREATED("dateCreated"),
    DATEMODIFIED("dateModified"),
    DATEDUE("dateDue"),
    PRIORITY("priority");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;
  private Boolean ascending = null;

  public CaseQueryJobSort() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CaseQueryJobSort(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The attribute to sort by. The default is dateDue.
   **/
  public CaseQueryJobSort name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attribute to sort by. The default is dateDue.")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }


  /**
   * Whether to sort in ascending order. The default is false.
   **/
  public CaseQueryJobSort ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to sort in ascending order. The default is false.")
  @JsonProperty("ascending")
  public Boolean getAscending() {
    return ascending;
  }
  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseQueryJobSort caseQueryJobSort = (CaseQueryJobSort) o;

    return Objects.equals(this.name, caseQueryJobSort.name) &&
            Objects.equals(this.ascending, caseQueryJobSort.ascending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ascending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseQueryJobSort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
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

