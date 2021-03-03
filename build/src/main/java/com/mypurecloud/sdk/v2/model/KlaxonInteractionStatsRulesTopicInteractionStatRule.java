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
import com.mypurecloud.sdk.v2.model.KlaxonInteractionStatsRulesTopicNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KlaxonInteractionStatsRulesTopicInteractionStatRule
 */

public class KlaxonInteractionStatsRulesTopicInteractionStatRule  implements Serializable {
  
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
   * Gets or Sets dimension
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
  private String dimensionValueName = null;

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
   * Gets or Sets metric
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
   * Gets or Sets mediaType
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
   * Gets or Sets numericRange
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
   * Gets or Sets statistic
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
  private BigDecimal value = null;
  private Boolean inAlarm = null;
  private Boolean enabled = null;
  private List<KlaxonInteractionStatsRulesTopicNotificationUser> notificationUsers = new ArrayList<KlaxonInteractionStatsRulesTopicNotificationUser>();

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

  
  /**
   **/
  public KlaxonInteractionStatsRulesTopicInteractionStatRule id(String id) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule name(String name) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule dimension(DimensionEnum dimension) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule dimensionValue(String dimensionValue) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule dimensionValueName(String dimensionValueName) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule metric(MetricEnum metric) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule mediaType(MediaTypeEnum mediaType) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule numericRange(NumericRangeEnum numericRange) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule statistic(StatisticEnum statistic) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule value(BigDecimal value) {
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
  public KlaxonInteractionStatsRulesTopicInteractionStatRule inAlarm(Boolean inAlarm) {
    this.inAlarm = inAlarm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inAlarm")
  public Boolean getInAlarm() {
    return inAlarm;
  }
  public void setInAlarm(Boolean inAlarm) {
    this.inAlarm = inAlarm;
  }

  
  /**
   **/
  public KlaxonInteractionStatsRulesTopicInteractionStatRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  public KlaxonInteractionStatsRulesTopicInteractionStatRule notificationUsers(List<KlaxonInteractionStatsRulesTopicNotificationUser> notificationUsers) {
    this.notificationUsers = notificationUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notificationUsers")
  public List<KlaxonInteractionStatsRulesTopicNotificationUser> getNotificationUsers() {
    return notificationUsers;
  }
  public void setNotificationUsers(List<KlaxonInteractionStatsRulesTopicNotificationUser> notificationUsers) {
    this.notificationUsers = notificationUsers;
  }

  
  /**
   **/
  public KlaxonInteractionStatsRulesTopicInteractionStatRule alertTypes(List<AlertTypesEnum> alertTypes) {
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
    KlaxonInteractionStatsRulesTopicInteractionStatRule klaxonInteractionStatsRulesTopicInteractionStatRule = (KlaxonInteractionStatsRulesTopicInteractionStatRule) o;
    return Objects.equals(this.id, klaxonInteractionStatsRulesTopicInteractionStatRule.id) &&
        Objects.equals(this.name, klaxonInteractionStatsRulesTopicInteractionStatRule.name) &&
        Objects.equals(this.dimension, klaxonInteractionStatsRulesTopicInteractionStatRule.dimension) &&
        Objects.equals(this.dimensionValue, klaxonInteractionStatsRulesTopicInteractionStatRule.dimensionValue) &&
        Objects.equals(this.dimensionValueName, klaxonInteractionStatsRulesTopicInteractionStatRule.dimensionValueName) &&
        Objects.equals(this.metric, klaxonInteractionStatsRulesTopicInteractionStatRule.metric) &&
        Objects.equals(this.mediaType, klaxonInteractionStatsRulesTopicInteractionStatRule.mediaType) &&
        Objects.equals(this.numericRange, klaxonInteractionStatsRulesTopicInteractionStatRule.numericRange) &&
        Objects.equals(this.statistic, klaxonInteractionStatsRulesTopicInteractionStatRule.statistic) &&
        Objects.equals(this.value, klaxonInteractionStatsRulesTopicInteractionStatRule.value) &&
        Objects.equals(this.inAlarm, klaxonInteractionStatsRulesTopicInteractionStatRule.inAlarm) &&
        Objects.equals(this.enabled, klaxonInteractionStatsRulesTopicInteractionStatRule.enabled) &&
        Objects.equals(this.notificationUsers, klaxonInteractionStatsRulesTopicInteractionStatRule.notificationUsers) &&
        Objects.equals(this.alertTypes, klaxonInteractionStatsRulesTopicInteractionStatRule.alertTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dimension, dimensionValue, dimensionValueName, metric, mediaType, numericRange, statistic, value, inAlarm, enabled, notificationUsers, alertTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KlaxonInteractionStatsRulesTopicInteractionStatRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
    sb.append("    dimensionValueName: ").append(toIndentedString(dimensionValueName)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    numericRange: ").append(toIndentedString(numericRange)).append("\n");
    sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    inAlarm: ").append(toIndentedString(inAlarm)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

