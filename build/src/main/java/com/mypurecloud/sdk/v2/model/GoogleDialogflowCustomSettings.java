package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GoogleDialogflowCustomSettings
 */

public class GoogleDialogflowCustomSettings  implements Serializable {
  
  private String environment = null;

  
  /**
   * If set this environment will be used to initiate the dialogflow bot, otherwise the default configuration will be used.  See https://cloud.google.com/dialogflow/docs/agents-versions
   **/
  public GoogleDialogflowCustomSettings environment(String environment) {
    this.environment = environment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If set this environment will be used to initiate the dialogflow bot, otherwise the default configuration will be used.  See https://cloud.google.com/dialogflow/docs/agents-versions")
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleDialogflowCustomSettings googleDialogflowCustomSettings = (GoogleDialogflowCustomSettings) o;
    return Objects.equals(this.environment, googleDialogflowCustomSettings.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleDialogflowCustomSettings {\n");
    
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

