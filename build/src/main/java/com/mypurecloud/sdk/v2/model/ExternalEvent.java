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
import com.mypurecloud.sdk.v2.model.ExternalEventIdentifiers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ExternalEvent
 */

public class ExternalEvent  implements Serializable {
  
  private String id = null;
  private Date dateCreated = null;
  private ExternalEventIdentifiers identifiers = null;
  private Map<String, Object> attributes = null;

  public ExternalEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ExternalEvent(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the event.
   **/
  public ExternalEvent id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the event.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExternalEvent dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The identifiers of the contact the event is for.
   **/
  public ExternalEvent identifiers(ExternalEventIdentifiers identifiers) {
    this.identifiers = identifiers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifiers of the contact the event is for.")
  @JsonProperty("identifiers")
  public ExternalEventIdentifiers getIdentifiers() {
    return identifiers;
  }
  public void setIdentifiers(ExternalEventIdentifiers identifiers) {
    this.identifiers = identifiers;
  }


  /**
   * The event attributes.
   **/
  public ExternalEvent attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The event attributes.")
  @JsonProperty("attributes")
  public Map<String, Object> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalEvent externalEvent = (ExternalEvent) o;

    return Objects.equals(this.id, externalEvent.id) &&
            Objects.equals(this.dateCreated, externalEvent.dateCreated) &&
            Objects.equals(this.identifiers, externalEvent.identifiers) &&
            Objects.equals(this.attributes, externalEvent.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, identifiers, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

