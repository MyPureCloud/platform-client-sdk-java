package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicEdgeReference;
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicLineStatus;
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicOffsetDateTime;
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicProvisionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PhoneChangeTopicPhoneStatus
 */

public class PhoneChangeTopicPhoneStatus  implements Serializable {
  
  private String id = null;

  /**
   * Gets or Sets operationalStatus
   */
  public enum OperationalStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPERATIONAL("OPERATIONAL"),
    DEGRADED("DEGRADED"),
    OFFLINE("OFFLINE");

    private String value;

    OperationalStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperationalStatusEnum fromString(String key) {
      if (key == null) return null;

      for (OperationalStatusEnum value : OperationalStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperationalStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperationalStatusEnum operationalStatus = null;
  private PhoneChangeTopicEdgeReference edge = null;
  private PhoneChangeTopicProvisionInfo provision = null;
  private List<PhoneChangeTopicLineStatus> lineStatuses = new ArrayList<PhoneChangeTopicLineStatus>();
  private PhoneChangeTopicOffsetDateTime eventCreationTime = null;

  
  /**
   **/
  public PhoneChangeTopicPhoneStatus id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public PhoneChangeTopicPhoneStatus operationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operationalStatus")
  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }
  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }

  
  /**
   **/
  public PhoneChangeTopicPhoneStatus edge(PhoneChangeTopicEdgeReference edge) {
    this.edge = edge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edge")
  public PhoneChangeTopicEdgeReference getEdge() {
    return edge;
  }
  public void setEdge(PhoneChangeTopicEdgeReference edge) {
    this.edge = edge;
  }

  
  /**
   **/
  public PhoneChangeTopicPhoneStatus provision(PhoneChangeTopicProvisionInfo provision) {
    this.provision = provision;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("provision")
  public PhoneChangeTopicProvisionInfo getProvision() {
    return provision;
  }
  public void setProvision(PhoneChangeTopicProvisionInfo provision) {
    this.provision = provision;
  }

  
  /**
   **/
  public PhoneChangeTopicPhoneStatus lineStatuses(List<PhoneChangeTopicLineStatus> lineStatuses) {
    this.lineStatuses = lineStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineStatuses")
  public List<PhoneChangeTopicLineStatus> getLineStatuses() {
    return lineStatuses;
  }
  public void setLineStatuses(List<PhoneChangeTopicLineStatus> lineStatuses) {
    this.lineStatuses = lineStatuses;
  }

  
  /**
   **/
  public PhoneChangeTopicPhoneStatus eventCreationTime(PhoneChangeTopicOffsetDateTime eventCreationTime) {
    this.eventCreationTime = eventCreationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventCreationTime")
  public PhoneChangeTopicOffsetDateTime getEventCreationTime() {
    return eventCreationTime;
  }
  public void setEventCreationTime(PhoneChangeTopicOffsetDateTime eventCreationTime) {
    this.eventCreationTime = eventCreationTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChangeTopicPhoneStatus phoneChangeTopicPhoneStatus = (PhoneChangeTopicPhoneStatus) o;
    return Objects.equals(this.id, phoneChangeTopicPhoneStatus.id) &&
        Objects.equals(this.operationalStatus, phoneChangeTopicPhoneStatus.operationalStatus) &&
        Objects.equals(this.edge, phoneChangeTopicPhoneStatus.edge) &&
        Objects.equals(this.provision, phoneChangeTopicPhoneStatus.provision) &&
        Objects.equals(this.lineStatuses, phoneChangeTopicPhoneStatus.lineStatuses) &&
        Objects.equals(this.eventCreationTime, phoneChangeTopicPhoneStatus.eventCreationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operationalStatus, edge, provision, lineStatuses, eventCreationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChangeTopicPhoneStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    provision: ").append(toIndentedString(provision)).append("\n");
    sb.append("    lineStatuses: ").append(toIndentedString(lineStatuses)).append("\n");
    sb.append("    eventCreationTime: ").append(toIndentedString(eventCreationTime)).append("\n");
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

