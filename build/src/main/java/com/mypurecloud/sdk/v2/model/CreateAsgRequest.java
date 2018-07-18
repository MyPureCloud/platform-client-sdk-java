package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateAsgRequest
 */

public class CreateAsgRequest  implements Serializable {
  
  private String asgOwnerEmail = null;
  private String edgeGroupId = null;
  private String externalTrunkBaseId = null;
  private String asgLogicalIAMInstanceProfile = null;
  private String asgAmi = null;

  /**
   * Overrides the type of ASG being created.  By default we always create a 'standard' asg.
   */
  public enum AsgTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("standard"),
    RECOVERY("recovery");

    private String value;

    AsgTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AsgTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AsgTypeEnum value : AsgTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AsgTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AsgTypeEnum asgType = null;
  private Integer asgInstanceCount = null;
  private String asgNetworkSpace = null;
  private Boolean asgChaosExempt = null;
  private Integer asgRecoveryShutdownMinutes = null;

  
  /**
   * Email address of the individual starting the ASG
   **/
  public CreateAsgRequest asgOwnerEmail(String asgOwnerEmail) {
    this.asgOwnerEmail = asgOwnerEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email address of the individual starting the ASG")
  @JsonProperty("asgOwnerEmail")
  public String getAsgOwnerEmail() {
    return asgOwnerEmail;
  }
  public void setAsgOwnerEmail(String asgOwnerEmail) {
    this.asgOwnerEmail = asgOwnerEmail;
  }

  
  /**
   * Edge group that the user wants the asg edges to be assigned to.
   **/
  public CreateAsgRequest edgeGroupId(String edgeGroupId) {
    this.edgeGroupId = edgeGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Edge group that the user wants the asg edges to be assigned to.")
  @JsonProperty("edgeGroupId")
  public String getEdgeGroupId() {
    return edgeGroupId;
  }
  public void setEdgeGroupId(String edgeGroupId) {
    this.edgeGroupId = edgeGroupId;
  }

  
  /**
   * Trunk base that the user wants the asg edges to be assigned to
   **/
  public CreateAsgRequest externalTrunkBaseId(String externalTrunkBaseId) {
    this.externalTrunkBaseId = externalTrunkBaseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Trunk base that the user wants the asg edges to be assigned to")
  @JsonProperty("externalTrunkBaseId")
  public String getExternalTrunkBaseId() {
    return externalTrunkBaseId;
  }
  public void setExternalTrunkBaseId(String externalTrunkBaseId) {
    this.externalTrunkBaseId = externalTrunkBaseId;
  }

  
  /**
   * Overrides the default logical IAM Instance Profile
   **/
  public CreateAsgRequest asgLogicalIAMInstanceProfile(String asgLogicalIAMInstanceProfile) {
    this.asgLogicalIAMInstanceProfile = asgLogicalIAMInstanceProfile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overrides the default logical IAM Instance Profile")
  @JsonProperty("asgLogicalIAMInstanceProfile")
  public String getAsgLogicalIAMInstanceProfile() {
    return asgLogicalIAMInstanceProfile;
  }
  public void setAsgLogicalIAMInstanceProfile(String asgLogicalIAMInstanceProfile) {
    this.asgLogicalIAMInstanceProfile = asgLogicalIAMInstanceProfile;
  }

  
  /**
   * Overrides the default EDGE AMI used with the ASG
   **/
  public CreateAsgRequest asgAmi(String asgAmi) {
    this.asgAmi = asgAmi;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overrides the default EDGE AMI used with the ASG")
  @JsonProperty("asgAmi")
  public String getAsgAmi() {
    return asgAmi;
  }
  public void setAsgAmi(String asgAmi) {
    this.asgAmi = asgAmi;
  }

  
  /**
   * Overrides the type of ASG being created.  By default we always create a 'standard' asg.
   **/
  public CreateAsgRequest asgType(AsgTypeEnum asgType) {
    this.asgType = asgType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overrides the type of ASG being created.  By default we always create a 'standard' asg.")
  @JsonProperty("asgType")
  public AsgTypeEnum getAsgType() {
    return asgType;
  }
  public void setAsgType(AsgTypeEnum asgType) {
    this.asgType = asgType;
  }

  
  /**
   * Overrides the default number of Edge instances to start in the ASG
   **/
  public CreateAsgRequest asgInstanceCount(Integer asgInstanceCount) {
    this.asgInstanceCount = asgInstanceCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overrides the default number of Edge instances to start in the ASG")
  @JsonProperty("asgInstanceCount")
  public Integer getAsgInstanceCount() {
    return asgInstanceCount;
  }
  public void setAsgInstanceCount(Integer asgInstanceCount) {
    this.asgInstanceCount = asgInstanceCount;
  }

  
  /**
   * Overrides the network space the ASG will start in.  The default will always be mediaservices
   **/
  public CreateAsgRequest asgNetworkSpace(String asgNetworkSpace) {
    this.asgNetworkSpace = asgNetworkSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overrides the network space the ASG will start in.  The default will always be mediaservices")
  @JsonProperty("asgNetworkSpace")
  public String getAsgNetworkSpace() {
    return asgNetworkSpace;
  }
  public void setAsgNetworkSpace(String asgNetworkSpace) {
    this.asgNetworkSpace = asgNetworkSpace;
  }

  
  /**
   * Optional parameter that exempts this ASG from chaos monkey killing one of its instances.
   **/
  public CreateAsgRequest asgChaosExempt(Boolean asgChaosExempt) {
    this.asgChaosExempt = asgChaosExempt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional parameter that exempts this ASG from chaos monkey killing one of its instances.")
  @JsonProperty("asgChaosExempt")
  public Boolean getAsgChaosExempt() {
    return asgChaosExempt;
  }
  public void setAsgChaosExempt(Boolean asgChaosExempt) {
    this.asgChaosExempt = asgChaosExempt;
  }

  
  /**
   * Number of minutes a recovery ASG will stay active before it is torn down
   **/
  public CreateAsgRequest asgRecoveryShutdownMinutes(Integer asgRecoveryShutdownMinutes) {
    this.asgRecoveryShutdownMinutes = asgRecoveryShutdownMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of minutes a recovery ASG will stay active before it is torn down")
  @JsonProperty("asgRecoveryShutdownMinutes")
  public Integer getAsgRecoveryShutdownMinutes() {
    return asgRecoveryShutdownMinutes;
  }
  public void setAsgRecoveryShutdownMinutes(Integer asgRecoveryShutdownMinutes) {
    this.asgRecoveryShutdownMinutes = asgRecoveryShutdownMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAsgRequest createAsgRequest = (CreateAsgRequest) o;
    return Objects.equals(this.asgOwnerEmail, createAsgRequest.asgOwnerEmail) &&
        Objects.equals(this.edgeGroupId, createAsgRequest.edgeGroupId) &&
        Objects.equals(this.externalTrunkBaseId, createAsgRequest.externalTrunkBaseId) &&
        Objects.equals(this.asgLogicalIAMInstanceProfile, createAsgRequest.asgLogicalIAMInstanceProfile) &&
        Objects.equals(this.asgAmi, createAsgRequest.asgAmi) &&
        Objects.equals(this.asgType, createAsgRequest.asgType) &&
        Objects.equals(this.asgInstanceCount, createAsgRequest.asgInstanceCount) &&
        Objects.equals(this.asgNetworkSpace, createAsgRequest.asgNetworkSpace) &&
        Objects.equals(this.asgChaosExempt, createAsgRequest.asgChaosExempt) &&
        Objects.equals(this.asgRecoveryShutdownMinutes, createAsgRequest.asgRecoveryShutdownMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asgOwnerEmail, edgeGroupId, externalTrunkBaseId, asgLogicalIAMInstanceProfile, asgAmi, asgType, asgInstanceCount, asgNetworkSpace, asgChaosExempt, asgRecoveryShutdownMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAsgRequest {\n");
    
    sb.append("    asgOwnerEmail: ").append(toIndentedString(asgOwnerEmail)).append("\n");
    sb.append("    edgeGroupId: ").append(toIndentedString(edgeGroupId)).append("\n");
    sb.append("    externalTrunkBaseId: ").append(toIndentedString(externalTrunkBaseId)).append("\n");
    sb.append("    asgLogicalIAMInstanceProfile: ").append(toIndentedString(asgLogicalIAMInstanceProfile)).append("\n");
    sb.append("    asgAmi: ").append(toIndentedString(asgAmi)).append("\n");
    sb.append("    asgType: ").append(toIndentedString(asgType)).append("\n");
    sb.append("    asgInstanceCount: ").append(toIndentedString(asgInstanceCount)).append("\n");
    sb.append("    asgNetworkSpace: ").append(toIndentedString(asgNetworkSpace)).append("\n");
    sb.append("    asgChaosExempt: ").append(toIndentedString(asgChaosExempt)).append("\n");
    sb.append("    asgRecoveryShutdownMinutes: ").append(toIndentedString(asgRecoveryShutdownMinutes)).append("\n");
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

