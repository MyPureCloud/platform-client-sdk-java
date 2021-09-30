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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.MessagingTemplate;
import com.mypurecloud.sdk.v2.model.ResponseSubstitution;
import com.mypurecloud.sdk.v2.model.ResponseText;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Contains information about a response.
 */
@ApiModel(description = "Contains information about a response.")

public class Response  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer version = null;
  private List<DomainEntityRef> libraries = new ArrayList<DomainEntityRef>();
  private List<ResponseText> texts = new ArrayList<ResponseText>();
  private User createdBy = null;
  private Date dateCreated = null;

  private static class InteractionTypeEnumDeserializer extends StdDeserializer<InteractionTypeEnum> {
    public InteractionTypeEnumDeserializer() {
      super(InteractionTypeEnumDeserializer.class);
    }

    @Override
    public InteractionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InteractionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The interaction type for this response.
   */
 @JsonDeserialize(using = InteractionTypeEnumDeserializer.class)
  public enum InteractionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CHAT("chat"),
    EMAIL("email"),
    TWITTER("twitter");

    private String value;

    InteractionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InteractionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (InteractionTypeEnum value : InteractionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InteractionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InteractionTypeEnum interactionType = null;
  private List<ResponseSubstitution> substitutions = new ArrayList<ResponseSubstitution>();
  private JsonSchemaDocument substitutionsSchema = null;

  private static class ResponseTypeEnumDeserializer extends StdDeserializer<ResponseTypeEnum> {
    public ResponseTypeEnumDeserializer() {
      super(ResponseTypeEnumDeserializer.class);
    }

    @Override
    public ResponseTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResponseTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The response type represented by the response.
   */
 @JsonDeserialize(using = ResponseTypeEnumDeserializer.class)
  public enum ResponseTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MESSAGINGTEMPLATE("MessagingTemplate"),
    CAMPAIGNSMSTEMPLATE("CampaignSmsTemplate"),
    CAMPAIGNEMAILTEMPLATE("CampaignEmailTemplate");

    private String value;

    ResponseTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResponseTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ResponseTypeEnum value : ResponseTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResponseTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResponseTypeEnum responseType = null;
  private MessagingTemplate messagingTemplate = null;
  private List<AddressableEntityRef> assets = new ArrayList<AddressableEntityRef>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Response name(String name) {
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
   * Version number required for updates.
   **/
  public Response version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version number required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * One or more libraries response is associated with.
   **/
  public Response libraries(List<DomainEntityRef> libraries) {
    this.libraries = libraries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "One or more libraries response is associated with.")
  @JsonProperty("libraries")
  public List<DomainEntityRef> getLibraries() {
    return libraries;
  }
  public void setLibraries(List<DomainEntityRef> libraries) {
    this.libraries = libraries;
  }

  
  /**
   * One or more texts associated with the response.
   **/
  public Response texts(List<ResponseText> texts) {
    this.texts = texts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "One or more texts associated with the response.")
  @JsonProperty("texts")
  public List<ResponseText> getTexts() {
    return texts;
  }
  public void setTexts(List<ResponseText> texts) {
    this.texts = texts;
  }

  
  @ApiModelProperty(example = "null", value = "User that created the response")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  /**
   * The interaction type for this response.
   **/
  public Response interactionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The interaction type for this response.")
  @JsonProperty("interactionType")
  public InteractionTypeEnum getInteractionType() {
    return interactionType;
  }
  public void setInteractionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
  }

  
  /**
   * Details about any text substitutions used in the texts for this response.
   **/
  public Response substitutions(List<ResponseSubstitution> substitutions) {
    this.substitutions = substitutions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about any text substitutions used in the texts for this response.")
  @JsonProperty("substitutions")
  public List<ResponseSubstitution> getSubstitutions() {
    return substitutions;
  }
  public void setSubstitutions(List<ResponseSubstitution> substitutions) {
    this.substitutions = substitutions;
  }

  
  /**
   * Metadata about the text substitutions in json schema format.
   **/
  public Response substitutionsSchema(JsonSchemaDocument substitutionsSchema) {
    this.substitutionsSchema = substitutionsSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata about the text substitutions in json schema format.")
  @JsonProperty("substitutionsSchema")
  public JsonSchemaDocument getSubstitutionsSchema() {
    return substitutionsSchema;
  }
  public void setSubstitutionsSchema(JsonSchemaDocument substitutionsSchema) {
    this.substitutionsSchema = substitutionsSchema;
  }

  
  /**
   * The response type represented by the response.
   **/
  public Response responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The response type represented by the response.")
  @JsonProperty("responseType")
  public ResponseTypeEnum getResponseType() {
    return responseType;
  }
  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

  
  /**
   * An optional messaging template definition for responseType.MessagingTemplate.
   **/
  public Response messagingTemplate(MessagingTemplate messagingTemplate) {
    this.messagingTemplate = messagingTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional messaging template definition for responseType.MessagingTemplate.")
  @JsonProperty("messagingTemplate")
  public MessagingTemplate getMessagingTemplate() {
    return messagingTemplate;
  }
  public void setMessagingTemplate(MessagingTemplate messagingTemplate) {
    this.messagingTemplate = messagingTemplate;
  }

  
  /**
   * Assets used in the response
   **/
  public Response assets(List<AddressableEntityRef> assets) {
    this.assets = assets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assets used in the response")
  @JsonProperty("assets")
  public List<AddressableEntityRef> getAssets() {
    return assets;
  }
  public void setAssets(List<AddressableEntityRef> assets) {
    this.assets = assets;
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
    Response response = (Response) o;
    return Objects.equals(this.id, response.id) &&
        Objects.equals(this.name, response.name) &&
        Objects.equals(this.version, response.version) &&
        Objects.equals(this.libraries, response.libraries) &&
        Objects.equals(this.texts, response.texts) &&
        Objects.equals(this.createdBy, response.createdBy) &&
        Objects.equals(this.dateCreated, response.dateCreated) &&
        Objects.equals(this.interactionType, response.interactionType) &&
        Objects.equals(this.substitutions, response.substitutions) &&
        Objects.equals(this.substitutionsSchema, response.substitutionsSchema) &&
        Objects.equals(this.responseType, response.responseType) &&
        Objects.equals(this.messagingTemplate, response.messagingTemplate) &&
        Objects.equals(this.assets, response.assets) &&
        Objects.equals(this.selfUri, response.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, libraries, texts, createdBy, dateCreated, interactionType, substitutions, substitutionsSchema, responseType, messagingTemplate, assets, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    libraries: ").append(toIndentedString(libraries)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    substitutions: ").append(toIndentedString(substitutions)).append("\n");
    sb.append("    substitutionsSchema: ").append(toIndentedString(substitutionsSchema)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    messagingTemplate: ").append(toIndentedString(messagingTemplate)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

