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
import com.mypurecloud.sdk.v2.model.DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * DialerOutboundSettingsConfigChangeOutboundSettings
 */

public class DialerOutboundSettingsConfigChangeOutboundSettings  implements Serializable {
  
  private Long maxCallsPerAgent = null;
  private BigDecimal maxLineUtilization = null;
  private BigDecimal abandonSeconds = null;

  private static class ComplianceAbandonRateDenominatorEnumDeserializer extends StdDeserializer<ComplianceAbandonRateDenominatorEnum> {
    public ComplianceAbandonRateDenominatorEnumDeserializer() {
      super(ComplianceAbandonRateDenominatorEnumDeserializer.class);
    }

    @Override
    public ComplianceAbandonRateDenominatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ComplianceAbandonRateDenominatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The denominator to be used in determining the compliance abandon rate
   */
 @JsonDeserialize(using = ComplianceAbandonRateDenominatorEnumDeserializer.class)
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
  private DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings automaticTimeZoneMapping = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;

  public DialerOutboundSettingsConfigChangeOutboundSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The maximum number of calls that can be placed per agent on any campaign
   **/
  public DialerOutboundSettingsConfigChangeOutboundSettings maxCallsPerAgent(Long maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of calls that can be placed per agent on any campaign")
  @JsonProperty("maxCallsPerAgent")
  public Long getMaxCallsPerAgent() {
    return maxCallsPerAgent;
  }
  public void setMaxCallsPerAgent(Long maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
  }


  /**
   * The maximum percentage of lines that should be used for Outbound, expressed as a decimal in the range [0.0, 1.0]
   **/
  public DialerOutboundSettingsConfigChangeOutboundSettings maxLineUtilization(BigDecimal maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum percentage of lines that should be used for Outbound, expressed as a decimal in the range [0.0, 1.0]")
  @JsonProperty("maxLineUtilization")
  public BigDecimal getMaxLineUtilization() {
    return maxLineUtilization;
  }
  public void setMaxLineUtilization(BigDecimal maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
  }


  /**
   * The number of seconds used to determine if a call is abandoned
   **/
  public DialerOutboundSettingsConfigChangeOutboundSettings abandonSeconds(BigDecimal abandonSeconds) {
    this.abandonSeconds = abandonSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds used to determine if a call is abandoned")
  @JsonProperty("abandonSeconds")
  public BigDecimal getAbandonSeconds() {
    return abandonSeconds;
  }
  public void setAbandonSeconds(BigDecimal abandonSeconds) {
    this.abandonSeconds = abandonSeconds;
  }


  /**
   * The denominator to be used in determining the compliance abandon rate
   **/
  public DialerOutboundSettingsConfigChangeOutboundSettings complianceAbandonRateDenominator(ComplianceAbandonRateDenominatorEnum complianceAbandonRateDenominator) {
    this.complianceAbandonRateDenominator = complianceAbandonRateDenominator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The denominator to be used in determining the compliance abandon rate")
  @JsonProperty("complianceAbandonRateDenominator")
  public ComplianceAbandonRateDenominatorEnum getComplianceAbandonRateDenominator() {
    return complianceAbandonRateDenominator;
  }
  public void setComplianceAbandonRateDenominator(ComplianceAbandonRateDenominatorEnum complianceAbandonRateDenominator) {
    this.complianceAbandonRateDenominator = complianceAbandonRateDenominator;
  }


  /**
   **/
  public DialerOutboundSettingsConfigChangeOutboundSettings automaticTimeZoneMapping(DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("automaticTimeZoneMapping")
  public DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings getAutomaticTimeZoneMapping() {
    return automaticTimeZoneMapping;
  }
  public void setAutomaticTimeZoneMapping(DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public DialerOutboundSettingsConfigChangeOutboundSettings id(String id) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings name(String name) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings dateCreated(Date dateCreated) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings dateModified(Date dateModified) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
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
    DialerOutboundSettingsConfigChangeOutboundSettings dialerOutboundSettingsConfigChangeOutboundSettings = (DialerOutboundSettingsConfigChangeOutboundSettings) o;

    return Objects.equals(this.maxCallsPerAgent, dialerOutboundSettingsConfigChangeOutboundSettings.maxCallsPerAgent) &&
            Objects.equals(this.maxLineUtilization, dialerOutboundSettingsConfigChangeOutboundSettings.maxLineUtilization) &&
            Objects.equals(this.abandonSeconds, dialerOutboundSettingsConfigChangeOutboundSettings.abandonSeconds) &&
            Objects.equals(this.complianceAbandonRateDenominator, dialerOutboundSettingsConfigChangeOutboundSettings.complianceAbandonRateDenominator) &&
            Objects.equals(this.automaticTimeZoneMapping, dialerOutboundSettingsConfigChangeOutboundSettings.automaticTimeZoneMapping) &&
            Objects.equals(this.id, dialerOutboundSettingsConfigChangeOutboundSettings.id) &&
            Objects.equals(this.name, dialerOutboundSettingsConfigChangeOutboundSettings.name) &&
            Objects.equals(this.dateCreated, dialerOutboundSettingsConfigChangeOutboundSettings.dateCreated) &&
            Objects.equals(this.dateModified, dialerOutboundSettingsConfigChangeOutboundSettings.dateModified) &&
            Objects.equals(this.version, dialerOutboundSettingsConfigChangeOutboundSettings.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCallsPerAgent, maxLineUtilization, abandonSeconds, complianceAbandonRateDenominator, automaticTimeZoneMapping, id, name, dateCreated, dateModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerOutboundSettingsConfigChangeOutboundSettings {\n");
    
    sb.append("    maxCallsPerAgent: ").append(toIndentedString(maxCallsPerAgent)).append("\n");
    sb.append("    maxLineUtilization: ").append(toIndentedString(maxLineUtilization)).append("\n");
    sb.append("    abandonSeconds: ").append(toIndentedString(abandonSeconds)).append("\n");
    sb.append("    complianceAbandonRateDenominator: ").append(toIndentedString(complianceAbandonRateDenominator)).append("\n");
    sb.append("    automaticTimeZoneMapping: ").append(toIndentedString(automaticTimeZoneMapping)).append("\n");
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

