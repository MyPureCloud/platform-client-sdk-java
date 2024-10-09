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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AlertablePresences
 */

public class AlertablePresences  implements Serializable {
  

  private static class AlertablePresencesEnumDeserializer extends StdDeserializer<AlertablePresencesEnum> {
    public AlertablePresencesEnumDeserializer() {
      super(AlertablePresencesEnumDeserializer.class);
    }

    @Override
    public AlertablePresencesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlertablePresencesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets alertablePresences
   */
 @JsonDeserialize(using = AlertablePresencesEnumDeserializer.class)
  public enum AlertablePresencesEnum {
    AVAILABLE("Available"),
    AWAY("Away"),
    BUSY("Busy"),
    OFFLINE("Offline"),
    IDLE("Idle"),
    ONQUEUE("OnQueue"),
    MEAL("Meal"),
    TRAINING("Training"),
    MEETING("Meeting"),
    BREAK("Break");

    private String value;

    AlertablePresencesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlertablePresencesEnum fromString(String key) {
      if (key == null) return null;

      for (AlertablePresencesEnum value : AlertablePresencesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlertablePresencesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<AlertablePresencesEnum> alertablePresences = new ArrayList<AlertablePresencesEnum>();

  
  /**
   * The list of alertable system presences.
   **/
  public AlertablePresences alertablePresences(List<AlertablePresencesEnum> alertablePresences) {
    this.alertablePresences = alertablePresences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of alertable system presences.")
  @JsonProperty("alertablePresences")
  public List<AlertablePresencesEnum> getAlertablePresences() {
    return alertablePresences;
  }
  public void setAlertablePresences(List<AlertablePresencesEnum> alertablePresences) {
    this.alertablePresences = alertablePresences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertablePresences alertablePresences = (AlertablePresences) o;

    return Objects.equals(this.alertablePresences, alertablePresences.alertablePresences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertablePresences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertablePresences {\n");
    
    sb.append("    alertablePresences: ").append(toIndentedString(alertablePresences)).append("\n");
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

