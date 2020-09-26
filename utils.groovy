def version="1.0" 
def list_processor = params.SIMPLE_LIST.split(',')



def buildApp(){
	echo "Building the application " 
}

def compileApp(){
	echo "Compiling the application"
}
def testApp(){
	def fruit = ${list_processor[1]}
	echo "Testing the application"
	echo "List Processor------> ${fruit}"
}

def deployApp(){
	echo "Deploying the application"
}

def reportAppResults(){
	echo "Reporting the application results"
}

return this