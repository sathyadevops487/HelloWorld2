def version="1.0" 
def list_processor = params.SIMPLE_LIST.split(',')



def buildApp(){
	echo "Building the application " 
}

def compileApp(){
	echo "Compiling the application"
}
def testApp(){
	echo "Testing the application"
	echo "List Processor------> "+list_processor[1]
}

def deployApp(){
	echo "Deploying the application"
}

def reportAppResults(){
	echo "Reporting the application results"
}

return this