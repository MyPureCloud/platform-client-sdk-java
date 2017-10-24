Platform API version: 1587


# SDK Changes

* API-2916 - `Map` properties on models are no longer initialized by default. This will cause runtime exceptions if you use `model.getMapProperty().put(key, value)` without first initializing via `model.mapProperty(hashMap)` or `model.setMapProperty(hashMap)`.

# Major Changes (0 changes)


# Minor Changes (0 changes)


# Point Changes (0 changes)
