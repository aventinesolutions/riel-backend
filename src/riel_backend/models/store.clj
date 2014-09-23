(ns riel-backend.models.store
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(def conn (mg/connect { :host "localhost" }))
(def db (mg/get-db conn "riel"))

(defn smoketest []
  (println (mc/find-maps db "test")) 
  (if (empty (mc/find-maps db "global-exercises"))
    ((println "global exercises document not found")
     (use 'riel-backend.models.global-exercises :reload :verbose)
     (mc/insert db "global-exercises" 'global-exercises)
     (println "initialized global exercises document"))))
