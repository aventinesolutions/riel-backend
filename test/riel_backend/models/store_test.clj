(ns riel-backend.models.store-test
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:use midje.sweet)
  (:use [riel-backend.models.store]))

(fact "run the database smoketest, loading global exercises if necessary"
      ((smoketest)(get-global-exercises db)) =not=> #(empty? %))


