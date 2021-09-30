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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * InteractionStatsAlert
 */

public class InteractionStatsAlert  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class DimensionEnumDeserializer extends StdDeserializer<DimensionEnum> {
    public DimensionEnumDeserializer() {
      super(DimensionEnumDeserializer.class);
    }

    @Override
    public DimensionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DimensionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The dimension of concern.
   */
 @JsonDeserialize(using = DimensionEnumDeserializer.class)
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

  private static class MetricEnumDeserializer extends StdDeserializer<MetricEnum> {
    public MetricEnumDeserializer() {
      super(MetricEnumDeserializer.class);
    }

    @Override
    public MetricEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The metric to be assessed.
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
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

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The media type.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("voice"),
    CHAT("chat"),
    EMAIL("email"),
    CALLBACK("callback"),
    MESSAGE("message");

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

  private static class NumericRangeEnumDeserializer extends StdDeserializer<NumericRangeEnum> {
    public NumericRangeEnumDeserializer() {
      super(NumericRangeEnumDeserializer.class);
    }

    @Override
    public NumericRangeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NumericRangeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The comparison descriptor used against the metric's value.
   */
 @JsonDeserialize(using = NumericRangeEnumDeserializer.class)
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

  private static class StatisticEnumDeserializer extends StdDeserializer<StatisticEnum> {
    public StatisticEnumDeserializer() {
      super(StatisticEnumDeserializer.class);
    }

    @Override
    public StatisticEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatisticEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The statistic of concern for the metric.
   */
 @JsonDeserialize(using = StatisticEnumDeserializer.class)
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
  private Double value = null;
  private String ruleId = null;
  private Boolean unread = null;
  private Date startDate = null;
  private Date endDate = null;
  private List<User> notificationUsers = new ArrayList<User>();

  private static class AlertTypesEnumDeserializer extends StdDeserializer<AlertTypesEnum> {
    public AlertTypesEnumDeserializer() {
      super(AlertTypesEnumDeserializer.class);
    }

    @Override
    public AlertTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlertTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets alertTypes
   */
 @JsonDeserialize(using = AlertTypesEnumDeserializer.class)
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
  private String ruleUri = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Name of the rule that generated the alert")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The dimension of concern.")
  @JsonProperty("dimension")
  public DimensionEnum getDimension() {
    return dimension;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The value of the dimension.")
  @JsonProperty("dimensionValue")
  public String getDimensionValue() {
    return dimensionValue;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The metric to be assessed.")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The media type.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The comparison descriptor used against the metric's value.")
  @JsonProperty("numericRange")
  public NumericRangeEnum getNumericRange() {
    return numericRange;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The statistic of concern for the metric.")
  @JsonProperty("statistic")
  public StatisticEnum getStatistic() {
    return statistic;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The threshold value.")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The id of the rule.")
  @JsonProperty("ruleId")
  public String getRuleId() {
    return ruleId;
  }

  
  /**
   * Indicates if the alert has been read.
   **/
  public InteractionStatsAlert unread(Boolean unread) {
    this.unread = unread;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if the alert has been read.")
  @JsonProperty("unread")
  public Boolean getUnread() {
    return unread;
  }
  public void setUnread(Boolean unread) {
    this.unread = unread;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The date/time the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  
  @ApiModelProperty(example = "null", value = "The date/time the owning rule exiting in alarm status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The ids of users who were notified of alarm state change.")
  @JsonProperty("notificationUsers")
  public List<User> getNotificationUsers() {
    return notificationUsers;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "A collection of notification methods.")
  @JsonProperty("alertTypes")
  public List<AlertTypesEnum> getAlertTypes() {
    return alertTypes;
  }

  
  /**
   **/
  public InteractionStatsAlert ruleUri(String ruleUri) {
    this.ruleUri = ruleUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleUri")
  public String getRuleUri() {
    return ruleUri;
  }
  public void setRuleUri(String ruleUri) {
    this.ruleUri = ruleUri;
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
    InteractionStatsAlert interactionStatsAlert = (InteractionStatsAlert) o;
    return Objects.equals(this.id, interactionStatsAlert.id) &&
        Objects.equals(this.name, interactionStatsAlert.name) &&
        Objects.equals(this.dimension, interactionStatsAlert.dimension) &&
        Objects.equals(this.dimensionValue, interactionStatsAlert.dimensionValue) &&
        Objects.equals(this.metric, interactionStatsAlert.metric) &&
        Objects.equals(this.mediaType, interactionStatsAlert.mediaType) &&
        Objects.equals(this.numericRange, interactionStatsAlert.numericRange) &&
        Objects.equals(this.statistic, interactionStatsAlert.statistic) &&
        Objects.equals(this.value, interactionStatsAlert.value) &&
        Objects.equals(this.ruleId, interactionStatsAlert.ruleId) &&
        Objects.equals(this.unread, interactionStatsAlert.unread) &&
        Objects.equals(this.startDate, interactionStatsAlert.startDate) &&
        Objects.equals(this.endDate, interactionStatsAlert.endDate) &&
        Objects.equals(this.notificationUsers, interactionStatsAlert.notificationUsers) &&
        Objects.equals(this.alertTypes, interactionStatsAlert.alertTypes) &&
        Objects.equals(this.ruleUri, interactionStatsAlert.ruleUri) &&
        Objects.equals(this.selfUri, interactionStatsAlert.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dimension, dimensionValue, metric, mediaType, numericRange, statistic, value, ruleId, unread, startDate, endDate, notificationUsers, alertTypes, ruleUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionStatsAlert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    numericRange: ").append(toIndentedString(numericRange)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
    sb.append("    ruleUri: ").append(toIndentedString(ruleUri)).append("\n");
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

