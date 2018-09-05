package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ForecastTimeSeriesResult
 */

public class ForecastTimeSeriesResult  implements Serializable {
  

  /**
   * The metric this result applies to
   */
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFFERED("Offered"),
    AVERAGETALKTIMESECONDS("AverageTalkTimeSeconds"),
    AVERAGEAFTERCALLWORKTIMESECONDS("AverageAfterCallWorkTimeSeconds"),
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

  /**
   * The forecasting method that was used for this metric
   */
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

  
  /**
   * The metric this result applies to
   **/
  public ForecastTimeSeriesResult metric(MetricEnum metric) {
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
  public ForecastTimeSeriesResult forecastingMethod(ForecastingMethodEnum forecastingMethod) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastTimeSeriesResult forecastTimeSeriesResult = (ForecastTimeSeriesResult) o;
    return Objects.equals(this.metric, forecastTimeSeriesResult.metric) &&
        Objects.equals(this.forecastingMethod, forecastTimeSeriesResult.forecastingMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, forecastingMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastTimeSeriesResult {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    forecastingMethod: ").append(toIndentedString(forecastingMethod)).append("\n");
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

