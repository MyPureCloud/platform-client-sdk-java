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
import com.mypurecloud.sdk.v2.model.HelpSettings;
import com.mypurecloud.sdk.v2.model.OptInSettings;
import com.mypurecloud.sdk.v2.model.StopSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Compliance
 */

public class Compliance  implements Serializable {
  
  private List<StopSettings> stopSettings = null;
  private List<OptInSettings> optInSettings = null;
  private List<HelpSettings> helpSettings = null;

  public Compliance() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      stopSettings = new ArrayList<StopSettings>();
      optInSettings = new ArrayList<OptInSettings>();
      helpSettings = new ArrayList<HelpSettings>();
    }
  }

  
  /**
   * List of configurations for 'StopSettings' compliance
   **/
  public Compliance stopSettings(List<StopSettings> stopSettings) {
    this.stopSettings = stopSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of configurations for 'StopSettings' compliance")
  @JsonProperty("stopSettings")
  public List<StopSettings> getStopSettings() {
    return stopSettings;
  }
  public void setStopSettings(List<StopSettings> stopSettings) {
    this.stopSettings = stopSettings;
  }


  /**
   * List of configurations for 'OptInSettings' compliance
   **/
  public Compliance optInSettings(List<OptInSettings> optInSettings) {
    this.optInSettings = optInSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of configurations for 'OptInSettings' compliance")
  @JsonProperty("optInSettings")
  public List<OptInSettings> getOptInSettings() {
    return optInSettings;
  }
  public void setOptInSettings(List<OptInSettings> optInSettings) {
    this.optInSettings = optInSettings;
  }


  /**
   * List of configurations for 'HelpSettings' compliance
   **/
  public Compliance helpSettings(List<HelpSettings> helpSettings) {
    this.helpSettings = helpSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of configurations for 'HelpSettings' compliance")
  @JsonProperty("helpSettings")
  public List<HelpSettings> getHelpSettings() {
    return helpSettings;
  }
  public void setHelpSettings(List<HelpSettings> helpSettings) {
    this.helpSettings = helpSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compliance compliance = (Compliance) o;

    return Objects.equals(this.stopSettings, compliance.stopSettings) &&
            Objects.equals(this.optInSettings, compliance.optInSettings) &&
            Objects.equals(this.helpSettings, compliance.helpSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopSettings, optInSettings, helpSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compliance {\n");
    
    sb.append("    stopSettings: ").append(toIndentedString(stopSettings)).append("\n");
    sb.append("    optInSettings: ").append(toIndentedString(optInSettings)).append("\n");
    sb.append("    helpSettings: ").append(toIndentedString(helpSettings)).append("\n");
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

