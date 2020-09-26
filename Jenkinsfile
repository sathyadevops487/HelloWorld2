def utilshelper
pipeline{
	agent any
	environment {       
       PATH = "C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Program Files\\Java\\jdk1.8.0_171\\bin;C:\\Program Files (x86)\\Windows Kits\\8.1\\Windows Performance Toolkit\\;C:\\Program Files\\nodejs\\;C:\\Program Files\\PuTTY\\;C:\\Program Files\\Git\\cmd;D:\\DevOps\\apache-maven-3.6.3\\bin;C:\\Python27;"
       NEW_VERSION = "4.0"
    }	
    tools{
    	maven 'Maven3.6.1'
    }
    parameters{
    	string(name: 'VERSION', defaultValue: '1.3', description: 'versions')
    	string(name: 'SIMPLE_LIST', defaultValue: 'apples, oranges, mangoes', description: 'processing list')
    	choice(name: 'BRANCHES', choices:['dev1','test1','master','uat1'], description:'branches')
    	booleanParam(name: 'DECFLAG', defaultValue: false, description: 'boolean flag')
    }
	stages{		
		stage('init'){
		   steps{
		   	script{
				utilshelper = load "utils.groovy"
			  }
		   }
			
			
		}
		stage('Compile'){			
			steps{
			   script{
			   		utilshelper.compileApp()
			   }				
				withMaven(maven: 'Maven3.6.1'){
					bat 'mvn clean compile'
				}		
			}				
		}
		stage('Build'){
			steps{
			   script{
			   		utilshelper.buildApp()
			   }				
				echo "Testing in branch ${params.BRANCHES}"
				withMaven(maven: 'Maven3.6.1'){
					bat 'mvn install'
				}				
			}
		}
		stage('Test'){			 	  
			steps{		
				with {
			   	expression{
			    		params.DECFLAG
			    	}
		   		}
		   		script{
		   			utilshelper.testApp()
		   		}					
				echo BRANCH_NAME
				echo "New Version env var ${NEW_VERSION}"
				echo "ExecutionFlag: ${params.DECFLAG}"
				withMaven(maven: 'Maven3.6.1'){
					bat 'mvn test'
				}				
			}				
		}
		
		stage('Deploy'){
			steps{
				script{
					utilshelper.deployApp()
				}
			}
		}
	}

}