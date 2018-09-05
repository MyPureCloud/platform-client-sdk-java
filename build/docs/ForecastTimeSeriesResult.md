---
title: ForecastTimeSeriesResult
---
## ForecastTimeSeriesResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#MetricEnum) | The metric this result applies to |  [optional] |
| **forecastingMethod** | [**ForecastingMethodEnum**](#ForecastingMethodEnum) | The forecasting method that was used for this metric |  [optional] |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OFFERED | &quot;Offered&quot; |
| AVERAGETALKTIMESECONDS | &quot;AverageTalkTimeSeconds&quot; |
| AVERAGEAFTERCALLWORKTIMESECONDS | &quot;AverageAfterCallWorkTimeSeconds&quot; |
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; |
{: class="table table-striped"}


<a name="ForecastingMethodEnum"></a>

## Enum: ForecastingMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AUTOREGRESSIVEINTEGRATEDMOVINGAVERAGE | &quot;AutoRegressiveIntegratedMovingAverage&quot; |
| MOVINGAVERAGE | &quot;MovingAverage&quot; |
| SINGLEEXPONENTIALSMOOTHING | &quot;SingleExponentialSmoothing&quot; |
| RANDOMWALK | &quot;RandomWalk&quot; |
| DECOMPOSITIONUSINGADDITIVESEASONALITY | &quot;DecompositionUsingAdditiveSeasonality&quot; |
| DECOMPOSITIONUSINGMULTIPLICATIVESEASONALITY | &quot;DecompositionUsingMultiplicativeSeasonality&quot; |
| HOLTWINTERSADDITIVESEASONALITY | &quot;HoltWintersAdditiveSeasonality&quot; |
| HOLTWINTERSADDITIVESEASONALITYWITHDAMPEDTREND | &quot;HoltWintersAdditiveSeasonalityWithDampedTrend&quot; |
| HOLTWINTERSMULTIPLICATIVESEASONALITY | &quot;HoltWintersMultiplicativeSeasonality&quot; |
| HOLTWINTERSMULTIPLICATIVESEASONALITYWITHDAMPEDTREND | &quot;HoltWintersMultiplicativeSeasonalityWithDampedTrend&quot; |
| DAMPEDLINEAREXPONENTIALSMOOTHING | &quot;DampedLinearExponentialSmoothing&quot; |
| DOUBLEEXPONENTIALSMOOTHING | &quot;DoubleExponentialSmoothing&quot; |
| DOUBLEMOVINGAVERAGE | &quot;DoubleMovingAverage&quot; |
| LINEAREXPONENTIALSMOOTHING | &quot;LinearExponentialSmoothing&quot; |
| LINEARWEIGHTEDMOVINGAVERAGE | &quot;LinearWeightedMovingAverage&quot; |
| POINTESTIMATEUSINGDAMPEDLINEAREXPONENTIALSMOOTHING | &quot;PointEstimateUsingDampedLinearExponentialSmoothing&quot; |
| POINTESTIMATEUSINGDOUBLEEXPONENTIALSMOOTHING | &quot;PointEstimateUsingDoubleExponentialSmoothing&quot; |
| POINTESTIMATEUSINGLATESTWEEK | &quot;PointEstimateUsingLatestWeek&quot; |
| POINTESTIMATEUSINGLINEAREXPONENTIALSMOOTHING | &quot;PointEstimateUsingLinearExponentialSmoothing&quot; |
| POINTESTIMATEUSINGWEIGHTEDAVERAGE | &quot;PointEstimateUsingWeightedAverage&quot; |
| CURVEFIT | &quot;CurveFit&quot; |
| MULTILINEARREGRESSION | &quot;MultiLinearRegression&quot; |
| DYNAMICHARMONICREGRESSION | &quot;DynamicHarmonicRegression&quot; |
| OTHER | &quot;Other&quot; |
{: class="table table-striped"}



