(defproject riel-backend "0.1.0-SNAPSHOT"
  :description "the backend for Riel"
  :url "http://aventinesolutions.eu"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]
                 [ring-server "0.3.1"]
                 [com.novemberain/monger "2.0.0"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler riel-backend.handler/app
         :init riel-backend.handler/init
         :destroy riel-backend.handler/destroy}
  :aot :all
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.2.1"] [midje "1.5.1"]]}})
