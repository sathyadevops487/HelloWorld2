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
				withMaven(maven: 'Maven3.6.1'){
					 'mvn clean compile'
				}		
			}				
		}
		stage('Test'){
			steps{
				echo "Testing the code"
				withMaven(maven: 'Maven3.6.1'){
					'mvn test'
				}				
			}				
		}
		stage('Build'){
			steps{
				echo "Building the code"
				withMaven(maven: 'Maven3.6.1'){
					'mvn install'
				}				
			}
		}
		stage('Deploy'){
			steps{
				echo "Deploy the code"
			}
		}
	}

}