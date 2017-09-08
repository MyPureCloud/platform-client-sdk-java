package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.HeartBeatAlertNotificationNotificationUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * InteractionStatAlertNotification
 */

public class InteractionStatAlertNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String ruleId = null;

  /**
   * Gets or Sets dimension
   */
  public enum DimensionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUEID("queueId"),
    USERID("userId");

    private String value;

    DimensionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DimensionEnum fromString(String key) {
      if (key == null) return null;

      for (DimensionEnum value : DimensionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DimensionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DimensionEnum dimension = null;
  private String dimensionValue = null;
  private String dimensionValueName = null;

  /**
   * Gets or Sets metric
   */
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TABANDON("tAbandon"),
    TANSWERED("tAnswered"),
    TTALK("tTalk"),
    NOFFERED("nOffered"),
    THANDLE("tHandle"),
    NTRANSFERRED("nTransferred"),
    OSERVICELEVEL("oServiceLevel"),
    TWAIT("tWait"),
    THELD("tHeld"),
    TACW("tAcw");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricEnum fromString(String key) {
      if (key == null) return null;

      for (MetricEnum value : MetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricEnum metric = null;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("voice"),
    CHAT("chat"),
    EMAIL("email"),
    CALLBACK("callback"),
    SMS("sms");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;

  /**
   * Gets or Sets numericRange
   */
  public enum NumericRangeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GT("gt"),
    GTE("gte"),
    LT("lt"),
    LTE("lte"),
    EQ("eq"),
    NE("ne");

    private String value;

    NumericRangeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NumericRangeEnum fromString(String key) {
      if (key == null) return null;

      for (NumericRangeEnum value : NumericRangeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NumericRangeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NumericRangeEnum numericRange = null;

  /**
   * Gets or Sets statistic
   */
  public enum StatisticEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COUNT("count"),
    MIN("min"),
    RATIO("ratio"),
    MAX("max");

    private String value;

    StatisticEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatisticEnum fromString(String key) {
      if (key == null) return null;

      for (StatisticEnum value : StatisticEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatisticEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatisticEnum statistic = null;
  private BigDecimal value = null;
  private Boolean unread = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<HeartBeatAlertNotificationNotificationUsers> notificationUsers = new ArrayList<HeartBeatAlertNotificationNotificationUsers>();

  /**
   * Gets or Sets alertTypes
   */
  public enum AlertTypesEnum {
    SMS("SMS"),
    DEVICE("DEVICE"),
    EMAIL("EMAIL");

    private String value;

    AlertTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlertTypesEnum fromString(String key) {
      if (key == null) return null;

      for (AlertTypesEnum value : AlertTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlertTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<AlertTypesEnum> alertTypes = new ArrayList<AlertTypesEnum>();

  
  /**
   **/
  public InteractionStatAlertNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public InteractionStatAlertNotification name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public InteractionStatAlertNotification ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleId")
  public String getRuleId() {
    return ruleId;
  }
  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  
  /**
   **/
  public InteractionStatAlertNotification dimension(DimensionEnum dimension) {
    this.dimension = dimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dimension")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  
  /**
   **/
  public InteractionStatAlertNotification dimensionValue(String dimensionValue) {
    this.dimensionValue = dimensionValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dimensionValue")
  public String getDimensionValue() {
    return dimensionValue;
  }
  public void setDimensionValue(String dimensionValue) {
    this.dimensionValue = dimensionValue;
  }

  
  /**
   **/
  public InteractionStatAlertNotification dimensionValueName(String dimensionValueName) {
    this.dimensionValueName = dimensionValueName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dimensionValueName")
  public String getDimensionValueName() {
    return dimensionValueName;
  }
  public void setDimensionValueName(String dimensionValueName) {
    this.dimensionValueName = dimensionValueName;
  }

  
  /**
   **/
  public InteractionStatAlertNotification metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  /**
   **/
  public InteractionStatAlertNotification mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   **/
  public InteractionStatAlertNotification numericRange(NumericRangeEnum numericRange) {
    this.numericRange = numericRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numericRange")
  public NumericRangeEnum getNumericRange() {
    return numericRange;
  }
  public void setNumericRange(NumericRangeEnum numericRange) {
    this.numericRange = numericRange;
  }

  
  /**
   **/
  public InteractionStatAlertNotification statistic(StatisticEnum statistic) {
    this.statistic = statistic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statistic")
  public StatisticEnum getStatistic() {
    return statistic;
  }
  public void setStatistic(StatisticEnum statistic) {
    this.statistic = statistic;
  }

  
  /**
   **/
  public InteractionStatAlertNotification value(BigDecimal value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  
  /**
   **/
  public InteractionStatAlertNotification unread(Boolean unread) {
    this.unread = unread;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unread")
  public Boolean getUnread() {
    return unread;
  }
  public void setUnread(Boolean unread) {
    this.unread = unread;
  }

  
  /**
   **/
  public InteractionStatAlertNotification startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  public InteractionStatAlertNotification endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  public InteractionStatAlertNotification notificationUsers(List<HeartBeatAlertNotificationNotificationUsers> notificationUsers) {
    this.notificationUsers = notificationUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notificationUsers")
  public List<HeartBeatAlertNotificationNotificationUsers> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<HeartBeatAlertNotificationNotificationUsers> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  
  /**
   **/
  public InteractionStatAlertNotification alertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertTypes")
  public List<AlertTypesEnum> getAlertTypes() {
    return alertTypes;
  }
  public void setAlertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractionStatAlertNotification interactionStatAlertNotification = (InteractionStatAlertNotification) o;
    return Objects.equals(this.id, interactionStatAlertNotification.id) &&
        Objects.equals(this.name, interactionStatAlertNotification.name) &&
        Objects.equals(this.ruleId, interactionStatAlertNotification.ruleId) &&
        Objects.equals(this.dimension, interactionStatAlertNotification.dimension) &&
        Objects.equals(this.dimensionValue, interactionStatAlertNotification.dimensionValue) &&
        Objects.equals(this.dimensionValueName, interactionStatAlertNotification.dimensionValueName) &&
        Objects.equals(this.metric, interactionStatAlertNotification.metric) &&
        Objects.equals(this.mediaType, interactionStatAlertNotification.mediaType) &&
        Objects.equals(this.numericRange, interactionStatAlertNotification.numericRange) &&
        Objects.equals(this.statistic, interactionStatAlertNotification.statistic) &&
        Objects.equals(this.value, interactionStatAlertNotification.value) &&
        Objects.equals(this.unread, interactionStatAlertNotification.unread) &&
        Objects.equals(this.startDate, interactionStatAlertNotification.startDate) &&
        Objects.equals(this.endDate, interactionStatAlertNotification.endDate) &&
        Objects.equals(this.notificationUsers, interactionStatAlertNotification.notificationUsers) &&
        Objects.equals(this.alertTypes, interactionStatAlertNotification.alertTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ruleId, dimension, dimensionValue, dimensionValueName, metric, mediaType, numericRange, statistic, value, unread, startDate, endDate, notificationUsers, alertTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionStatAlertNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    dimensionValueName: ").append(toIndentedString(dimensionValueName)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    numericRange: ").append(toIndentedString(numericRange)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
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

