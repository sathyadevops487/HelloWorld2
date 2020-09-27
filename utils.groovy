
def version="1.0" 

def buildApp(){
	echo "Building the application"
	echo "${params.SIMPLE_LIST}" 
}

def compileApp(){
	echo "Compiling the application"
}

def testApp(){	
	def list_processor = "${params.SIMPLE_LIST}"
	echo "printing the list processor value"
	echo list_processor
	def list_processor_strArr = list_processor.split(",")
		
	for (int f = 0; f < list_processor_strArr.length; f++){
		echo "${list_processor_strArr[f]}"
	}	
	echo "Testing the application"	
}

def deployApp(){
	echo "Deploying the application"
}

def reportAppResults(){
	echo "Reporting the application results"
}

return this