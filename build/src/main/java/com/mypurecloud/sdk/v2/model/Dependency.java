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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Dependency
 */

public class Dependency  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String version = null;

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
    ACDLANGUAGE("ACDLANGUAGE"),
    ACDSKILL("ACDSKILL"),
    ACDWRAPUPCODE("ACDWRAPUPCODE"),
    AUDIOCONNECTORBOT("AUDIOCONNECTORBOT"),
    BOTCONNECTORBOT("BOTCONNECTORBOT"),
    BOTCONNECTORINTEGRATION("BOTCONNECTORINTEGRATION"),
    BOTFLOW("BOTFLOW"),
    BRIDGEACTION("BRIDGEACTION"),
    COMMONMODULEFLOW("COMMONMODULEFLOW"),
    COMPOSERSCRIPT("COMPOSERSCRIPT"),
    CONTACTLIST("CONTACTLIST"),
    DATAACTION("DATAACTION"),
    DATATABLE("DATATABLE"),
    DECISIONTABLE("DECISIONTABLE"),
    DIALOGENGINEBOT("DIALOGENGINEBOT"),
    DIALOGENGINEBOTVERSION("DIALOGENGINEBOTVERSION"),
    DIALOGFLOWAGENT("DIALOGFLOWAGENT"),
    DIALOGFLOWCXAGENT("DIALOGFLOWCXAGENT"),
    DIGITALBOTCONNECTOR("DIGITALBOTCONNECTOR"),
    DIGITALBOTCONNECTORINTEGRATION("DIGITALBOTCONNECTORINTEGRATION"),
    DIGITALBOTFLOW("DIGITALBOTFLOW"),
    DIVISION("DIVISION"),
    EMAILROUTE("EMAILROUTE"),
    EMERGENCYGROUP("EMERGENCYGROUP"),
    FLOWACTION("FLOWACTION"),
    FLOWDATATYPE("FLOWDATATYPE"),
    FLOWMILESTONE("FLOWMILESTONE"),
    FLOWOUTCOME("FLOWOUTCOME"),
    GRAMMAR("GRAMMAR"),
    GROUP("GROUP"),
    GUIDE("GUIDE"),
    GUIDEVERSION("GUIDEVERSION"),
    IMAGE("IMAGE"),
    INBOUNDCALLFLOW("INBOUNDCALLFLOW"),
    INBOUNDCHATFLOW("INBOUNDCHATFLOW"),
    INBOUNDEMAILFLOW("INBOUNDEMAILFLOW"),
    INBOUNDSHORTMESSAGEFLOW("INBOUNDSHORTMESSAGEFLOW"),
    INQUEUECALLFLOW("INQUEUECALLFLOW"),
    INQUEUEEMAILFLOW("INQUEUEEMAILFLOW"),
    INQUEUESHORTMESSAGEFLOW("INQUEUESHORTMESSAGEFLOW"),
    IVRCONFIGURATION("IVRCONFIGURATION"),
    KNOWLEDGEBASE("KNOWLEDGEBASE"),
    KNOWLEDGEBASEDOCUMENT("KNOWLEDGEBASEDOCUMENT"),
    LANGUAGE("LANGUAGE"),
    LEXBOT("LEXBOT"),
    LEXBOTALIAS("LEXBOTALIAS"),
    LEXV2BOT("LEXV2BOT"),
    LEXV2BOTALIAS("LEXV2BOTALIAS"),
    NLUDOMAIN("NLUDOMAIN"),
    NUANCEMIXBOT("NUANCEMIXBOT"),
    NUANCEMIXINTEGRATION("NUANCEMIXINTEGRATION"),
    OAUTHCLIENT("OAUTHCLIENT"),
    OUTBOUNDCALLFLOW("OUTBOUNDCALLFLOW"),
    QUEUE("QUEUE"),
    RECORDINGPOLICY("RECORDINGPOLICY"),
    RESPONSE("RESPONSE"),
    SCHEDULE("SCHEDULE"),
    SCHEDULEGROUP("SCHEDULEGROUP"),
    SECUREACTION("SECUREACTION"),
    SECURECALLFLOW("SECURECALLFLOW"),
    SMSPHONENUMBER("SMSPHONENUMBER"),
    STTENGINE("STTENGINE"),
    SURVEYFORM("SURVEYFORM"),
    SURVEYINVITEFLOW("SURVEYINVITEFLOW"),
    SYSTEMPROMPT("SYSTEMPROMPT"),
    TTSENGINE("TTSENGINE"),
    TTSVOICE("TTSVOICE"),
    USER("USER"),
    USERPROMPT("USERPROMPT"),
    UTILIZATIONLABEL("UTILIZATIONLABEL"),
    VOICEFLOW("VOICEFLOW"),
    VOICEMAILFLOW("VOICEMAILFLOW"),
    VOICESURVEYFLOW("VOICESURVEYFLOW"),
    WIDGET("WIDGET"),
    WORKFLOW("WORKFLOW"),
    WORKITEMFLOW("WORKITEMFLOW"),
    WORKTYPE("WORKTYPE");

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
  private Boolean deleted = null;
  private Boolean updated = null;
  private Boolean stateUnknown = null;
  private String selfUri = null;

  public Dependency() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The dependency identifier
   **/
  public Dependency id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dependency identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public Dependency name(String name) {
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
  public Dependency version(String version) {
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
  public Dependency type(TypeEnum type) {
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
  public Dependency deleted(Boolean deleted) {
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
  public Dependency updated(Boolean updated) {
    this.updated = updated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updated")
  public Boolean getUpdated() {
    return updated;
  }
  public void setUpdated(Boolean updated) {
    this.updated = updated;
  }


  /**
   **/
  public Dependency stateUnknown(Boolean stateUnknown) {
    this.stateUnknown = stateUnknown;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stateUnknown")
  public Boolean getStateUnknown() {
    return stateUnknown;
  }
  public void setStateUnknown(Boolean stateUnknown) {
    this.stateUnknown = stateUnknown;
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
    Dependency dependency = (Dependency) o;

    return Objects.equals(this.id, dependency.id) &&
            Objects.equals(this.name, dependency.name) &&
            Objects.equals(this.version, dependency.version) &&
            Objects.equals(this.type, dependency.type) &&
            Objects.equals(this.deleted, dependency.deleted) &&
            Objects.equals(this.updated, dependency.updated) &&
            Objects.equals(this.stateUnknown, dependency.stateUnknown) &&
            Objects.equals(this.selfUri, dependency.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, type, deleted, updated, stateUnknown, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    stateUnknown: ").append(toIndentedString(stateUnknown)).append("\n");
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

