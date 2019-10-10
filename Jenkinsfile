pipeline {
	  agent any
	environment {
            PATH = "C:\\WINDOWS\\SYSTEM32"
        }
	parameters { choice(name: 'REQUESTED_ACTION', choices: ['Package', 'Sonar Analysis'], description: '') }
	  stages {
		  
		  stage('Job Start Notification') { 
	     steps {
		 emailext ( 
        subject: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'", 
        body: """<p>Job ${env.JOB_NAME} [${env.BUILD_NUMBER}] has been started.</p>""",
         to: 'techdevopsnow@gmail.com'
     )
			}
        }
		  	  
	  
	    stage('Source') { 
	      steps {
	    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'HappyTrip', url: 'https://github.com/bhaveshrajrathore/ZApp.git']]])
	    
	      }
	    }
	  stage ('Build'){
	                     agent DockerHost
	                     
