(defproject cark/cljs-priority-map "1.2.0"
  :description "ClojureScript priority map implementation based on clojure.data.priority-map"
  :url "https://github.com/cark/cljs-priority-map"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :source-paths ["src/cljs"]
  :plugins [[lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]]
  :cljsbuild {:builds {:test
                       {:source-paths ["test"]
                        :compiler {:output-to "public/test.js"
                                   :optimizations :advanced}
                        :jar false}}
              :test-commands {"phantomjs" ["phantomjs" "public/test.js"]}})
