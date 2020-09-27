def testListMethod(){	
	def list = ["apples", "mangoes", "oranges","pappaya"];
	for(int f=0; f<=list.size()-1;f++){
		println "${list[f]}"
	}
}

def testMapMethod(){
	def m_map = [name:"Jerry", age:42, city:"Bangalore"]
	print m_map.get("city")
	m_map.each{entry->
		println "$entry.key", "$entry.value"
	}
}
def testConditionalStatements(){
	if(condition){
		
	}
	else if(condition){
		
	}
	else{
		
	}
}
return this