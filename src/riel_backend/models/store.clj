(ns riel-backend.models.store
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(def conn (mg/connect { :host "localhost" }))
(def db (mg/get-db conn "riel"))
(defn smoketest [] (mc/find-maps db "test"))


