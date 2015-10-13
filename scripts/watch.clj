(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'main-optimizations-bug.core
   :output-to "out/main_optimizations_bug.js"
   :output-dir "out"})
