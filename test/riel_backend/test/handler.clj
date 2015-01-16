(ns riel-backend.test.handler
  (:use clojure.test
        midje.sweet
        ring.mock.request
        riel-backend.handler))

(fact "working home page"
      (let [response (app (request :get "/"))]
        (fact "valid response" (:status response) => 200)
        (fact "valid body" (:body response) => (contains "riel-backend"))))

(fact "invalid route"
      (let [response (app (request :get "/invalid"))]
        (fact "valid response" (:status response) => 404)))
      
