
(import nutrivisor.*)
(deftemplate Person 		(declare (from-class Person)))
(deftemplate DailyNeeds 	(declare (from-class DailyNeeds)))
(deftemplate Carbohydrates 	(declare (from-class Carbohydrates)))
(deftemplate Energy 		(declare (from-class Energy)))
(deftemplate Floride 		(declare (from-class Floride)))
(deftemplate Fibers 		(declare (from-class Fibers)))
(deftemplate Lodine 		(declare (from-class Lodine)))
(deftemplate Mineral 		(declare (from-class Mineral)))
(deftemplate Protine 		(declare (from-class Protine)))
(deftemplate Vitamine 		(declare (from-class Vitamine)))

(defrule rule_1 
		(Person  	{( 	age >= 14 && age <= 18 )&&  phys == "yes"  && 
							purge == "yes" && constipation == "no" && 
							(bmi >= 18.5 && bmi <= 25) && gender == "Male"}) => 

							(add
									(new DailyNeeds 
											(new Energy "3000" "Kilo cal")  
											(new Protine ">75" "gram")
											(new Carbohydrates "412.5-562.5" "grams")
											(new Fibers "<24" "gram")
											(new Vitamine "Vitamine A" "700-1000" "micro-grams")
											(new Vitamine "Vitamine D" "5-10" "micro-grams" )
											(new Mineral "Iron" "11" "milli-gram")
											(new Mineral "Folaite" "450-600" "micro-gram" )
											(new Mineral "Zinc" "20" "milli-gram")
											(new Mineral "Calcium" "500-800" "milli-gram")
											(new Vitamine "Vitamine E" "10.5-15" "milli-gram")
											(new Vitamine "Vitamine K" "60-120" "micro-gram")
											(new Vitamine "Vitamine C" "75-90" "milli-gram")
											(new Vitamine "Thiamine" "1.5-2.4" "milli-gram")
											(new Vitamine "Riboflavin" "1.8-2.7" "milli-gram")
											(new Vitamine "Niacine" "18-30" "milli-gram")
											(new Vitamine "Vitamine B6" "1.5-3" "milli-gram")
											(new Vitamine "Vitamine B12" "1.5-3" "milli-gram")
											(new Floride  "1.5-3" "milli-gram")
											(new Lodine "225" "micro-gram")
											(new Mineral "Sodium" "7.5" "gram")
									)
								)
)