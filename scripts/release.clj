(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main 'main-optimizations-bug.core
     :output-to "release/main_optimizations_bug.js"
     :output-dir "release"
     :optimizations :simple
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
