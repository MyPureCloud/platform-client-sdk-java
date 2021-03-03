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
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private Integer maxCallsPerAgent = null;
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
   * Gets or Sets complianceAbandonRateDenominator
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

  
  /**
   **/
  public DialerOutboundSettingsConfigChangeOutboundSettings id(String id) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings name(String name) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings dateCreated(Date dateCreated) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings dateModified(Date dateModified) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings version(Integer version) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings maxCallsPerAgent(Integer maxCallsPerAgent) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings maxLineUtilization(BigDecimal maxLineUtilization) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings abandonSeconds(BigDecimal abandonSeconds) {
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
  public DialerOutboundSettingsConfigChangeOutboundSettings complianceAbandonRateDenominator(ComplianceAbandonRateDenominatorEnum complianceAbandonRateDenominator) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerOutboundSettingsConfigChangeOutboundSettings dialerOutboundSettingsConfigChangeOutboundSettings = (DialerOutboundSettingsConfigChangeOutboundSettings) o;
    return Objects.equals(this.id, dialerOutboundSettingsConfigChangeOutboundSettings.id) &&
        Objects.equals(this.name, dialerOutboundSettingsConfigChangeOutboundSettings.name) &&
        Objects.equals(this.dateCreated, dialerOutboundSettingsConfigChangeOutboundSettings.dateCreated) &&
        Objects.equals(this.dateModified, dialerOutboundSettingsConfigChangeOutboundSettings.dateModified) &&
        Objects.equals(this.version, dialerOutboundSettingsConfigChangeOutboundSettings.version) &&
        Objects.equals(this.maxCallsPerAgent, dialerOutboundSettingsConfigChangeOutboundSettings.maxCallsPerAgent) &&
        Objects.equals(this.maxLineUtilization, dialerOutboundSettingsConfigChangeOutboundSettings.maxLineUtilization) &&
        Objects.equals(this.abandonSeconds, dialerOutboundSettingsConfigChangeOutboundSettings.abandonSeconds) &&
        Objects.equals(this.complianceAbandonRateDenominator, dialerOutboundSettingsConfigChangeOutboundSettings.complianceAbandonRateDenominator) &&
        Objects.equals(this.automaticTimeZoneMapping, dialerOutboundSettingsConfigChangeOutboundSettings.automaticTimeZoneMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, maxCallsPerAgent, maxLineUtilization, abandonSeconds, complianceAbandonRateDenominator, automaticTimeZoneMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerOutboundSettingsConfigChangeOutboundSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxCallsPerAgent: ").append(toIndentedString(maxCallsPerAgent)).append("\n");
    sb.append("    maxLineUtilization: ").append(toIndentedString(maxLineUtilization)).append("\n");
    sb.append("    abandonSeconds: ").append(toIndentedString(abandonSeconds)).append("\n");
    sb.append("    complianceAbandonRateDenominator: ").append(toIndentedString(complianceAbandonRateDenominator)).append("\n");
    sb.append("    automaticTimeZoneMapping: ").append(toIndentedString(automaticTimeZoneMapping)).append("\n");
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

