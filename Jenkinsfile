pipeline {
    agent any
    stages {
        stage('Before') {
            steps {
                echo 'Starting sonar analysis...'
            }
        }
        stage('Test Maven') {
            steps {
                withMaven() {
                    sh 'mvn test'
                }
            }
        }
        stage('Build and Analyzing') {
            steps {
                withSonarQubeEnv("sonar") {
                    sh "mvn clean compile sonar:sonar"
                }
            }
        }
    }
}