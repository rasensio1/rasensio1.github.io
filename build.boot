(set-env!
  :source-paths #{"src" "content"}
  :dependencies '[[perun "0.4.2-SNAPSHOT" :scope "test"]
                  [pandeiro/boot-http "0.8.3" :exclusions [org.clojure/clojure]]
                  [hiccup "1.0.5" :exclusions [org.clojure/clojure]]])

(require '[io.perun :as perun]
         '[pandeiro.boot-http :refer [serve]])
