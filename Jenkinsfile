pipeline{
	agent any
	stages{
		stage('SCM Checkout'){
			steps{
				git 'https://github.com/sathyadevops487/JavaProject.git'
				echo "Checking out the project"
			}			
		}
		stage('Compile'){
			steps{
				echo "Compiling the code"
				bat 'mvn clean compile'
			}				
		}
		stage('Test'){
			steps{
				echo "Testing the code"
				bat 'mvn test'
			}				
		}
		stage('Build'){
			steps{
				echo "Building the code"
				bat 'mvn install'
			}
		}
		stage('Deploy'){
			steps{
				echo "Deploy the code"
			}
		}
	}

}