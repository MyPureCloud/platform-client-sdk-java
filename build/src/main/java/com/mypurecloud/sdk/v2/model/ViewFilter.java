package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ViewFilter
 */

public class ViewFilter  implements Serializable {
  

  /**
   * Gets or Sets mediaTypes
   */
  public enum MediaTypesEnum {
    VOICE("voice"),
    CHAT("chat"),
    EMAIL("email"),
    CALLBACK("callback"),
    COBROWSE("cobrowse"),
    VIDEO("video"),
    SCREENSHARE("screenshare"),
    MESSAGE("message");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();
  private List<String> queueIds = new ArrayList<String>();
  private List<String> skillIds = new ArrayList<String>();
  private List<String> languageIds = new ArrayList<String>();

  /**
   * Gets or Sets directions
   */
  public enum DirectionsEnum {
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionsEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionsEnum value : DirectionsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DirectionsEnum> directions = new ArrayList<DirectionsEnum>();
  private List<String> wrapUpCodes = new ArrayList<String>();
  private List<String> dnisList = new ArrayList<String>();
  private List<String> userIds = new ArrayList<String>();
  private List<String> addressTos = new ArrayList<String>();
  private List<String> outboundCampaignIds = new ArrayList<String>();
  private List<String> outboundContactListIds = new ArrayList<String>();

  
  /**
   * The media types used to filter the data export request
   **/
  public ViewFilter mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media types used to filter the data export request")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  
  /**
   * The queue ids used to filter the data export request
   **/
  public ViewFilter queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ids used to filter the data export request")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }

  
  /**
   * The skill ids used to filter the data export request
   **/
  public ViewFilter skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill ids used to filter the data export request")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  
  /**
   * The language ids used to filter the data export request
   **/
  public ViewFilter languageIds(List<String> languageIds) {
    this.languageIds = languageIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language ids used to filter the data export request")
  @JsonProperty("languageIds")
  public List<String> getLanguageIds() {
    return languageIds;
  }
  public void setLanguageIds(List<String> languageIds) {
    this.languageIds = languageIds;
  }

  
  /**
   * The directions used to filter the data export request
   **/
  public ViewFilter directions(List<DirectionsEnum> directions) {
    this.directions = directions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The directions used to filter the data export request")
  @JsonProperty("directions")
  public List<DirectionsEnum> getDirections() {
    return directions;
  }
  public void setDirections(List<DirectionsEnum> directions) {
    this.directions = directions;
  }

  
  /**
   * The wrap up codes used to filter the data export request
   **/
  public ViewFilter wrapUpCodes(List<String> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The wrap up codes used to filter the data export request")
  @JsonProperty("wrapUpCodes")
  public List<String> getWrapUpCodes() {
    return wrapUpCodes;
  }
  public void setWrapUpCodes(List<String> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
  }

  
  /**
   * The dnis list used to filter the data export request
   **/
  public ViewFilter dnisList(List<String> dnisList) {
    this.dnisList = dnisList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dnis list used to filter the data export request")
  @JsonProperty("dnisList")
  public List<String> getDnisList() {
    return dnisList;
  }
  public void setDnisList(List<String> dnisList) {
    this.dnisList = dnisList;
  }

  
  /**
   * The user ids used to filter the data export request
   **/
  public ViewFilter userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ids used to filter the data export request")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  
  /**
   * The address To values used to filter the data export request
   **/
  public ViewFilter addressTos(List<String> addressTos) {
    this.addressTos = addressTos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address To values used to filter the data export request")
  @JsonProperty("addressTos")
  public List<String> getAddressTos() {
    return addressTos;
  }
  public void setAddressTos(List<String> addressTos) {
    this.addressTos = addressTos;
  }

  
  /**
   * The outbound campaign ids used to filter the data export request
   **/
  public ViewFilter outboundCampaignIds(List<String> outboundCampaignIds) {
    this.outboundCampaignIds = outboundCampaignIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outbound campaign ids used to filter the data export request")
  @JsonProperty("outboundCampaignIds")
  public List<String> getOutboundCampaignIds() {
    return outboundCampaignIds;
  }
  public void setOutboundCampaignIds(List<String> outboundCampaignIds) {
    this.outboundCampaignIds = outboundCampaignIds;
  }

  
  /**
   * The outbound contact list ids used to filter the data export request
   **/
  public ViewFilter outboundContactListIds(List<String> outboundContactListIds) {
    this.outboundContactListIds = outboundContactListIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outbound contact list ids used to filter the data export request")
  @JsonProperty("outboundContactListIds")
  public List<String> getOutboundContactListIds() {
    return outboundContactListIds;
  }
  public void setOutboundContactListIds(List<String> outboundContactListIds) {
    this.outboundContactListIds = outboundContactListIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewFilter viewFilter = (ViewFilter) o;
    return Objects.equals(this.mediaTypes, viewFilter.mediaTypes) &&
        Objects.equals(this.queueIds, viewFilter.queueIds) &&
        Objects.equals(this.skillIds, viewFilter.skillIds) &&
        Objects.equals(this.languageIds, viewFilter.languageIds) &&
        Objects.equals(this.directions, viewFilter.directions) &&
        Objects.equals(this.wrapUpCodes, viewFilter.wrapUpCodes) &&
        Objects.equals(this.dnisList, viewFilter.dnisList) &&
        Objects.equals(this.userIds, viewFilter.userIds) &&
        Objects.equals(this.addressTos, viewFilter.addressTos) &&
        Objects.equals(this.outboundCampaignIds, viewFilter.outboundCampaignIds) &&
        Objects.equals(this.outboundContactListIds, viewFilter.outboundContactListIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaTypes, queueIds, skillIds, languageIds, directions, wrapUpCodes, dnisList, userIds, addressTos, outboundCampaignIds, outboundContactListIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewFilter {\n");
    
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    wrapUpCodes: ").append(toIndentedString(wrapUpCodes)).append("\n");
    sb.append("    dnisList: ").append(toIndentedString(dnisList)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    addressTos: ").append(toIndentedString(addressTos)).append("\n");
    sb.append("    outboundCampaignIds: ").append(toIndentedString(outboundCampaignIds)).append("\n");
    sb.append("    outboundContactListIds: ").append(toIndentedString(outboundContactListIds)).append("\n");
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

