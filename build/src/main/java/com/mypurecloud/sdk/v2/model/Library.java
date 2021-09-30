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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Library
 */

public class Library  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer version = null;
  private User createdBy = null;
  private Date dateCreated = null;

  private static class ResponseTypeEnumDeserializer extends StdDeserializer<ResponseTypeEnum> {
    public ResponseTypeEnumDeserializer() {
      super(ResponseTypeEnumDeserializer.class);
    }

    @Override
    public ResponseTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResponseTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * This value is deprecated. Responses representing message templates may be added to any library.
   */
 @JsonDeserialize(using = ResponseTypeEnumDeserializer.class)
  public enum ResponseTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MESSAGINGTEMPLATE("MessagingTemplate"),
    CAMPAIGNSMSTEMPLATE("CampaignSmsTemplate"),
    CAMPAIGNEMAILTEMPLATE("CampaignEmailTemplate");

    private String value;

    ResponseTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResponseTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ResponseTypeEnum value : ResponseTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResponseTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResponseTypeEnum responseType = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The library name.
   **/
  public Library name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The library name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Current version for this resource.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  
  @ApiModelProperty(example = "null", value = "User that created the library.")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  /**
   * This value is deprecated. Responses representing message templates may be added to any library.
   **/
  public Library responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This value is deprecated. Responses representing message templates may be added to any library.")
  @JsonProperty("responseType")
  public ResponseTypeEnum getResponseType() {
    return responseType;
  }
  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
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
    Library library = (Library) o;
    return Objects.equals(this.id, library.id) &&
        Objects.equals(this.name, library.name) &&
        Objects.equals(this.version, library.version) &&
        Objects.equals(this.createdBy, library.createdBy) &&
        Objects.equals(this.dateCreated, library.dateCreated) &&
        Objects.equals(this.responseType, library.responseType) &&
        Objects.equals(this.selfUri, library.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, createdBy, dateCreated, responseType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Library {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
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

