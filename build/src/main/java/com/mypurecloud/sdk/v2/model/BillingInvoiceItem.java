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
import com.mypurecloud.sdk.v2.model.BillingProduct;
import com.mypurecloud.sdk.v2.model.NamedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BillingInvoiceItem
 */

public class BillingInvoiceItem  implements Serializable {
  
  private String id = null;
  private BillingProduct product = null;
  private String description = null;
  private LocalDate dateTransacted = null;
  private LocalDate dateStart = null;
  private LocalDate dateEnd = null;
  private NamedEntity organization = null;
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
   * Unit of Measure.
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
  private BigDecimal amount = null;

  public BillingInvoiceItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Represents the details of a product.
   **/
  public BillingInvoiceItem product(BillingProduct product) {
    this.product = product;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the details of a product.")
  @JsonProperty("product")
  public BillingProduct getProduct() {
    return product;
  }
  public void setProduct(BillingProduct product) {
    this.product = product;
  }


  /**
   * Line Item Description.
   **/
  public BillingInvoiceItem description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Line Item Description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Invoice transaction date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingInvoiceItem dateTransacted(LocalDate dateTransacted) {
    this.dateTransacted = dateTransacted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Invoice transaction date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateTransacted")
  public LocalDate getDateTransacted() {
    return dateTransacted;
  }
  public void setDateTransacted(LocalDate dateTransacted) {
    this.dateTransacted = dateTransacted;
  }


  /**
   * Invoice start date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingInvoiceItem dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Invoice start date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * Invoice end date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BillingInvoiceItem dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Invoice end date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * A Genesys Cloud Organization.
   **/
  public BillingInvoiceItem organization(NamedEntity organization) {
    this.organization = organization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Genesys Cloud Organization.")
  @JsonProperty("organization")
  public NamedEntity getOrganization() {
    return organization;
  }
  public void setOrganization(NamedEntity organization) {
    this.organization = organization;
  }


  /**
   * Quantity of the item.
   **/
  public BillingInvoiceItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantity of the item.")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  /**
   * Unit of Measure.
   **/
  public BillingInvoiceItem unitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unit of Measure.")
  @JsonProperty("unitOfMeasure")
  public UnitOfMeasureEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }
  public void setUnitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  /**
   * Amount.
   **/
  public BillingInvoiceItem amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount.")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingInvoiceItem billingInvoiceItem = (BillingInvoiceItem) o;

    return Objects.equals(this.id, billingInvoiceItem.id) &&
            Objects.equals(this.product, billingInvoiceItem.product) &&
            Objects.equals(this.description, billingInvoiceItem.description) &&
            Objects.equals(this.dateTransacted, billingInvoiceItem.dateTransacted) &&
            Objects.equals(this.dateStart, billingInvoiceItem.dateStart) &&
            Objects.equals(this.dateEnd, billingInvoiceItem.dateEnd) &&
            Objects.equals(this.organization, billingInvoiceItem.organization) &&
            Objects.equals(this.quantity, billingInvoiceItem.quantity) &&
            Objects.equals(this.unitOfMeasure, billingInvoiceItem.unitOfMeasure) &&
            Objects.equals(this.amount, billingInvoiceItem.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, product, description, dateTransacted, dateStart, dateEnd, organization, quantity, unitOfMeasure, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoiceItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateTransacted: ").append(toIndentedString(dateTransacted)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

