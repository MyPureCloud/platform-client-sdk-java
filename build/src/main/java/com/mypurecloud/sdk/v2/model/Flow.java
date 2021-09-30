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
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.NluInfo;
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.SupportedLanguage;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.WritableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Flow
 */

public class Flow  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WritableDivision division = null;
  private String description = null;

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
    BOT("BOT"),
    COMMONMODULE("COMMONMODULE"),
    INBOUNDCALL("INBOUNDCALL"),
    INBOUNDCHAT("INBOUNDCHAT"),
    INBOUNDEMAIL("INBOUNDEMAIL"),
    INBOUNDSHORTMESSAGE("INBOUNDSHORTMESSAGE"),
    INQUEUECALL("INQUEUECALL"),
    INQUEUEEMAIL("INQUEUEEMAIL"),
    INQUEUESHORTMESSAGE("INQUEUESHORTMESSAGE"),
    OUTBOUNDCALL("OUTBOUNDCALL"),
    SECURECALL("SECURECALL"),
    SPEECH("SPEECH"),
    SURVEYINVITE("SURVEYINVITE"),
    VOICEMAIL("VOICEMAIL"),
    WORKFLOW("WORKFLOW"),
    WORKITEM("WORKITEM");

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
  private User lockedUser = null;
  private DomainEntityRef lockedClient = null;
  private Boolean active = null;
  private Boolean system = null;
  private Boolean deleted = null;
  private FlowVersion publishedVersion = null;
  private FlowVersion savedVersion = null;
  private Object inputSchema = null;
  private Object outputSchema = null;
  private FlowVersion checkedInVersion = null;
  private FlowVersion debugVersion = null;
  private User publishedBy = null;
  private Operation currentOperation = null;
  private NluInfo nluInfo = null;
  private List<SupportedLanguage> supportedLanguages = new ArrayList<SupportedLanguage>();

  private static class CompatibleFlowTypesEnumDeserializer extends StdDeserializer<CompatibleFlowTypesEnum> {
    public CompatibleFlowTypesEnumDeserializer() {
      super(CompatibleFlowTypesEnumDeserializer.class);
    }

    @Override
    public CompatibleFlowTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CompatibleFlowTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets compatibleFlowTypes
   */
 @JsonDeserialize(using = CompatibleFlowTypesEnumDeserializer.class)
  public enum CompatibleFlowTypesEnum {
    BOT("BOT"),
    COMMONMODULE("COMMONMODULE"),
    INBOUNDCALL("INBOUNDCALL"),
    INBOUNDCHAT("INBOUNDCHAT"),
    INBOUNDEMAIL("INBOUNDEMAIL"),
    INBOUNDSHORTMESSAGE("INBOUNDSHORTMESSAGE"),
    INQUEUECALL("INQUEUECALL"),
    INQUEUEEMAIL("INQUEUEEMAIL"),
    INQUEUESHORTMESSAGE("INQUEUESHORTMESSAGE"),
    OUTBOUNDCALL("OUTBOUNDCALL"),
    SECURECALL("SECURECALL"),
    SPEECH("SPEECH"),
    SURVEYINVITE("SURVEYINVITE"),
    VOICEMAIL("VOICEMAIL"),
    WORKFLOW("WORKFLOW"),
    WORKITEM("WORKITEM");

    private String value;

    CompatibleFlowTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CompatibleFlowTypesEnum fromString(String key) {
      if (key == null) return null;

      for (CompatibleFlowTypesEnum value : CompatibleFlowTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CompatibleFlowTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<CompatibleFlowTypesEnum> compatibleFlowTypes = new ArrayList<CompatibleFlowTypesEnum>();
  private String selfUri = null;

  
  /**
   * The flow identifier
   **/
  public Flow id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   * The division to which this entity belongs.
   **/
  public Flow division(WritableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public WritableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableDivision division) {
    this.division = division;
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
   * User that has the flow locked.
   **/
  public Flow lockedUser(User lockedUser) {
    this.lockedUser = lockedUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that has the flow locked.")
  @JsonProperty("lockedUser")
  public User getLockedUser() {
    return lockedUser;
  }
  public void setLockedUser(User lockedUser) {
    this.lockedUser = lockedUser;
  }

  
  /**
   * OAuth client that has the flow locked.
   **/
  public Flow lockedClient(DomainEntityRef lockedClient) {
    this.lockedClient = lockedClient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OAuth client that has the flow locked.")
  @JsonProperty("lockedClient")
  public DomainEntityRef getLockedClient() {
    return lockedClient;
  }
  public void setLockedClient(DomainEntityRef lockedClient) {
    this.lockedClient = lockedClient;
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
  public Flow debugVersion(FlowVersion debugVersion) {
    this.debugVersion = debugVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("debugVersion")
  public FlowVersion getDebugVersion() {
    return debugVersion;
  }
  public void setDebugVersion(FlowVersion debugVersion) {
    this.debugVersion = debugVersion;
  }

  
  /**
   **/
  public Flow publishedBy(User publishedBy) {
    this.publishedBy = publishedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishedBy")
  public User getPublishedBy() {
    return publishedBy;
  }
  public void setPublishedBy(User publishedBy) {
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

  
  @ApiModelProperty(example = "null", value = "Information about the natural language understanding configuration for the published version of the flow")
  @JsonProperty("nluInfo")
  public NluInfo getNluInfo() {
    return nluInfo;
  }

  
  @ApiModelProperty(example = "null", value = "List of supported languages for the published version of the flow.")
  @JsonProperty("supportedLanguages")
  public List<SupportedLanguage> getSupportedLanguages() {
    return supportedLanguages;
  }

  
  @ApiModelProperty(example = "null", value = "Compatible flow types designate which flow types are allowed to embed a flow’s configuration within their own flow configuration.  Currently the only flows that can be embedded are Common Module flows and the embedding flow can invoke them using the Call Common Module action.")
  @JsonProperty("compatibleFlowTypes")
  public List<CompatibleFlowTypesEnum> getCompatibleFlowTypes() {
    return compatibleFlowTypes;
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
        Objects.equals(this.division, flow.division) &&
        Objects.equals(this.description, flow.description) &&
        Objects.equals(this.type, flow.type) &&
        Objects.equals(this.lockedUser, flow.lockedUser) &&
        Objects.equals(this.lockedClient, flow.lockedClient) &&
        Objects.equals(this.active, flow.active) &&
        Objects.equals(this.system, flow.system) &&
        Objects.equals(this.deleted, flow.deleted) &&
        Objects.equals(this.publishedVersion, flow.publishedVersion) &&
        Objects.equals(this.savedVersion, flow.savedVersion) &&
        Objects.equals(this.inputSchema, flow.inputSchema) &&
        Objects.equals(this.outputSchema, flow.outputSchema) &&
        Objects.equals(this.checkedInVersion, flow.checkedInVersion) &&
        Objects.equals(this.debugVersion, flow.debugVersion) &&
        Objects.equals(this.publishedBy, flow.publishedBy) &&
        Objects.equals(this.currentOperation, flow.currentOperation) &&
        Objects.equals(this.nluInfo, flow.nluInfo) &&
        Objects.equals(this.supportedLanguages, flow.supportedLanguages) &&
        Objects.equals(this.compatibleFlowTypes, flow.compatibleFlowTypes) &&
        Objects.equals(this.selfUri, flow.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, type, lockedUser, lockedClient, active, system, deleted, publishedVersion, savedVersion, inputSchema, outputSchema, checkedInVersion, debugVersion, publishedBy, currentOperation, nluInfo, supportedLanguages, compatibleFlowTypes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lockedUser: ").append(toIndentedString(lockedUser)).append("\n");
    sb.append("    lockedClient: ").append(toIndentedString(lockedClient)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    publishedVersion: ").append(toIndentedString(publishedVersion)).append("\n");
    sb.append("    savedVersion: ").append(toIndentedString(savedVersion)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    outputSchema: ").append(toIndentedString(outputSchema)).append("\n");
    sb.append("    checkedInVersion: ").append(toIndentedString(checkedInVersion)).append("\n");
    sb.append("    debugVersion: ").append(toIndentedString(debugVersion)).append("\n");
    sb.append("    publishedBy: ").append(toIndentedString(publishedBy)).append("\n");
    sb.append("    currentOperation: ").append(toIndentedString(currentOperation)).append("\n");
    sb.append("    nluInfo: ").append(toIndentedString(nluInfo)).append("\n");
    sb.append("    supportedLanguages: ").append(toIndentedString(supportedLanguages)).append("\n");
    sb.append("    compatibleFlowTypes: ").append(toIndentedString(compatibleFlowTypes)).append("\n");
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

