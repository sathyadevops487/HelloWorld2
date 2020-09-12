pipeline{
	agent any
	environment {       
       PATH = "C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Program Files\\Java\\jdk1.8.0_171\\bin;C:\\Program Files (x86)\\Windows Kits\\8.1\\Windows Performance Toolkit\\;C:\\Program Files\\nodejs\\;C:\\Program Files\\PuTTY\\;C:\\Program Files\\Git\\cmd;D:\\DevOps\\apache-maven-3.6.3\\bin;C:\\Python27;"
    }	
	stages{		
	    stage('Build the software'){
	       parallel{
	           stage('Build in windows'){
	             agent {
				   label 'Windows_Node2'
			     } 
				 steps{
					echo "Compiling the code"
					withMaven(maven: 'Maven3.6.1'){
					bat 'mvn clean compile'
				  }
	             }
	            }
	            stage('Build in Linux'){
	             agent {
				   label 'Linux'
			     } 
				 steps{
					echo "Compiling the code"
					withMaven(maven: 'Maven3.6.1'){
					sh 'mvn clean compile'
				  }
	             }
	            }
	       }
					
		}	
	
		stage('Compile'){
			steps{
				echo "Compiling the code"
				withMaven(maven: 'Maven3.6.1'){
					bat 'mvn clean compile'
				}		
			}				
		}
		stage('Test'){
			steps{
				echo "Testing the code"
				withMaven(maven: 'Maven3.6.1'){
					bat 'mvn test'
				}				
			}				
		}
		stage('Build'){
			steps{
				echo "Building the code"
				withMaven(maven: 'Maven3.6.1'){
					bat 'mvn install'
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