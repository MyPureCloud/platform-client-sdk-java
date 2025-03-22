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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SocialMediaMessageEscalationInfo
 */

public class SocialMediaMessageEscalationInfo  implements Serializable {
  

  private static class EscalationStatusEnumDeserializer extends StdDeserializer<EscalationStatusEnum> {
    public EscalationStatusEnumDeserializer() {
      super(EscalationStatusEnumDeserializer.class);
    }

    @Override
    public EscalationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EscalationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets escalationStatus
   */
 @JsonDeserialize(using = EscalationStatusEnumDeserializer.class)
  public enum EscalationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    MANUAL("Manual"),
    THROTTLED("Throttled"),
    PREVIOUSLYESCALATED("PreviouslyEscalated"),
    NOTESCALATED("NotEscalated"),
    AUTOMATIC("Automatic");

    private String value;

    EscalationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EscalationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (EscalationStatusEnum value : EscalationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EscalationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EscalationStatusEnum escalationStatus = null;

  
  /**
   **/
  public SocialMediaMessageEscalationInfo escalationStatus(EscalationStatusEnum escalationStatus) {
    this.escalationStatus = escalationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("escalationStatus")
  public EscalationStatusEnum getEscalationStatus() {
    return escalationStatus;
  }
  public void setEscalationStatus(EscalationStatusEnum escalationStatus) {
    this.escalationStatus = escalationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialMediaMessageEscalationInfo socialMediaMessageEscalationInfo = (SocialMediaMessageEscalationInfo) o;

    return Objects.equals(this.escalationStatus, socialMediaMessageEscalationInfo.escalationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(escalationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialMediaMessageEscalationInfo {\n");
    
    sb.append("    escalationStatus: ").append(toIndentedString(escalationStatus)).append("\n");
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

