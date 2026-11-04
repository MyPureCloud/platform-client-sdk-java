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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * V2ExternalEventsContactExternalEventBody
 */

public class V2ExternalEventsContactExternalEventBody  implements Serializable {
  
  private String externalContactId = null;
  private String schemaId = null;
  private String eventId = null;
  private Date createdDate = null;
  private String source = null;
  private String divisionId = null;
  private Map<String, Object> attributes = null;

  public V2ExternalEventsContactExternalEventBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V2ExternalEventsContactExternalEventBody(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public V2ExternalEventsContactExternalEventBody externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   **/
  public V2ExternalEventsContactExternalEventBody schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   **/
  public V2ExternalEventsContactExternalEventBody eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   **/
  public V2ExternalEventsContactExternalEventBody createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  /**
   **/
  public V2ExternalEventsContactExternalEventBody source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   **/
  public V2ExternalEventsContactExternalEventBody divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   **/
  public V2ExternalEventsContactExternalEventBody attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    V2ExternalEventsContactExternalEventBody v2ExternalEventsContactExternalEventBody = (V2ExternalEventsContactExternalEventBody) o;

    return Objects.equals(this.externalContactId, v2ExternalEventsContactExternalEventBody.externalContactId) &&
            Objects.equals(this.schemaId, v2ExternalEventsContactExternalEventBody.schemaId) &&
            Objects.equals(this.eventId, v2ExternalEventsContactExternalEventBody.eventId) &&
            Objects.equals(this.createdDate, v2ExternalEventsContactExternalEventBody.createdDate) &&
            Objects.equals(this.source, v2ExternalEventsContactExternalEventBody.source) &&
            Objects.equals(this.divisionId, v2ExternalEventsContactExternalEventBody.divisionId) &&
            Objects.equals(this.attributes, v2ExternalEventsContactExternalEventBody.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalContactId, schemaId, eventId, createdDate, source, divisionId, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ExternalEventsContactExternalEventBody {\n");
    
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
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

