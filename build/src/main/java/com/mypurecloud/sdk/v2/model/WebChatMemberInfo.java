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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * WebChatMemberInfo
 */

public class WebChatMemberInfo  implements Serializable {
  
  private String id = null;
  private String displayName = null;
  private String firstName = null;
  private String lastName = null;
  private String email = null;
  private String phoneNumber = null;
  private String avatarImageUrl = null;

  private static class RoleEnumDeserializer extends StdDeserializer<RoleEnum> {
    public RoleEnumDeserializer() {
      super(RoleEnumDeserializer.class);
    }

    @Override
    public RoleEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RoleEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The role of the member, one of [agent, customer, acd, workflow]
   */
 @JsonDeserialize(using = RoleEnumDeserializer.class)
  public enum RoleEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENT("AGENT"),
    CUSTOMER("CUSTOMER"),
    WORKFLOW("WORKFLOW"),
    ACD("ACD");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RoleEnum fromString(String key) {
      if (key == null) return null;

      for (RoleEnum value : RoleEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RoleEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RoleEnum role = null;
  private Date joinDate = null;
  private Date leaveDate = null;
  private Boolean authenticatedGuest = null;
  private Map<String, String> customFields = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The connection state of this member.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONNECTED("CONNECTED"),
    DISCONNECTED("DISCONNECTED"),
    ALERTING("ALERTING");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  
  /**
   * The communicationId of this member.
   **/
  public WebChatMemberInfo id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The communicationId of this member.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The display name of the member.
   **/
  public WebChatMemberInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display name of the member.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * The first name of the member.
   **/
  public WebChatMemberInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first name of the member.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * The last name of the member.
   **/
  public WebChatMemberInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last name of the member.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * The email address of the member.
   **/
  public WebChatMemberInfo email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address of the member.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The phone number of the member.
   **/
  public WebChatMemberInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number of the member.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * The url to the avatar image of the member.
   **/
  public WebChatMemberInfo avatarImageUrl(String avatarImageUrl) {
    this.avatarImageUrl = avatarImageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url to the avatar image of the member.")
  @JsonProperty("avatarImageUrl")
  public String getAvatarImageUrl() {
    return avatarImageUrl;
  }
  public void setAvatarImageUrl(String avatarImageUrl) {
    this.avatarImageUrl = avatarImageUrl;
  }

  
  /**
   * The role of the member, one of [agent, customer, acd, workflow]
   **/
  public WebChatMemberInfo role(RoleEnum role) {
    this.role = role;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The role of the member, one of [agent, customer, acd, workflow]")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  
  /**
   * The time the member joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WebChatMemberInfo joinDate(Date joinDate) {
    this.joinDate = joinDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the member joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("joinDate")
  public Date getJoinDate() {
    return joinDate;
  }
  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }

  
  /**
   * The time the member left the conversation, or null if the member is still active in the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WebChatMemberInfo leaveDate(Date leaveDate) {
    this.leaveDate = leaveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the member left the conversation, or null if the member is still active in the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("leaveDate")
  public Date getLeaveDate() {
    return leaveDate;
  }
  public void setLeaveDate(Date leaveDate) {
    this.leaveDate = leaveDate;
  }

  
  /**
   * If true, the guest member is an authenticated guest.
   **/
  public WebChatMemberInfo authenticatedGuest(Boolean authenticatedGuest) {
    this.authenticatedGuest = authenticatedGuest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the guest member is an authenticated guest.")
  @JsonProperty("authenticatedGuest")
  public Boolean getAuthenticatedGuest() {
    return authenticatedGuest;
  }
  public void setAuthenticatedGuest(Boolean authenticatedGuest) {
    this.authenticatedGuest = authenticatedGuest;
  }

  
  /**
   * Any custom fields of information pertaining to this member.
   **/
  public WebChatMemberInfo customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any custom fields of information pertaining to this member.")
  @JsonProperty("customFields")
  public Map<String, String> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }

  
  /**
   * The connection state of this member.
   **/
  public WebChatMemberInfo state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The connection state of this member.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebChatMemberInfo webChatMemberInfo = (WebChatMemberInfo) o;
    return Objects.equals(this.id, webChatMemberInfo.id) &&
        Objects.equals(this.displayName, webChatMemberInfo.displayName) &&
        Objects.equals(this.firstName, webChatMemberInfo.firstName) &&
        Objects.equals(this.lastName, webChatMemberInfo.lastName) &&
        Objects.equals(this.email, webChatMemberInfo.email) &&
        Objects.equals(this.phoneNumber, webChatMemberInfo.phoneNumber) &&
        Objects.equals(this.avatarImageUrl, webChatMemberInfo.avatarImageUrl) &&
        Objects.equals(this.role, webChatMemberInfo.role) &&
        Objects.equals(this.joinDate, webChatMemberInfo.joinDate) &&
        Objects.equals(this.leaveDate, webChatMemberInfo.leaveDate) &&
        Objects.equals(this.authenticatedGuest, webChatMemberInfo.authenticatedGuest) &&
        Objects.equals(this.customFields, webChatMemberInfo.customFields) &&
        Objects.equals(this.state, webChatMemberInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, firstName, lastName, email, phoneNumber, avatarImageUrl, role, joinDate, leaveDate, authenticatedGuest, customFields, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatMemberInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    avatarImageUrl: ").append(toIndentedString(avatarImageUrl)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
    sb.append("    leaveDate: ").append(toIndentedString(leaveDate)).append("\n");
    sb.append("    authenticatedGuest: ").append(toIndentedString(authenticatedGuest)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

