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
 * BillingProduct
 */

public class BillingProduct  implements Serializable {
  
  private String id = null;
  private String sku = null;
  private String name = null;

  private static class UnitOfMeasureEnumDeserializer extends StdDeserializer<UnitOfMeasureEnum> {
    public UnitOfMeasureEnumDeserializer() {
      super(UnitOfMeasureEnumDeserializer.class);
    }

    @Override
    public UnitOfMeasureEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnitOfMeasureEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The unit of measure for the product.
   */
 @JsonDeserialize(using = UnitOfMeasureEnumDeserializer.class)
  public enum UnitOfMeasureEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("Call"),
    CHARACTER("Character"),
    CONVERSATION("Conversation"),
    COURSE("Course"),
    DAY("Day"),
    EACH("Each"),
    EMPLOYEE("Employee"),
    ENGAGEMENT("Engagement"),
    EVENT("Event"),
    EXAM("Exam"),
    GB("GB"),
    HOUR("Hour"),
    INSTANCE("Instance"),
    INTERACTION("Interaction"),
    INVOCATION("Invocation"),
    MESSAGE("Message"),
    MILLIONCHARACTERS("MillionCharacters"),
    MINUTE("Minute"),
    PERSON("Person"),
    PHONENUMBER("PhoneNumber"),
    PORT("Port"),
    SEGMENT("Segment"),
    SESSION("Session"),
    STREAM("Stream"),
    TOKEN("Token"),
    TRANSACTION("Transaction"),
    TURN("Turn"),
    UNIT("Unit"),
    USER("User");

    private String value;

    UnitOfMeasureEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnitOfMeasureEnum fromString(String key) {
      if (key == null) return null;

      for (UnitOfMeasureEnum value : UnitOfMeasureEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnitOfMeasureEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnitOfMeasureEnum unitOfMeasure = null;

  public BillingProduct() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The product associated with the fund.
   **/
  public BillingProduct sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The product associated with the fund.")
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }


  /**
   * The name of the product.
   **/
  public BillingProduct name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the product.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The unit of measure for the product.
   **/
  public BillingProduct unitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unit of measure for the product.")
  @JsonProperty("unitOfMeasure")
  public UnitOfMeasureEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }
  public void setUnitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingProduct billingProduct = (BillingProduct) o;

    return Objects.equals(this.id, billingProduct.id) &&
            Objects.equals(this.sku, billingProduct.sku) &&
            Objects.equals(this.name, billingProduct.name) &&
            Objects.equals(this.unitOfMeasure, billingProduct.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sku, name, unitOfMeasure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingProduct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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

