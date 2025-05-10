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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BillingWallet
 */

public class BillingWallet  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<NamedEntity> organizations = null;
  private BillingProduct product = null;
  private BigDecimal startingBalance = null;
  private BigDecimal endingBalance = null;
  private BigDecimal balanceIncrease = null;
  private BigDecimal balanceDecrease = null;
  private BigDecimal balanceConsumption = null;
  private BigDecimal balanceOverage = null;
  private BigDecimal balanceOverageRate = null;
  private BigDecimal balanceOverageCharge = null;
  private String balanceOverageCurrency = null;

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

  public BillingWallet() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      organizations = new ArrayList<NamedEntity>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The name of the object.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  /**
   * A Genesys Cloud Organization and it's related plans.
   **/
  public BillingWallet organizations(List<NamedEntity> organizations) {
    this.organizations = organizations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Genesys Cloud Organization and it's related plans.")
  @JsonProperty("organizations")
  public List<NamedEntity> getOrganizations() {
    return organizations;
  }
  public void setOrganizations(List<NamedEntity> organizations) {
    this.organizations = organizations;
  }


  /**
   * Represents the details of a product.
   **/
  public BillingWallet product(BillingProduct product) {
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
   * The initial balance in the wallet.
   **/
  public BillingWallet startingBalance(BigDecimal startingBalance) {
    this.startingBalance = startingBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The initial balance in the wallet.")
  @JsonProperty("startingBalance")
  public BigDecimal getStartingBalance() {
    return startingBalance;
  }
  public void setStartingBalance(BigDecimal startingBalance) {
    this.startingBalance = startingBalance;
  }


  /**
   * The final balance in the wallet after transactions.
   **/
  public BillingWallet endingBalance(BigDecimal endingBalance) {
    this.endingBalance = endingBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The final balance in the wallet after transactions.")
  @JsonProperty("endingBalance")
  public BigDecimal getEndingBalance() {
    return endingBalance;
  }
  public void setEndingBalance(BigDecimal endingBalance) {
    this.endingBalance = endingBalance;
  }


  /**
   * Total amount added to the wallet.
   **/
  public BillingWallet balanceIncrease(BigDecimal balanceIncrease) {
    this.balanceIncrease = balanceIncrease;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total amount added to the wallet.")
  @JsonProperty("balanceIncrease")
  public BigDecimal getBalanceIncrease() {
    return balanceIncrease;
  }
  public void setBalanceIncrease(BigDecimal balanceIncrease) {
    this.balanceIncrease = balanceIncrease;
  }


  /**
   * The amount removed from the wallet due to a contract change.
   **/
  public BillingWallet balanceDecrease(BigDecimal balanceDecrease) {
    this.balanceDecrease = balanceDecrease;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount removed from the wallet due to a contract change.")
  @JsonProperty("balanceDecrease")
  public BigDecimal getBalanceDecrease() {
    return balanceDecrease;
  }
  public void setBalanceDecrease(BigDecimal balanceDecrease) {
    this.balanceDecrease = balanceDecrease;
  }


  /**
   * Total consumption deducted from the wallet.
   **/
  public BillingWallet balanceConsumption(BigDecimal balanceConsumption) {
    this.balanceConsumption = balanceConsumption;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total consumption deducted from the wallet.")
  @JsonProperty("balanceConsumption")
  public BigDecimal getBalanceConsumption() {
    return balanceConsumption;
  }
  public void setBalanceConsumption(BigDecimal balanceConsumption) {
    this.balanceConsumption = balanceConsumption;
  }


  /**
   * The amount exceeding a predefined balance threshold.
   **/
  public BillingWallet balanceOverage(BigDecimal balanceOverage) {
    this.balanceOverage = balanceOverage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount exceeding a predefined balance threshold.")
  @JsonProperty("balanceOverage")
  public BigDecimal getBalanceOverage() {
    return balanceOverage;
  }
  public void setBalanceOverage(BigDecimal balanceOverage) {
    this.balanceOverage = balanceOverage;
  }


  /**
   * The rate charged for an overage..
   **/
  public BillingWallet balanceOverageRate(BigDecimal balanceOverageRate) {
    this.balanceOverageRate = balanceOverageRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The rate charged for an overage..")
  @JsonProperty("balanceOverageRate")
  public BigDecimal getBalanceOverageRate() {
    return balanceOverageRate;
  }
  public void setBalanceOverageRate(BigDecimal balanceOverageRate) {
    this.balanceOverageRate = balanceOverageRate;
  }


  /**
   * The amount to be charged.
   **/
  public BillingWallet balanceOverageCharge(BigDecimal balanceOverageCharge) {
    this.balanceOverageCharge = balanceOverageCharge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount to be charged.")
  @JsonProperty("balanceOverageCharge")
  public BigDecimal getBalanceOverageCharge() {
    return balanceOverageCharge;
  }
  public void setBalanceOverageCharge(BigDecimal balanceOverageCharge) {
    this.balanceOverageCharge = balanceOverageCharge;
  }


  /**
   * The currency in which the overage charge is invoiced.
   **/
  public BillingWallet balanceOverageCurrency(String balanceOverageCurrency) {
    this.balanceOverageCurrency = balanceOverageCurrency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The currency in which the overage charge is invoiced.")
  @JsonProperty("balanceOverageCurrency")
  public String getBalanceOverageCurrency() {
    return balanceOverageCurrency;
  }
  public void setBalanceOverageCurrency(String balanceOverageCurrency) {
    this.balanceOverageCurrency = balanceOverageCurrency;
  }


  /**
   * The unit of measure for the wallet.
   **/
  public BillingWallet unitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
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
    BillingWallet billingWallet = (BillingWallet) o;

    return Objects.equals(this.id, billingWallet.id) &&
            Objects.equals(this.name, billingWallet.name) &&
            Objects.equals(this.organizations, billingWallet.organizations) &&
            Objects.equals(this.product, billingWallet.product) &&
            Objects.equals(this.startingBalance, billingWallet.startingBalance) &&
            Objects.equals(this.endingBalance, billingWallet.endingBalance) &&
            Objects.equals(this.balanceIncrease, billingWallet.balanceIncrease) &&
            Objects.equals(this.balanceDecrease, billingWallet.balanceDecrease) &&
            Objects.equals(this.balanceConsumption, billingWallet.balanceConsumption) &&
            Objects.equals(this.balanceOverage, billingWallet.balanceOverage) &&
            Objects.equals(this.balanceOverageRate, billingWallet.balanceOverageRate) &&
            Objects.equals(this.balanceOverageCharge, billingWallet.balanceOverageCharge) &&
            Objects.equals(this.balanceOverageCurrency, billingWallet.balanceOverageCurrency) &&
            Objects.equals(this.unitOfMeasure, billingWallet.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, organizations, product, startingBalance, endingBalance, balanceIncrease, balanceDecrease, balanceConsumption, balanceOverage, balanceOverageRate, balanceOverageCharge, balanceOverageCurrency, unitOfMeasure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingWallet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    startingBalance: ").append(toIndentedString(startingBalance)).append("\n");
    sb.append("    endingBalance: ").append(toIndentedString(endingBalance)).append("\n");
    sb.append("    balanceIncrease: ").append(toIndentedString(balanceIncrease)).append("\n");
    sb.append("    balanceDecrease: ").append(toIndentedString(balanceDecrease)).append("\n");
    sb.append("    balanceConsumption: ").append(toIndentedString(balanceConsumption)).append("\n");
    sb.append("    balanceOverage: ").append(toIndentedString(balanceOverage)).append("\n");
    sb.append("    balanceOverageRate: ").append(toIndentedString(balanceOverageRate)).append("\n");
    sb.append("    balanceOverageCharge: ").append(toIndentedString(balanceOverageCharge)).append("\n");
    sb.append("    balanceOverageCurrency: ").append(toIndentedString(balanceOverageCurrency)).append("\n");
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

