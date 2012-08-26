(defproject hello-world "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :plugins [[lein-cljsbuild "0.2.6"]]
  :source-path "src/clj"
  :cljsbuild {:builds [{
    :source-path "src/cljs"
    :compiler {
      :output-to "resources/public/hello.js"
      :optimizations :whitespace
      :pretty-print true
    }
  }]})
