package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.InstanceInfo;
import com.mypurecloud.sdk.v2.model.Site;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AsgInfoResponse
 */

public class AsgInfoResponse  implements Serializable {
  
  private String id = null;
  private Site site = null;
  private String ami = null;
  private String edgeVersion = null;
  private List<InstanceInfo> instanceInfo = new ArrayList<InstanceInfo>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The site that the asg belongs to.
   **/
  public AsgInfoResponse site(Site site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The site that the asg belongs to.")
  @JsonProperty("site")
  public Site getSite() {
    return site;
  }
  public void setSite(Site site) {
    this.site = site;
  }

  
  /**
   * The ami ami of the asg.
   **/
  public AsgInfoResponse ami(String ami) {
    this.ami = ami;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ami ami of the asg.")
  @JsonProperty("ami")
  public String getAmi() {
    return ami;
  }
  public void setAmi(String ami) {
    this.ami = ami;
  }

  
  /**
   * The software ami of the edges in the asg.
   **/
  public AsgInfoResponse edgeVersion(String edgeVersion) {
    this.edgeVersion = edgeVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The software ami of the edges in the asg.")
  @JsonProperty("edgeVersion")
  public String getEdgeVersion() {
    return edgeVersion;
  }
  public void setEdgeVersion(String edgeVersion) {
    this.edgeVersion = edgeVersion;
  }

  
  /**
   * List of instances and their information that live in the ASG.
   **/
  public AsgInfoResponse instanceInfo(List<InstanceInfo> instanceInfo) {
    this.instanceInfo = instanceInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of instances and their information that live in the ASG.")
  @JsonProperty("instanceInfo")
  public List<InstanceInfo> getInstanceInfo() {
    return instanceInfo;
  }
  public void setInstanceInfo(List<InstanceInfo> instanceInfo) {
    this.instanceInfo = instanceInfo;
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
    AsgInfoResponse asgInfoResponse = (AsgInfoResponse) o;
    return Objects.equals(this.id, asgInfoResponse.id) &&
        Objects.equals(this.site, asgInfoResponse.site) &&
        Objects.equals(this.ami, asgInfoResponse.ami) &&
        Objects.equals(this.edgeVersion, asgInfoResponse.edgeVersion) &&
        Objects.equals(this.instanceInfo, asgInfoResponse.instanceInfo) &&
        Objects.equals(this.selfUri, asgInfoResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, site, ami, edgeVersion, instanceInfo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsgInfoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    ami: ").append(toIndentedString(ami)).append("\n");
    sb.append("    edgeVersion: ").append(toIndentedString(edgeVersion)).append("\n");
    sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
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

