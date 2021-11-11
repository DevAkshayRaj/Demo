pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package spring-boot:repackage'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t myorg/myapp .'
            }
        }
        stage('Stop Previous container'){
            steps {
                sh 'docker stop demo-container'
            }
        }
        stage('Remove Previous container'){
            steps {
                sh 'docker rm demo-container'
            }
        }
        stage('Run Docker Image') {
            steps {
                sh 'docker run -p 7777:7050 --name demo-container -d myorg/myapp'
            }
        }
    }
}
