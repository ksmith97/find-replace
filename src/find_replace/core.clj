(ns find-replace.core
  (:use [clojure.string :only (replace)]
       [clojure.java.io :only (file)]))

(def fs (file-seq (file "E:\\Clojure\\ignite\\src\\meta_ex")))

(def files (filter #(.isFile %) fs))

(doseq [file files]
  (spit file
        (replace (slurp file) #"overtone\.live" "overtone.core")))
