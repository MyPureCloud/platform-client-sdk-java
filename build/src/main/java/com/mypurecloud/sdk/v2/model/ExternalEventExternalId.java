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

import java.io.Serializable;
/**
 * ExternalEventExternalId
 */

public class ExternalEventExternalId  implements Serializable {
  
  private String value = null;
  private String externalSourceId = null;

  public ExternalEventExternalId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ExternalEventExternalId(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The value of the identifier.
   **/
  public ExternalEventExternalId value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of the identifier.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * The id of the external source.
   **/
  public ExternalEventExternalId externalSourceId(String externalSourceId) {
    this.externalSourceId = externalSourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the external source.")
  @JsonProperty("externalSourceId")
  public String getExternalSourceId() {
    return externalSourceId;
  }
  public void setExternalSourceId(String externalSourceId) {
    this.externalSourceId = externalSourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalEventExternalId externalEventExternalId = (ExternalEventExternalId) o;

    return Objects.equals(this.value, externalEventExternalId.value) &&
            Objects.equals(this.externalSourceId, externalEventExternalId.externalSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, externalSourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalEventExternalId {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    externalSourceId: ").append(toIndentedString(externalSourceId)).append("\n");
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

