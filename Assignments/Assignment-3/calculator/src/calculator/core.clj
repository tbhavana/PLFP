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
	 (def op1 (String->Number (get elements 0))) 		 
	 (def op2 (String->Number (get elements 2)))	 
	 (def operation (get elements 1))
(if (not= op1 nil)
	(if (not= op2 nil)	
	 (case operation
	"+"  (println (+ op1 op2)) 	
	"-"  (println (- op1 op2))
	"*"  (println (* op1 op2))	
	"/"  (println (quot op1 op2))
	"default" 
)
(println "Invalid input")

)
(println "Invalid operands")
)
)

