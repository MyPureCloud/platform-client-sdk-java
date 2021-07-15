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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuForecastTimeSeriesResult
 */

public class BuForecastTimeSeriesResult  implements Serializable {
  

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
   * The metric this result applies to
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFFERED("Offered"),
    AVERAGEHANDLETIMESECONDS("AverageHandleTimeSeconds");

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

  private static class ForecastingMethodEnumDeserializer extends StdDeserializer<ForecastingMethodEnum> {
    public ForecastingMethodEnumDeserializer() {
      super(ForecastingMethodEnumDeserializer.class);
    }

    @Override
    public ForecastingMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ForecastingMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The forecasting method that was used for this metric
   */
 @JsonDeserialize(using = ForecastingMethodEnumDeserializer.class)
  public enum ForecastingMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AUTOREGRESSIVEINTEGRATEDMOVINGAVERAGE("AutoRegressiveIntegratedMovingAverage"),
    MOVINGAVERAGE("MovingAverage"),
    SINGLEEXPONENTIALSMOOTHING("SingleExponentialSmoothing"),
    RANDOMWALK("RandomWalk"),
    DECOMPOSITIONUSINGADDITIVESEASONALITY("DecompositionUsingAdditiveSeasonality"),
    DECOMPOSITIONUSINGMULTIPLICATIVESEASONALITY("DecompositionUsingMultiplicativeSeasonality"),
    HOLTWINTERSADDITIVESEASONALITY("HoltWintersAdditiveSeasonality"),
    HOLTWINTERSADDITIVESEASONALITYWITHDAMPEDTREND("HoltWintersAdditiveSeasonalityWithDampedTrend"),
    HOLTWINTERSMULTIPLICATIVESEASONALITY("HoltWintersMultiplicativeSeasonality"),
    HOLTWINTERSMULTIPLICATIVESEASONALITYWITHDAMPEDTREND("HoltWintersMultiplicativeSeasonalityWithDampedTrend"),
    DAMPEDLINEAREXPONENTIALSMOOTHING("DampedLinearExponentialSmoothing"),
    DOUBLEEXPONENTIALSMOOTHING("DoubleExponentialSmoothing"),
    DOUBLEMOVINGAVERAGE("DoubleMovingAverage"),
    LINEAREXPONENTIALSMOOTHING("LinearExponentialSmoothing"),
    LINEARWEIGHTEDMOVINGAVERAGE("LinearWeightedMovingAverage"),
    POINTESTIMATEUSINGDAMPEDLINEAREXPONENTIALSMOOTHING("PointEstimateUsingDampedLinearExponentialSmoothing"),
    POINTESTIMATEUSINGDOUBLEEXPONENTIALSMOOTHING("PointEstimateUsingDoubleExponentialSmoothing"),
    POINTESTIMATEUSINGLATESTWEEK("PointEstimateUsingLatestWeek"),
    POINTESTIMATEUSINGLINEAREXPONENTIALSMOOTHING("PointEstimateUsingLinearExponentialSmoothing"),
    POINTESTIMATEUSINGWEIGHTEDAVERAGE("PointEstimateUsingWeightedAverage"),
    CURVEFIT("CurveFit"),
    MULTILINEARREGRESSION("MultiLinearRegression"),
    DYNAMICHARMONICREGRESSION("DynamicHarmonicRegression"),
    THETA("Theta"),
    ENSEMBLE("Ensemble"),
    OTHER("Other");

    private String value;

    ForecastingMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ForecastingMethodEnum fromString(String key) {
      if (key == null) return null;

      for (ForecastingMethodEnum value : ForecastingMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ForecastingMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ForecastingMethodEnum forecastingMethod = null;

  private static class ForecastTypeEnumDeserializer extends StdDeserializer<ForecastTypeEnum> {
    public ForecastTypeEnumDeserializer() {
      super(ForecastTypeEnumDeserializer.class);
    }

    @Override
    public ForecastTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ForecastTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The forecasting type in this forecast result
   */
 @JsonDeserialize(using = ForecastTypeEnumDeserializer.class)
  public enum ForecastTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LONGTERM("LongTerm"),
    SHORTTERM("ShortTerm");

    private String value;

    ForecastTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ForecastTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ForecastTypeEnum value : ForecastTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ForecastTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ForecastTypeEnum forecastType = null;

  
  /**
   * The metric this result applies to
   **/
  public BuForecastTimeSeriesResult metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metric this result applies to")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  /**
   * The forecasting method that was used for this metric
   **/
  public BuForecastTimeSeriesResult forecastingMethod(ForecastingMethodEnum forecastingMethod) {
    this.forecastingMethod = forecastingMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The forecasting method that was used for this metric")
  @JsonProperty("forecastingMethod")
  public ForecastingMethodEnum getForecastingMethod() {
    return forecastingMethod;
  }
  public void setForecastingMethod(ForecastingMethodEnum forecastingMethod) {
    this.forecastingMethod = forecastingMethod;
  }

  
  /**
   * The forecasting type in this forecast result
   **/
  public BuForecastTimeSeriesResult forecastType(ForecastTypeEnum forecastType) {
    this.forecastType = forecastType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The forecasting type in this forecast result")
  @JsonProperty("forecastType")
  public ForecastTypeEnum getForecastType() {
    return forecastType;
  }
  public void setForecastType(ForecastTypeEnum forecastType) {
    this.forecastType = forecastType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuForecastTimeSeriesResult buForecastTimeSeriesResult = (BuForecastTimeSeriesResult) o;
    return Objects.equals(this.metric, buForecastTimeSeriesResult.metric) &&
        Objects.equals(this.forecastingMethod, buForecastTimeSeriesResult.forecastingMethod) &&
        Objects.equals(this.forecastType, buForecastTimeSeriesResult.forecastType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, forecastingMethod, forecastType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuForecastTimeSeriesResult {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    forecastingMethod: ").append(toIndentedString(forecastingMethod)).append("\n");
    sb.append("    forecastType: ").append(toIndentedString(forecastType)).append("\n");
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

