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
import com.mypurecloud.sdk.v2.model.IntakeSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IntakeSettingsUpdate
 */

public class IntakeSettingsUpdate  implements Serializable {
  
  private List<IntakeSetting> intakeSettings = null;

  public IntakeSettingsUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intakeSettings = new ArrayList<IntakeSetting>();
    }
  }

  public IntakeSettingsUpdate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      intakeSettings = new ArrayList<IntakeSetting>();
    }
  }

  
  /**
   * The intake settings for the Caseplan.
   **/
  public IntakeSettingsUpdate intakeSettings(List<IntakeSetting> intakeSettings) {
    this.intakeSettings = intakeSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intake settings for the Caseplan.")
  @JsonProperty("intakeSettings")
  public List<IntakeSetting> getIntakeSettings() {
    return intakeSettings;
  }
  public void setIntakeSettings(List<IntakeSetting> intakeSettings) {
    this.intakeSettings = intakeSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntakeSettingsUpdate intakeSettingsUpdate = (IntakeSettingsUpdate) o;

    return Objects.equals(this.intakeSettings, intakeSettingsUpdate.intakeSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intakeSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntakeSettingsUpdate {\n");
    
    sb.append("    intakeSettings: ").append(toIndentedString(intakeSettings)).append("\n");
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

