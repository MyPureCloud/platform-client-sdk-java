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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignSequence
 */

public class CampaignSequence  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<DomainEntityRef> campaigns = new ArrayList<DomainEntityRef>();
  private Integer currentCampaign = null;

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
   * The current status of the CampaignSequence. A CampaignSequence can be turned 'on' or 'off'.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("on"),
    OFF("off"),
    COMPLETE("complete");

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
  private String stopMessage = null;
  private Boolean repeat = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public CampaignSequence name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public CampaignSequence version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The ordered list of Campaigns that this CampaignSequence will run.
   **/
  public CampaignSequence campaigns(List<DomainEntityRef> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ordered list of Campaigns that this CampaignSequence will run.")
  @JsonProperty("campaigns")
  public List<DomainEntityRef> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<DomainEntityRef> campaigns) {
    this.campaigns = campaigns;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "A zero-based index indicating which Campaign this CampaignSequence is currently on.")
  @JsonProperty("currentCampaign")
  public Integer getCurrentCampaign() {
    return currentCampaign;
  }

  
  /**
   * The current status of the CampaignSequence. A CampaignSequence can be turned 'on' or 'off'.
   **/
  public CampaignSequence status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current status of the CampaignSequence. A CampaignSequence can be turned 'on' or 'off'.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  @ApiModelProperty(example = "null", value = "A message indicating if and why a CampaignSequence has stopped unexpectedly.")
  @JsonProperty("stopMessage")
  public String getStopMessage() {
    return stopMessage;
  }

  
  /**
   * Indicates if a sequence should repeat from the beginning after the last campaign completes. Default is false.
   **/
  public CampaignSequence repeat(Boolean repeat) {
    this.repeat = repeat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if a sequence should repeat from the beginning after the last campaign completes. Default is false.")
  @JsonProperty("repeat")
  public Boolean getRepeat() {
    return repeat;
  }
  public void setRepeat(Boolean repeat) {
    this.repeat = repeat;
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
    CampaignSequence campaignSequence = (CampaignSequence) o;
    return Objects.equals(this.id, campaignSequence.id) &&
        Objects.equals(this.name, campaignSequence.name) &&
        Objects.equals(this.dateCreated, campaignSequence.dateCreated) &&
        Objects.equals(this.dateModified, campaignSequence.dateModified) &&
        Objects.equals(this.version, campaignSequence.version) &&
        Objects.equals(this.campaigns, campaignSequence.campaigns) &&
        Objects.equals(this.currentCampaign, campaignSequence.currentCampaign) &&
        Objects.equals(this.status, campaignSequence.status) &&
        Objects.equals(this.stopMessage, campaignSequence.stopMessage) &&
        Objects.equals(this.repeat, campaignSequence.repeat) &&
        Objects.equals(this.selfUri, campaignSequence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, campaigns, currentCampaign, status, stopMessage, repeat, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSequence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    currentCampaign: ").append(toIndentedString(currentCampaign)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stopMessage: ").append(toIndentedString(stopMessage)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
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

