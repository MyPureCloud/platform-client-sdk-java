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
import com.mypurecloud.sdk.v2.model.AgenticVersionAddressableEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AgenticVirtualAgent
 */

public class AgenticVirtualAgent  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the virtual agent.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    PUBLISHED("Published");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private AgenticVersionAddressableEntity latestSavedVersion = null;
  private AgenticVersionAddressableEntity latestProductionReadyVersion = null;
  private String imageUri = null;
  private String selfUri = null;

  public AgenticVirtualAgent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVirtualAgent(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public AgenticVirtualAgent name(String name) {
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


  @ApiModelProperty(example = "null", value = "The date and time the virtual agent was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The date and time the virtual agent was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The status of the virtual agent.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "The latest saved version of the virtual agent.")
  @JsonProperty("latestSavedVersion")
  public AgenticVersionAddressableEntity getLatestSavedVersion() {
    return latestSavedVersion;
  }


  @ApiModelProperty(example = "null", value = "The latest production ready version of the virtual agent.")
  @JsonProperty("latestProductionReadyVersion")
  public AgenticVersionAddressableEntity getLatestProductionReadyVersion() {
    return latestProductionReadyVersion;
  }


  /**
   * The URI of the image for the virtual agent.
   **/
  public AgenticVirtualAgent imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the image for the virtual agent.")
  @JsonProperty("imageUri")
  public String getImageUri() {
    return imageUri;
  }
  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
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
    AgenticVirtualAgent agenticVirtualAgent = (AgenticVirtualAgent) o;

    return Objects.equals(this.id, agenticVirtualAgent.id) &&
            Objects.equals(this.name, agenticVirtualAgent.name) &&
            Objects.equals(this.dateCreated, agenticVirtualAgent.dateCreated) &&
            Objects.equals(this.dateModified, agenticVirtualAgent.dateModified) &&
            Objects.equals(this.status, agenticVirtualAgent.status) &&
            Objects.equals(this.latestSavedVersion, agenticVirtualAgent.latestSavedVersion) &&
            Objects.equals(this.latestProductionReadyVersion, agenticVirtualAgent.latestProductionReadyVersion) &&
            Objects.equals(this.imageUri, agenticVirtualAgent.imageUri) &&
            Objects.equals(this.selfUri, agenticVirtualAgent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, status, latestSavedVersion, latestProductionReadyVersion, imageUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    latestSavedVersion: ").append(toIndentedString(latestSavedVersion)).append("\n");
    sb.append("    latestProductionReadyVersion: ").append(toIndentedString(latestProductionReadyVersion)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
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

