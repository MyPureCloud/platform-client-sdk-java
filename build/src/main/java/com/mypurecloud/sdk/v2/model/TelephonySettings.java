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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TelephonySettings
 */

public class TelephonySettings  implements Serializable {
  
  private Boolean persistentConnectionRequired = null;
  private String blockCallerIdAccessCode = null;

  public TelephonySettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public TelephonySettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Determines if a persistent connection will be established before routing calls to agents
   **/
  public TelephonySettings persistentConnectionRequired(Boolean persistentConnectionRequired) {
    this.persistentConnectionRequired = persistentConnectionRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines if a persistent connection will be established before routing calls to agents")
  @JsonProperty("persistentConnectionRequired")
  public Boolean getPersistentConnectionRequired() {
    return persistentConnectionRequired;
  }
  public void setPersistentConnectionRequired(Boolean persistentConnectionRequired) {
    this.persistentConnectionRequired = persistentConnectionRequired;
  }


  /**
   * Configurable code that should be exempt from caller ID manipulation (e.g. *67 for anonymized calling)
   **/
  public TelephonySettings blockCallerIdAccessCode(String blockCallerIdAccessCode) {
    this.blockCallerIdAccessCode = blockCallerIdAccessCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configurable code that should be exempt from caller ID manipulation (e.g. *67 for anonymized calling)")
  @JsonProperty("blockCallerIdAccessCode")
  public String getBlockCallerIdAccessCode() {
    return blockCallerIdAccessCode;
  }
  public void setBlockCallerIdAccessCode(String blockCallerIdAccessCode) {
    this.blockCallerIdAccessCode = blockCallerIdAccessCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelephonySettings telephonySettings = (TelephonySettings) o;

    return Objects.equals(this.persistentConnectionRequired, telephonySettings.persistentConnectionRequired) &&
            Objects.equals(this.blockCallerIdAccessCode, telephonySettings.blockCallerIdAccessCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentConnectionRequired, blockCallerIdAccessCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelephonySettings {\n");
    
    sb.append("    persistentConnectionRequired: ").append(toIndentedString(persistentConnectionRequired)).append("\n");
    sb.append("    blockCallerIdAccessCode: ").append(toIndentedString(blockCallerIdAccessCode)).append("\n");
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

