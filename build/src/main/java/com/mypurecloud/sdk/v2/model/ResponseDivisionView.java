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
import com.mypurecloud.sdk.v2.model.Form;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.LibraryDivisionView;
import com.mypurecloud.sdk.v2.model.MessagingTemplate;
import com.mypurecloud.sdk.v2.model.ResponseSubstitution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Division view of a response management response.
 */
@ApiModel(description = "Division view of a response management response.")

public class ResponseDivisionView  implements Serializable {
  
  private String id = null;
  private String name = null;

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
    CAMPAIGNEMAILTEMPLATE("CampaignEmailTemplate"),
    FOOTER("Footer"),
    FORM("Form"),
    APPLEINVITATION("AppleInvitation");

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
  private List<LibraryDivisionView> libraries = null;
  private List<ResponseSubstitution> substitutions = null;
  private JsonSchemaDocument substitutionsSchema = null;
  private MessagingTemplate messagingTemplate = null;
  private Form form = null;
  private String selfUri = null;

  public ResponseDivisionView() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      libraries = new ArrayList<LibraryDivisionView>();
      substitutions = new ArrayList<ResponseSubstitution>();
    }
  }

  public ResponseDivisionView(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      libraries = new ArrayList<LibraryDivisionView>();
      substitutions = new ArrayList<ResponseSubstitution>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ResponseDivisionView name(String name) {
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
   * The response type represented by the response.
   **/
  public ResponseDivisionView responseType(ResponseTypeEnum responseType) {
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
   * One or more libraries response is associated with.
   **/
  public ResponseDivisionView libraries(List<LibraryDivisionView> libraries) {
    this.libraries = libraries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "One or more libraries response is associated with.")
  @JsonProperty("libraries")
  public List<LibraryDivisionView> getLibraries() {
    return libraries;
  }
  public void setLibraries(List<LibraryDivisionView> libraries) {
    this.libraries = libraries;
  }


  /**
   * Details about any text substitutions used in the texts for this response.
   **/
  public ResponseDivisionView substitutions(List<ResponseSubstitution> substitutions) {
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
  public ResponseDivisionView substitutionsSchema(JsonSchemaDocument substitutionsSchema) {
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
   * An optional messaging template definition for responseType.MessagingTemplate.
   **/
  public ResponseDivisionView messagingTemplate(MessagingTemplate messagingTemplate) {
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
   * Form template definition for responseType.Form.
   **/
  public ResponseDivisionView form(Form form) {
    this.form = form;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Form template definition for responseType.Form.")
  @JsonProperty("form")
  public Form getForm() {
    return form;
  }
  public void setForm(Form form) {
    this.form = form;
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
    ResponseDivisionView responseDivisionView = (ResponseDivisionView) o;

    return Objects.equals(this.id, responseDivisionView.id) &&
            Objects.equals(this.name, responseDivisionView.name) &&
            Objects.equals(this.responseType, responseDivisionView.responseType) &&
            Objects.equals(this.libraries, responseDivisionView.libraries) &&
            Objects.equals(this.substitutions, responseDivisionView.substitutions) &&
            Objects.equals(this.substitutionsSchema, responseDivisionView.substitutionsSchema) &&
            Objects.equals(this.messagingTemplate, responseDivisionView.messagingTemplate) &&
            Objects.equals(this.form, responseDivisionView.form) &&
            Objects.equals(this.selfUri, responseDivisionView.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, responseType, libraries, substitutions, substitutionsSchema, messagingTemplate, form, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDivisionView {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    libraries: ").append(toIndentedString(libraries)).append("\n");
    sb.append("    substitutions: ").append(toIndentedString(substitutions)).append("\n");
    sb.append("    substitutionsSchema: ").append(toIndentedString(substitutionsSchema)).append("\n");
    sb.append("    messagingTemplate: ").append(toIndentedString(messagingTemplate)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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

