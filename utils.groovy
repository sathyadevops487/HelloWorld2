def version="1.0" 

def buildApp(){
	echo "Building the application ${version}" 
}

def compileApp(){
	echo "Compiling the application"
}
def testApp(){
	echo "Testing the application"
}

def deployApp(){
	echo "Deploying the application"
}

def reportAppResults(){
	echo "Reporting the application results"
}

return this