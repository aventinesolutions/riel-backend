(ns riel_backend.models.store
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(let [conn (mg/connect) db (mg/get-db conn "riel")])
