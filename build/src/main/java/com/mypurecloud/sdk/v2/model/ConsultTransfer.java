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
import com.mypurecloud.sdk.v2.model.Destination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConsultTransfer
 */

public class ConsultTransfer  implements Serializable {
  

  private static class SpeakToEnumDeserializer extends StdDeserializer<SpeakToEnum> {
    public SpeakToEnumDeserializer() {
      super(SpeakToEnumDeserializer.class);
    }

    @Override
    public SpeakToEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SpeakToEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Determines to whom the initiating participant is speaking. Defaults to DESTINATION
   */
 @JsonDeserialize(using = SpeakToEnumDeserializer.class)
  public enum SpeakToEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DESTINATION("DESTINATION"),
    OBJECT("OBJECT"),
    BOTH("BOTH");

    private String value;

    SpeakToEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SpeakToEnum fromString(String key) {
      if (key == null) return null;

      for (SpeakToEnum value : SpeakToEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SpeakToEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SpeakToEnum speakTo = null;
  private Destination destination = null;

  
  /**
   * Determines to whom the initiating participant is speaking. Defaults to DESTINATION
   **/
  public ConsultTransfer speakTo(SpeakToEnum speakTo) {
    this.speakTo = speakTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines to whom the initiating participant is speaking. Defaults to DESTINATION")
  @JsonProperty("speakTo")
  public SpeakToEnum getSpeakTo() {
    return speakTo;
  }
  public void setSpeakTo(SpeakToEnum speakTo) {
    this.speakTo = speakTo;
  }

  
  /**
   * Destination phone number and name.
   **/
  public ConsultTransfer destination(Destination destination) {
    this.destination = destination;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Destination phone number and name.")
  @JsonProperty("destination")
  public Destination getDestination() {
    return destination;
  }
  public void setDestination(Destination destination) {
    this.destination = destination;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultTransfer consultTransfer = (ConsultTransfer) o;
    return Objects.equals(this.speakTo, consultTransfer.speakTo) &&
        Objects.equals(this.destination, consultTransfer.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakTo, destination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultTransfer {\n");
    
    sb.append("    speakTo: ").append(toIndentedString(speakTo)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

