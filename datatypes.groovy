def testListMethod(){	
	def list = ["apples", "mangoes", "oranges","pappaya"];
	for(int f=0; f<=list.size()-1;f++){
		println "${list[f]}"
	}
}

def testMapMethod(){
	def m_map = [name:"Jerry", age:42, city:"Bangalore"]
	println m_map.get("city")
	/*m_map.each{entry -->
		println "$entry.key", "$entry.value"
	}*/
}
def testConditionalStatements(){
	if(params.DECFLAG){
		println "The execute flag is set to true!"
	}
	else if(condition){
		println "The execute flag is set to false"
	}
	else{
		println "Default value"
	}
}
return this