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
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.NluInfo;
import com.mypurecloud.sdk.v2.model.SupportedLanguage;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowVersion
 */

public class FlowVersion  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String commitVersion = null;
  private String configurationVersion = null;

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
    PUBLISH("PUBLISH"),
    CHECKIN("CHECKIN"),
    SAVE("SAVE");

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
  private Boolean secure = null;
  private Boolean debug = null;
  private User createdBy = null;
  private DomainEntityRef createdByClient = null;
  private String configurationUri = null;
  private Long dateCreated = null;
  private String generationId = null;
  private String publishResultUri = null;
  private JsonSchemaDocument inputSchema = null;
  private JsonSchemaDocument outputSchema = null;
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
   * The flow version identifier
   **/
  public FlowVersion id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow version identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public FlowVersion name(String name) {
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
  public FlowVersion commitVersion(String commitVersion) {
    this.commitVersion = commitVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("commitVersion")
  public String getCommitVersion() {
    return commitVersion;
  }
  public void setCommitVersion(String commitVersion) {
    this.commitVersion = commitVersion;
  }

  
  /**
   **/
  public FlowVersion configurationVersion(String configurationVersion) {
    this.configurationVersion = configurationVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("configurationVersion")
  public String getConfigurationVersion() {
    return configurationVersion;
  }
  public void setConfigurationVersion(String configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  
  /**
   **/
  public FlowVersion type(TypeEnum type) {
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
  public FlowVersion secure(Boolean secure) {
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

  
  /**
   **/
  public FlowVersion debug(Boolean debug) {
    this.debug = debug;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("debug")
  public Boolean getDebug() {
    return debug;
  }
  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  
  /**
   **/
  public FlowVersion createdBy(User createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public FlowVersion createdByClient(DomainEntityRef createdByClient) {
    this.createdByClient = createdByClient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdByClient")
  public DomainEntityRef getCreatedByClient() {
    return createdByClient;
  }
  public void setCreatedByClient(DomainEntityRef createdByClient) {
    this.createdByClient = createdByClient;
  }

  
  /**
   **/
  public FlowVersion configurationUri(String configurationUri) {
    this.configurationUri = configurationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("configurationUri")
  public String getConfigurationUri() {
    return configurationUri;
  }
  public void setConfigurationUri(String configurationUri) {
    this.configurationUri = configurationUri;
  }

  
  /**
   **/
  public FlowVersion dateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Long getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Long dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public FlowVersion generationId(String generationId) {
    this.generationId = generationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("generationId")
  public String getGenerationId() {
    return generationId;
  }
  public void setGenerationId(String generationId) {
    this.generationId = generationId;
  }

  
  /**
   **/
  public FlowVersion publishResultUri(String publishResultUri) {
    this.publishResultUri = publishResultUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("publishResultUri")
  public String getPublishResultUri() {
    return publishResultUri;
  }
  public void setPublishResultUri(String publishResultUri) {
    this.publishResultUri = publishResultUri;
  }

  
  /**
   **/
  public FlowVersion inputSchema(JsonSchemaDocument inputSchema) {
    this.inputSchema = inputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inputSchema")
  public JsonSchemaDocument getInputSchema() {
    return inputSchema;
  }
  public void setInputSchema(JsonSchemaDocument inputSchema) {
    this.inputSchema = inputSchema;
  }

  
  /**
   **/
  public FlowVersion outputSchema(JsonSchemaDocument outputSchema) {
    this.outputSchema = outputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outputSchema")
  public JsonSchemaDocument getOutputSchema() {
    return outputSchema;
  }
  public void setOutputSchema(JsonSchemaDocument outputSchema) {
    this.outputSchema = outputSchema;
  }

  
  @ApiModelProperty(example = "null", value = "Information about the natural language understanding configuration for the flow version")
  @JsonProperty("nluInfo")
  public NluInfo getNluInfo() {
    return nluInfo;
  }

  
  @ApiModelProperty(example = "null", value = "List of supported languages for this version of the flow")
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
    FlowVersion flowVersion = (FlowVersion) o;
    return Objects.equals(this.id, flowVersion.id) &&
        Objects.equals(this.name, flowVersion.name) &&
        Objects.equals(this.commitVersion, flowVersion.commitVersion) &&
        Objects.equals(this.configurationVersion, flowVersion.configurationVersion) &&
        Objects.equals(this.type, flowVersion.type) &&
        Objects.equals(this.secure, flowVersion.secure) &&
        Objects.equals(this.debug, flowVersion.debug) &&
        Objects.equals(this.createdBy, flowVersion.createdBy) &&
        Objects.equals(this.createdByClient, flowVersion.createdByClient) &&
        Objects.equals(this.configurationUri, flowVersion.configurationUri) &&
        Objects.equals(this.dateCreated, flowVersion.dateCreated) &&
        Objects.equals(this.generationId, flowVersion.generationId) &&
        Objects.equals(this.publishResultUri, flowVersion.publishResultUri) &&
        Objects.equals(this.inputSchema, flowVersion.inputSchema) &&
        Objects.equals(this.outputSchema, flowVersion.outputSchema) &&
        Objects.equals(this.nluInfo, flowVersion.nluInfo) &&
        Objects.equals(this.supportedLanguages, flowVersion.supportedLanguages) &&
        Objects.equals(this.compatibleFlowTypes, flowVersion.compatibleFlowTypes) &&
        Objects.equals(this.selfUri, flowVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, commitVersion, configurationVersion, type, secure, debug, createdBy, createdByClient, configurationUri, dateCreated, generationId, publishResultUri, inputSchema, outputSchema, nluInfo, supportedLanguages, compatibleFlowTypes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commitVersion: ").append(toIndentedString(commitVersion)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByClient: ").append(toIndentedString(createdByClient)).append("\n");
    sb.append("    configurationUri: ").append(toIndentedString(configurationUri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    generationId: ").append(toIndentedString(generationId)).append("\n");
    sb.append("    publishResultUri: ").append(toIndentedString(publishResultUri)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    outputSchema: ").append(toIndentedString(outputSchema)).append("\n");
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

