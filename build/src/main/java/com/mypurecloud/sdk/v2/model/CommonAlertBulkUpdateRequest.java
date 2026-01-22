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
import com.mypurecloud.sdk.v2.model.MuteSnoozeFields;
import com.mypurecloud.sdk.v2.model.UnreadFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * CommonAlertBulkUpdateRequest
 */

public class CommonAlertBulkUpdateRequest  implements Serializable {
  

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
   * The action to take
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MUTE("Mute"),
    SNOOZE("Snooze"),
    UNREAD("Unread"),
    CLOSE("Close");

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
  private List<String> alertIds = null;
  private MuteSnoozeFields muteSnooze = null;
  private UnreadFields unread = null;

  public CommonAlertBulkUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      alertIds = new ArrayList<String>();
    }
  }

  
  /**
   * The action to take
   **/
  public CommonAlertBulkUpdateRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action to take")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The user supplied alert ids to be muted
   **/
  public CommonAlertBulkUpdateRequest alertIds(List<String> alertIds) {
    this.alertIds = alertIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user supplied alert ids to be muted")
  @JsonProperty("alertIds")
  public List<String> getAlertIds() {
    return alertIds;
  }
  public void setAlertIds(List<String> alertIds) {
    this.alertIds = alertIds;
  }


  /**
   * The fields need for a mute or snooze requests
   **/
  public CommonAlertBulkUpdateRequest muteSnooze(MuteSnoozeFields muteSnooze) {
    this.muteSnooze = muteSnooze;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The fields need for a mute or snooze requests")
  @JsonProperty("muteSnooze")
  public MuteSnoozeFields getMuteSnooze() {
    return muteSnooze;
  }
  public void setMuteSnooze(MuteSnoozeFields muteSnooze) {
    this.muteSnooze = muteSnooze;
  }


  /**
   * The fields need for an unread update requests
   **/
  public CommonAlertBulkUpdateRequest unread(UnreadFields unread) {
    this.unread = unread;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The fields need for an unread update requests")
  @JsonProperty("unread")
  public UnreadFields getUnread() {
    return unread;
  }
  public void setUnread(UnreadFields unread) {
    this.unread = unread;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonAlertBulkUpdateRequest commonAlertBulkUpdateRequest = (CommonAlertBulkUpdateRequest) o;

    return Objects.equals(this.type, commonAlertBulkUpdateRequest.type) &&
            Objects.equals(this.alertIds, commonAlertBulkUpdateRequest.alertIds) &&
            Objects.equals(this.muteSnooze, commonAlertBulkUpdateRequest.muteSnooze) &&
            Objects.equals(this.unread, commonAlertBulkUpdateRequest.unread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, alertIds, muteSnooze, unread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonAlertBulkUpdateRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alertIds: ").append(toIndentedString(alertIds)).append("\n");
    sb.append("    muteSnooze: ").append(toIndentedString(muteSnooze)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
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

