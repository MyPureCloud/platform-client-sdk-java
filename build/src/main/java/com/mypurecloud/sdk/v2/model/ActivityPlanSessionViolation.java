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
import com.mypurecloud.sdk.v2.model.ActivityPlanViolationDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActivityPlanSessionViolation
 */

public class ActivityPlanSessionViolation  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of violation for this session
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GROUPSIZEMIN("GroupSizeMin"),
    GROUPSIZEMAX("GroupSizeMax"),
    INITIALSCHEDULEPERIOD("InitialSchedulePeriod"),
    LENGTHLONG("LengthLong"),
    LENGTHSHORT("LengthShort"),
    NOFACILITATOR("NoFacilitator"),
    NOATTENDEES("NoAttendees"),
    TRANSITIONTIME("TransitionTime"),
    OUTSIDESESSIONAVAILABILITY("OutsideSessionAvailability"),
    ATTENDEESRULE("AttendeesRule"),
    FACILITATORSRULE("FacilitatorsRule"),
    INCORRECTACTIVITYCODE("IncorrectActivityCode"),
    OUTSIDEOCCURRENCE("OutsideOccurrence"),
    FACILITATORNOSCHEDULE("FacilitatorNoSchedule"),
    INCORRECTCOUNTSASPAIDTIME("IncorrectCountsAsPaidTime");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private ActivityPlanViolationDetails details = null;

  public ActivityPlanSessionViolation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ActivityPlanSessionViolation(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The type of violation for this session
   **/
  public ActivityPlanSessionViolation type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of violation for this session")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The detail of the violation
   **/
  public ActivityPlanSessionViolation details(ActivityPlanViolationDetails details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The detail of the violation")
  @JsonProperty("details")
  public ActivityPlanViolationDetails getDetails() {
    return details;
  }
  public void setDetails(ActivityPlanViolationDetails details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityPlanSessionViolation activityPlanSessionViolation = (ActivityPlanSessionViolation) o;

    return Objects.equals(this.type, activityPlanSessionViolation.type) &&
            Objects.equals(this.details, activityPlanSessionViolation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityPlanSessionViolation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

