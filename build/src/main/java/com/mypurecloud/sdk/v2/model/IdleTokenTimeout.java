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
import com.mypurecloud.sdk.v2.model.InactivityTimeoutGroupBundle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IdleTokenTimeout
 */

public class IdleTokenTimeout  implements Serializable {
  
  private Integer idleTokenTimeoutSeconds = null;
  private Boolean enableIdleTokenTimeout = null;

  private static class InactivityTimeoutUnitEnumDeserializer extends StdDeserializer<InactivityTimeoutUnitEnum> {
    public InactivityTimeoutUnitEnumDeserializer() {
      super(InactivityTimeoutUnitEnumDeserializer.class);
    }

    @Override
    public InactivityTimeoutUnitEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InactivityTimeoutUnitEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The unit for the inactivity timeout (MINUTES or HOURS).
   */
 @JsonDeserialize(using = InactivityTimeoutUnitEnumDeserializer.class)
  public enum InactivityTimeoutUnitEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MINUTES("Minutes"),
    HOURS("Hours");

    private String value;

    InactivityTimeoutUnitEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InactivityTimeoutUnitEnum fromString(String key) {
      if (key == null) return null;

      for (InactivityTimeoutUnitEnum value : InactivityTimeoutUnitEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InactivityTimeoutUnitEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InactivityTimeoutUnitEnum inactivityTimeoutUnit = null;
  private Boolean inactivityTimeoutGroupsEnabled = null;
  private List<InactivityTimeoutGroupBundle> inactivityTimeoutGroupBundles = null;

  public IdleTokenTimeout() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      inactivityTimeoutGroupBundles = new ArrayList<InactivityTimeoutGroupBundle>();
    }
  }

  public IdleTokenTimeout(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      inactivityTimeoutGroupBundles = new ArrayList<InactivityTimeoutGroupBundle>();
    }
  }

  
  /**
   * Token timeout length in seconds. Must be at least 5 minutes and at most 8 hours. HIPAA-enabled organizations may be subject to a stricter 15-minute maximum during rollout.
   * minimum: 300
   **/
  public IdleTokenTimeout idleTokenTimeoutSeconds(Integer idleTokenTimeoutSeconds) {
    this.idleTokenTimeoutSeconds = idleTokenTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token timeout length in seconds. Must be at least 5 minutes and at most 8 hours. HIPAA-enabled organizations may be subject to a stricter 15-minute maximum during rollout.")
  @JsonProperty("idleTokenTimeoutSeconds")
  public Integer getIdleTokenTimeoutSeconds() {
    return idleTokenTimeoutSeconds;
  }
  public void setIdleTokenTimeoutSeconds(Integer idleTokenTimeoutSeconds) {
    this.idleTokenTimeoutSeconds = idleTokenTimeoutSeconds;
  }


  /**
   * Indicates whether the Token Timeout should be enabled or disabled.
   **/
  public IdleTokenTimeout enableIdleTokenTimeout(Boolean enableIdleTokenTimeout) {
    this.enableIdleTokenTimeout = enableIdleTokenTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the Token Timeout should be enabled or disabled.")
  @JsonProperty("enableIdleTokenTimeout")
  public Boolean getEnableIdleTokenTimeout() {
    return enableIdleTokenTimeout;
  }
  public void setEnableIdleTokenTimeout(Boolean enableIdleTokenTimeout) {
    this.enableIdleTokenTimeout = enableIdleTokenTimeout;
  }


  /**
   * The unit for the inactivity timeout (MINUTES or HOURS).
   **/
  public IdleTokenTimeout inactivityTimeoutUnit(InactivityTimeoutUnitEnum inactivityTimeoutUnit) {
    this.inactivityTimeoutUnit = inactivityTimeoutUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unit for the inactivity timeout (MINUTES or HOURS).")
  @JsonProperty("inactivityTimeoutUnit")
  public InactivityTimeoutUnitEnum getInactivityTimeoutUnit() {
    return inactivityTimeoutUnit;
  }
  public void setInactivityTimeoutUnit(InactivityTimeoutUnitEnum inactivityTimeoutUnit) {
    this.inactivityTimeoutUnit = inactivityTimeoutUnit;
  }


  /**
   * Indicates whether inactivity timeout groups are enabled.
   **/
  public IdleTokenTimeout inactivityTimeoutGroupsEnabled(Boolean inactivityTimeoutGroupsEnabled) {
    this.inactivityTimeoutGroupsEnabled = inactivityTimeoutGroupsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether inactivity timeout groups are enabled.")
  @JsonProperty("inactivityTimeoutGroupsEnabled")
  public Boolean getInactivityTimeoutGroupsEnabled() {
    return inactivityTimeoutGroupsEnabled;
  }
  public void setInactivityTimeoutGroupsEnabled(Boolean inactivityTimeoutGroupsEnabled) {
    this.inactivityTimeoutGroupsEnabled = inactivityTimeoutGroupsEnabled;
  }


  /**
   * Group bundle configuration for inactivity timeout.
   **/
  public IdleTokenTimeout inactivityTimeoutGroupBundles(List<InactivityTimeoutGroupBundle> inactivityTimeoutGroupBundles) {
    this.inactivityTimeoutGroupBundles = inactivityTimeoutGroupBundles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group bundle configuration for inactivity timeout.")
  @JsonProperty("inactivityTimeoutGroupBundles")
  public List<InactivityTimeoutGroupBundle> getInactivityTimeoutGroupBundles() {
    return inactivityTimeoutGroupBundles;
  }
  public void setInactivityTimeoutGroupBundles(List<InactivityTimeoutGroupBundle> inactivityTimeoutGroupBundles) {
    this.inactivityTimeoutGroupBundles = inactivityTimeoutGroupBundles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdleTokenTimeout idleTokenTimeout = (IdleTokenTimeout) o;

    return Objects.equals(this.idleTokenTimeoutSeconds, idleTokenTimeout.idleTokenTimeoutSeconds) &&
            Objects.equals(this.enableIdleTokenTimeout, idleTokenTimeout.enableIdleTokenTimeout) &&
            Objects.equals(this.inactivityTimeoutUnit, idleTokenTimeout.inactivityTimeoutUnit) &&
            Objects.equals(this.inactivityTimeoutGroupsEnabled, idleTokenTimeout.inactivityTimeoutGroupsEnabled) &&
            Objects.equals(this.inactivityTimeoutGroupBundles, idleTokenTimeout.inactivityTimeoutGroupBundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idleTokenTimeoutSeconds, enableIdleTokenTimeout, inactivityTimeoutUnit, inactivityTimeoutGroupsEnabled, inactivityTimeoutGroupBundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdleTokenTimeout {\n");
    
    sb.append("    idleTokenTimeoutSeconds: ").append(toIndentedString(idleTokenTimeoutSeconds)).append("\n");
    sb.append("    enableIdleTokenTimeout: ").append(toIndentedString(enableIdleTokenTimeout)).append("\n");
    sb.append("    inactivityTimeoutUnit: ").append(toIndentedString(inactivityTimeoutUnit)).append("\n");
    sb.append("    inactivityTimeoutGroupsEnabled: ").append(toIndentedString(inactivityTimeoutGroupsEnabled)).append("\n");
    sb.append("    inactivityTimeoutGroupBundles: ").append(toIndentedString(inactivityTimeoutGroupBundles)).append("\n");
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

