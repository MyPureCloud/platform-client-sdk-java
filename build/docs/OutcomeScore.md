---
title: OutcomeScore
---
## OutcomeScore


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outcome** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The outcome that the score was calculated for. |  [optional] |
| **sessionMaxProbability** | <!----><!---->**Float**<!----> | Represents the max probability reached in the session. |  [optional] |
| **probability** | <!----><!---->**Float**<!----> | Represents the likelihood of a customer reaching or achieving a given outcome. |  [optional] |
| **percentile** | <!----><!---->**Integer**<!----> | (Deprecated: use the 'quantile' field instead) Represents the predicted probability's percentile score when compared with all other generated probabilities for a given outcome. |  [optional] |
| **sessionMaxPercentile** | <!----><!---->**Integer**<!----> | (Deprecated: use the 'quantile' field instead) Represents the maximum likelihood percentile score reached for a given outcome by the current session. |  [optional] |
| **quantile** | <!----><!---->**Float**<!----> | Represents the quantity of sessions that have a maximum probability less than the predicted probability. |  [optional] |
| **sessionMaxQuantile** | <!----><!---->**Float**<!----> | Represents the quantity of sessions that have a maximum probability less than the predicted session max probability. |  [optional] |
{: class="table table-striped"}



