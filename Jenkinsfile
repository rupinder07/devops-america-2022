pipeline {
    agent { label 'agent1' }
    tools {
        maven 'apache-maven-3.8.6'
    }
    stages {
        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}