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
import com.mypurecloud.sdk.v2.model.Language;
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
 * MessageMediaPolicyConditions
 */

public class MessageMediaPolicyConditions  implements Serializable {
  
  private List<User> forUsers = null;
  private List<String> dateRanges = null;
  private List<Queue> forQueues = null;
  private List<WrapupCode> wrapupCodes = null;
  private List<Language> languages = null;
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
   * Gets or Sets customerParticipation
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

  public MessageMediaPolicyConditions() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      forUsers = new ArrayList<User>();
      dateRanges = new ArrayList<String>();
      forQueues = new ArrayList<Queue>();
      wrapupCodes = new ArrayList<WrapupCode>();
      languages = new ArrayList<Language>();
      teams = new ArrayList<Team>();
    }
  }

  
  /**
   **/
  public MessageMediaPolicyConditions forUsers(List<User> forUsers) {
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
  public MessageMediaPolicyConditions dateRanges(List<String> dateRanges) {
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
  public MessageMediaPolicyConditions forQueues(List<Queue> forQueues) {
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
  public MessageMediaPolicyConditions wrapupCodes(List<WrapupCode> wrapupCodes) {
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
  public MessageMediaPolicyConditions languages(List<Language> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("languages")
  public List<Language> getLanguages() {
    return languages;
  }
  public void setLanguages(List<Language> languages) {
    this.languages = languages;
  }


  /**
   **/
  public MessageMediaPolicyConditions timeAllowed(TimeAllowed timeAllowed) {
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
  public MessageMediaPolicyConditions teams(List<Team> teams) {
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
   **/
  public MessageMediaPolicyConditions customerParticipation(CustomerParticipationEnum customerParticipation) {
    this.customerParticipation = customerParticipation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    MessageMediaPolicyConditions messageMediaPolicyConditions = (MessageMediaPolicyConditions) o;

    return Objects.equals(this.forUsers, messageMediaPolicyConditions.forUsers) &&
            Objects.equals(this.dateRanges, messageMediaPolicyConditions.dateRanges) &&
            Objects.equals(this.forQueues, messageMediaPolicyConditions.forQueues) &&
            Objects.equals(this.wrapupCodes, messageMediaPolicyConditions.wrapupCodes) &&
            Objects.equals(this.languages, messageMediaPolicyConditions.languages) &&
            Objects.equals(this.timeAllowed, messageMediaPolicyConditions.timeAllowed) &&
            Objects.equals(this.teams, messageMediaPolicyConditions.teams) &&
            Objects.equals(this.customerParticipation, messageMediaPolicyConditions.customerParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forUsers, dateRanges, forQueues, wrapupCodes, languages, timeAllowed, teams, customerParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageMediaPolicyConditions {\n");
    
    sb.append("    forUsers: ").append(toIndentedString(forUsers)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
    sb.append("    forQueues: ").append(toIndentedString(forQueues)).append("\n");
    sb.append("    wrapupCodes: ").append(toIndentedString(wrapupCodes)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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

