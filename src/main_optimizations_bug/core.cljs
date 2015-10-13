(ns main-optimizations-bug.core
  (:require [clojure.browser.repl :as repl]
            [cljsjs.jquery]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Hello world!")

(if (js/$ "#app")
  (.log js/console "app found")
  (.log js/console "app not found"))
