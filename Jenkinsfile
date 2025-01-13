pipeline {
    agent any
    tools { 
		maven 'MAVEN_HOME'
	}
    stages {
      stage('Git Checkout') {
            steps {
                script {
                    git url: 'https://github.com/rajeshkit/demoservicerepo.git'
                    echo 'git checkout is done code pulled from github to jenkins workspace'
                }
            }
        }
        stage('Mvn Build') {
            steps {
					bat "mvn clean install"
          			echo 'maven build is done'
            }
        }
        stage('docker image'){
            steps{
				echo "Build no is ${BUILD_ID}"
				echo "Build no is ${BUILD_NUMBER}"
                bat 'docker build -t 9894851315/demoserviceimage -f Dockerfile .'
                echo 'docker image is created'
            }
        }
        stage('docker deploy'){
            steps{
                bat 'docker container rm -f demoservicecontainer'
                bat 'docker run --name demoservicecontainer -itd -p 8888:9999 9894851315/demoserviceimage'
                echo 'docker container is created'
                echo 'docker container is running'
            }
        }
        
    }
 }



