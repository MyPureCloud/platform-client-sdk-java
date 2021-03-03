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
 * OrganizationFeatures
 */

public class OrganizationFeatures  implements Serializable {
  
  private Boolean realtimeCIC = null;
  private Boolean purecloud = null;
  private Boolean hipaa = null;
  private Boolean ucEnabled = null;
  private Boolean pci = null;
  private Boolean purecloudVoice = null;
  private Boolean xmppFederation = null;
  private Boolean chat = null;
  private Boolean informalPhotos = null;
  private Boolean directory = null;
  private Boolean contactCenter = null;
  private Boolean unifiedCommunications = null;
  private Boolean custserv = null;

  
  /**
   **/
  public OrganizationFeatures realtimeCIC(Boolean realtimeCIC) {
    this.realtimeCIC = realtimeCIC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("realtimeCIC")
  public Boolean getRealtimeCIC() {
    return realtimeCIC;
  }
  public void setRealtimeCIC(Boolean realtimeCIC) {
    this.realtimeCIC = realtimeCIC;
  }

  
  /**
   **/
  public OrganizationFeatures purecloud(Boolean purecloud) {
    this.purecloud = purecloud;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("purecloud")
  public Boolean getPurecloud() {
    return purecloud;
  }
  public void setPurecloud(Boolean purecloud) {
    this.purecloud = purecloud;
  }

  
  /**
   **/
  public OrganizationFeatures hipaa(Boolean hipaa) {
    this.hipaa = hipaa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hipaa")
  public Boolean getHipaa() {
    return hipaa;
  }
  public void setHipaa(Boolean hipaa) {
    this.hipaa = hipaa;
  }

  
  /**
   **/
  public OrganizationFeatures ucEnabled(Boolean ucEnabled) {
    this.ucEnabled = ucEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ucEnabled")
  public Boolean getUcEnabled() {
    return ucEnabled;
  }
  public void setUcEnabled(Boolean ucEnabled) {
    this.ucEnabled = ucEnabled;
  }

  
  /**
   **/
  public OrganizationFeatures pci(Boolean pci) {
    this.pci = pci;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pci")
  public Boolean getPci() {
    return pci;
  }
  public void setPci(Boolean pci) {
    this.pci = pci;
  }

  
  /**
   **/
  public OrganizationFeatures purecloudVoice(Boolean purecloudVoice) {
    this.purecloudVoice = purecloudVoice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("purecloudVoice")
  public Boolean getPurecloudVoice() {
    return purecloudVoice;
  }
  public void setPurecloudVoice(Boolean purecloudVoice) {
    this.purecloudVoice = purecloudVoice;
  }

  
  /**
   **/
  public OrganizationFeatures xmppFederation(Boolean xmppFederation) {
    this.xmppFederation = xmppFederation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("xmppFederation")
  public Boolean getXmppFederation() {
    return xmppFederation;
  }
  public void setXmppFederation(Boolean xmppFederation) {
    this.xmppFederation = xmppFederation;
  }

  
  /**
   **/
  public OrganizationFeatures chat(Boolean chat) {
    this.chat = chat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chat")
  public Boolean getChat() {
    return chat;
  }
  public void setChat(Boolean chat) {
    this.chat = chat;
  }

  
  /**
   **/
  public OrganizationFeatures informalPhotos(Boolean informalPhotos) {
    this.informalPhotos = informalPhotos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("informalPhotos")
  public Boolean getInformalPhotos() {
    return informalPhotos;
  }
  public void setInformalPhotos(Boolean informalPhotos) {
    this.informalPhotos = informalPhotos;
  }

  
  /**
   **/
  public OrganizationFeatures directory(Boolean directory) {
    this.directory = directory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("directory")
  public Boolean getDirectory() {
    return directory;
  }
  public void setDirectory(Boolean directory) {
    this.directory = directory;
  }

  
  /**
   **/
  public OrganizationFeatures contactCenter(Boolean contactCenter) {
    this.contactCenter = contactCenter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactCenter")
  public Boolean getContactCenter() {
    return contactCenter;
  }
  public void setContactCenter(Boolean contactCenter) {
    this.contactCenter = contactCenter;
  }

  
  /**
   **/
  public OrganizationFeatures unifiedCommunications(Boolean unifiedCommunications) {
    this.unifiedCommunications = unifiedCommunications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unifiedCommunications")
  public Boolean getUnifiedCommunications() {
    return unifiedCommunications;
  }
  public void setUnifiedCommunications(Boolean unifiedCommunications) {
    this.unifiedCommunications = unifiedCommunications;
  }

  
  /**
   **/
  public OrganizationFeatures custserv(Boolean custserv) {
    this.custserv = custserv;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("custserv")
  public Boolean getCustserv() {
    return custserv;
  }
  public void setCustserv(Boolean custserv) {
    this.custserv = custserv;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationFeatures organizationFeatures = (OrganizationFeatures) o;
    return Objects.equals(this.realtimeCIC, organizationFeatures.realtimeCIC) &&
        Objects.equals(this.purecloud, organizationFeatures.purecloud) &&
        Objects.equals(this.hipaa, organizationFeatures.hipaa) &&
        Objects.equals(this.ucEnabled, organizationFeatures.ucEnabled) &&
        Objects.equals(this.pci, organizationFeatures.pci) &&
        Objects.equals(this.purecloudVoice, organizationFeatures.purecloudVoice) &&
        Objects.equals(this.xmppFederation, organizationFeatures.xmppFederation) &&
        Objects.equals(this.chat, organizationFeatures.chat) &&
        Objects.equals(this.informalPhotos, organizationFeatures.informalPhotos) &&
        Objects.equals(this.directory, organizationFeatures.directory) &&
        Objects.equals(this.contactCenter, organizationFeatures.contactCenter) &&
        Objects.equals(this.unifiedCommunications, organizationFeatures.unifiedCommunications) &&
        Objects.equals(this.custserv, organizationFeatures.custserv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realtimeCIC, purecloud, hipaa, ucEnabled, pci, purecloudVoice, xmppFederation, chat, informalPhotos, directory, contactCenter, unifiedCommunications, custserv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationFeatures {\n");
    
    sb.append("    realtimeCIC: ").append(toIndentedString(realtimeCIC)).append("\n");
    sb.append("    purecloud: ").append(toIndentedString(purecloud)).append("\n");
    sb.append("    hipaa: ").append(toIndentedString(hipaa)).append("\n");
    sb.append("    ucEnabled: ").append(toIndentedString(ucEnabled)).append("\n");
    sb.append("    pci: ").append(toIndentedString(pci)).append("\n");
    sb.append("    purecloudVoice: ").append(toIndentedString(purecloudVoice)).append("\n");
    sb.append("    xmppFederation: ").append(toIndentedString(xmppFederation)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    informalPhotos: ").append(toIndentedString(informalPhotos)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    contactCenter: ").append(toIndentedString(contactCenter)).append("\n");
    sb.append("    unifiedCommunications: ").append(toIndentedString(unifiedCommunications)).append("\n");
    sb.append("    custserv: ").append(toIndentedString(custserv)).append("\n");
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

