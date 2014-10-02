(ns riel-backend.models.store
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(def conn (mg/connect { :host "localhost" }))
(def db (mg/get-db conn "riel"))

(defn get-global-exercises [db]
  (last (map (fn [doc] (if (get doc :exercises)
                     (get doc :exercises))) (mc/find-maps db "global"))))

(defn smoketest []
  (if (not (get-global-exercises db))
    ((println "global exercises document not found")
     '(use riel-backend.models.data.global-exercises :verbose)
     '(riel-backend.models.data/insert-global-exercises db)
     (println "initialized global exercises document"))))
