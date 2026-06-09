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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NumberRouting
 */

public class NumberRouting  implements Serializable {
  
  private String numberId = null;
  private String ownerOrganizationId = null;
  private String carrierCode = null;
  private String pendingOrganizationId = null;
  private String region = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current status of the number routing
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NORMAL("Normal"),
    REDIRECTED("Redirected"),
    PENDING("Pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String activeOrganizationId = null;
  private List<String> linkedOrganizationIds = null;

  public NumberRouting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      linkedOrganizationIds = new ArrayList<String>();
    }
  }

  public NumberRouting(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      linkedOrganizationIds = new ArrayList<String>();
    }
  }

  
  /**
   * Phone number Id that has a disaster recovery linking
   **/
  public NumberRouting numberId(String numberId) {
    this.numberId = numberId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone number Id that has a disaster recovery linking")
  @JsonProperty("numberId")
  public String getNumberId() {
    return numberId;
  }
  public void setNumberId(String numberId) {
    this.numberId = numberId;
  }


  /**
   * Owner organization of numberId
   **/
  public NumberRouting ownerOrganizationId(String ownerOrganizationId) {
    this.ownerOrganizationId = ownerOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Owner organization of numberId")
  @JsonProperty("ownerOrganizationId")
  public String getOwnerOrganizationId() {
    return ownerOrganizationId;
  }
  public void setOwnerOrganizationId(String ownerOrganizationId) {
    this.ownerOrganizationId = ownerOrganizationId;
  }


  /**
   * Code that indicates which carrier manages the number ie. VERIZON
   **/
  public NumberRouting carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code that indicates which carrier manages the number ie. VERIZON")
  @JsonProperty("carrierCode")
  public String getCarrierCode() {
    return carrierCode;
  }
  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  /**
   * OrganizationId where the number will be routed to during a change routing event
   **/
  public NumberRouting pendingOrganizationId(String pendingOrganizationId) {
    this.pendingOrganizationId = pendingOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OrganizationId where the number will be routed to during a change routing event")
  @JsonProperty("pendingOrganizationId")
  public String getPendingOrganizationId() {
    return pendingOrganizationId;
  }
  public void setPendingOrganizationId(String pendingOrganizationId) {
    this.pendingOrganizationId = pendingOrganizationId;
  }


  /**
   * The current region where the number is located
   **/
  public NumberRouting region(String region) {
    this.region = region;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current region where the number is located")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * The current status of the number routing
   **/
  public NumberRouting status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current status of the number routing")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The orgId where the number is currently routing to
   **/
  public NumberRouting activeOrganizationId(String activeOrganizationId) {
    this.activeOrganizationId = activeOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The orgId where the number is currently routing to")
  @JsonProperty("activeOrganizationId")
  public String getActiveOrganizationId() {
    return activeOrganizationId;
  }
  public void setActiveOrganizationId(String activeOrganizationId) {
    this.activeOrganizationId = activeOrganizationId;
  }


  /**
   * List of linked organizations ids
   **/
  public NumberRouting linkedOrganizationIds(List<String> linkedOrganizationIds) {
    this.linkedOrganizationIds = linkedOrganizationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of linked organizations ids")
  @JsonProperty("linkedOrganizationIds")
  public List<String> getLinkedOrganizationIds() {
    return linkedOrganizationIds;
  }
  public void setLinkedOrganizationIds(List<String> linkedOrganizationIds) {
    this.linkedOrganizationIds = linkedOrganizationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberRouting numberRouting = (NumberRouting) o;

    return Objects.equals(this.numberId, numberRouting.numberId) &&
            Objects.equals(this.ownerOrganizationId, numberRouting.ownerOrganizationId) &&
            Objects.equals(this.carrierCode, numberRouting.carrierCode) &&
            Objects.equals(this.pendingOrganizationId, numberRouting.pendingOrganizationId) &&
            Objects.equals(this.region, numberRouting.region) &&
            Objects.equals(this.status, numberRouting.status) &&
            Objects.equals(this.activeOrganizationId, numberRouting.activeOrganizationId) &&
            Objects.equals(this.linkedOrganizationIds, numberRouting.linkedOrganizationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberId, ownerOrganizationId, carrierCode, pendingOrganizationId, region, status, activeOrganizationId, linkedOrganizationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberRouting {\n");
    
    sb.append("    numberId: ").append(toIndentedString(numberId)).append("\n");
    sb.append("    ownerOrganizationId: ").append(toIndentedString(ownerOrganizationId)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    pendingOrganizationId: ").append(toIndentedString(pendingOrganizationId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activeOrganizationId: ").append(toIndentedString(activeOrganizationId)).append("\n");
    sb.append("    linkedOrganizationIds: ").append(toIndentedString(linkedOrganizationIds)).append("\n");
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

