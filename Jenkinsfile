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
                withSonarQubeEnv("Local SonarQube Server") {
                    sh "mvn clean compile sonar:sonar"
                }
            }
        }
    }
}