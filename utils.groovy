def version="1.0" 
def list_processor = params.SIMPLE_LIST.split(',')



def buildApp(){
	echo "Building the application "
	echo "params.SIMPLE_LIST" 
}

def compileApp(){
	echo "Compiling the application"
}
def testApp(){	
	for (int f = 0; f < list_processor.length; f++){
		echo "${list_processor[f]}"
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