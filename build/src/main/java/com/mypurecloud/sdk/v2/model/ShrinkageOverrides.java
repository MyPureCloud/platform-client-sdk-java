package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ShrinkageOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ShrinkageOverrides
 */

public class ShrinkageOverrides  implements Serializable {
  
  private Boolean clear = null;
  private List<ShrinkageOverride> values = new ArrayList<ShrinkageOverride>();

  
  /**
   * Set true to clear the shrinkage interval overrides
   **/
  public ShrinkageOverrides clear(Boolean clear) {
    this.clear = clear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set true to clear the shrinkage interval overrides")
  @JsonProperty("clear")
  public Boolean getClear() {
    return clear;
  }
  public void setClear(Boolean clear) {
    this.clear = clear;
  }

  
  /**
   * List of interval shrinkage overrides
   **/
  public ShrinkageOverrides values(List<ShrinkageOverride> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of interval shrinkage overrides")
  @JsonProperty("values")
  public List<ShrinkageOverride> getValues() {
    return values;
  }
  public void setValues(List<ShrinkageOverride> values) {
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
    ShrinkageOverrides shrinkageOverrides = (ShrinkageOverrides) o;
    return Objects.equals(this.clear, shrinkageOverrides.clear) &&
        Objects.equals(this.values, shrinkageOverrides.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clear, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShrinkageOverrides {\n");
    
    sb.append("    clear: ").append(toIndentedString(clear)).append("\n");
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

