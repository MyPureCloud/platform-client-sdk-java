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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyViewSchedule
 */

public class JourneyViewSchedule  implements Serializable {
  
  private String id = null;

  private static class FrequencyEnumDeserializer extends StdDeserializer<FrequencyEnum> {
    public FrequencyEnumDeserializer() {
      super(FrequencyEnumDeserializer.class);
    }

    @Override
    public FrequencyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FrequencyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Frequency of execution
   */
 @JsonDeserialize(using = FrequencyEnumDeserializer.class)
  public enum FrequencyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FrequencyEnum fromString(String key) {
      if (key == null) return null;

      for (FrequencyEnum value : FrequencyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FrequencyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FrequencyEnum frequency = null;
  private Date dateModified = null;
  private AddressableEntityRef user = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Frequency of execution
   **/
  public JourneyViewSchedule frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Frequency of execution")
  @JsonProperty("frequency")
  public FrequencyEnum getFrequency() {
    return frequency;
  }
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  @ApiModelProperty(example = "null", required = true, value = "Timestamp of last update. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", required = true, value = "Last modified user")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
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
    JourneyViewSchedule journeyViewSchedule = (JourneyViewSchedule) o;

    return Objects.equals(this.id, journeyViewSchedule.id) &&
            Objects.equals(this.frequency, journeyViewSchedule.frequency) &&
            Objects.equals(this.dateModified, journeyViewSchedule.dateModified) &&
            Objects.equals(this.user, journeyViewSchedule.user) &&
            Objects.equals(this.selfUri, journeyViewSchedule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, frequency, dateModified, user, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

