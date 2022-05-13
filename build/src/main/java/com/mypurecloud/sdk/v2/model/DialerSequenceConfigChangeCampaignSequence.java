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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DialerSequenceConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DialerSequenceConfigChangeCampaignSequence
 */

public class DialerSequenceConfigChangeCampaignSequence  implements Serializable {
  
  private List<DialerSequenceConfigChangeUriReference> campaigns = new ArrayList<DialerSequenceConfigChangeUriReference>();
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
   * Gets or Sets status
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
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;

  
  /**
   * the ordered list of campaign identifiers
   **/
  public DialerSequenceConfigChangeCampaignSequence campaigns(List<DialerSequenceConfigChangeUriReference> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the ordered list of campaign identifiers")
  @JsonProperty("campaigns")
  public List<DialerSequenceConfigChangeUriReference> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<DialerSequenceConfigChangeUriReference> campaigns) {
    this.campaigns = campaigns;
  }


  /**
   * the zero-based index of the current campaign in the campaigns list
   **/
  public DialerSequenceConfigChangeCampaignSequence currentCampaign(Integer currentCampaign) {
    this.currentCampaign = currentCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the zero-based index of the current campaign in the campaigns list")
  @JsonProperty("currentCampaign")
  public Integer getCurrentCampaign() {
    return currentCampaign;
  }
  public void setCurrentCampaign(Integer currentCampaign) {
    this.currentCampaign = currentCampaign;
  }


  /**
   **/
  public DialerSequenceConfigChangeCampaignSequence status(StatusEnum status) {
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
   * if a sequence has unexpectedly stopped, this message provides the reason
   **/
  public DialerSequenceConfigChangeCampaignSequence stopMessage(String stopMessage) {
    this.stopMessage = stopMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "if a sequence has unexpectedly stopped, this message provides the reason")
  @JsonProperty("stopMessage")
  public String getStopMessage() {
    return stopMessage;
  }
  public void setStopMessage(String stopMessage) {
    this.stopMessage = stopMessage;
  }


  /**
   * indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false
   **/
  public DialerSequenceConfigChangeCampaignSequence repeat(Boolean repeat) {
    this.repeat = repeat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "indicates if a sequence is to repeat from the beginning after the last campaign completes; default is false")
  @JsonProperty("repeat")
  public Boolean getRepeat() {
    return repeat;
  }
  public void setRepeat(Boolean repeat) {
    this.repeat = repeat;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public DialerSequenceConfigChangeCampaignSequence id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The UI-visible name of the object
   **/
  public DialerSequenceConfigChangeCampaignSequence name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UI-visible name of the object")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Creation time of the entity
   **/
  public DialerSequenceConfigChangeCampaignSequence dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation time of the entity")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Last modified time of the entity
   **/
  public DialerSequenceConfigChangeCampaignSequence dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DialerSequenceConfigChangeCampaignSequence version(Integer version) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerSequenceConfigChangeCampaignSequence dialerSequenceConfigChangeCampaignSequence = (DialerSequenceConfigChangeCampaignSequence) o;

    return Objects.equals(this.campaigns, dialerSequenceConfigChangeCampaignSequence.campaigns) &&
            Objects.equals(this.currentCampaign, dialerSequenceConfigChangeCampaignSequence.currentCampaign) &&
            Objects.equals(this.status, dialerSequenceConfigChangeCampaignSequence.status) &&
            Objects.equals(this.stopMessage, dialerSequenceConfigChangeCampaignSequence.stopMessage) &&
            Objects.equals(this.repeat, dialerSequenceConfigChangeCampaignSequence.repeat) &&
            Objects.equals(this.id, dialerSequenceConfigChangeCampaignSequence.id) &&
            Objects.equals(this.name, dialerSequenceConfigChangeCampaignSequence.name) &&
            Objects.equals(this.dateCreated, dialerSequenceConfigChangeCampaignSequence.dateCreated) &&
            Objects.equals(this.dateModified, dialerSequenceConfigChangeCampaignSequence.dateModified) &&
            Objects.equals(this.version, dialerSequenceConfigChangeCampaignSequence.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, currentCampaign, status, stopMessage, repeat, id, name, dateCreated, dateModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerSequenceConfigChangeCampaignSequence {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    currentCampaign: ").append(toIndentedString(currentCampaign)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stopMessage: ").append(toIndentedString(stopMessage)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

