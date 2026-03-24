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
import com.mypurecloud.sdk.v2.model.CaseReference;
import com.mypurecloud.sdk.v2.model.ConversationReference;
import com.mypurecloud.sdk.v2.model.StageReference;
import com.mypurecloud.sdk.v2.model.StepReference;
import com.mypurecloud.sdk.v2.model.WorkitemReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Represents an association between a case and an interaction
 */
@ApiModel(description = "Represents an association between a case and an interaction")

public class CaseAssociation  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class AssociationTypeEnumDeserializer extends StdDeserializer<AssociationTypeEnum> {
    public AssociationTypeEnumDeserializer() {
      super(AssociationTypeEnumDeserializer.class);
    }

    @Override
    public AssociationTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssociationTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Association type.
   */
 @JsonDeserialize(using = AssociationTypeEnumDeserializer.class)
  public enum AssociationTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVITY("Activity"),
    ENQUIRY("Enquiry"),
    INITIATION("Initiation");

    private String value;

    AssociationTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssociationTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AssociationTypeEnum value : AssociationTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssociationTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssociationTypeEnum associationType = null;
  private Date dateAssociated = null;
  private WorkitemReference workitem = null;
  private ConversationReference conversation = null;
  private StageReference stage = null;
  private StepReference step = null;
  private String selfUri = null;
  private CaseReference _case = null;

  public CaseAssociation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the association.
   **/
  public CaseAssociation id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the association.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public CaseAssociation name(String name) {
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
   * Association type.
   **/
  public CaseAssociation associationType(AssociationTypeEnum associationType) {
    this.associationType = associationType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Association type.")
  @JsonProperty("associationType")
  public AssociationTypeEnum getAssociationType() {
    return associationType;
  }
  public void setAssociationType(AssociationTypeEnum associationType) {
    this.associationType = associationType;
  }


  /**
   * Interaction association date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CaseAssociation dateAssociated(Date dateAssociated) {
    this.dateAssociated = dateAssociated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interaction association date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAssociated")
  public Date getDateAssociated() {
    return dateAssociated;
  }
  public void setDateAssociated(Date dateAssociated) {
    this.dateAssociated = dateAssociated;
  }


  /**
   * Associated workitem ID.
   **/
  public CaseAssociation workitem(WorkitemReference workitem) {
    this.workitem = workitem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Associated workitem ID.")
  @JsonProperty("workitem")
  public WorkitemReference getWorkitem() {
    return workitem;
  }
  public void setWorkitem(WorkitemReference workitem) {
    this.workitem = workitem;
  }


  /**
   * Associated conversation ID.
   **/
  public CaseAssociation conversation(ConversationReference conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Associated conversation ID.")
  @JsonProperty("conversation")
  public ConversationReference getConversation() {
    return conversation;
  }
  public void setConversation(ConversationReference conversation) {
    this.conversation = conversation;
  }


  /**
   * The stage related to this association.
   **/
  public CaseAssociation stage(StageReference stage) {
    this.stage = stage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The stage related to this association.")
  @JsonProperty("stage")
  public StageReference getStage() {
    return stage;
  }
  public void setStage(StageReference stage) {
    this.stage = stage;
  }


  /**
   * The step related to this association.
   **/
  public CaseAssociation step(StepReference step) {
    this.step = step;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The step related to this association.")
  @JsonProperty("step")
  public StepReference getStep() {
    return step;
  }
  public void setStep(StepReference step) {
    this.step = step;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  /**
   * Case ID
   **/
  public CaseAssociation _case(CaseReference _case) {
    this._case = _case;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Case ID")
  @JsonProperty("case")
  public CaseReference getCase() {
    return _case;
  }
  public void setCase(CaseReference _case) {
    this._case = _case;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseAssociation caseAssociation = (CaseAssociation) o;

    return Objects.equals(this.id, caseAssociation.id) &&
            Objects.equals(this.name, caseAssociation.name) &&
            Objects.equals(this.associationType, caseAssociation.associationType) &&
            Objects.equals(this.dateAssociated, caseAssociation.dateAssociated) &&
            Objects.equals(this.workitem, caseAssociation.workitem) &&
            Objects.equals(this.conversation, caseAssociation.conversation) &&
            Objects.equals(this.stage, caseAssociation.stage) &&
            Objects.equals(this.step, caseAssociation.step) &&
            Objects.equals(this.selfUri, caseAssociation.selfUri) &&
            Objects.equals(this._case, caseAssociation._case);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, associationType, dateAssociated, workitem, conversation, stage, step, selfUri, _case);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    dateAssociated: ").append(toIndentedString(dateAssociated)).append("\n");
    sb.append("    workitem: ").append(toIndentedString(workitem)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
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

