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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * HrisTimeOffType
 */

public class HrisTimeOffType  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String hrisIntegrationId = null;
  private String secondaryId = null;

  
  /**
   * The ID of the time off type configured in integration.
   **/
  public HrisTimeOffType id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the time off type configured in integration.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the time off type configured in integration.
   **/
  public HrisTimeOffType name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the time off type configured in integration.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The ID of the integration.
   **/
  public HrisTimeOffType hrisIntegrationId(String hrisIntegrationId) {
    this.hrisIntegrationId = hrisIntegrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the integration.")
  @JsonProperty("hrisIntegrationId")
  public String getHrisIntegrationId() {
    return hrisIntegrationId;
  }
  public void setHrisIntegrationId(String hrisIntegrationId) {
    this.hrisIntegrationId = hrisIntegrationId;
  }


  /**
   * Secondary ID of the time off type, if configured in integration.
   **/
  public HrisTimeOffType secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Secondary ID of the time off type, if configured in integration.")
  @JsonProperty("secondaryId")
  public String getSecondaryId() {
    return secondaryId;
  }
  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrisTimeOffType hrisTimeOffType = (HrisTimeOffType) o;

    return Objects.equals(this.id, hrisTimeOffType.id) &&
            Objects.equals(this.name, hrisTimeOffType.name) &&
            Objects.equals(this.hrisIntegrationId, hrisTimeOffType.hrisIntegrationId) &&
            Objects.equals(this.secondaryId, hrisTimeOffType.secondaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hrisIntegrationId, secondaryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrisTimeOffType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hrisIntegrationId: ").append(toIndentedString(hrisIntegrationId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

