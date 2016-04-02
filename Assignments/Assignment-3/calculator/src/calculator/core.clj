(ns calculator.core
  (:gen-class))


(defn String->Number [str]
  (let [n (read-string str)]
       (if (number? n) n nil)))

(defn -main[]
	(println "----------")
	(println "CALCULATOR")
	(println "----------")
	(println "ADD(+) SUBTRACT(-) DIVIDE(/) MULTIPLY(*)")
	(println "USAGE: operand1<space>operation<space>operand2")
	(require '[clojure.string :as str])
	(println "Enter:")
	 (def elements (clojure.string/split (read-line) #" "))
	 (def op1 (try (String->Number (get elements 0)) (catch Exception e (println (str "Please follow the usage"))))) 		 
	 (def op2 (try (String->Number (get elements 2)) (catch Exception e (println (str "Please follow the usage")))))	 
	 (def operation (get elements 1))
(if (not= op1 nil)
	(if (not= op2 nil)	
	 (case operation
	"+"  (println (+ op1 op2)) 	
	"-"  (println (- op1 op2))
	"*"  (println (* op1 op2))	
	"/"  (try (println (double (/ op1 op2)))(catch Exception e (println (str "caught exception: "(.getMessage e)))))
	"default" 
)
(println "Invalid operation")

)
(println "Invalid input")
)
)

