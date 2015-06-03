(defproject lein-ring-bug "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]]
            :profiles {:provided
                       {:dependencies [[munge-tout "0.1.2"]]}}
            :plugins [[lein-ring "0.9.4"]]
            :ring {:handler lein-ring-bug.core/foo}
            :uberjar {:aot :all})
