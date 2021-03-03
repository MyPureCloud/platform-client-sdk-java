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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * HistoryEntry
 */

public class HistoryEntry  implements Serializable {
  

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The action performed
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CHECKIN("CHECKIN"),
    CHECKOUT("CHECKOUT"),
    CREATE("CREATE"),
    DEACTIVATE("DEACTIVATE"),
    DEBUG("DEBUG"),
    DELETE("DELETE"),
    PUBLISH("PUBLISH"),
    REVERT("REVERT"),
    SAVE("SAVE"),
    TRANSCODE("TRANSCODE"),
    UPDATE("UPDATE"),
    UPLOAD("UPLOAD");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;
  private String resource = null;
  private Date timestamp = null;
  private User user = null;
  private DomainEntityRef client = null;
  private String version = null;
  private Boolean secure = null;

  
  /**
   * The action performed
   **/
  public HistoryEntry action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action performed")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * For actions performed not on the item itself, but on a sub-item, this field identifies the sub-item by name.  For example, for actions performed on prompt resources, this will be the prompt resource name.
   **/
  public HistoryEntry resource(String resource) {
    this.resource = resource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For actions performed not on the item itself, but on a sub-item, this field identifies the sub-item by name.  For example, for actions performed on prompt resources, this will be the prompt resource name.")
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }
  public void setResource(String resource) {
    this.resource = resource;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public HistoryEntry timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * User associated with this entry.
   **/
  public HistoryEntry user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User associated with this entry.")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * OAuth client associated with this entry.
   **/
  public HistoryEntry client(DomainEntityRef client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OAuth client associated with this entry.")
  @JsonProperty("client")
  public DomainEntityRef getClient() {
    return client;
  }
  public void setClient(DomainEntityRef client) {
    this.client = client;
  }

  
  /**
   **/
  public HistoryEntry version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  public HistoryEntry secure(Boolean secure) {
    this.secure = secure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secure")
  public Boolean getSecure() {
    return secure;
  }
  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryEntry historyEntry = (HistoryEntry) o;
    return Objects.equals(this.action, historyEntry.action) &&
        Objects.equals(this.resource, historyEntry.resource) &&
        Objects.equals(this.timestamp, historyEntry.timestamp) &&
        Objects.equals(this.user, historyEntry.user) &&
        Objects.equals(this.client, historyEntry.client) &&
        Objects.equals(this.version, historyEntry.version) &&
        Objects.equals(this.secure, historyEntry.secure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, resource, timestamp, user, client, version, secure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryEntry {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
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

