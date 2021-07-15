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
import com.mypurecloud.sdk.v2.model.AutomaticTimeZoneMappingSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutboundSettings
 */

public class OutboundSettings  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private Integer maxCallsPerAgent = null;
  private Integer maxConfigurableCallsPerAgent = null;
  private Double maxLineUtilization = null;
  private Double abandonSeconds = null;

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
  private AutomaticTimeZoneMappingSettings automaticTimeZoneMapping = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public OutboundSettings name(String name) {
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
  public OutboundSettings version(Integer version) {
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
   * The maximum number of calls that can be placed per agent on any campaign
   **/
  public OutboundSettings maxCallsPerAgent(Integer maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of calls that can be placed per agent on any campaign")
  @JsonProperty("maxCallsPerAgent")
  public Integer getMaxCallsPerAgent() {
    return maxCallsPerAgent;
  }
  public void setMaxCallsPerAgent(Integer maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum number of calls that can be configured to be placed per agent on any campaign")
  @JsonProperty("maxConfigurableCallsPerAgent")
  public Integer getMaxConfigurableCallsPerAgent() {
    return maxConfigurableCallsPerAgent;
  }

  
  /**
   * The maximum percentage of lines that should be used for Outbound, expressed as a decimal in the range [0.0, 1.0]
   **/
  public OutboundSettings maxLineUtilization(Double maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum percentage of lines that should be used for Outbound, expressed as a decimal in the range [0.0, 1.0]")
  @JsonProperty("maxLineUtilization")
  public Double getMaxLineUtilization() {
    return maxLineUtilization;
  }
  public void setMaxLineUtilization(Double maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
  }

  
  /**
   * The number of seconds used to determine if a call is abandoned
   **/
  public OutboundSettings abandonSeconds(Double abandonSeconds) {
    this.abandonSeconds = abandonSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds used to determine if a call is abandoned")
  @JsonProperty("abandonSeconds")
  public Double getAbandonSeconds() {
    return abandonSeconds;
  }
  public void setAbandonSeconds(Double abandonSeconds) {
    this.abandonSeconds = abandonSeconds;
  }

  
  /**
   * The denominator to be used in determining the compliance abandon rate
   **/
  public OutboundSettings complianceAbandonRateDenominator(ComplianceAbandonRateDenominatorEnum complianceAbandonRateDenominator) {
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
   * The settings for automatic time zone mapping. Note that changing these settings will change them for both voice and messaging campaigns.
   **/
  public OutboundSettings automaticTimeZoneMapping(AutomaticTimeZoneMappingSettings automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for automatic time zone mapping. Note that changing these settings will change them for both voice and messaging campaigns.")
  @JsonProperty("automaticTimeZoneMapping")
  public AutomaticTimeZoneMappingSettings getAutomaticTimeZoneMapping() {
    return automaticTimeZoneMapping;
  }
  public void setAutomaticTimeZoneMapping(AutomaticTimeZoneMappingSettings automaticTimeZoneMapping) {
    this.automaticTimeZoneMapping = automaticTimeZoneMapping;
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
    OutboundSettings outboundSettings = (OutboundSettings) o;
    return Objects.equals(this.id, outboundSettings.id) &&
        Objects.equals(this.name, outboundSettings.name) &&
        Objects.equals(this.dateCreated, outboundSettings.dateCreated) &&
        Objects.equals(this.dateModified, outboundSettings.dateModified) &&
        Objects.equals(this.version, outboundSettings.version) &&
        Objects.equals(this.maxCallsPerAgent, outboundSettings.maxCallsPerAgent) &&
        Objects.equals(this.maxConfigurableCallsPerAgent, outboundSettings.maxConfigurableCallsPerAgent) &&
        Objects.equals(this.maxLineUtilization, outboundSettings.maxLineUtilization) &&
        Objects.equals(this.abandonSeconds, outboundSettings.abandonSeconds) &&
        Objects.equals(this.complianceAbandonRateDenominator, outboundSettings.complianceAbandonRateDenominator) &&
        Objects.equals(this.automaticTimeZoneMapping, outboundSettings.automaticTimeZoneMapping) &&
        Objects.equals(this.selfUri, outboundSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, maxCallsPerAgent, maxConfigurableCallsPerAgent, maxLineUtilization, abandonSeconds, complianceAbandonRateDenominator, automaticTimeZoneMapping, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxCallsPerAgent: ").append(toIndentedString(maxCallsPerAgent)).append("\n");
    sb.append("    maxConfigurableCallsPerAgent: ").append(toIndentedString(maxConfigurableCallsPerAgent)).append("\n");
    sb.append("    maxLineUtilization: ").append(toIndentedString(maxLineUtilization)).append("\n");
    sb.append("    abandonSeconds: ").append(toIndentedString(abandonSeconds)).append("\n");
    sb.append("    complianceAbandonRateDenominator: ").append(toIndentedString(complianceAbandonRateDenominator)).append("\n");
    sb.append("    automaticTimeZoneMapping: ").append(toIndentedString(automaticTimeZoneMapping)).append("\n");
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

