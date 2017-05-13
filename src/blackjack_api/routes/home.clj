(ns blackjack-api.routes.home
  (:require [compojure.core :refer :all]
            [blackjack-api.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Hello World!"]))

(defroutes home-routes
  (GET "/" [] (home)))
