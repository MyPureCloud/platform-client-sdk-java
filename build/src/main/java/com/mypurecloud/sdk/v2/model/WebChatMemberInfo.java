package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
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
  private String avatarImageUrl = null;

  /**
   * The role of the member, one of [agent, customer, acd, workflow]
   */
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

  /**
   * The connection state of this member.
   */
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
   * The time the member joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public WebChatMemberInfo joinDate(Date joinDate) {
    this.joinDate = joinDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the member joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("joinDate")
  public Date getJoinDate() {
    return joinDate;
  }
  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }

  
  /**
   * The time the member left the conversation, or null if the member is still active in the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public WebChatMemberInfo leaveDate(Date leaveDate) {
    this.leaveDate = leaveDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the member left the conversation, or null if the member is still active in the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
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
    return Objects.hash(id, displayName, avatarImageUrl, role, joinDate, leaveDate, authenticatedGuest, customFields, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatMemberInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

