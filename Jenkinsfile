pipeline {
    agent any
 
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
				 withMaven {
          			bat "mvn clean verify"
          			echo 'maven build is done'
        		 }
            }
        }
        stage('docker image'){
            steps{
                sh 'docker build -t 9894851315/demoserviceimage:${BUILD_NUMBER} -f Dockerfile .'
                echo 'docker image is created'
            }
        }
        stage('docker deploy'){
            steps{
                sh 'docker container rm -f demoservicecontainer'
                sh 'docker run --name demoservicecontainer -itd -p 8888:9999 9894851315/demoserviceimage:${BUILD_NUMBER}'
                echo 'docker container is created'
                echo 'docker container is running'
            }
        }
        
    }
 }



