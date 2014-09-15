(ns riel-backend.routes.home
  (:require [compojure.core :refer :all]
            [riel-backend.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Hello World!"]))

(defroutes home-routes
  (GET "/" [] (home)))
