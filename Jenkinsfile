pipeline {
    agent any
    stages {
        stage('Before') {
            steps {
                echo 'Starting sonar analysis...'
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