---
title: AnalyticsMediaEndpointStat
---
## AnalyticsMediaEndpointStat


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **codecs** | <!----><!---->**List&lt;String&gt;**<!----> | The MIME types of the audio encodings used by the audio streams belonging to this endpoint |  [optional] |
| **minMos** | <!----><!---->**Double**<!----> | The lowest estimated average MOS among all the audio streams belonging to this endpoint |  [optional] |
| **minRFactor** | <!----><!---->**Double**<!----> | The lowest R-factor value among all of the audio streams belonging to this endpoint |  [optional] |
| **maxLatencyMs** | <!----><!---->**Long**<!----> | The maximum latency experienced by any audio stream belonging to this endpoint, in milliseconds |  [optional] |
| **receivedPackets** | <!----><!---->**Long**<!----> | The total number of packets received for all audio streams belonging to this endpoint (includes invalid, duplicate, and discarded packets) |  [optional] |
| **invalidPackets** | <!----><!---->**Long**<!----> | The total number of malformed or not RTP packets, unknown payload type, or discarded probation packets for all audio streams belonging to this endpoint |  [optional] |
| **discardedPackets** | <!----><!---->**Long**<!----> | The total number of packets received too late or too early, jitter queue overrun or underrun, for all audio streams belonging to this endpoint |  [optional] |
| **duplicatePackets** | <!----><!---->**Long**<!----> | The total number of packets received with the same sequence number as another one recently received (window of 64 packets), for all audio streams belonging to this endpoint |  [optional] |
| **overrunPackets** | <!----><!---->**Long**<!----> | The total number of packets for which there was no room in the jitter queue when it was received, for all audio streams belonging to this endpoint (also counted in discarded) |  [optional] |
| **underrunPackets** | <!----><!---->**Long**<!----> | The total number of packets received after their timestamp/seqnum has been played out, for all audio streams belonging to this endpoint (also counted in discarded) |  [optional] |
{: class="table table-striped"}



