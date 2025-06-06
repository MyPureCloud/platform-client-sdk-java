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
import com.mypurecloud.sdk.v2.model.DurationCondition;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.Team;
import com.mypurecloud.sdk.v2.model.TimeAllowed;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PolicyConditions
 */

public class PolicyConditions  implements Serializable {
  
  private List<User> forUsers = null;

  private static class DirectionsEnumDeserializer extends StdDeserializer<DirectionsEnum> {
    public DirectionsEnumDeserializer() {
      super(DirectionsEnumDeserializer.class);
    }

    @Override
    public DirectionsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets directions
   */
 @JsonDeserialize(using = DirectionsEnumDeserializer.class)
  public enum DirectionsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("INBOUND"),
    OUTBOUND("OUTBOUND");

    private String value;

    DirectionsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionsEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionsEnum value : DirectionsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DirectionsEnum> directions = null;
  private List<String> dateRanges = null;

  private static class MediaTypesEnumDeserializer extends StdDeserializer<MediaTypesEnum> {
    public MediaTypesEnumDeserializer() {
      super(MediaTypesEnumDeserializer.class);
    }

    @Override
    public MediaTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaTypes
   */
 @JsonDeserialize(using = MediaTypesEnumDeserializer.class)
  public enum MediaTypesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("CALL"),
    CHAT("CHAT");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = null;
  private List<Queue> forQueues = null;
  private DurationCondition duration = null;
  private List<WrapupCode> wrapupCodes = null;
  private TimeAllowed timeAllowed = null;
  private List<Team> teams = null;

  private static class CustomerParticipationEnumDeserializer extends StdDeserializer<CustomerParticipationEnum> {
    public CustomerParticipationEnumDeserializer() {
      super(CustomerParticipationEnumDeserializer.class);
    }

    @Override
    public CustomerParticipationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CustomerParticipationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * This condition is to filter out conversation with and without customer participation.
   */
 @JsonDeserialize(using = CustomerParticipationEnumDeserializer.class)
  public enum CustomerParticipationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    YES("YES"),
    NO("NO");

    private String value;

    CustomerParticipationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CustomerParticipationEnum fromString(String key) {
      if (key == null) return null;

      for (CustomerParticipationEnum value : CustomerParticipationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CustomerParticipationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CustomerParticipationEnum customerParticipation = null;

  public PolicyConditions() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      forUsers = new ArrayList<User>();
      directions = new ArrayList<DirectionsEnum>();
      dateRanges = new ArrayList<String>();
      mediaTypes = new ArrayList<MediaTypesEnum>();
      forQueues = new ArrayList<Queue>();
      wrapupCodes = new ArrayList<WrapupCode>();
      teams = new ArrayList<Team>();
    }
  }

  
  /**
   **/
  public PolicyConditions forUsers(List<User> forUsers) {
    this.forUsers = forUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forUsers")
  public List<User> getForUsers() {
    return forUsers;
  }
  public void setForUsers(List<User> forUsers) {
    this.forUsers = forUsers;
  }


  /**
   **/
  public PolicyConditions directions(List<DirectionsEnum> directions) {
    this.directions = directions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("directions")
  public List<DirectionsEnum> getDirections() {
    return directions;
  }
  public void setDirections(List<DirectionsEnum> directions) {
    this.directions = directions;
  }


  /**
   **/
  public PolicyConditions dateRanges(List<String> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateRanges")
  public List<String> getDateRanges() {
    return dateRanges;
  }
  public void setDateRanges(List<String> dateRanges) {
    this.dateRanges = dateRanges;
  }


  /**
   **/
  public PolicyConditions mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }


  /**
   **/
  public PolicyConditions forQueues(List<Queue> forQueues) {
    this.forQueues = forQueues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forQueues")
  public List<Queue> getForQueues() {
    return forQueues;
  }
  public void setForQueues(List<Queue> forQueues) {
    this.forQueues = forQueues;
  }


  /**
   **/
  public PolicyConditions duration(DurationCondition duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("duration")
  public DurationCondition getDuration() {
    return duration;
  }
  public void setDuration(DurationCondition duration) {
    this.duration = duration;
  }


  /**
   **/
  public PolicyConditions wrapupCodes(List<WrapupCode> wrapupCodes) {
    this.wrapupCodes = wrapupCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupCodes")
  public List<WrapupCode> getWrapupCodes() {
    return wrapupCodes;
  }
  public void setWrapupCodes(List<WrapupCode> wrapupCodes) {
    this.wrapupCodes = wrapupCodes;
  }


  /**
   **/
  public PolicyConditions timeAllowed(TimeAllowed timeAllowed) {
    this.timeAllowed = timeAllowed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeAllowed")
  public TimeAllowed getTimeAllowed() {
    return timeAllowed;
  }
  public void setTimeAllowed(TimeAllowed timeAllowed) {
    this.timeAllowed = timeAllowed;
  }


  /**
   * Teams to match conversations against
   **/
  public PolicyConditions teams(List<Team> teams) {
    this.teams = teams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Teams to match conversations against")
  @JsonProperty("teams")
  public List<Team> getTeams() {
    return teams;
  }
  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }


  /**
   * This condition is to filter out conversation with and without customer participation.
   **/
  public PolicyConditions customerParticipation(CustomerParticipationEnum customerParticipation) {
    this.customerParticipation = customerParticipation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This condition is to filter out conversation with and without customer participation.")
  @JsonProperty("customerParticipation")
  public CustomerParticipationEnum getCustomerParticipation() {
    return customerParticipation;
  }
  public void setCustomerParticipation(CustomerParticipationEnum customerParticipation) {
    this.customerParticipation = customerParticipation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyConditions policyConditions = (PolicyConditions) o;

    return Objects.equals(this.forUsers, policyConditions.forUsers) &&
            Objects.equals(this.directions, policyConditions.directions) &&
            Objects.equals(this.dateRanges, policyConditions.dateRanges) &&
            Objects.equals(this.mediaTypes, policyConditions.mediaTypes) &&
            Objects.equals(this.forQueues, policyConditions.forQueues) &&
            Objects.equals(this.duration, policyConditions.duration) &&
            Objects.equals(this.wrapupCodes, policyConditions.wrapupCodes) &&
            Objects.equals(this.timeAllowed, policyConditions.timeAllowed) &&
            Objects.equals(this.teams, policyConditions.teams) &&
            Objects.equals(this.customerParticipation, policyConditions.customerParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forUsers, directions, dateRanges, mediaTypes, forQueues, duration, wrapupCodes, timeAllowed, teams, customerParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyConditions {\n");
    
    sb.append("    forUsers: ").append(toIndentedString(forUsers)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    forQueues: ").append(toIndentedString(forQueues)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    wrapupCodes: ").append(toIndentedString(wrapupCodes)).append("\n");
    sb.append("    timeAllowed: ").append(toIndentedString(timeAllowed)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    customerParticipation: ").append(toIndentedString(customerParticipation)).append("\n");
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

