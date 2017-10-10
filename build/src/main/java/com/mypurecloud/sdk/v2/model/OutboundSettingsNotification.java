package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * OutboundSettingsNotification
 */

public class OutboundSettingsNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private Integer maxCallsPerAgent = null;
  private BigDecimal maxLineUtilization = null;
  private BigDecimal abandonSeconds = null;

  /**
   * Gets or Sets complianceAbandonRateDenominator
   */
  public enum ComplianceAbandonRateDenominatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL_CALLS("ALL_CALLS"),
    CALLS_THAT_REACHED_QUEUE("CALLS_THAT_REACHED_QUEUE");

    private String value;

    ComplianceAbandonRateDenominatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ComplianceAbandonRateDenominatorEnum fromString(String key) {
      if (key == null) return null;

      for (ComplianceAbandonRateDenominatorEnum value : ComplianceAbandonRateDenominatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ComplianceAbandonRateDenominatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ComplianceAbandonRateDenominatorEnum complianceAbandonRateDenominator = null;

  
  /**
   **/
  public OutboundSettingsNotification id(String id) {
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
  public OutboundSettingsNotification name(String name) {
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
  public OutboundSettingsNotification dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public OutboundSettingsNotification dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public OutboundSettingsNotification version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  public OutboundSettingsNotification maxCallsPerAgent(Integer maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxCallsPerAgent")
  public Integer getMaxCallsPerAgent() {
    return maxCallsPerAgent;
  }
  public void setMaxCallsPerAgent(Integer maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
  }

  
  /**
   **/
  public OutboundSettingsNotification maxLineUtilization(BigDecimal maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxLineUtilization")
  public BigDecimal getMaxLineUtilization() {
    return maxLineUtilization;
  }
  public void setMaxLineUtilization(BigDecimal maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
  }

  
  /**
   **/
  public OutboundSettingsNotification abandonSeconds(BigDecimal abandonSeconds) {
    this.abandonSeconds = abandonSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("abandonSeconds")
  public BigDecimal getAbandonSeconds() {
    return abandonSeconds;
  }
  public void setAbandonSeconds(BigDecimal abandonSeconds) {
    this.abandonSeconds = abandonSeconds;
  }

  
  /**
   **/
  public OutboundSettingsNotification complianceAbandonRateDenominator(ComplianceAbandonRateDenominatorEnum complianceAbandonRateDenominator) {
    this.complianceAbandonRateDenominator = complianceAbandonRateDenominator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("complianceAbandonRateDenominator")
  public ComplianceAbandonRateDenominatorEnum getComplianceAbandonRateDenominator() {
    return complianceAbandonRateDenominator;
  }
  public void setComplianceAbandonRateDenominator(ComplianceAbandonRateDenominatorEnum complianceAbandonRateDenominator) {
    this.complianceAbandonRateDenominator = complianceAbandonRateDenominator;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundSettingsNotification outboundSettingsNotification = (OutboundSettingsNotification) o;
    return Objects.equals(this.id, outboundSettingsNotification.id) &&
        Objects.equals(this.name, outboundSettingsNotification.name) &&
        Objects.equals(this.dateCreated, outboundSettingsNotification.dateCreated) &&
        Objects.equals(this.dateModified, outboundSettingsNotification.dateModified) &&
        Objects.equals(this.version, outboundSettingsNotification.version) &&
        Objects.equals(this.maxCallsPerAgent, outboundSettingsNotification.maxCallsPerAgent) &&
        Objects.equals(this.maxLineUtilization, outboundSettingsNotification.maxLineUtilization) &&
        Objects.equals(this.abandonSeconds, outboundSettingsNotification.abandonSeconds) &&
        Objects.equals(this.complianceAbandonRateDenominator, outboundSettingsNotification.complianceAbandonRateDenominator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, maxCallsPerAgent, maxLineUtilization, abandonSeconds, complianceAbandonRateDenominator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundSettingsNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxCallsPerAgent: ").append(toIndentedString(maxCallsPerAgent)).append("\n");
    sb.append("    maxLineUtilization: ").append(toIndentedString(maxLineUtilization)).append("\n");
    sb.append("    abandonSeconds: ").append(toIndentedString(abandonSeconds)).append("\n");
    sb.append("    complianceAbandonRateDenominator: ").append(toIndentedString(complianceAbandonRateDenominator)).append("\n");
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

