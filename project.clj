(defproject blackjack-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.2"]
                 [hiccup "1.0.5"]
                 [ring-server "0.4.0"]]
  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler blackjack-api.handler/app
         :init blackjack-api.handler/init
         :destroy blackjack-api.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.5.1"]]}})
