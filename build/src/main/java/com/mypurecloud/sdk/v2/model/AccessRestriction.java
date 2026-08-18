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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AccessRestriction
 */

public class AccessRestriction  implements Serializable {
  
  private String kind = null;
  private List<String> values = null;

  public AccessRestriction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<String>();
    }
  }

  public AccessRestriction(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      values = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public AccessRestriction kind(String kind) {
    this.kind = kind;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }


  /**
   **/
  public AccessRestriction values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
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
    AccessRestriction accessRestriction = (AccessRestriction) o;

    return Objects.equals(this.kind, accessRestriction.kind) &&
            Objects.equals(this.values, accessRestriction.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRestriction {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

