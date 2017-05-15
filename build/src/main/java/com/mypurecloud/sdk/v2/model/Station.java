package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Station
 */

public class Station  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVAILABLE("AVAILABLE"),
    ASSOCIATED("ASSOCIATED");

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
  private String userId = null;
  private String webRtcUserId = null;
  private UriReference primaryEdge = null;
  private UriReference secondaryEdge = null;
  private String type = null;
  private String lineAppearanceId = null;
  private Integer webRtcMediaDscp = null;
  private Boolean webRtcPersistentEnabled = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public Station name(String name) {
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
   **/
  public Station description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public Station status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The Id of the user currently logged in and associated with the station.
   **/
  public Station userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Id of the user currently logged in and associated with the station.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The Id of the user configured for the station if it is of type inin_webrtc_softphone. Empty if station type is not inin_webrtc_softphone.
   **/
  public Station webRtcUserId(String webRtcUserId) {
    this.webRtcUserId = webRtcUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Id of the user configured for the station if it is of type inin_webrtc_softphone. Empty if station type is not inin_webrtc_softphone.")
  @JsonProperty("webRtcUserId")
  public String getWebRtcUserId() {
    return webRtcUserId;
  }
  public void setWebRtcUserId(String webRtcUserId) {
    this.webRtcUserId = webRtcUserId;
  }


  /**
   **/
  public Station primaryEdge(UriReference primaryEdge) {
    this.primaryEdge = primaryEdge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primaryEdge")
  public UriReference getPrimaryEdge() {
    return primaryEdge;
  }
  public void setPrimaryEdge(UriReference primaryEdge) {
    this.primaryEdge = primaryEdge;
  }


  /**
   **/
  public Station secondaryEdge(UriReference secondaryEdge) {
    this.secondaryEdge = secondaryEdge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondaryEdge")
  public UriReference getSecondaryEdge() {
    return secondaryEdge;
  }
  public void setSecondaryEdge(UriReference secondaryEdge) {
    this.secondaryEdge = secondaryEdge;
  }


  /**
   **/
  public Station type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   **/
  public Station lineAppearanceId(String lineAppearanceId) {
    this.lineAppearanceId = lineAppearanceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineAppearanceId")
  public String getLineAppearanceId() {
    return lineAppearanceId;
  }
  public void setLineAppearanceId(String lineAppearanceId) {
    this.lineAppearanceId = lineAppearanceId;
  }


  @ApiModelProperty(example = "null", value = "The default or configured value of media dscp for the station. Empty if station type is not inin_webrtc_softphone.")
  @JsonProperty("webRtcMediaDscp")
  public Integer getWebRtcMediaDscp() {
    return webRtcMediaDscp;
  }


  @ApiModelProperty(example = "null", value = "The default or configured value of persistent connection setting for the station. Empty if station type is not inin_webrtc_softphone.")
  @JsonProperty("webRtcPersistentEnabled")
  public Boolean getWebRtcPersistentEnabled() {
    return webRtcPersistentEnabled;
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
    Station station = (Station) o;
    return Objects.equals(this.id, station.id) &&
        Objects.equals(this.name, station.name) &&
        Objects.equals(this.description, station.description) &&
        Objects.equals(this.status, station.status) &&
        Objects.equals(this.userId, station.userId) &&
        Objects.equals(this.webRtcUserId, station.webRtcUserId) &&
        Objects.equals(this.primaryEdge, station.primaryEdge) &&
        Objects.equals(this.secondaryEdge, station.secondaryEdge) &&
        Objects.equals(this.type, station.type) &&
        Objects.equals(this.lineAppearanceId, station.lineAppearanceId) &&
        Objects.equals(this.webRtcMediaDscp, station.webRtcMediaDscp) &&
        Objects.equals(this.webRtcPersistentEnabled, station.webRtcPersistentEnabled) &&
        Objects.equals(this.selfUri, station.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, status, userId, webRtcUserId, primaryEdge, secondaryEdge, type, lineAppearanceId, webRtcMediaDscp, webRtcPersistentEnabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Station {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    webRtcUserId: ").append(toIndentedString(webRtcUserId)).append("\n");
    sb.append("    primaryEdge: ").append(toIndentedString(primaryEdge)).append("\n");
    sb.append("    secondaryEdge: ").append(toIndentedString(secondaryEdge)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lineAppearanceId: ").append(toIndentedString(lineAppearanceId)).append("\n");
    sb.append("    webRtcMediaDscp: ").append(toIndentedString(webRtcMediaDscp)).append("\n");
    sb.append("    webRtcPersistentEnabled: ").append(toIndentedString(webRtcPersistentEnabled)).append("\n");
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

