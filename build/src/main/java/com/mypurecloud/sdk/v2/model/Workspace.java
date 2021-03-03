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
import com.mypurecloud.sdk.v2.model.WorkspaceSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Workspace
 */

public class Workspace  implements Serializable {
  
  private String id = null;
  private String name = null;

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("USER"),
    GROUP("GROUP");

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
  private Boolean isCurrentUserWorkspace = null;
  private DomainEntityRef user = null;
  private String bucket = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private WorkspaceSummary summary = null;
  private List<String> acl = new ArrayList<String>();
  private String description = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The current name of the workspace.
   **/
  public Workspace name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current name of the workspace.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Workspace type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public Workspace isCurrentUserWorkspace(Boolean isCurrentUserWorkspace) {
    this.isCurrentUserWorkspace = isCurrentUserWorkspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isCurrentUserWorkspace")
  public Boolean getIsCurrentUserWorkspace() {
    return isCurrentUserWorkspace;
  }
  public void setIsCurrentUserWorkspace(Boolean isCurrentUserWorkspace) {
    this.isCurrentUserWorkspace = isCurrentUserWorkspace;
  }

  
  /**
   **/
  public Workspace user(DomainEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DomainEntityRef getUser() {
    return user;
  }
  public void setUser(DomainEntityRef user) {
    this.user = user;
  }

  
  /**
   **/
  public Workspace bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bucket")
  public String getBucket() {
    return bucket;
  }
  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Workspace dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Workspace dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public Workspace summary(WorkspaceSummary summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("summary")
  public WorkspaceSummary getSummary() {
    return summary;
  }
  public void setSummary(WorkspaceSummary summary) {
    this.summary = summary;
  }

  
  /**
   **/
  public Workspace acl(List<String> acl) {
    this.acl = acl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acl")
  public List<String> getAcl() {
    return acl;
  }
  public void setAcl(List<String> acl) {
    this.acl = acl;
  }

  
  /**
   **/
  public Workspace description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
    Workspace workspace = (Workspace) o;
    return Objects.equals(this.id, workspace.id) &&
        Objects.equals(this.name, workspace.name) &&
        Objects.equals(this.type, workspace.type) &&
        Objects.equals(this.isCurrentUserWorkspace, workspace.isCurrentUserWorkspace) &&
        Objects.equals(this.user, workspace.user) &&
        Objects.equals(this.bucket, workspace.bucket) &&
        Objects.equals(this.dateCreated, workspace.dateCreated) &&
        Objects.equals(this.dateModified, workspace.dateModified) &&
        Objects.equals(this.summary, workspace.summary) &&
        Objects.equals(this.acl, workspace.acl) &&
        Objects.equals(this.description, workspace.description) &&
        Objects.equals(this.selfUri, workspace.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, isCurrentUserWorkspace, user, bucket, dateCreated, dateModified, summary, acl, description, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isCurrentUserWorkspace: ").append(toIndentedString(isCurrentUserWorkspace)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

