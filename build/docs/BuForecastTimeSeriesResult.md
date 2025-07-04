# BuForecastTimeSeriesResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The metric this result applies to |  [optional] |
| **forecastingMethod** | [**ForecastingMethodEnum**](#Enum--ForecastingMethodEnum) | The forecasting method that was used for this metric |  [optional] |
| **forecastType** | [**ForecastTypeEnum**](#Enum--ForecastTypeEnum) | The forecasting type in this forecast result |  [optional] |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFERED | &quot;Offered&quot; | 
| AVERAGEHANDLETIMESECONDS | &quot;AverageHandleTimeSeconds&quot; | 


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
| THETA | &quot;Theta&quot; | 
| ENSEMBLE | &quot;Ensemble&quot; | 
| OTHER | &quot;Other&quot; | 


## Enum: ForecastTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LONGTERM | &quot;LongTerm&quot; | 
| SHORTTERM | &quot;ShortTerm&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
