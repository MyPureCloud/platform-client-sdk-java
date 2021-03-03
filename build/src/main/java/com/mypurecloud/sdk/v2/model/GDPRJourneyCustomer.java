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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GDPRJourneyCustomer
 */

public class GDPRJourneyCustomer  implements Serializable {
  
  private String type = null;
  private String id = null;

  
  /**
   * The type of the customerId within the Journey System (e.g. cookie). Required if `id` is defined.
   **/
  public GDPRJourneyCustomer type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the customerId within the Journey System (e.g. cookie). Required if `id` is defined.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * An ID of a customer within the Journey System at a point-in-time. Required if `type` is defined.
   **/
  public GDPRJourneyCustomer id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ID of a customer within the Journey System at a point-in-time. Required if `type` is defined.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GDPRJourneyCustomer gDPRJourneyCustomer = (GDPRJourneyCustomer) o;
    return Objects.equals(this.type, gDPRJourneyCustomer.type) &&
        Objects.equals(this.id, gDPRJourneyCustomer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GDPRJourneyCustomer {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

