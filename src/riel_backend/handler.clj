(ns riel-backend.handler
  (:require [compojure.core :refer [defroutes routes]]
            [ring.middleware.resource :refer [wrap-resource]]
            [ring.middleware.file-info :refer [wrap-file-info]]
            [hiccup.middleware :refer [wrap-base-url]]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [riel-backend.routes.home :refer [home-routes]]
            [riel-backend.models.store :as store]))


(defn init []
  (println "riel-backend is starting")
  (println (store/smoketest)))

(defn destroy []
  (println "riel-backend is shutting down"))

(defroutes app-routes
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (routes home-routes app-routes)
      (handler/site)
      (wrap-base-url)))
