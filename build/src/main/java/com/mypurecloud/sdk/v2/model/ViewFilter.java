package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationProperties;
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
  private List<String> filterQueuesByUserIds = new ArrayList<String>();
  private List<String> filterUsersByQueueIds = new ArrayList<String>();
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
  private List<String> divisionIds = new ArrayList<String>();
  private List<String> surveyFormIds = new ArrayList<String>();
  private NumericRange surveyTotalScore = null;
  private NumericRange surveyNpsScore = null;
  private Boolean showSecondaryStatus = null;

  /**
   * Provides the agent duration sort order
   */
  public enum AgentDurationSortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASCENDING("ascending"),
    DESCENDING("descending");

    private String value;

    AgentDurationSortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AgentDurationSortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (AgentDurationSortOrderEnum value : AgentDurationSortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AgentDurationSortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AgentDurationSortOrderEnum agentDurationSortOrder = null;

  /**
   * Provides the waiting duration sort order
   */
  public enum WaitingDurationSortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASCENDING("ascending"),
    DESCENDING("descending");

    private String value;

    WaitingDurationSortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WaitingDurationSortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (WaitingDurationSortOrderEnum value : WaitingDurationSortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WaitingDurationSortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WaitingDurationSortOrderEnum waitingDurationSortOrder = null;

  /**
   * Provides the interacting duration sort order
   */
  public enum InteractingDurationSortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASCENDING("ascending"),
    DESCENDING("descending");

    private String value;

    InteractingDurationSortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InteractingDurationSortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (InteractingDurationSortOrderEnum value : InteractingDurationSortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InteractingDurationSortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InteractingDurationSortOrderEnum interactingDurationSortOrder = null;
  private String agentName = null;
  private List<String> skillsList = new ArrayList<String>();
  private List<String> languageList = new ArrayList<String>();
  private NumericRange mos = null;
  private NumericRange surveyQuestionGroupScore = null;
  private NumericRange surveyPromoterScore = null;
  private List<String> surveyFormContextIds = new ArrayList<String>();
  private List<String> conversationIds = new ArrayList<String>();
  private Boolean isEnded = null;
  private Boolean isSurveyed = null;
  private List<NumericRange> surveyScores = new ArrayList<NumericRange>();
  private List<NumericRange> promoterScores = new ArrayList<NumericRange>();
  private Boolean isCampaign = null;
  private List<String> surveyStatuses = new ArrayList<String>();
  private ConversationProperties conversationProperties = null;
  private Boolean isBlindTransferred = null;
  private Boolean isConsulted = null;
  private Boolean isConsultTransferred = null;
  private List<String> remoteParticipants = new ArrayList<String>();

  
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
   * The user ids are used to fetch associated queues for the view
   **/
  public ViewFilter filterQueuesByUserIds(List<String> filterQueuesByUserIds) {
    this.filterQueuesByUserIds = filterQueuesByUserIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ids are used to fetch associated queues for the view")
  @JsonProperty("filterQueuesByUserIds")
  public List<String> getFilterQueuesByUserIds() {
    return filterQueuesByUserIds;
  }
  public void setFilterQueuesByUserIds(List<String> filterQueuesByUserIds) {
    this.filterQueuesByUserIds = filterQueuesByUserIds;
  }

  
  /**
   * The queue ids are used to fetch associated users for the view
   **/
  public ViewFilter filterUsersByQueueIds(List<String> filterUsersByQueueIds) {
    this.filterUsersByQueueIds = filterUsersByQueueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ids are used to fetch associated users for the view")
  @JsonProperty("filterUsersByQueueIds")
  public List<String> getFilterUsersByQueueIds() {
    return filterUsersByQueueIds;
  }
  public void setFilterUsersByQueueIds(List<String> filterUsersByQueueIds) {
    this.filterUsersByQueueIds = filterUsersByQueueIds;
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

  
  /**
   * The divison Ids used to filter the view
   **/
  public ViewFilter divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The divison Ids used to filter the view")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }

  
  /**
   * The survey form ids used to filter the view
   **/
  public ViewFilter surveyFormIds(List<String> surveyFormIds) {
    this.surveyFormIds = surveyFormIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey form ids used to filter the view")
  @JsonProperty("surveyFormIds")
  public List<String> getSurveyFormIds() {
    return surveyFormIds;
  }
  public void setSurveyFormIds(List<String> surveyFormIds) {
    this.surveyFormIds = surveyFormIds;
  }

  
  /**
   * The survey total score used to filter the view
   **/
  public ViewFilter surveyTotalScore(NumericRange surveyTotalScore) {
    this.surveyTotalScore = surveyTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey total score used to filter the view")
  @JsonProperty("surveyTotalScore")
  public NumericRange getSurveyTotalScore() {
    return surveyTotalScore;
  }
  public void setSurveyTotalScore(NumericRange surveyTotalScore) {
    this.surveyTotalScore = surveyTotalScore;
  }

  
  /**
   * The survey NPS score used to filter the view
   **/
  public ViewFilter surveyNpsScore(NumericRange surveyNpsScore) {
    this.surveyNpsScore = surveyNpsScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey NPS score used to filter the view")
  @JsonProperty("surveyNpsScore")
  public NumericRange getSurveyNpsScore() {
    return surveyNpsScore;
  }
  public void setSurveyNpsScore(NumericRange surveyNpsScore) {
    this.surveyNpsScore = surveyNpsScore;
  }

  
  /**
   * Indicates if the Secondary Status should be shown
   **/
  public ViewFilter showSecondaryStatus(Boolean showSecondaryStatus) {
    this.showSecondaryStatus = showSecondaryStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the Secondary Status should be shown")
  @JsonProperty("showSecondaryStatus")
  public Boolean getShowSecondaryStatus() {
    return showSecondaryStatus;
  }
  public void setShowSecondaryStatus(Boolean showSecondaryStatus) {
    this.showSecondaryStatus = showSecondaryStatus;
  }

  
  /**
   * Provides the agent duration sort order
   **/
  public ViewFilter agentDurationSortOrder(AgentDurationSortOrderEnum agentDurationSortOrder) {
    this.agentDurationSortOrder = agentDurationSortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides the agent duration sort order")
  @JsonProperty("agentDurationSortOrder")
  public AgentDurationSortOrderEnum getAgentDurationSortOrder() {
    return agentDurationSortOrder;
  }
  public void setAgentDurationSortOrder(AgentDurationSortOrderEnum agentDurationSortOrder) {
    this.agentDurationSortOrder = agentDurationSortOrder;
  }

  
  /**
   * Provides the waiting duration sort order
   **/
  public ViewFilter waitingDurationSortOrder(WaitingDurationSortOrderEnum waitingDurationSortOrder) {
    this.waitingDurationSortOrder = waitingDurationSortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides the waiting duration sort order")
  @JsonProperty("waitingDurationSortOrder")
  public WaitingDurationSortOrderEnum getWaitingDurationSortOrder() {
    return waitingDurationSortOrder;
  }
  public void setWaitingDurationSortOrder(WaitingDurationSortOrderEnum waitingDurationSortOrder) {
    this.waitingDurationSortOrder = waitingDurationSortOrder;
  }

  
  /**
   * Provides the interacting duration sort order
   **/
  public ViewFilter interactingDurationSortOrder(InteractingDurationSortOrderEnum interactingDurationSortOrder) {
    this.interactingDurationSortOrder = interactingDurationSortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides the interacting duration sort order")
  @JsonProperty("interactingDurationSortOrder")
  public InteractingDurationSortOrderEnum getInteractingDurationSortOrder() {
    return interactingDurationSortOrder;
  }
  public void setInteractingDurationSortOrder(InteractingDurationSortOrderEnum interactingDurationSortOrder) {
    this.interactingDurationSortOrder = interactingDurationSortOrder;
  }

  
  /**
   * Displays the Agent name as provided by the user
   **/
  public ViewFilter agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Displays the Agent name as provided by the user")
  @JsonProperty("agentName")
  public String getAgentName() {
    return agentName;
  }
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  
  /**
   * The list of skill strings as free form text
   **/
  public ViewFilter skillsList(List<String> skillsList) {
    this.skillsList = skillsList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of skill strings as free form text")
  @JsonProperty("skillsList")
  public List<String> getSkillsList() {
    return skillsList;
  }
  public void setSkillsList(List<String> skillsList) {
    this.skillsList = skillsList;
  }

  
  /**
   * The list of language strings as free form text
   **/
  public ViewFilter languageList(List<String> languageList) {
    this.languageList = languageList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of language strings as free form text")
  @JsonProperty("languageList")
  public List<String> getLanguageList() {
    return languageList;
  }
  public void setLanguageList(List<String> languageList) {
    this.languageList = languageList;
  }

  
  /**
   * The desired range for mos values
   **/
  public ViewFilter mos(NumericRange mos) {
    this.mos = mos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The desired range for mos values")
  @JsonProperty("mos")
  public NumericRange getMos() {
    return mos;
  }
  public void setMos(NumericRange mos) {
    this.mos = mos;
  }

  
  /**
   * The survey question group score used to filter the view
   **/
  public ViewFilter surveyQuestionGroupScore(NumericRange surveyQuestionGroupScore) {
    this.surveyQuestionGroupScore = surveyQuestionGroupScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey question group score used to filter the view")
  @JsonProperty("surveyQuestionGroupScore")
  public NumericRange getSurveyQuestionGroupScore() {
    return surveyQuestionGroupScore;
  }
  public void setSurveyQuestionGroupScore(NumericRange surveyQuestionGroupScore) {
    this.surveyQuestionGroupScore = surveyQuestionGroupScore;
  }

  
  /**
   * The survey promoter score used to filter the view
   **/
  public ViewFilter surveyPromoterScore(NumericRange surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey promoter score used to filter the view")
  @JsonProperty("surveyPromoterScore")
  public NumericRange getSurveyPromoterScore() {
    return surveyPromoterScore;
  }
  public void setSurveyPromoterScore(NumericRange surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
  }

  
  /**
   * The list of survey form context ids used to filter the view
   **/
  public ViewFilter surveyFormContextIds(List<String> surveyFormContextIds) {
    this.surveyFormContextIds = surveyFormContextIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of survey form context ids used to filter the view")
  @JsonProperty("surveyFormContextIds")
  public List<String> getSurveyFormContextIds() {
    return surveyFormContextIds;
  }
  public void setSurveyFormContextIds(List<String> surveyFormContextIds) {
    this.surveyFormContextIds = surveyFormContextIds;
  }

  
  /**
   * The list of conversation ids used to filter the view
   **/
  public ViewFilter conversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of conversation ids used to filter the view")
  @JsonProperty("conversationIds")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }

  
  /**
   * Indicates filtering for ended
   **/
  public ViewFilter isEnded(Boolean isEnded) {
    this.isEnded = isEnded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for ended")
  @JsonProperty("isEnded")
  public Boolean getIsEnded() {
    return isEnded;
  }
  public void setIsEnded(Boolean isEnded) {
    this.isEnded = isEnded;
  }

  
  /**
   * Indicates filtering for survey
   **/
  public ViewFilter isSurveyed(Boolean isSurveyed) {
    this.isSurveyed = isSurveyed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for survey")
  @JsonProperty("isSurveyed")
  public Boolean getIsSurveyed() {
    return isSurveyed;
  }
  public void setIsSurveyed(Boolean isSurveyed) {
    this.isSurveyed = isSurveyed;
  }

  
  /**
   * The list of survey score ranges used to filter the view
   **/
  public ViewFilter surveyScores(List<NumericRange> surveyScores) {
    this.surveyScores = surveyScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of survey score ranges used to filter the view")
  @JsonProperty("surveyScores")
  public List<NumericRange> getSurveyScores() {
    return surveyScores;
  }
  public void setSurveyScores(List<NumericRange> surveyScores) {
    this.surveyScores = surveyScores;
  }

  
  /**
   * The list of promoter score ranges used to filter the view
   **/
  public ViewFilter promoterScores(List<NumericRange> promoterScores) {
    this.promoterScores = promoterScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of promoter score ranges used to filter the view")
  @JsonProperty("promoterScores")
  public List<NumericRange> getPromoterScores() {
    return promoterScores;
  }
  public void setPromoterScores(List<NumericRange> promoterScores) {
    this.promoterScores = promoterScores;
  }

  
  /**
   * Indicates filtering for campaign
   **/
  public ViewFilter isCampaign(Boolean isCampaign) {
    this.isCampaign = isCampaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for campaign")
  @JsonProperty("isCampaign")
  public Boolean getIsCampaign() {
    return isCampaign;
  }
  public void setIsCampaign(Boolean isCampaign) {
    this.isCampaign = isCampaign;
  }

  
  /**
   * The list of survey statuses used to filter the view
   **/
  public ViewFilter surveyStatuses(List<String> surveyStatuses) {
    this.surveyStatuses = surveyStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of survey statuses used to filter the view")
  @JsonProperty("surveyStatuses")
  public List<String> getSurveyStatuses() {
    return surveyStatuses;
  }
  public void setSurveyStatuses(List<String> surveyStatuses) {
    this.surveyStatuses = surveyStatuses;
  }

  
  /**
   * A grouping of conversation level filters
   **/
  public ViewFilter conversationProperties(ConversationProperties conversationProperties) {
    this.conversationProperties = conversationProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A grouping of conversation level filters")
  @JsonProperty("conversationProperties")
  public ConversationProperties getConversationProperties() {
    return conversationProperties;
  }
  public void setConversationProperties(ConversationProperties conversationProperties) {
    this.conversationProperties = conversationProperties;
  }

  
  /**
   * Indicates filtering for blind transferred
   **/
  public ViewFilter isBlindTransferred(Boolean isBlindTransferred) {
    this.isBlindTransferred = isBlindTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for blind transferred")
  @JsonProperty("isBlindTransferred")
  public Boolean getIsBlindTransferred() {
    return isBlindTransferred;
  }
  public void setIsBlindTransferred(Boolean isBlindTransferred) {
    this.isBlindTransferred = isBlindTransferred;
  }

  
  /**
   * Indicates filtering for consulted
   **/
  public ViewFilter isConsulted(Boolean isConsulted) {
    this.isConsulted = isConsulted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for consulted")
  @JsonProperty("isConsulted")
  public Boolean getIsConsulted() {
    return isConsulted;
  }
  public void setIsConsulted(Boolean isConsulted) {
    this.isConsulted = isConsulted;
  }

  
  /**
   * Indicates filtering for consult transferred
   **/
  public ViewFilter isConsultTransferred(Boolean isConsultTransferred) {
    this.isConsultTransferred = isConsultTransferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for consult transferred")
  @JsonProperty("isConsultTransferred")
  public Boolean getIsConsultTransferred() {
    return isConsultTransferred;
  }
  public void setIsConsultTransferred(Boolean isConsultTransferred) {
    this.isConsultTransferred = isConsultTransferred;
  }

  
  /**
   * The list of remote participants used to filter the view
   **/
  public ViewFilter remoteParticipants(List<String> remoteParticipants) {
    this.remoteParticipants = remoteParticipants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of remote participants used to filter the view")
  @JsonProperty("remoteParticipants")
  public List<String> getRemoteParticipants() {
    return remoteParticipants;
  }
  public void setRemoteParticipants(List<String> remoteParticipants) {
    this.remoteParticipants = remoteParticipants;
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
        Objects.equals(this.filterQueuesByUserIds, viewFilter.filterQueuesByUserIds) &&
        Objects.equals(this.filterUsersByQueueIds, viewFilter.filterUsersByQueueIds) &&
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
        Objects.equals(this.messageTypes, viewFilter.messageTypes) &&
        Objects.equals(this.divisionIds, viewFilter.divisionIds) &&
        Objects.equals(this.surveyFormIds, viewFilter.surveyFormIds) &&
        Objects.equals(this.surveyTotalScore, viewFilter.surveyTotalScore) &&
        Objects.equals(this.surveyNpsScore, viewFilter.surveyNpsScore) &&
        Objects.equals(this.showSecondaryStatus, viewFilter.showSecondaryStatus) &&
        Objects.equals(this.agentDurationSortOrder, viewFilter.agentDurationSortOrder) &&
        Objects.equals(this.waitingDurationSortOrder, viewFilter.waitingDurationSortOrder) &&
        Objects.equals(this.interactingDurationSortOrder, viewFilter.interactingDurationSortOrder) &&
        Objects.equals(this.agentName, viewFilter.agentName) &&
        Objects.equals(this.skillsList, viewFilter.skillsList) &&
        Objects.equals(this.languageList, viewFilter.languageList) &&
        Objects.equals(this.mos, viewFilter.mos) &&
        Objects.equals(this.surveyQuestionGroupScore, viewFilter.surveyQuestionGroupScore) &&
        Objects.equals(this.surveyPromoterScore, viewFilter.surveyPromoterScore) &&
        Objects.equals(this.surveyFormContextIds, viewFilter.surveyFormContextIds) &&
        Objects.equals(this.conversationIds, viewFilter.conversationIds) &&
        Objects.equals(this.isEnded, viewFilter.isEnded) &&
        Objects.equals(this.isSurveyed, viewFilter.isSurveyed) &&
        Objects.equals(this.surveyScores, viewFilter.surveyScores) &&
        Objects.equals(this.promoterScores, viewFilter.promoterScores) &&
        Objects.equals(this.isCampaign, viewFilter.isCampaign) &&
        Objects.equals(this.surveyStatuses, viewFilter.surveyStatuses) &&
        Objects.equals(this.conversationProperties, viewFilter.conversationProperties) &&
        Objects.equals(this.isBlindTransferred, viewFilter.isBlindTransferred) &&
        Objects.equals(this.isConsulted, viewFilter.isConsulted) &&
        Objects.equals(this.isConsultTransferred, viewFilter.isConsultTransferred) &&
        Objects.equals(this.remoteParticipants, viewFilter.remoteParticipants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaTypes, queueIds, skillIds, skillGroups, languageIds, languageGroups, directions, wrapUpCodes, dnisList, filterQueuesByUserIds, filterUsersByQueueIds, userIds, addressTos, addressFroms, outboundCampaignIds, outboundContactListIds, contactIds, aniList, durationsMilliseconds, evaluationScore, evaluationCriticalScore, evaluationFormIds, evaluatedAgentIds, evaluatorIds, transferred, abandoned, messageTypes, divisionIds, surveyFormIds, surveyTotalScore, surveyNpsScore, showSecondaryStatus, agentDurationSortOrder, waitingDurationSortOrder, interactingDurationSortOrder, agentName, skillsList, languageList, mos, surveyQuestionGroupScore, surveyPromoterScore, surveyFormContextIds, conversationIds, isEnded, isSurveyed, surveyScores, promoterScores, isCampaign, surveyStatuses, conversationProperties, isBlindTransferred, isConsulted, isConsultTransferred, remoteParticipants);
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
    sb.append("    filterQueuesByUserIds: ").append(toIndentedString(filterQueuesByUserIds)).append("\n");
    sb.append("    filterUsersByQueueIds: ").append(toIndentedString(filterUsersByQueueIds)).append("\n");
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
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    surveyFormIds: ").append(toIndentedString(surveyFormIds)).append("\n");
    sb.append("    surveyTotalScore: ").append(toIndentedString(surveyTotalScore)).append("\n");
    sb.append("    surveyNpsScore: ").append(toIndentedString(surveyNpsScore)).append("\n");
    sb.append("    showSecondaryStatus: ").append(toIndentedString(showSecondaryStatus)).append("\n");
    sb.append("    agentDurationSortOrder: ").append(toIndentedString(agentDurationSortOrder)).append("\n");
    sb.append("    waitingDurationSortOrder: ").append(toIndentedString(waitingDurationSortOrder)).append("\n");
    sb.append("    interactingDurationSortOrder: ").append(toIndentedString(interactingDurationSortOrder)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    skillsList: ").append(toIndentedString(skillsList)).append("\n");
    sb.append("    languageList: ").append(toIndentedString(languageList)).append("\n");
    sb.append("    mos: ").append(toIndentedString(mos)).append("\n");
    sb.append("    surveyQuestionGroupScore: ").append(toIndentedString(surveyQuestionGroupScore)).append("\n");
    sb.append("    surveyPromoterScore: ").append(toIndentedString(surveyPromoterScore)).append("\n");
    sb.append("    surveyFormContextIds: ").append(toIndentedString(surveyFormContextIds)).append("\n");
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
    sb.append("    isEnded: ").append(toIndentedString(isEnded)).append("\n");
    sb.append("    isSurveyed: ").append(toIndentedString(isSurveyed)).append("\n");
    sb.append("    surveyScores: ").append(toIndentedString(surveyScores)).append("\n");
    sb.append("    promoterScores: ").append(toIndentedString(promoterScores)).append("\n");
    sb.append("    isCampaign: ").append(toIndentedString(isCampaign)).append("\n");
    sb.append("    surveyStatuses: ").append(toIndentedString(surveyStatuses)).append("\n");
    sb.append("    conversationProperties: ").append(toIndentedString(conversationProperties)).append("\n");
    sb.append("    isBlindTransferred: ").append(toIndentedString(isBlindTransferred)).append("\n");
    sb.append("    isConsulted: ").append(toIndentedString(isConsulted)).append("\n");
    sb.append("    isConsultTransferred: ").append(toIndentedString(isConsultTransferred)).append("\n");
    sb.append("    remoteParticipants: ").append(toIndentedString(remoteParticipants)).append("\n");
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

