(defproject hiccup "2.0.0-alpha1"
  :description "A fast library for rendering HTML in Clojure"
  :url "https://github.com/weavejester/hiccup"
  :license {:name "Eclipse Public License"
            :url "https://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-codox "0.10.2"]]
  :codox
  {:output-path "codox"
   :source-uri  "https://github.com/weavejester/hiccup/blob/{version}/{filepath}#L{line}"
   :namespaces  [#"^hiccup2?\.(?!compiler)"]
   :metadata    {:doc/format :markdown}}
  :aliases {"test-all" ["with-profile" "default:+1.6:+1.7:+1.8" "test"]}
  :profiles
  {:dev {:dependencies [[criterium "0.4.4"]]}
   :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
   :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
   :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
   :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
   :1.10 {:dependencies [[org.clojure/clojure "1.10.0-master-SNAPSHOT"]]}})
