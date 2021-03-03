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
import com.mypurecloud.sdk.v2.model.CallRoute;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CallForwarding
 */

public class CallForwarding  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User user = null;
  private Boolean enabled = null;
  private String phoneNumber = null;
  private List<CallRoute> calls = new ArrayList<CallRoute>();

  private static class VoicemailEnumDeserializer extends StdDeserializer<VoicemailEnum> {
    public VoicemailEnumDeserializer() {
      super(VoicemailEnumDeserializer.class);
    }

    @Override
    public VoicemailEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VoicemailEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of voicemail to use with the callForwarding configuration
   */
 @JsonDeserialize(using = VoicemailEnumDeserializer.class)
  public enum VoicemailEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PURECLOUD("PURECLOUD"),
    LASTCALL("LASTCALL"),
    NONE("NONE");

    private String value;

    VoicemailEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VoicemailEnum fromString(String key) {
      if (key == null) return null;

      for (VoicemailEnum value : VoicemailEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VoicemailEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VoicemailEnum voicemail = null;
  private Date modifiedDate = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public CallForwarding name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public CallForwarding user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * Whether or not CallForwarding is enabled
   **/
  public CallForwarding enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not CallForwarding is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * This property is deprecated. Please use the calls property
   **/
  public CallForwarding phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property is deprecated. Please use the calls property")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * An ordered list of CallRoutes to be executed when CallForwarding is enabled
   **/
  public CallForwarding calls(List<CallRoute> calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ordered list of CallRoutes to be executed when CallForwarding is enabled")
  @JsonProperty("calls")
  public List<CallRoute> getCalls() {
    return calls;
  }
  public void setCalls(List<CallRoute> calls) {
    this.calls = calls;
  }

  
  /**
   * The type of voicemail to use with the callForwarding configuration
   **/
  public CallForwarding voicemail(VoicemailEnum voicemail) {
    this.voicemail = voicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of voicemail to use with the callForwarding configuration")
  @JsonProperty("voicemail")
  public VoicemailEnum getVoicemail() {
    return voicemail;
  }
  public void setVoicemail(VoicemailEnum voicemail) {
    this.voicemail = voicemail;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CallForwarding modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
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
    CallForwarding callForwarding = (CallForwarding) o;
    return Objects.equals(this.id, callForwarding.id) &&
        Objects.equals(this.name, callForwarding.name) &&
        Objects.equals(this.user, callForwarding.user) &&
        Objects.equals(this.enabled, callForwarding.enabled) &&
        Objects.equals(this.phoneNumber, callForwarding.phoneNumber) &&
        Objects.equals(this.calls, callForwarding.calls) &&
        Objects.equals(this.voicemail, callForwarding.voicemail) &&
        Objects.equals(this.modifiedDate, callForwarding.modifiedDate) &&
        Objects.equals(this.selfUri, callForwarding.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, enabled, phoneNumber, calls, voicemail, modifiedDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallForwarding {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

