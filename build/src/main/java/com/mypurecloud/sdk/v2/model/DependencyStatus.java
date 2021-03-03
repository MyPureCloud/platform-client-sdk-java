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
import com.mypurecloud.sdk.v2.model.FailedObject;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DependencyStatus
 */

public class DependencyStatus  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User user = null;
  private DomainEntityRef client = null;
  private String buildId = null;
  private Date dateStarted = null;
  private Date dateCompleted = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BUILDINITIALIZING("BUILDINITIALIZING"),
    BUILDINPROGRESS("BUILDINPROGRESS"),
    NOTBUILT("NOTBUILT"),
    OPERATIONAL("OPERATIONAL"),
    OPERATIONALNEEDSREBUILD("OPERATIONALNEEDSREBUILD");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private List<FailedObject> failedObjects = new ArrayList<FailedObject>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DependencyStatus name(String name) {
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
   * User that initiated the build.
   **/
  public DependencyStatus user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that initiated the build.")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * OAuth client that initiated the build.
   **/
  public DependencyStatus client(DomainEntityRef client) {
    this.client = client;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OAuth client that initiated the build.")
  @JsonProperty("client")
  public DomainEntityRef getClient() {
    return client;
  }
  public void setClient(DomainEntityRef client) {
    this.client = client;
  }

  
  /**
   **/
  public DependencyStatus buildId(String buildId) {
    this.buildId = buildId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("buildId")
  public String getBuildId() {
    return buildId;
  }
  public void setBuildId(String buildId) {
    this.buildId = buildId;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DependencyStatus dateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStarted")
  public Date getDateStarted() {
    return dateStarted;
  }
  public void setDateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DependencyStatus dateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
  }

  
  /**
   **/
  public DependencyStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public DependencyStatus failedObjects(List<FailedObject> failedObjects) {
    this.failedObjects = failedObjects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("failedObjects")
  public List<FailedObject> getFailedObjects() {
    return failedObjects;
  }
  public void setFailedObjects(List<FailedObject> failedObjects) {
    this.failedObjects = failedObjects;
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
    DependencyStatus dependencyStatus = (DependencyStatus) o;
    return Objects.equals(this.id, dependencyStatus.id) &&
        Objects.equals(this.name, dependencyStatus.name) &&
        Objects.equals(this.user, dependencyStatus.user) &&
        Objects.equals(this.client, dependencyStatus.client) &&
        Objects.equals(this.buildId, dependencyStatus.buildId) &&
        Objects.equals(this.dateStarted, dependencyStatus.dateStarted) &&
        Objects.equals(this.dateCompleted, dependencyStatus.dateCompleted) &&
        Objects.equals(this.status, dependencyStatus.status) &&
        Objects.equals(this.failedObjects, dependencyStatus.failedObjects) &&
        Objects.equals(this.selfUri, dependencyStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, client, buildId, dateStarted, dateCompleted, status, failedObjects, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failedObjects: ").append(toIndentedString(failedObjects)).append("\n");
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

