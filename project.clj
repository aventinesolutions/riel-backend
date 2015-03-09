(defproject riel-backend "0.1.0-SNAPSHOT"
  :description "the backend for Riel"
  :url "http://aventinesolutions.eu"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.2"]
                 [hiccup "1.0.5"]
                 [ring-server "0.4.0"]
                 [liberator "0.12.2"]
                 [com.novemberain/monger "2.1.0"]]
  :plugins [[lein-ring "0.9.2"]]
  :ring {:handler riel-backend.api/app
         :init riel-backend.handler/init
         :destroy riel-backend.handler/destroy}
  :aot :all
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.3.2"] [midje "1.6.3"]]}})
