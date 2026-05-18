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
import com.mypurecloud.sdk.v2.model.ConversationDataSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CustomAttributes
 */

public class CustomAttributes  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String conversationId = null;
  private List<String> divisions = null;
  private ConversationDataSchema schema = null;
  private Map<String, Object> customAttributes = null;
  private Map<String, String> customAttributesTimestamps = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public CustomAttributes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      divisions = new ArrayList<String>();
    }
  }

  public CustomAttributes(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      divisions = new ArrayList<String>();
    }
  }

  
  /**
   * The id of the Custom Attributes record.
   **/
  public CustomAttributes id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the Custom Attributes record.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public CustomAttributes name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The id of the conversation.
   **/
  public CustomAttributes conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the conversation.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The list of division ids that the record is visible in. If [], the record is visible to all divisions (Unassigned Division).
   **/
  public CustomAttributes divisions(List<String> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of division ids that the record is visible in. If [], the record is visible to all divisions (Unassigned Division).")
  @JsonProperty("divisions")
  public List<String> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<String> divisions) {
    this.divisions = divisions;
  }


  /**
   * The schema that dictates which attributes can be included.
   **/
  public CustomAttributes schema(ConversationDataSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema that dictates which attributes can be included.")
  @JsonProperty("schema")
  public ConversationDataSchema getSchema() {
    return schema;
  }
  public void setSchema(ConversationDataSchema schema) {
    this.schema = schema;
  }


  /**
   * The map of attribute values.
   **/
  public CustomAttributes customAttributes(Map<String, Object> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The map of attribute values.")
  @JsonProperty("customAttributes")
  public Map<String, Object> getCustomAttributes() {
    return customAttributes;
  }
  public void setCustomAttributes(Map<String, Object> customAttributes) {
    this.customAttributes = customAttributes;
  }


  @ApiModelProperty(example = "null", value = "The map of timestamps for when each attribute was last updated.")
  @JsonProperty("customAttributesTimestamps")
  public Map<String, String> getCustomAttributesTimestamps() {
    return customAttributesTimestamps;
  }


  /**
   * The latest version of the Custom Attributes record.
   **/
  public CustomAttributes version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The latest version of the Custom Attributes record.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * The date the record was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CustomAttributes dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the record was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The date the record was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CustomAttributes dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the record was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributes customAttributes = (CustomAttributes) o;

    return Objects.equals(this.id, customAttributes.id) &&
            Objects.equals(this.name, customAttributes.name) &&
            Objects.equals(this.conversationId, customAttributes.conversationId) &&
            Objects.equals(this.divisions, customAttributes.divisions) &&
            Objects.equals(this.schema, customAttributes.schema) &&
            Objects.equals(this.customAttributes, customAttributes.customAttributes) &&
            Objects.equals(this.customAttributesTimestamps, customAttributes.customAttributesTimestamps) &&
            Objects.equals(this.version, customAttributes.version) &&
            Objects.equals(this.dateCreated, customAttributes.dateCreated) &&
            Objects.equals(this.dateModified, customAttributes.dateModified) &&
            Objects.equals(this.selfUri, customAttributes.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, conversationId, divisions, schema, customAttributes, customAttributesTimestamps, version, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    customAttributesTimestamps: ").append(toIndentedString(customAttributesTimestamps)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

