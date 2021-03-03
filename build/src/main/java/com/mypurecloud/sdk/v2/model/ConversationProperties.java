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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationProperties
 */

public class ConversationProperties  implements Serializable {
  
  private Boolean isWaiting = null;
  private Boolean isActive = null;
  private Boolean isAcd = null;
  private Boolean isPreferred = null;
  private Boolean isScreenshare = null;
  private Boolean isCobrowse = null;
  private Boolean isVoicemail = null;
  private Boolean isFlagged = null;
  private Boolean isMonitored = null;
  private Boolean filterWrapUpNotes = null;
  private Boolean matchAll = null;

  
  /**
   * Indicates filtering for waiting
   **/
  public ConversationProperties isWaiting(Boolean isWaiting) {
    this.isWaiting = isWaiting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for waiting")
  @JsonProperty("isWaiting")
  public Boolean getIsWaiting() {
    return isWaiting;
  }
  public void setIsWaiting(Boolean isWaiting) {
    this.isWaiting = isWaiting;
  }

  
  /**
   * Indicates filtering for active
   **/
  public ConversationProperties isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for active")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  
  /**
   * Indicates filtering for Acd
   **/
  public ConversationProperties isAcd(Boolean isAcd) {
    this.isAcd = isAcd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for Acd")
  @JsonProperty("isAcd")
  public Boolean getIsAcd() {
    return isAcd;
  }
  public void setIsAcd(Boolean isAcd) {
    this.isAcd = isAcd;
  }

  
  /**
   * Indicates filtering for Preferred Agent Routing
   **/
  public ConversationProperties isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for Preferred Agent Routing")
  @JsonProperty("isPreferred")
  public Boolean getIsPreferred() {
    return isPreferred;
  }
  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  
  /**
   * Indicates filtering for screenshare
   **/
  public ConversationProperties isScreenshare(Boolean isScreenshare) {
    this.isScreenshare = isScreenshare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for screenshare")
  @JsonProperty("isScreenshare")
  public Boolean getIsScreenshare() {
    return isScreenshare;
  }
  public void setIsScreenshare(Boolean isScreenshare) {
    this.isScreenshare = isScreenshare;
  }

  
  /**
   * Indicates filtering for Cobrowse
   **/
  public ConversationProperties isCobrowse(Boolean isCobrowse) {
    this.isCobrowse = isCobrowse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for Cobrowse")
  @JsonProperty("isCobrowse")
  public Boolean getIsCobrowse() {
    return isCobrowse;
  }
  public void setIsCobrowse(Boolean isCobrowse) {
    this.isCobrowse = isCobrowse;
  }

  
  /**
   * Indicates filtering for Voice mail
   **/
  public ConversationProperties isVoicemail(Boolean isVoicemail) {
    this.isVoicemail = isVoicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for Voice mail")
  @JsonProperty("isVoicemail")
  public Boolean getIsVoicemail() {
    return isVoicemail;
  }
  public void setIsVoicemail(Boolean isVoicemail) {
    this.isVoicemail = isVoicemail;
  }

  
  /**
   * Indicates filtering for flagged
   **/
  public ConversationProperties isFlagged(Boolean isFlagged) {
    this.isFlagged = isFlagged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for flagged")
  @JsonProperty("isFlagged")
  public Boolean getIsFlagged() {
    return isFlagged;
  }
  public void setIsFlagged(Boolean isFlagged) {
    this.isFlagged = isFlagged;
  }

  
  /**
   * Indicates filtering for monitored
   **/
  public ConversationProperties isMonitored(Boolean isMonitored) {
    this.isMonitored = isMonitored;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for monitored")
  @JsonProperty("isMonitored")
  public Boolean getIsMonitored() {
    return isMonitored;
  }
  public void setIsMonitored(Boolean isMonitored) {
    this.isMonitored = isMonitored;
  }

  
  /**
   * Indicates filtering for WrapUpNotes
   **/
  public ConversationProperties filterWrapUpNotes(Boolean filterWrapUpNotes) {
    this.filterWrapUpNotes = filterWrapUpNotes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates filtering for WrapUpNotes")
  @JsonProperty("filterWrapUpNotes")
  public Boolean getFilterWrapUpNotes() {
    return filterWrapUpNotes;
  }
  public void setFilterWrapUpNotes(Boolean filterWrapUpNotes) {
    this.filterWrapUpNotes = filterWrapUpNotes;
  }

  
  /**
   * Indicates comparison operation, TRUE indicates filters will use AND logic, FALSE indicates OR logic
   **/
  public ConversationProperties matchAll(Boolean matchAll) {
    this.matchAll = matchAll;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates comparison operation, TRUE indicates filters will use AND logic, FALSE indicates OR logic")
  @JsonProperty("matchAll")
  public Boolean getMatchAll() {
    return matchAll;
  }
  public void setMatchAll(Boolean matchAll) {
    this.matchAll = matchAll;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationProperties conversationProperties = (ConversationProperties) o;
    return Objects.equals(this.isWaiting, conversationProperties.isWaiting) &&
        Objects.equals(this.isActive, conversationProperties.isActive) &&
        Objects.equals(this.isAcd, conversationProperties.isAcd) &&
        Objects.equals(this.isPreferred, conversationProperties.isPreferred) &&
        Objects.equals(this.isScreenshare, conversationProperties.isScreenshare) &&
        Objects.equals(this.isCobrowse, conversationProperties.isCobrowse) &&
        Objects.equals(this.isVoicemail, conversationProperties.isVoicemail) &&
        Objects.equals(this.isFlagged, conversationProperties.isFlagged) &&
        Objects.equals(this.isMonitored, conversationProperties.isMonitored) &&
        Objects.equals(this.filterWrapUpNotes, conversationProperties.filterWrapUpNotes) &&
        Objects.equals(this.matchAll, conversationProperties.matchAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isWaiting, isActive, isAcd, isPreferred, isScreenshare, isCobrowse, isVoicemail, isFlagged, isMonitored, filterWrapUpNotes, matchAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationProperties {\n");
    
    sb.append("    isWaiting: ").append(toIndentedString(isWaiting)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isAcd: ").append(toIndentedString(isAcd)).append("\n");
    sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
    sb.append("    isScreenshare: ").append(toIndentedString(isScreenshare)).append("\n");
    sb.append("    isCobrowse: ").append(toIndentedString(isCobrowse)).append("\n");
    sb.append("    isVoicemail: ").append(toIndentedString(isVoicemail)).append("\n");
    sb.append("    isFlagged: ").append(toIndentedString(isFlagged)).append("\n");
    sb.append("    isMonitored: ").append(toIndentedString(isMonitored)).append("\n");
    sb.append("    filterWrapUpNotes: ").append(toIndentedString(filterWrapUpNotes)).append("\n");
    sb.append("    matchAll: ").append(toIndentedString(matchAll)).append("\n");
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

