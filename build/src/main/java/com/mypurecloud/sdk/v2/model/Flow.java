package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Flow
 */

public class Flow  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUNDCALL("INBOUNDCALL"),
    INBOUNDEMAIL("INBOUNDEMAIL"),
    INQUEUECALL("INQUEUECALL"),
    OUTBOUNDCALL("OUTBOUNDCALL"),
    SECURECALL("SECURECALL"),
    SPEECH("SPEECH"),
    WORKFLOW("WORKFLOW");

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
  private UriReference lockedUser = null;
  private Boolean active = null;
  private Boolean system = null;
  private Boolean deleted = null;
  private FlowVersion publishedVersion = null;
  private FlowVersion savedVersion = null;
  private Object inputSchema = null;
  private Object outputSchema = null;
  private FlowVersion checkedInVersion = null;
  private UriReference publishedBy = null;
  private Operation currentOperation = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The flow name
   **/
  public Flow name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flow name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public Flow description(String description) {
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


  /**
   **/
  public Flow type(TypeEnum type) {
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
  public Flow lockedUser(UriReference lockedUser) {
    this.lockedUser = lockedUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lockedUser")
  public UriReference getLockedUser() {
    return lockedUser;
  }
  public void setLockedUser(UriReference lockedUser) {
    this.lockedUser = lockedUser;
  }


  /**
   **/
  public Flow active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  /**
   **/
  public Flow system(Boolean system) {
    this.system = system;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("system")
  public Boolean getSystem() {
    return system;
  }
  public void setSystem(Boolean system) {
    this.system = system;
  }


  /**
   **/
  public Flow deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  /**
   **/
  public Flow publishedVersion(FlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedVersion")
  public FlowVersion getPublishedVersion() {
    return publishedVersion;
  }
  public void setPublishedVersion(FlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
  }


  /**
   **/
  public Flow savedVersion(FlowVersion savedVersion) {
    this.savedVersion = savedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("savedVersion")
  public FlowVersion getSavedVersion() {
    return savedVersion;
  }
  public void setSavedVersion(FlowVersion savedVersion) {
    this.savedVersion = savedVersion;
  }


  /**
   * json schema describing the inputs for the flow
   **/
  public Flow inputSchema(Object inputSchema) {
    this.inputSchema = inputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "json schema describing the inputs for the flow")
  @JsonProperty("inputSchema")
  public Object getInputSchema() {
    return inputSchema;
  }
  public void setInputSchema(Object inputSchema) {
    this.inputSchema = inputSchema;
  }


  /**
   * json schema describing the outputs for the flow
   **/
  public Flow outputSchema(Object outputSchema) {
    this.outputSchema = outputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "json schema describing the outputs for the flow")
  @JsonProperty("outputSchema")
  public Object getOutputSchema() {
    return outputSchema;
  }
  public void setOutputSchema(Object outputSchema) {
    this.outputSchema = outputSchema;
  }


  /**
   **/
  public Flow checkedInVersion(FlowVersion checkedInVersion) {
    this.checkedInVersion = checkedInVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("checkedInVersion")
  public FlowVersion getCheckedInVersion() {
    return checkedInVersion;
  }
  public void setCheckedInVersion(FlowVersion checkedInVersion) {
    this.checkedInVersion = checkedInVersion;
  }


  /**
   **/
  public Flow publishedBy(UriReference publishedBy) {
    this.publishedBy = publishedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedBy")
  public UriReference getPublishedBy() {
    return publishedBy;
  }
  public void setPublishedBy(UriReference publishedBy) {
    this.publishedBy = publishedBy;
  }


  /**
   **/
  public Flow currentOperation(Operation currentOperation) {
    this.currentOperation = currentOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentOperation")
  public Operation getCurrentOperation() {
    return currentOperation;
  }
  public void setCurrentOperation(Operation currentOperation) {
    this.currentOperation = currentOperation;
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
    Flow flow = (Flow) o;
    return Objects.equals(this.id, flow.id) &&
        Objects.equals(this.name, flow.name) &&
        Objects.equals(this.description, flow.description) &&
        Objects.equals(this.type, flow.type) &&
        Objects.equals(this.lockedUser, flow.lockedUser) &&
        Objects.equals(this.active, flow.active) &&
        Objects.equals(this.system, flow.system) &&
        Objects.equals(this.deleted, flow.deleted) &&
        Objects.equals(this.publishedVersion, flow.publishedVersion) &&
        Objects.equals(this.savedVersion, flow.savedVersion) &&
        Objects.equals(this.inputSchema, flow.inputSchema) &&
        Objects.equals(this.outputSchema, flow.outputSchema) &&
        Objects.equals(this.checkedInVersion, flow.checkedInVersion) &&
        Objects.equals(this.publishedBy, flow.publishedBy) &&
        Objects.equals(this.currentOperation, flow.currentOperation) &&
        Objects.equals(this.selfUri, flow.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, lockedUser, active, system, deleted, publishedVersion, savedVersion, inputSchema, outputSchema, checkedInVersion, publishedBy, currentOperation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lockedUser: ").append(toIndentedString(lockedUser)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    publishedVersion: ").append(toIndentedString(publishedVersion)).append("\n");
    sb.append("    savedVersion: ").append(toIndentedString(savedVersion)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    outputSchema: ").append(toIndentedString(outputSchema)).append("\n");
    sb.append("    checkedInVersion: ").append(toIndentedString(checkedInVersion)).append("\n");
    sb.append("    publishedBy: ").append(toIndentedString(publishedBy)).append("\n");
    sb.append("    currentOperation: ").append(toIndentedString(currentOperation)).append("\n");
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

