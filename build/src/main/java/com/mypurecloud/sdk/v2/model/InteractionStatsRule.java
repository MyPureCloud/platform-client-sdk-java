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
import java.util.List;

import java.io.Serializable;
/**
 * InteractionStatsRule
 */

public class InteractionStatsRule  implements Serializable {
  
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
  private Boolean enabled = null;
  private Boolean inAlarm = null;
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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Name of the rule
   **/
  public InteractionStatsRule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the rule")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The dimension of concern.
   **/
  public InteractionStatsRule dimension(DimensionEnum dimension) {
    this.dimension = dimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The dimension of concern.")
  @JsonProperty("dimension")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  
  /**
   * The value of the dimension.
   **/
  public InteractionStatsRule dimensionValue(String dimensionValue) {
    this.dimensionValue = dimensionValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of the dimension.")
  @JsonProperty("dimensionValue")
  public String getDimensionValue() {
    return dimensionValue;
  }
  public void setDimensionValue(String dimensionValue) {
    this.dimensionValue = dimensionValue;
  }

  
  /**
   * The metric to be assessed.
   **/
  public InteractionStatsRule metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metric to be assessed.")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  /**
   * The media type.
   **/
  public InteractionStatsRule mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The media type.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * The comparison descriptor used against the metric's value.
   **/
  public InteractionStatsRule numericRange(NumericRangeEnum numericRange) {
    this.numericRange = numericRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The comparison descriptor used against the metric's value.")
  @JsonProperty("numericRange")
  public NumericRangeEnum getNumericRange() {
    return numericRange;
  }
  public void setNumericRange(NumericRangeEnum numericRange) {
    this.numericRange = numericRange;
  }

  
  /**
   * The statistic of concern for the metric.
   **/
  public InteractionStatsRule statistic(StatisticEnum statistic) {
    this.statistic = statistic;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The statistic of concern for the metric.")
  @JsonProperty("statistic")
  public StatisticEnum getStatistic() {
    return statistic;
  }
  public void setStatistic(StatisticEnum statistic) {
    this.statistic = statistic;
  }

  
  /**
   * The threshold value.
   **/
  public InteractionStatsRule value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The threshold value.")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  
  /**
   * Indicates if the rule is enabled.
   **/
  public InteractionStatsRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if the rule is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates if the rule is in alarm state.")
  @JsonProperty("inAlarm")
  public Boolean getInAlarm() {
    return inAlarm;
  }

  
  /**
   * The ids of users who will be notified of alarm state change.
   **/
  public InteractionStatsRule notificationUsers(List<User> notificationUsers) {
    this.notificationUsers = notificationUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids of users who will be notified of alarm state change.")
  @JsonProperty("notificationUsers")
  public List<User> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<User> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  
  /**
   * A collection of notification methods.
   **/
  public InteractionStatsRule alertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A collection of notification methods.")
  @JsonProperty("alertTypes")
  public List<AlertTypesEnum> getAlertTypes() {
    return alertTypes;
  }
  public void setAlertTypes(List<AlertTypesEnum> alertTypes) {
    this.alertTypes = alertTypes;
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
    InteractionStatsRule interactionStatsRule = (InteractionStatsRule) o;
    return Objects.equals(this.id, interactionStatsRule.id) &&
        Objects.equals(this.name, interactionStatsRule.name) &&
        Objects.equals(this.dimension, interactionStatsRule.dimension) &&
        Objects.equals(this.dimensionValue, interactionStatsRule.dimensionValue) &&
        Objects.equals(this.metric, interactionStatsRule.metric) &&
        Objects.equals(this.mediaType, interactionStatsRule.mediaType) &&
        Objects.equals(this.numericRange, interactionStatsRule.numericRange) &&
        Objects.equals(this.statistic, interactionStatsRule.statistic) &&
        Objects.equals(this.value, interactionStatsRule.value) &&
        Objects.equals(this.enabled, interactionStatsRule.enabled) &&
        Objects.equals(this.inAlarm, interactionStatsRule.inAlarm) &&
        Objects.equals(this.notificationUsers, interactionStatsRule.notificationUsers) &&
        Objects.equals(this.alertTypes, interactionStatsRule.alertTypes) &&
        Objects.equals(this.selfUri, interactionStatsRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dimension, dimensionValue, metric, mediaType, numericRange, statistic, value, enabled, inAlarm, notificationUsers, alertTypes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractionStatsRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    numericRange: ").append(toIndentedString(numericRange)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    notificationUsers: ").append(toIndentedString(notificationUsers)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
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

