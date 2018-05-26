package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.NumericRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ViewFilter
 */

public class ViewFilter  implements Serializable {
  

  /**
   * Gets or Sets mediaTypes
   */
  public enum MediaTypesEnum {
    VOICE("voice"),
    CHAT("chat"),
    EMAIL("email"),
    CALLBACK("callback"),
    COBROWSE("cobrowse"),
    VIDEO("video"),
    SCREENSHARE("screenshare"),
    MESSAGE("message");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();
  private List<String> queueIds = new ArrayList<String>();
  private List<String> skillIds = new ArrayList<String>();
  private List<String> skillGroups = new ArrayList<String>();
  private List<String> languageIds = new ArrayList<String>();
  private List<String> languageGroups = new ArrayList<String>();

  /**
   * Gets or Sets directions
   */
  public enum DirectionsEnum {
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionsEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionsEnum value : DirectionsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DirectionsEnum> directions = new ArrayList<DirectionsEnum>();
  private List<String> wrapUpCodes = new ArrayList<String>();
  private List<String> dnisList = new ArrayList<String>();
  private List<String> userIds = new ArrayList<String>();
  private List<String> addressTos = new ArrayList<String>();
  private List<String> addressFroms = new ArrayList<String>();
  private List<String> outboundCampaignIds = new ArrayList<String>();
  private List<String> outboundContactListIds = new ArrayList<String>();
  private List<String> contactIds = new ArrayList<String>();
  private List<String> aniList = new ArrayList<String>();
  private List<NumericRange> durationsMilliseconds = new ArrayList<NumericRange>();
  private NumericRange evaluationScore = null;
  private NumericRange evaluationCriticalScore = null;
  private List<String> evaluationFormIds = new ArrayList<String>();
  private List<String> evaluatedAgentIds = new ArrayList<String>();
  private List<String> evaluatorIds = new ArrayList<String>();
  private Boolean transferred = null;
  private Boolean abandoned = null;

  /**
   * Gets or Sets messageTypes
   */
  public enum MessageTypesEnum {
    SMS("sms"),
    TWITTER("twitter"),
    LINE("line"),
    FACEBOOK("facebook");

    private String value;

    MessageTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MessageTypesEnum value : MessageTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MessageTypesEnum> messageTypes = new ArrayList<MessageTypesEnum>();

  
  /**
   * The media types are used to filter the view
   **/
  public ViewFilter mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media types are used to filter the view")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  
  /**
   * The queue ids are used to filter the view
   **/
  public ViewFilter queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ids are used to filter the view")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }

  
  /**
   * The skill ids are used to filter the view
   **/
  public ViewFilter skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill ids are used to filter the view")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  
  /**
   * The skill groups used to filter the view
   **/
  public ViewFilter skillGroups(List<String> skillGroups) {
    this.skillGroups = skillGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill groups used to filter the view")
  @JsonProperty("skillGroups")
  public List<String> getSkillGroups() {
    return skillGroups;
  }
  public void setSkillGroups(List<String> skillGroups) {
    this.skillGroups = skillGroups;
  }

  
  /**
   * The language ids are used to filter the view
   **/
  public ViewFilter languageIds(List<String> languageIds) {
    this.languageIds = languageIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language ids are used to filter the view")
  @JsonProperty("languageIds")
  public List<String> getLanguageIds() {
    return languageIds;
  }
  public void setLanguageIds(List<String> languageIds) {
    this.languageIds = languageIds;
  }

  
  /**
   * The language groups used to filter the view
   **/
  public ViewFilter languageGroups(List<String> languageGroups) {
    this.languageGroups = languageGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language groups used to filter the view")
  @JsonProperty("languageGroups")
  public List<String> getLanguageGroups() {
    return languageGroups;
  }
  public void setLanguageGroups(List<String> languageGroups) {
    this.languageGroups = languageGroups;
  }

  
  /**
   * The directions are used to filter the view
   **/
  public ViewFilter directions(List<DirectionsEnum> directions) {
    this.directions = directions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The directions are used to filter the view")
  @JsonProperty("directions")
  public List<DirectionsEnum> getDirections() {
    return directions;
  }
  public void setDirections(List<DirectionsEnum> directions) {
    this.directions = directions;
  }

  
  /**
   * The wrap up codes are used to filter the view
   **/
  public ViewFilter wrapUpCodes(List<String> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The wrap up codes are used to filter the view")
  @JsonProperty("wrapUpCodes")
  public List<String> getWrapUpCodes() {
    return wrapUpCodes;
  }
  public void setWrapUpCodes(List<String> wrapUpCodes) {
    this.wrapUpCodes = wrapUpCodes;
  }

  
  /**
   * The dnis list is used to filter the view
   **/
  public ViewFilter dnisList(List<String> dnisList) {
    this.dnisList = dnisList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dnis list is used to filter the view")
  @JsonProperty("dnisList")
  public List<String> getDnisList() {
    return dnisList;
  }
  public void setDnisList(List<String> dnisList) {
    this.dnisList = dnisList;
  }

  
  /**
   * The user ids are used to filter the view
   **/
  public ViewFilter userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ids are used to filter the view")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  
  /**
   * The address To values are used to filter the view
   **/
  public ViewFilter addressTos(List<String> addressTos) {
    this.addressTos = addressTos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address To values are used to filter the view")
  @JsonProperty("addressTos")
  public List<String> getAddressTos() {
    return addressTos;
  }
  public void setAddressTos(List<String> addressTos) {
    this.addressTos = addressTos;
  }

  
  /**
   * The address from values are used to filter the view
   **/
  public ViewFilter addressFroms(List<String> addressFroms) {
    this.addressFroms = addressFroms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address from values are used to filter the view")
  @JsonProperty("addressFroms")
  public List<String> getAddressFroms() {
    return addressFroms;
  }
  public void setAddressFroms(List<String> addressFroms) {
    this.addressFroms = addressFroms;
  }

  
  /**
   * The outbound campaign ids are used to filter the view
   **/
  public ViewFilter outboundCampaignIds(List<String> outboundCampaignIds) {
    this.outboundCampaignIds = outboundCampaignIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outbound campaign ids are used to filter the view")
  @JsonProperty("outboundCampaignIds")
  public List<String> getOutboundCampaignIds() {
    return outboundCampaignIds;
  }
  public void setOutboundCampaignIds(List<String> outboundCampaignIds) {
    this.outboundCampaignIds = outboundCampaignIds;
  }

  
  /**
   * The outbound contact list ids are used to filter the view
   **/
  public ViewFilter outboundContactListIds(List<String> outboundContactListIds) {
    this.outboundContactListIds = outboundContactListIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outbound contact list ids are used to filter the view")
  @JsonProperty("outboundContactListIds")
  public List<String> getOutboundContactListIds() {
    return outboundContactListIds;
  }
  public void setOutboundContactListIds(List<String> outboundContactListIds) {
    this.outboundContactListIds = outboundContactListIds;
  }

  
  /**
   * The contact ids are used to filter the view
   **/
  public ViewFilter contactIds(List<String> contactIds) {
    this.contactIds = contactIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact ids are used to filter the view")
  @JsonProperty("contactIds")
  public List<String> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<String> contactIds) {
    this.contactIds = contactIds;
  }

  
  /**
   * The ani list ids are used to filter the view
   **/
  public ViewFilter aniList(List<String> aniList) {
    this.aniList = aniList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ani list ids are used to filter the view")
  @JsonProperty("aniList")
  public List<String> getAniList() {
    return aniList;
  }
  public void setAniList(List<String> aniList) {
    this.aniList = aniList;
  }

  
  /**
   * The durations in milliseconds used to filter the view
   **/
  public ViewFilter durationsMilliseconds(List<NumericRange> durationsMilliseconds) {
    this.durationsMilliseconds = durationsMilliseconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The durations in milliseconds used to filter the view")
  @JsonProperty("durationsMilliseconds")
  public List<NumericRange> getDurationsMilliseconds() {
    return durationsMilliseconds;
  }
  public void setDurationsMilliseconds(List<NumericRange> durationsMilliseconds) {
    this.durationsMilliseconds = durationsMilliseconds;
  }

  
  /**
   * The evaluationScore is used to filter the view
   **/
  public ViewFilter evaluationScore(NumericRange evaluationScore) {
    this.evaluationScore = evaluationScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluationScore is used to filter the view")
  @JsonProperty("evaluationScore")
  public NumericRange getEvaluationScore() {
    return evaluationScore;
  }
  public void setEvaluationScore(NumericRange evaluationScore) {
    this.evaluationScore = evaluationScore;
  }

  
  /**
   * The evaluationCriticalScore is used to filter the view
   **/
  public ViewFilter evaluationCriticalScore(NumericRange evaluationCriticalScore) {
    this.evaluationCriticalScore = evaluationCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluationCriticalScore is used to filter the view")
  @JsonProperty("evaluationCriticalScore")
  public NumericRange getEvaluationCriticalScore() {
    return evaluationCriticalScore;
  }
  public void setEvaluationCriticalScore(NumericRange evaluationCriticalScore) {
    this.evaluationCriticalScore = evaluationCriticalScore;
  }

  
  /**
   * The evaluation form ids are used to filter the view
   **/
  public ViewFilter evaluationFormIds(List<String> evaluationFormIds) {
    this.evaluationFormIds = evaluationFormIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluation form ids are used to filter the view")
  @JsonProperty("evaluationFormIds")
  public List<String> getEvaluationFormIds() {
    return evaluationFormIds;
  }
  public void setEvaluationFormIds(List<String> evaluationFormIds) {
    this.evaluationFormIds = evaluationFormIds;
  }

  
  /**
   * The evaluated agent ids are used to filter the view
   **/
  public ViewFilter evaluatedAgentIds(List<String> evaluatedAgentIds) {
    this.evaluatedAgentIds = evaluatedAgentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluated agent ids are used to filter the view")
  @JsonProperty("evaluatedAgentIds")
  public List<String> getEvaluatedAgentIds() {
    return evaluatedAgentIds;
  }
  public void setEvaluatedAgentIds(List<String> evaluatedAgentIds) {
    this.evaluatedAgentIds = evaluatedAgentIds;
  }

  
  /**
   * The evaluator ids are used to filter the view
   **/
  public ViewFilter evaluatorIds(List<String> evaluatorIds) {
    this.evaluatorIds = evaluatorIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluator ids are used to filter the view")
  @JsonProperty("evaluatorIds")
  public List<String> getEvaluatorIds() {
    return evaluatorIds;
  }
  public void setEvaluatorIds(List<String> evaluatorIds) {
    this.evaluatorIds = evaluatorIds;
  }

  
  /**
   * Indicates filtering for transfers
   **/
  public ViewFilter transferred(Boolean transferred) {
    this.transferred = transferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for transfers")
  @JsonProperty("transferred")
  public Boolean getTransferred() {
    return transferred;
  }
  public void setTransferred(Boolean transferred) {
    this.transferred = transferred;
  }

  
  /**
   * Indicates filtering for abandons
   **/
  public ViewFilter abandoned(Boolean abandoned) {
    this.abandoned = abandoned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for abandons")
  @JsonProperty("abandoned")
  public Boolean getAbandoned() {
    return abandoned;
  }
  public void setAbandoned(Boolean abandoned) {
    this.abandoned = abandoned;
  }

  
  /**
   * The message media types used to filter the view
   **/
  public ViewFilter messageTypes(List<MessageTypesEnum> messageTypes) {
    this.messageTypes = messageTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message media types used to filter the view")
  @JsonProperty("messageTypes")
  public List<MessageTypesEnum> getMessageTypes() {
    return messageTypes;
  }
  public void setMessageTypes(List<MessageTypesEnum> messageTypes) {
    this.messageTypes = messageTypes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewFilter viewFilter = (ViewFilter) o;
    return Objects.equals(this.mediaTypes, viewFilter.mediaTypes) &&
        Objects.equals(this.queueIds, viewFilter.queueIds) &&
        Objects.equals(this.skillIds, viewFilter.skillIds) &&
        Objects.equals(this.skillGroups, viewFilter.skillGroups) &&
        Objects.equals(this.languageIds, viewFilter.languageIds) &&
        Objects.equals(this.languageGroups, viewFilter.languageGroups) &&
        Objects.equals(this.directions, viewFilter.directions) &&
        Objects.equals(this.wrapUpCodes, viewFilter.wrapUpCodes) &&
        Objects.equals(this.dnisList, viewFilter.dnisList) &&
        Objects.equals(this.userIds, viewFilter.userIds) &&
        Objects.equals(this.addressTos, viewFilter.addressTos) &&
        Objects.equals(this.addressFroms, viewFilter.addressFroms) &&
        Objects.equals(this.outboundCampaignIds, viewFilter.outboundCampaignIds) &&
        Objects.equals(this.outboundContactListIds, viewFilter.outboundContactListIds) &&
        Objects.equals(this.contactIds, viewFilter.contactIds) &&
        Objects.equals(this.aniList, viewFilter.aniList) &&
        Objects.equals(this.durationsMilliseconds, viewFilter.durationsMilliseconds) &&
        Objects.equals(this.evaluationScore, viewFilter.evaluationScore) &&
        Objects.equals(this.evaluationCriticalScore, viewFilter.evaluationCriticalScore) &&
        Objects.equals(this.evaluationFormIds, viewFilter.evaluationFormIds) &&
        Objects.equals(this.evaluatedAgentIds, viewFilter.evaluatedAgentIds) &&
        Objects.equals(this.evaluatorIds, viewFilter.evaluatorIds) &&
        Objects.equals(this.transferred, viewFilter.transferred) &&
        Objects.equals(this.abandoned, viewFilter.abandoned) &&
        Objects.equals(this.messageTypes, viewFilter.messageTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaTypes, queueIds, skillIds, skillGroups, languageIds, languageGroups, directions, wrapUpCodes, dnisList, userIds, addressTos, addressFroms, outboundCampaignIds, outboundContactListIds, contactIds, aniList, durationsMilliseconds, evaluationScore, evaluationCriticalScore, evaluationFormIds, evaluatedAgentIds, evaluatorIds, transferred, abandoned, messageTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewFilter {\n");
    
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    skillGroups: ").append(toIndentedString(skillGroups)).append("\n");
    sb.append("    languageIds: ").append(toIndentedString(languageIds)).append("\n");
    sb.append("    languageGroups: ").append(toIndentedString(languageGroups)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    wrapUpCodes: ").append(toIndentedString(wrapUpCodes)).append("\n");
    sb.append("    dnisList: ").append(toIndentedString(dnisList)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    addressTos: ").append(toIndentedString(addressTos)).append("\n");
    sb.append("    addressFroms: ").append(toIndentedString(addressFroms)).append("\n");
    sb.append("    outboundCampaignIds: ").append(toIndentedString(outboundCampaignIds)).append("\n");
    sb.append("    outboundContactListIds: ").append(toIndentedString(outboundContactListIds)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
    sb.append("    aniList: ").append(toIndentedString(aniList)).append("\n");
    sb.append("    durationsMilliseconds: ").append(toIndentedString(durationsMilliseconds)).append("\n");
    sb.append("    evaluationScore: ").append(toIndentedString(evaluationScore)).append("\n");
    sb.append("    evaluationCriticalScore: ").append(toIndentedString(evaluationCriticalScore)).append("\n");
    sb.append("    evaluationFormIds: ").append(toIndentedString(evaluationFormIds)).append("\n");
    sb.append("    evaluatedAgentIds: ").append(toIndentedString(evaluatedAgentIds)).append("\n");
    sb.append("    evaluatorIds: ").append(toIndentedString(evaluatorIds)).append("\n");
    sb.append("    transferred: ").append(toIndentedString(transferred)).append("\n");
    sb.append("    abandoned: ").append(toIndentedString(abandoned)).append("\n");
    sb.append("    messageTypes: ").append(toIndentedString(messageTypes)).append("\n");
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

