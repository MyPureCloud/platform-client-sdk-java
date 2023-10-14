---
title: ActionMapEstimateOutcomeCriteria
---
## ActionMapEstimateOutcomeCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outcomeId** | <!----><!---->**String**<!----> | ID of outcome. |  |
| **maxProbability** | <!----><!---->**Float**<!----> | Probability value for the selected outcome at or above which the action map will trigger. |  [optional] |
| **probability** | <!----><!---->**Float**<!----> | Additional probability condition, where if set, the action map will trigger if the current outcome probability is lower or equal to the value. |  [optional] |
| **quantile** | <!----><!---->**Float**<!----> | Represents the quantity of sessions that have a maximum probability less than the predicted probability. |  [optional] |
| **maxQuantile** | <!----><!---->**Float**<!----> | Represents the quantity of sessions that have a maximum probability less than the predicted session max probability. |  [optional] |
{: class="table table-striped"}



