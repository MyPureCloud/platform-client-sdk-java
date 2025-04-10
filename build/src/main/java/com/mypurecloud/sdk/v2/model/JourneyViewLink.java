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
import com.mypurecloud.sdk.v2.model.JourneyViewLinkTimeConstraint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A link between elements in a journey view
 */
@ApiModel(description = "A link between elements in a journey view")

public class JourneyViewLink  implements Serializable {
  
  private String id = null;
  private JourneyViewLinkTimeConstraint constraintWithin = null;
  private JourneyViewLinkTimeConstraint constraintAfter = null;

  private static class EventCountTypeEnumDeserializer extends StdDeserializer<EventCountTypeEnum> {
    public EventCountTypeEnumDeserializer() {
      super(EventCountTypeEnumDeserializer.class);
    }

    @Override
    public EventCountTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EventCountTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of events that will be counted. Note: Concurrent will override any JourneyViewLinkTimeConstraint. Default is Sequential.
   */
 @JsonDeserialize(using = EventCountTypeEnumDeserializer.class)
  public enum EventCountTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("All"),
    CONCURRENT("Concurrent"),
    SEQUENTIAL("Sequential");

    private String value;

    EventCountTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EventCountTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EventCountTypeEnum value : EventCountTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EventCountTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EventCountTypeEnum eventCountType = null;
  private List<String> joinAttributes = null;

  public JourneyViewLink() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      joinAttributes = new ArrayList<String>();
    }
  }

  
  /**
   * The identifier of the element downstream
   **/
  public JourneyViewLink id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier of the element downstream")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * A time constraint on this link, which requires a customer to complete the downstream element within this amount of time to be counted.
   **/
  public JourneyViewLink constraintWithin(JourneyViewLinkTimeConstraint constraintWithin) {
    this.constraintWithin = constraintWithin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A time constraint on this link, which requires a customer to complete the downstream element within this amount of time to be counted.")
  @JsonProperty("constraintWithin")
  public JourneyViewLinkTimeConstraint getConstraintWithin() {
    return constraintWithin;
  }
  public void setConstraintWithin(JourneyViewLinkTimeConstraint constraintWithin) {
    this.constraintWithin = constraintWithin;
  }


  /**
   * A time constraint on this link, which requires a customer must complete the downstream element after this amount of time to be counted.
   **/
  public JourneyViewLink constraintAfter(JourneyViewLinkTimeConstraint constraintAfter) {
    this.constraintAfter = constraintAfter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A time constraint on this link, which requires a customer must complete the downstream element after this amount of time to be counted.")
  @JsonProperty("constraintAfter")
  public JourneyViewLinkTimeConstraint getConstraintAfter() {
    return constraintAfter;
  }
  public void setConstraintAfter(JourneyViewLinkTimeConstraint constraintAfter) {
    this.constraintAfter = constraintAfter;
  }


  /**
   * The type of events that will be counted. Note: Concurrent will override any JourneyViewLinkTimeConstraint. Default is Sequential.
   **/
  public JourneyViewLink eventCountType(EventCountTypeEnum eventCountType) {
    this.eventCountType = eventCountType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of events that will be counted. Note: Concurrent will override any JourneyViewLinkTimeConstraint. Default is Sequential.")
  @JsonProperty("eventCountType")
  public EventCountTypeEnum getEventCountType() {
    return eventCountType;
  }
  public void setEventCountType(EventCountTypeEnum eventCountType) {
    this.eventCountType = eventCountType;
  }


  /**
   * Other (secondary) attributes on which this link should join the customers being counted
   **/
  public JourneyViewLink joinAttributes(List<String> joinAttributes) {
    this.joinAttributes = joinAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Other (secondary) attributes on which this link should join the customers being counted")
  @JsonProperty("joinAttributes")
  public List<String> getJoinAttributes() {
    return joinAttributes;
  }
  public void setJoinAttributes(List<String> joinAttributes) {
    this.joinAttributes = joinAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewLink journeyViewLink = (JourneyViewLink) o;

    return Objects.equals(this.id, journeyViewLink.id) &&
            Objects.equals(this.constraintWithin, journeyViewLink.constraintWithin) &&
            Objects.equals(this.constraintAfter, journeyViewLink.constraintAfter) &&
            Objects.equals(this.eventCountType, journeyViewLink.eventCountType) &&
            Objects.equals(this.joinAttributes, journeyViewLink.joinAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, constraintWithin, constraintAfter, eventCountType, joinAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewLink {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    constraintWithin: ").append(toIndentedString(constraintWithin)).append("\n");
    sb.append("    constraintAfter: ").append(toIndentedString(constraintAfter)).append("\n");
    sb.append("    eventCountType: ").append(toIndentedString(eventCountType)).append("\n");
    sb.append("    joinAttributes: ").append(toIndentedString(joinAttributes)).append("\n");
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

