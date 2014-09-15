(ns riel-backend.views.layout
  (:require [hiccup.page :refer [html5 include-css]]))

(defn common [& body]
  (html5
    [:head
     [:title "Welcome to riel-backend"]
     (include-css "/css/screen.css")]
    [:body body]))
