pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
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
        stage('Run Docker Image') {
            steps {
                sh 'docker run -p 7777:7050 myorg/myapp'
            }
        }
    }
}