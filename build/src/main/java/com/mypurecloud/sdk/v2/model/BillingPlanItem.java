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
import java.math.BigDecimal;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BillingPlanItem
 */

public class BillingPlanItem  implements Serializable {
  
  private String itemNumber = null;
  private String name = null;
  private String type = null;
  private String function = null;
  private String description = null;
  private LocalDate dateChargedThrough = null;
  private String currencyIsoCode = null;
  private BigDecimal discountAmount = null;
  private LocalDate dateEffectiveStart = null;
  private LocalDate dateEffectiveEnd = null;
  private BigDecimal overagePrice = null;
  private BigDecimal price = null;
  private Integer quantity = null;

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
   * The unit of measure for the wallet.
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

  public BillingPlanItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Item number.
   **/
  public BillingPlanItem itemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Item number.")
  @JsonProperty("itemNumber")
  public String getItemNumber() {
    return itemNumber;
  }
  public void setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
  }


  /**
   * Name of the item.
   **/
  public BillingPlanItem name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the item.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Type of the item.
   **/
  public BillingPlanItem type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the item.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Function of the item.
   **/
  public BillingPlanItem function(String function) {
    this.function = function;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Function of the item.")
  @JsonProperty("function")
  public String getFunction() {
    return function;
  }
  public void setFunction(String function) {
    this.function = function;
  }


  /**
   * Detailed description of the item.
   **/
  public BillingPlanItem description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed description of the item.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The date through which a customer has been billed for the charge. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingPlanItem dateChargedThrough(LocalDate dateChargedThrough) {
    this.dateChargedThrough = dateChargedThrough;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date through which a customer has been billed for the charge. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateChargedThrough")
  public LocalDate getDateChargedThrough() {
    return dateChargedThrough;
  }
  public void setDateChargedThrough(LocalDate dateChargedThrough) {
    this.dateChargedThrough = dateChargedThrough;
  }


  /**
   * Contains the ISO code for any currency allowed by the organization.
   **/
  public BillingPlanItem currencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains the ISO code for any currency allowed by the organization.")
  @JsonProperty("currencyIsoCode")
  public String getCurrencyIsoCode() {
    return currencyIsoCode;
  }
  public void setCurrencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
  }


  /**
   * The amount of the discount.
   **/
  public BillingPlanItem discountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of the discount.")
  @JsonProperty("discountAmount")
  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }
  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }


  /**
   * The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingPlanItem dateEffectiveStart(LocalDate dateEffectiveStart) {
    this.dateEffectiveStart = dateEffectiveStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEffectiveStart")
  public LocalDate getDateEffectiveStart() {
    return dateEffectiveStart;
  }
  public void setDateEffectiveStart(LocalDate dateEffectiveStart) {
    this.dateEffectiveStart = dateEffectiveStart;
  }


  /**
   * The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingPlanItem dateEffectiveEnd(LocalDate dateEffectiveEnd) {
    this.dateEffectiveEnd = dateEffectiveEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEffectiveEnd")
  public LocalDate getDateEffectiveEnd() {
    return dateEffectiveEnd;
  }
  public void setDateEffectiveEnd(LocalDate dateEffectiveEnd) {
    this.dateEffectiveEnd = dateEffectiveEnd;
  }


  /**
   * The price for units over the allowed amount.
   **/
  public BillingPlanItem overagePrice(BigDecimal overagePrice) {
    this.overagePrice = overagePrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The price for units over the allowed amount.")
  @JsonProperty("overagePrice")
  public BigDecimal getOveragePrice() {
    return overagePrice;
  }
  public void setOveragePrice(BigDecimal overagePrice) {
    this.overagePrice = overagePrice;
  }


  /**
   * The price associated with the item expressed as a decimal.
   **/
  public BillingPlanItem price(BigDecimal price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The price associated with the item expressed as a decimal.")
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  /**
   * The quantity of units.
   **/
  public BillingPlanItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The quantity of units.")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  /**
   * The unit of measure for the wallet.
   **/
  public BillingPlanItem unitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unit of measure for the wallet.")
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
    BillingPlanItem billingPlanItem = (BillingPlanItem) o;

    return Objects.equals(this.itemNumber, billingPlanItem.itemNumber) &&
            Objects.equals(this.name, billingPlanItem.name) &&
            Objects.equals(this.type, billingPlanItem.type) &&
            Objects.equals(this.function, billingPlanItem.function) &&
            Objects.equals(this.description, billingPlanItem.description) &&
            Objects.equals(this.dateChargedThrough, billingPlanItem.dateChargedThrough) &&
            Objects.equals(this.currencyIsoCode, billingPlanItem.currencyIsoCode) &&
            Objects.equals(this.discountAmount, billingPlanItem.discountAmount) &&
            Objects.equals(this.dateEffectiveStart, billingPlanItem.dateEffectiveStart) &&
            Objects.equals(this.dateEffectiveEnd, billingPlanItem.dateEffectiveEnd) &&
            Objects.equals(this.overagePrice, billingPlanItem.overagePrice) &&
            Objects.equals(this.price, billingPlanItem.price) &&
            Objects.equals(this.quantity, billingPlanItem.quantity) &&
            Objects.equals(this.unitOfMeasure, billingPlanItem.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemNumber, name, type, function, description, dateChargedThrough, currencyIsoCode, discountAmount, dateEffectiveStart, dateEffectiveEnd, overagePrice, price, quantity, unitOfMeasure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanItem {\n");
    
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateChargedThrough: ").append(toIndentedString(dateChargedThrough)).append("\n");
    sb.append("    currencyIsoCode: ").append(toIndentedString(currencyIsoCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    dateEffectiveStart: ").append(toIndentedString(dateEffectiveStart)).append("\n");
    sb.append("    dateEffectiveEnd: ").append(toIndentedString(dateEffectiveEnd)).append("\n");
    sb.append("    overagePrice: ").append(toIndentedString(overagePrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

