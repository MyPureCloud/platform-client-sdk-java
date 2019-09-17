package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CallableContactsDiagnostic
 */

public class CallableContactsDiagnostic  implements Serializable {
  
  private DomainEntityRef attemptLimits = null;
  private List<DomainEntityRef> dncLists = new ArrayList<DomainEntityRef>();
  private DomainEntityRef callableTimeSet = null;
  private List<DomainEntityRef> ruleSets = new ArrayList<DomainEntityRef>();

  
  /**
   * Attempt limits for the campaign's contact list
   **/
  public CallableContactsDiagnostic attemptLimits(DomainEntityRef attemptLimits) {
    this.attemptLimits = attemptLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attempt limits for the campaign's contact list")
  @JsonProperty("attemptLimits")
  public DomainEntityRef getAttemptLimits() {
    return attemptLimits;
  }
  public void setAttemptLimits(DomainEntityRef attemptLimits) {
    this.attemptLimits = attemptLimits;
  }

  
  /**
   * Do not call lists for the campaign
   **/
  public CallableContactsDiagnostic dncLists(List<DomainEntityRef> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Do not call lists for the campaign")
  @JsonProperty("dncLists")
  public List<DomainEntityRef> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<DomainEntityRef> dncLists) {
    this.dncLists = dncLists;
  }

  
  /**
   * Callable time sets for the campaign
   **/
  public CallableContactsDiagnostic callableTimeSet(DomainEntityRef callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Callable time sets for the campaign")
  @JsonProperty("callableTimeSet")
  public DomainEntityRef getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(DomainEntityRef callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }

  
  /**
   * Rule sets for the campaign
   **/
  public CallableContactsDiagnostic ruleSets(List<DomainEntityRef> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Rule sets for the campaign")
  @JsonProperty("ruleSets")
  public List<DomainEntityRef> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<DomainEntityRef> ruleSets) {
    this.ruleSets = ruleSets;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallableContactsDiagnostic callableContactsDiagnostic = (CallableContactsDiagnostic) o;
    return Objects.equals(this.attemptLimits, callableContactsDiagnostic.attemptLimits) &&
        Objects.equals(this.dncLists, callableContactsDiagnostic.dncLists) &&
        Objects.equals(this.callableTimeSet, callableContactsDiagnostic.callableTimeSet) &&
        Objects.equals(this.ruleSets, callableContactsDiagnostic.ruleSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptLimits, dncLists, callableTimeSet, ruleSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallableContactsDiagnostic {\n");
    
    sb.append("    attemptLimits: ").append(toIndentedString(attemptLimits)).append("\n");
    sb.append("    dncLists: ").append(toIndentedString(dncLists)).append("\n");
    sb.append("    callableTimeSet: ").append(toIndentedString(callableTimeSet)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
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

